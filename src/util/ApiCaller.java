package util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import com.google.gson.Gson;

import entity.Category;
import entity.Person;

/**
 * The Class ApiCaller.
 */
public class ApiCaller {

	/** The person list. */
	List<Person> personList;

	/** The category list. */
	List<Category> categoryList = new ArrayList<>();

	/** The category finished list. */
	List<Boolean> categoryFinishedList = new ArrayList<>();

	/** The clean links finished. */
	List<Boolean> cleanLinksFinished = new ArrayList<>();

	/** The g. */
	Gson g = new Gson();

	/** The path. */
	private String path;

	protected boolean watchDogFinished;

	private int splitListSize = 0;

	/**
	 * Instantiates a new api caller.
	 *
	 * @param path
	 *            the path
	 * @param categoryTitleList
	 *            the category title list
	 */
	public ApiCaller(String path, List<String> categoryTitleList) {
		this.path = path;

		for (String title : categoryTitleList) {
			Category c = new Category(title);
			categoryList.add(c);
		}
	}

	/**
	 * This function compare the outgoing links to all known persons. If link is
	 * not "known" reference is deleted
	 */
	public void cleanLinks(final List<Person> pl) {
		new Thread() {

			@Override
			public void run() {
				for (Person p : pl) {
					while (p.getLinkList() == null) {
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					// Iterate over all links for this page
					for (Iterator<Person> linkIterator = p.getLinkList().iterator(); linkIterator.hasNext();) {
						Person link = linkIterator.next();
						boolean isPeople = false;
						// Check if link is in our person list
						for (Person person : personList) {
							// Link is a Person we know
							if (person.getTitle().equals(link.getTitle())) {
								isPeople = true;
								link.setPageid(person.getPageid());
								break;
							}
						}
						if (isPeople) {
							// TODO: Connect People
							isPeople = false;
						} else {
							linkIterator.remove();
						}
					}
				}

				cleanLinksFinished.add(true);

			}
		}.start();
	}
	
	

	/**
	 * Gets the categories.
	 *
	 * @param pl
	 *            Part of the whole personList
	 * @param ca
	 *            A new CategoryApi for every task
	 * @return All categories to which a person belong
	 */
	public void getCategories(final List<Person> pl, final CategoryApi ca) {
		new Thread() {
			@Override
			public void run() {
				for (Person p : pl) {
					try {
						ca.getCategories(p);
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}

			}

		}.start();
	}

	public void getCategoriesLinksAndClean(int listSplit) {
		for (List<Person> list : CommonFunctions.split(personList, listSplit)) {
			splitListSize++;
			// getCategories(list, new CategoryApi());
			getLinks(list, new LinkApi());
			// cleanLinks(list);
		}
	}

	/**
	 * Gets the links.
	 *
	 * @param pl
	 *            Part of the whole personList
	 * @param la
	 *            A new LinkApi for every task
	 * @return Outgoing links to each person
	 */
	public void getLinks(final List<Person> pl, final LinkApi la) {
		new Thread() {
			@Override
			public void run() {
				for (Person p : pl) {
					try {
						la.getOutgoingLinks(p);
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}

			}
		}.start();
	}

	/**
	 * Start.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public void start() throws Exception {
		startWatchDog(5);
		personList = new ArrayList<Person>();

		for (final Category c : categoryList) {
			 new Thread() {
			 @Override
			 public void run() {
			CategoryApi ca = new CategoryApi();

			try {
				// TODO: Hier muss noch eingefügt werden ob ich die
				// Subcategories will oder die Pages, dies sollte
				// automatisch nacheinander geschehen
				Thread.sleep(200);
				List<Person> tempList = ca.getCategoryMembers(c);
				List<String> exclusionList = Arrays.asList("References", "Sources", "Notes", "Bibliography", "See also",
						"External links", "Translations and adaptations","History");
				for (Person person : tempList) {
					person.groupExtract();
					for (String key : person.getExtractMap().keySet()) {
						if (exclusionList.contains(key)) {
							continue;
						}
						LinkedHashMap<String, String> textMap = person.getExtractMap().get(key);
						// TODO: Hier noch verfeinerte Stufe analysieren
						String fullText = "";
						for (String textMapKey : textMap.keySet()) {
							fullText += textMap.get(textMapKey);
						}
						if (fullText.length() != 0) {
							// person.getToneMap().put(key,
							// ToneAnalyzerUtil.getInstance().getTone(fullText));
						}
					}

				}
				personList.addAll(tempList);
				categoryFinishedList.add(true);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Category '" + c.getTitle() + "' done");
			CommonFunctions.printCurrentTimestamp();
		}
		 }.start();
		 }

		waitForCategoryMembers();
		// List<String> titleList = new ArrayList<>();
		// for (Person person : personList) {
		// LinkedHashMap<String, LinkedHashMap<String, String>> map =
		// person.getExtractMap();
		// List<String> list = Arrays.asList("References", "Sources", "Notes",
		// "Bibliography", "See also",
		// "External links", "Translations and adaptations");
		// for (String string : map.keySet()) {
		// if (list.contains(string)) {
		// break;
		// }
		// if (!titleList.contains(string)) {
		// titleList.add(string);
		// }
		// }
		//
		// }
		// runs async
		// getCategoriesLinksAndClean(10);

		// waitForCleanedLinks();

		watchDogFinished = true;
		System.out.println("Finally done");
		CommonFunctions.printCurrentTimestamp();

	}

	public void startWatchDog(int sleepTime) {
		new Thread() {
			@Override
			public void run() {
				while (!watchDogFinished) {
					// System.out.println("WatchDog: Still Alive");
					// CommonFunctions.printCurrentTimestamp();
					try {
						Thread.sleep(sleepTime * 1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				IO io = new IO();
				io.writeToDatabase(personList);
				System.out.println("WatchDog: Finished");
				CommonFunctions.printCurrentTimestamp();
			}
		}.start();
	}

	/**
	 * This function sets the main process to sleep while the initial fetching
	 * of categorymembers hasn't finished.
	 */
	private void waitForCategoryMembers() {
		while (categoryFinishedList.size() != categoryList.size()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Wait for category members error:");
				e.printStackTrace();
			}
		}

	}

	private void waitForCleanedLinks() {
		while (cleanLinksFinished.size() != splitListSize) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Wait for cleaned links error:");
				e.printStackTrace();
			}
		}
	}
}
