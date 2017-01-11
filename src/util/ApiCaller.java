/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.google.gson.Gson;

import entity.Category;
import entity.Page;

/**
 * The Class ApiCaller.
 */
public class ApiCaller {

	/** The Page list. */
	List<Page> pageList;

	/** The category list. */
	List<Category> categoryList = new ArrayList<>();

	/** The category finished list. */
	List<Boolean> categoryFinishedList = new ArrayList<>();

	/** The clean links finished. */
	List<Boolean> cleanLinksFinished = new ArrayList<>();

	/** The Gson for several purposes */
	Gson g = new Gson();
	
	/** The path. */
	private String path;

	/**
	 * Boolean watchDogFinished
	 */
	protected boolean watchDogFinished;
	

	/**
	 * Instantiates a new api caller.
	 *
	 * @param path
	 *            the path
	 * @param categoryTitleList
	 *            the category title list
	 */
	public ApiCaller(String path, List<String> categoryTitleList) {
		this.setPath(path);

		for (String title : categoryTitleList) {
			Category c = new Category(title);
			categoryList.add(c);
		}
	}

	/**
	 * Start. This method fetches the pages from the categories in an
	 * asynchronous task
	 *
	 * @throws Exception
	 *             the exception
	 */
	public void start() throws Exception {
		startWatchDog(5);
		pageList = new ArrayList<Page>();

		for (final Category c : categoryList) {
			new Thread() {
				@Override
				public void run() {
					CategoryApi ca = new CategoryApi();

					try {
						Thread.sleep(200);
						List<Page> tempList = ca.getCategoryMembers(c);

						for (Page Page : tempList) {
							Page.groupExtract();
							for (String key : Page.getExtractMap().keySet()) {
								LinkedHashMap<String, String> textMap = Page.getExtractMap().get(key);
								String fullText = "";
								for (String textMapKey : textMap.keySet()) {
									fullText += textMap.get(textMapKey);
								}
								if (fullText.length() != 0) {
									// Page.getToneMap().put(key,
									// ToneAnalyzerUtil.getInstance().getTone(fullText));
								}
							}

						}
						pageList.addAll(tempList);
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
		watchDogFinished = true;
		System.out.println("Finally done");
		CommonFunctions.printCurrentTimestamp();

	}

	/**
	 * Starts a watch dog for long running threads to give the user a feedback
	 * via console output
	 * 
	 * @param sleepTime
	 */
	public void startWatchDog(int sleepTime) {
		new Thread() {
			@Override
			public void run() {
				while (!watchDogFinished) {
					try {
						Thread.sleep(sleepTime * 1000);
						System.out.println("WatchDog: Running");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				IO io = new IO();
				io.writeToDatabase(pageList);
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

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
}
