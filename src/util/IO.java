/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ElementTone;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneCategory;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneScore;
import com.mashape.unirest.http.exceptions.UnirestException;

import entity.PageExtract;
import entity.Page;
import entity.receptiviti.Content;
import entity.receptiviti.ReceptivitiAnalysis;
import util.database.DbConnector;
import util.database.SqlConstants;
import util.external.AlchemyLanguageUtil;
import util.external.ReceptivitiUtil;
import util.external.ToneAnalyzerUtil;

/**
 * 
 * This class is the main class which contains most of the functions.
 *
 */
public class IO {

	/**
	 * A content is read from a file and is converted to a page object
	 * 
	 * @param path
	 *            a path to a file with content to convert
	 * @return a list of person objects
	 * 
	 */
	public List<Page> readFromJsonFile(String path) throws FileNotFoundException {
		Scanner testScanner = new Scanner(new BufferedReader(new FileReader(path)));
		Gson g = new Gson();
		List<Page> pageList = new ArrayList<>();
		while (testScanner.hasNext()) {
			pageList.add(g.fromJson(testScanner.nextLine(), Page.class));
		}
		g = null;
		testScanner.close();
		path = null;
		return pageList;
	}

	public List<Integer> tempList = new ArrayList<>();

	/**
	 * A method to write a list of pages in Json format to file
	 * 
	 * @param pageList
	 *            a list of person objects
	 * @param path
	 *            a path to a file, where the list of persons should be written
	 * 
	 */
	public void writeToJsonFile(List<Page> pageList, String path) throws IOException {
		Gson g = new Gson();
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
		for (Iterator<Page> iterator = pageList.iterator(); iterator.hasNext();) {
			out.write(g.toJson(iterator.next()) + "\n");
		}
		out.close();
	}

	/*
	 * public void openBrowser() throws SQLException, MalformedURLException,
	 * UnsupportedEncodingException { String basicLink =
	 * "https://en.wikipedia.org/wiki/"; DbConnector db = null; try { db = new
	 * DbConnector(); } catch (ClassNotFoundException | SQLException e1) {
	 * e1.printStackTrace(); } ResultSet pageResult = db.executeQuery(
	 * "SELECT * FROM pages WHERE ibmTone IS NOT NULL"); while
	 * (pageResult.next()) { String title = pageResult.getString("title"); URL u
	 * = new URL(basicLink + URLEncoder.encode(title, "UTF-8").replace("+",
	 * "%20")); openWebpage(u); try { Thread.sleep(500); } catch
	 * (InterruptedException e) { e.printStackTrace(); } }
	 * 
	 * }
	 * 
	 * public static void openWebpage(URI uri) { Desktop desktop =
	 * Desktop.isDesktopSupported() ? Desktop.getDesktop() : null; if (desktop
	 * != null && desktop.isSupported(Desktop.Action.BROWSE)) { try {
	 * desktop.browse(uri); } catch (Exception e) { e.printStackTrace(); } } }
	 * 
	 * public static void openWebpage(URL url) { try { openWebpage(url.toURI());
	 * } catch (URISyntaxException e) { e.printStackTrace(); } }
	 */

	/**
	 * Retrieves the links of the Template section in wikipedia pages.
	 * 
	 * @throws IOException
	 * @throws JSONException
	 * @throws SQLException
	 */
	public void getLinksFromWikipediaTemplate() throws IOException, JSONException, SQLException {
		List<Page> pages = this.getExtractsFromDatabase();
		for (List<Page> splitList : CommonFunctions.split(pages, 10)) {
			// new Thread() {
			// @Override
			// public void run() {
			for (Page page : splitList) {
				try {
					getLinksFromWikipedia(page, true);
				} catch (IOException | JSONException | SQLException e) {
					e.printStackTrace();
				}
			}
			// }
			//
			// }.start();
		}
	}

	/**
	 * Calls the characters and retreive outgoing links from them. If the link
	 * is also in our character list. A connection between the characters is
	 * persisted
	 * 
	 * @throws IOException
	 * @throws JSONException
	 * @throws SQLException
	 */
	public void getLinksFromWikipediaConnection() throws IOException, JSONException, SQLException {
		List<Page> pages = this.getCharactersFromDatabase();
		for (Page p : pages) {
			tempList.add(p.getPageId());
		}
		for (List<Page> splitList : CommonFunctions.split(pages, 5)) {
			new Thread() {
				@Override
				public void run() {
					for (Page page : splitList) {
						try {
							getLinksFromWikipedia(page, false);
						} catch (IOException | JSONException | SQLException e) {
							e.printStackTrace();
						}
					}
				}

			}.start();
		}
	}

	/**
	 * Processes the HTML result of a call from a wikipedia page. The wikipedia
	 * API only generates all links for a page so we have to manually select
	 * links in a relevant area. These are the templates or the page excluding
	 * the template.
	 * 
	 * @param page
	 * @param fromTemplate
	 * @throws IOException
	 * @throws JSONException
	 * @throws SQLException
	 */
	private void getLinksFromWikipedia(Page page, boolean fromTemplate)
			throws IOException, JSONException, SQLException {

		String pageTitle = page.getTitle();
		URL url = new URL("https://en.wikipedia.org/wiki/" + pageTitle.replace(" ", "%20"));
		URLConnection con = url.openConnection();
		InputStream in = con.getInputStream();
		String encoding = con.getContentEncoding();
		encoding = encoding == null ? "UTF-8" : encoding;
		String body = IOUtils.toString(in, encoding);
		Document doc = Jsoup.parse(body);
		// Nur Dokument betrachten
		Element content = doc.getElementById("content");
		Elements template = content.select("div[role=navigation]");

		for (Element e : template) {
			if (fromTemplate) {
				Elements rows = e.select("tr");
				for (Element row : rows) {
					Element cell = row.select("th").first();
					if (cell == null || !cell.html().contains("Character")) {
						continue;

					}
					Elements groups = row.select(".navbox-group");
					if (groups.size() != 0) {
						if (row.html().contains("Characters")) {
							getLinks(page, row, false);
						}
					}
				}
			}
			e.remove();
		}

		if (!fromTemplate) {
			getLinks(page, content, true);
		}

	}

	/**
	 * Get links from an element of the page
	 * 
	 * @param page
	 * @param content
	 * @param withConnection
	 * @throws JSONException
	 * @throws SQLException
	 */
	private void getLinks(Page page, Element content, boolean withConnection) throws JSONException, SQLException {
		String pageTitle = page.getTitle();
		String pageId = String.valueOf(page.getPageId());
		Elements links = content.select("a[href]");
		PageApi pa = new PageApi();
		for (Iterator<Element> iterator = links.iterator(); iterator.hasNext();) {
			Element element = iterator.next();
			String link = element.attr("href");
			/**
			 * It has to be an internal wikipedia link
			 */
			if (link.startsWith("/wiki/")) {
				/**
				 * Ignore unrelevant links
				 */
				if (link.startsWith("/wiki/Category:") || link.startsWith("/wiki/Special:")
						|| link.startsWith("/wiki/Wikipedia:") || link.startsWith("/wiki/Help:")
						|| link.startsWith("/wiki/Template:") || link.startsWith("/wiki/Portal:")
						|| link.startsWith("/wiki/Talk:") || link.startsWith("/wiki/" + pageTitle + ":")
						|| link.startsWith("/wiki/File:") || link.startsWith("/wiki/Template_talk:")) {
					continue;
				}
				link = link.replace("/wiki/", "");
				Page character = pa.getPageInfoForTitle(link);
				if (withConnection) {
					if (tempList.contains(character.getPageId())) {
						persistConnection(pageId, character);
					}

				}

				else {
					persistCharacter(pageId, character);
				}

			}
		}
	}

	/**
	 * Persist the connection between to characters to the database
	 * 
	 * @param parentPageId
	 * @param character
	 * @throws SQLException
	 */
	private void persistConnection(String parentPageId, Page character) throws SQLException {
		try {
			final DbConnector db = new DbConnector();

			ResultSet rs = db.executeQuery(SqlConstants.CONNECTION_EXISTS,
					Arrays.asList(parentPageId, String.valueOf(character.getPageId())));
			if (!rs.first()) {
				db.executeUpdate(SqlConstants.CONNECTION_INSERT,
						Arrays.asList(parentPageId, String.valueOf(character.getPageId()), "EN"));
			} else {
				db.executeUpdate(SqlConstants.CONNECTION_INCREMENT,
						Arrays.asList(parentPageId, String.valueOf(character.getPageId())));
			}

		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Persist the character to the database.
	 * 
	 * @param parentPageId
	 * @param character
	 * @throws SQLException
	 */
	private void persistCharacter(String parentPageId, Page character) throws SQLException {
		try {
			final DbConnector db = new DbConnector();
			ResultSet rs = db.executeQuery(SqlConstants.CHARACTER_EXISTS,
					Arrays.asList(String.valueOf(character.getPageId()), parentPageId));
			if (!rs.first()) {
				db.executeUpdate(SqlConstants.CHARACTER_INSERT,
						Arrays.asList(String.valueOf(character.getPageId()), parentPageId, character.getTitle(), "EN"));
			}

		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retreive the characters from the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	public List<Page> getExtractsFromDatabase() throws SQLException {
		DbConnector db = null;
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet pageResult = db.executeQuery(SqlConstants.GET_PAGES);

		List<Page> pageList = new ArrayList<>();
		Gson gson = new Gson();
		while (pageResult.next()) {
			int pageId = pageResult.getInt("pageId");
			String title = pageResult.getString("title");
			int earliestYear = pageResult.getInt("earliestYear");
			int latestYear = pageResult.getInt("latestYear");
			ToneAnalysis ibmTone = gson.fromJson(pageResult.getString("ibmTone"), ToneAnalysis.class);
			ReceptivitiAnalysis liwcTone = gson.fromJson(pageResult.getString("liwcTone"), ReceptivitiAnalysis.class);
			DocumentSentiment docSentiment = gson.fromJson(pageResult.getString("alchemyTone"),
					DocumentSentiment.class);
			Page page = new Page(pageId, title);
			page.setIbmTone(ibmTone);
			page.setLiwcTone(liwcTone);
			page.setDocumentSentiment(docSentiment);
			page.setEarliestYear(earliestYear);
			page.setLatestYear(latestYear);
			ResultSet rs = db.executeQuery(SqlConstants.PAGE_EXTRACT_GET, Arrays.asList(String.valueOf(pageId)));
			rs.close();
			pageList.add(page);
		}
		pageResult.close();
		return pageList;
	}

	/**
	 * Retreive the characters from the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	public List<Page> getCharactersFromDatabase() throws SQLException {
		DbConnector db = null;
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet pageResult = db.executeQuery(SqlConstants.SELECT_CHARACTERS);

		List<Page> pageList = new ArrayList<>();
		while (pageResult.next()) {
			int pageId = pageResult.getInt("pageId");
			String title = pageResult.getString("title");
			Page page = new Page(pageId, title);
			pageList.add(page);
		}
		pageResult.close();
		return pageList;
	}

	/**
	 * Prints out the collected Tones together with page meta data into readable
	 * and editable csv-file.
	 * 
	 * @param path
	 * @throws IOException
	 * @throws SQLException
	 */
	public void writeToCSV(String path) throws IOException, SQLException {
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
		// Title
		out.write("pageId;title;earliest year;latest year;mean year;");
		// IBM
		out.write(
				"Anger;Disgust;Fear;Joy;Sadness;Analytical;Confident;Tentative;Openness;Conscientiousness;Extraversion;Agreeableness;Emotional Range;");
		// LIWC
		out.write(
				"LIWC;Word Count;Analytical thinking;Clout;Authentic;Emotional tone;Dictionary Words;Positive Emotion;Negative Emotion;Anxiety;Anger;Sadness;Tentative;Certainty;Power;Risk;Death;");
		out.write("AlchemyTone;mixed;score;type;");
		out.write("\n");
		for (Page page : this.getExtractsFromDatabase()) {
			int pageId = page.getPageId();
			String title = page.getTitle();
			ToneAnalysis ibmTone = page.getIbmTone();
			ReceptivitiAnalysis liwcTone = page.getLiwcTone();
			DocumentSentiment docSentiment = page.getDocumentSentiment();
			int earliestYear = page.getEarliestYear();
			int latestYear = page.getLatestYear();
			int meanYear = 0;
			if (earliestYear == 0) {
				meanYear = latestYear;
			} else {
				meanYear = (earliestYear + latestYear) / 2;
			}
			if (ibmTone != null) {
				out.write(pageId + ";" + title + ";" + earliestYear + ";" + latestYear + ";" + meanYear + ";");
				ElementTone documentTone = ibmTone.getDocumentTone();
				List<ToneCategory> toneCategories = documentTone.getTones();
				for (ToneCategory toneCategory : toneCategories) {
					List<ToneScore> toneScores = toneCategory.getTones();
					for (ToneScore toneScore : toneScores) {
						// String name = toneScore.getName();
						double score = toneScore.getScore();
						out.write(String.valueOf(score).replace('.', ','));
						out.write(";");
					}
				}

				out.write(";");

				if (liwcTone != null) {
					Double wordCount = liwcTone.getLiwcScores().getWc();
					Double analyticalThinking = liwcTone.getLiwcScores().getAnalytic();
					Double clout = liwcTone.getLiwcScores().getClout();
					Double authentic = liwcTone.getLiwcScores().getAuthentic();
					Double emotionalTone = liwcTone.getLiwcScores().getTone();
					Double dictionaryWords = liwcTone.getLiwcScores().getDic();

					Double posEmo = liwcTone.getLiwcScores().getCategories().getPosemo();
					Double negEmo = liwcTone.getLiwcScores().getCategories().getNegemo();
					Double anxiety = liwcTone.getLiwcScores().getCategories().getAnx();
					Double anger = liwcTone.getLiwcScores().getCategories().getAnger();
					Double sadness = liwcTone.getLiwcScores().getCategories().getSad();
					Double tentative = liwcTone.getLiwcScores().getCategories().getTentat();
					Double certainty = liwcTone.getLiwcScores().getCategories().getCertain();
					Double power = liwcTone.getLiwcScores().getCategories().getPower();
					Double risk = liwcTone.getLiwcScores().getCategories().getRisk();
					Double death = liwcTone.getLiwcScores().getCategories().getDeath();

					out.write(wordCount + ";");
					out.write(String.valueOf(analyticalThinking).replace('.', ',') + ";");
					out.write(String.valueOf(clout).replace('.', ',') + ";");
					out.write(String.valueOf(authentic).replace('.', ',') + ";");
					out.write(String.valueOf(emotionalTone).replace('.', ',') + ";");
					out.write(String.valueOf(dictionaryWords).replace('.', ',') + ";");
					out.write(String.valueOf(posEmo).replace('.', ',') + ";");
					out.write(String.valueOf(negEmo).replace('.', ',') + ";");
					out.write(String.valueOf(anxiety).replace('.', ',') + ";");
					out.write(String.valueOf(anger).replace('.', ',') + ";");
					out.write(String.valueOf(sadness).replace('.', ',') + ";");
					out.write(String.valueOf(tentative).replace('.', ',') + ";");
					out.write(String.valueOf(certainty).replace('.', ',') + ";");
					out.write(String.valueOf(power).replace('.', ',') + ";");
					out.write(String.valueOf(risk).replace('.', ',') + ";");
					out.write(String.valueOf(death).replace('.', ',') + ";");
				}
				out.write(";");
				if (docSentiment != null) {
					String mixed = docSentiment.getSentiment().getMixed();
					Double score = docSentiment.getSentiment().getScore();
					String type = docSentiment.getSentiment().getType().toString();
					out.write(String.valueOf(mixed).replace('.', ',') + ";");
					out.write(String.valueOf(score).replace('.', ',') + ";");
					out.write(String.valueOf(type).replace('.', ',') + ";");
				}
				out.write("\n");
			}
		}
		out.close();
		System.out.println("Export finished.");

	}

	/**
	 * Get the Watson ToneAnalyser Tone
	 * 
	 * @throws SQLException
	 */
	public void getIBMTone() throws SQLException {
		for (List<PageExtract> splitList : CommonFunctions.split(getList(), 30)) {
			getIBMToneThreadList(splitList);
		}
	}

	/**
	 * Get the Watson AlchemyLanguage Tone
	 * 
	 * @throws SQLException
	 */
	public void getAlchemyTone() throws SQLException {
		for (List<PageExtract> splitList : CommonFunctions.split(getList(), 30)) {
			getDocumentSentimentThreadList(splitList);
		}
	}

	/**
	 * Get the Receptivity LIWC Tone
	 * 
	 * @throws SQLException
	 */
	public void getLIWCTone() throws UnirestException, JSONException, SQLException {
		for (List<PageExtract> splitList : CommonFunctions.split(getList(), 30)) {
			getLIWCToneThreadList(splitList);
		}
	}

	/**
	 * Gets the list of Extract from the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	private List<PageExtract> getList() throws SQLException {
		DbConnector db = null;
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		db.executeQuery(SqlConstants.SET_MAX_CONCAT_LENGTH);
		ResultSet pageResult = db.executeQuery(SqlConstants.PAGE_EXTRACT);
		List<PageExtract> list = new ArrayList<>();
		while (pageResult.next()) {
			int pageId = pageResult.getInt("pageId");
			String content = pageResult.getString("content");
			list.add(new PageExtract(pageId, content));

		}
		return list;
	}

	/**
	 * Threaded function to get liwc analysis
	 * 
	 * @param pl
	 */
	private void getLIWCToneThreadList(final List<PageExtract> pl) {
		final Gson g = new Gson();
		try {
			final DbConnector db = new DbConnector();

			new Thread() {
				@Override
				public void run() {
					for (PageExtract p : pl) {
						String content = p.getContent();
						if (!content.equals("")) {
							try {
								ReceptivitiAnalysis a = ReceptivitiUtil.getInstance()
										.analyseContent(new Content(content));
								db.executeUpdate(SqlConstants.PAGE_LIWC_TONE_UPDATE,
										Arrays.asList(g.toJson(a), String.valueOf(p.getPageId())));
							} catch (UnirestException | JSONException e) {
								e.printStackTrace();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}

				}

			}.start();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Threaded function to get ibm analysis
	 * 
	 * @param pl
	 */
	private void getIBMToneThreadList(final List<PageExtract> pl) {
		try {
			final DbConnector db = new DbConnector();

			new Thread() {
				@Override
				public void run() {
					for (PageExtract p : pl) {
						String content = p.getContent();
						if (!content.equals("")) {
							try {
								ToneAnalysis a = ToneAnalyzerUtil.getInstance().getTone(content);

								db.executeUpdate(SqlConstants.PAGE_IBM_TONE_UPDATE,
										Arrays.asList(a.toString(), String.valueOf(p.getPageId())));
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}

				}

			}.start();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Threaded function to get documentTone
	 * 
	 * @param pl
	 */
	private void getDocumentSentimentThreadList(final List<PageExtract> pl) {
		try {
			final DbConnector db = new DbConnector();

			new Thread() {
				@Override
				public void run() {
					for (PageExtract p : pl) {
						String content = p.getContent();
						if (!content.equals("")) {
							try {
								/**
								 * Put string into map and get tone
								 */
								Map<String, Object> params = new HashMap<String, Object>();
								params.put(AlchemyLanguage.TEXT, content);
								DocumentSentiment docSentiment = AlchemyLanguageUtil.getInstance()
										.getDocumentSentiment(params);

								db.executeUpdate(SqlConstants.PAGE_ALCHEMY_TONE_UPDATE,
										Arrays.asList(docSentiment.toString(), String.valueOf(p.getPageId())));
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}

				}

			}.start();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * This function writes a list of pages to the database
	 * 
	 * @param pageList
	 */
	public void writeToDatabase(List<Page> pageList) {
		DbConnector db = null;
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		for (Page page : pageList) {
			try {
				db.executeUpdate(SqlConstants.PAGE_INSERT, Arrays.asList(String.valueOf(page.getPageId()),
						page.getTitle(), String.valueOf(page.getNs()), "EN"));
				db.executeUpdate(SqlConstants.PAGE_CONTENT_INSERT,
						Arrays.asList(String.valueOf(page.getPageId()), page.getExtract()));
				int position = 0;
				for (String key : page.getExtractMap().keySet()) {
					String fullText = "";
					LinkedHashMap<String, String> textMap = page.getExtractMap().get(key);
					for (String textMapKey : textMap.keySet()) {
						fullText += textMap.get(textMapKey);
					}
					db.executeUpdate(SqlConstants.PAGE_EXTRACT_INSERT,
							Arrays.asList(String.valueOf(page.getPageId()), key, fullText, String.valueOf(position)));
					position++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The method calculates the outdegree and indegree depending on the
	 * characterlist. It only considers the characters for a specific parent
	 * page so that no cross reference is interfering the degrees.
	 */
	public void setDegree() {
		new Thread() {
			@Override
			public void run() {

				DbConnector db = null;
				try {
					db = new DbConnector();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				ResultSet r = null;
				try {
					r = db.executeQuery(SqlConstants.GET_PAGES_WITH_CHARACTERS);
					while (r.next()) {
						// Iterate over all Pages
						String pageId = r.getString("pageId");
						ResultSet characters = db.executeQuery(SqlConstants.BASE_QUERY_FOR_DEGREE,
								Arrays.asList(pageId, pageId));
						Map<String, Integer> outDegree = new HashMap<>();
						Map<String, Integer> inDegree = new HashMap<>();
						while (characters.next()) {
							String fromPage = characters.getString("fromPageId");
							String toPage = characters.getString("toPageId");
							// Count outdegree
							if (outDegree.containsKey(fromPage)) {
								outDegree.put(fromPage, outDegree.get(fromPage) + 1);
							} else {
								outDegree.put(fromPage, 1);
							}
							// Count indegree
							if (inDegree.containsKey(toPage)) {
								inDegree.put(toPage, inDegree.get(toPage) + 1);
							} else {
								inDegree.put(toPage, 1);
							}
						}
						Iterator<?> outDegreeIterator = outDegree.entrySet().iterator();
						while (outDegreeIterator.hasNext()) {
							@SuppressWarnings("rawtypes")
							Map.Entry pair = (Map.Entry) outDegreeIterator.next();
							db.executeUpdate(SqlConstants.UPDATE_OUTDEGREE,
									Arrays.asList(String.valueOf(pair.getValue()), (String) pair.getKey(), pageId));
							outDegreeIterator.remove(); // avoids a
							// ConcurrentModificationException
						}
						Iterator<?> inDegreeIterator = inDegree.entrySet().iterator();
						while (inDegreeIterator.hasNext()) {
							@SuppressWarnings("rawtypes")
							Map.Entry pair = (Map.Entry) inDegreeIterator.next();
							db.executeUpdate(SqlConstants.UPDATE_INDEGREE,
									Arrays.asList(String.valueOf(pair.getValue()), (String) pair.getKey(), pageId));
							inDegreeIterator.remove(); // avoids a
							// ConcurrentModificationException
						}

					}
					System.out.println("Successfully calculated degree.");
				} catch (SQLException e) {
					System.out.println("Problem while calculating degree.");
					e.printStackTrace();
				}
				try {
					db.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}.start();
	}

	/**
	 * a constant for Pagerank calculation
	 */
	private final float D = 0.85f;

	/**
	 * a SQL query for updating page rank for a specific page id.
	 */
	private String updatePageRankQuery = "UPDATE characters SET pagerank=? WHERE pageid=? AND characterId=?";
	/**
	 * a SQL query for getting the biggest value of a page id.
	 */
	private String MaxPageidQuery = "SELECT MAX(characterId) AS characterId FROM characters WHERE pageId=?";
	/**
	 * a SQL query for getting the total number of all page entities.
	 */
	private String pageCountQuery = "SELECT COUNT(*) as characters FROM characters WHERE pageId=?";
	/**
	 * a SQL query for getting all page ids and corresponding page ranks.
	 */
	private String pagerankPageidQuery = "SELECT characterId,pagerank FROM characters WHERE pageId=?";
	/**
	 * a SQL query for getting all connections between a specific page id and
	 * other page ids.
	 */
	private String connectionsQuery = "SELECT fromPageId, toPageId FROM connection Where fromPageId=";
	/**
	 * a SQL query for getting the number of all connections from a specific
	 * page id
	 */
	private String totalConnectionsQuery = "SELECT Count(*) AS connectionSum, fromPageId as fromPageId FROM connection WHERE toPageId IN (SELECT characterId FROM characters WHERE pageId=?) AND fromPageId IN (SELECT characterId FROM characters WHERE pageId=?) GROUP BY fromPageId";

	/**
	 * a SQL query for getting an outdegree value of a specific pageid.
	 */
	private String outdegreeQuery = "SELECT outdegree,characterId FROM characters WHERE pageId=?";

	public void setPagerank() {
		new Thread() {
			@Override
			public void run() {

				DbConnector db = null;
				try {
					db = new DbConnector();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				ResultSet r = null;
				try {
					r = db.executeQuery(SqlConstants.GET_PAGES_WITH_CHARACTERS);
					while (r.next()) {
						String pageId = r.getString("pageId");
						computePagerank(pageId);
					}
					System.out.println("Successfully calculated pagerank.");
				} catch (SQLException e) {
					System.out.println("Problem while calculating pagerank.");
					e.printStackTrace();
				}
				try {
					db.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}.start();

	}

	private void computePagerank(String epicPageId) {

		ResultSet pageid = null;
		ResultSet pageCount = null;
		ResultSet outdegree = null;
		DbConnector db = null;
		float[] pageRank = null;
		int[] pagerankid; // store pageIds here. Array is a collection of
							// pageIds. With this it is simplier to access all
							// pageIds
		int[][] connectionsArray = null;

		float outdegreeCount[] = null; // a variable needed for calculations
		int n = 0; // a constant for a number of pages; appears in calculations
					// of pagerank
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		// get Max, PageId, how many pages in total and outdegree for each page
		// Then use pageid to initialize the pagerank array
		try {
			pageid = db.executeQuery(MaxPageidQuery, Arrays.asList(epicPageId));
			pageCount = db.executeQuery(pageCountQuery, Arrays.asList(epicPageId));
			outdegree = db.executeQuery(outdegreeQuery, Arrays.asList(epicPageId));
			while (pageid.next()) {
				connectionsArray = new int[pageid.getInt("characterId") + 1][];
				pageRank = new float[pageid.getInt("characterId") + 1];
				outdegreeCount = new float[pageRank.length];
			}
			// get pages counted
			if (pageCount.next()) {
				n = pageCount.getInt("characters");
			}
			// get outdegrees of each page
			while (outdegree.next()) {
				// a division by D is done here instead of multiplication step
				// in the updatePagerank Method, which is done for optimization
				// purposes.
				outdegreeCount[outdegree.getInt("characterId")] = ((long) outdegree.getInt("outdegree") / D);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		pagerankid = new int[n];
		try {
			ResultSet connections = null;
			connections = db.executeQuery(totalConnectionsQuery, Arrays.asList(epicPageId, epicPageId));
			while (connections.next()) {

				connectionsArray[connections.getInt("fromPageId")] = new int[connections.getInt("connectionSum")];
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			pageid = db.executeQuery(pagerankPageidQuery, Arrays.asList(epicPageId));
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// initialize PageRank with value 1
		// and other variables for each pageid

		try {
			int pagerankidIndex = 0;
			while (pageid.next()) {
				pagerankid[pagerankidIndex] = pageid.getInt("characterId");
				pageRank[pagerankid[pagerankidIndex]] = 1f;
				pagerankidIndex++;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// initialize connections
		pageid = null;
		pageCount = null;
		outdegree = null;

		// initialize a value only if the corresponding pageid exists
		try {

			// create temp array for last indexes of each Pagerank
			int[] connectionsArrayCursor = new int[connectionsArray.length];

			ResultSet connections = null;
			for (int pagerankidIndex = 0; pagerankidIndex < pagerankid.length; pagerankidIndex++) {
				Statement st = db.getStatement();
				connections = st.executeQuery((connectionsQuery + pagerankid[pagerankidIndex]));
				while (connections.next()) {

					connectionsArray[pagerankid[pagerankidIndex]][connectionsArrayCursor[pagerankid[pagerankidIndex]]] = connections
							.getInt("topageid");
					connectionsArrayCursor[pagerankid[pagerankidIndex]]++;
				}
				connections = null;
				st.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		pageRank = updatePageRank(pageRank, connectionsArray, n, outdegreeCount);
		// save the actual pagerank to the database
		try {
			int batchArrayIndex = 0;
			int[] parameterPageId = new int[300000];
			int[] parameterCharacterId = new int[300000];
			float[] parameterPageRank = new float[300000];

			for (int pageRankIdIndex = 0; pageRankIdIndex < pagerankid.length; pageRankIdIndex++) {
				parameterPageId[batchArrayIndex] = pagerankid[pageRankIdIndex];
				parameterCharacterId[batchArrayIndex] = pagerankid[pageRankIdIndex];
				parameterPageRank[batchArrayIndex] = pageRank[pagerankid[pageRankIdIndex]];
				batchArrayIndex++;
				if (batchArrayIndex == 300000) {
					db.executeBatchPageRankUpdate(updatePageRankQuery, parameterPageRank, parameterPageId,
							parameterCharacterId);
					batchArrayIndex = 0;
				}
			}
			if (batchArrayIndex > 0) {
				db.executeBatchPageRankUpdate(updatePageRankQuery, parameterPageRank, parameterPageId,
						parameterCharacterId);
				batchArrayIndex = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * The method is used to only compute pagerank after all pre-work is being
	 * done. That means all necessary data is loaded from a database and is
	 * initialized as objects. The computation is done according to the
	 * recursive formula taken from Wikipedia. The implementation is done as an
	 * iterative process in order to mind errors occurring due to continuous
	 * recursion. Further the memory consumption and computation speed are taken
	 * into the consideration. One iteration consists of 3 steps: 1. calculate
	 * the sum of incoming page rank quotes for each page. 2. Add the constant
	 * (1-d). 3. Determine whether the difference to the previous result is
	 * significant, i.d. bigger than 0.00002.
	 * 
	 * @param pageRank
	 *            an array of pagerank values, where each index is a page id.
	 *            The last index is the maximum page id value and the 0-index is
	 *            not used.
	 * @param connectionsArray
	 *            For each page id an array of connections to other page id is
	 *            stored here. The connection definition is used according to
	 *            the page rank calculation. The first index is page id. The
	 *            second index is the index of a connection. Each array cell
	 *            contains the destination page id.
	 * @param n
	 *            total number of pages.
	 * @param outdegreeCount
	 *            outdegree of each page id. The index of the array is a page
	 *            id.
	 * @return calculated array pageranks for each page id. The index is a page
	 *         id .
	 */
	public float[] updatePageRank(float[] pageRank, int[][] connectionsArray, int n, float[] outdegreeCount) {
		float prconst = (float) ((1d - D));
		boolean noChange = true;
		float[] pageRankTmp = new float[pageRank.length];
		do {
			noChange = true;
			// initiate sum operation of the pagerank
			for (int fromPageidIndex = 0; fromPageidIndex < connectionsArray.length; fromPageidIndex++) {
				if (connectionsArray[fromPageidIndex] != null)
					for (int toPageidIndex = 0; toPageidIndex < connectionsArray[fromPageidIndex].length; toPageidIndex++) {
						pageRankTmp[connectionsArray[fromPageidIndex][toPageidIndex]] = pageRankTmp[connectionsArray[fromPageidIndex][toPageidIndex]]
								+ (pageRank[fromPageidIndex] / outdegreeCount[fromPageidIndex]);
					}
			}
			for (int i = 1; i < pageRankTmp.length; i++) {
				pageRankTmp[i] = prconst + pageRankTmp[i];
				if (noChange && (pageRank[i] - pageRankTmp[i] > 0.00002f)
						|| (pageRank[i] - pageRankTmp[i] < -0.00002f)) {
					noChange = false;
				}

			}
			for (int i = 0; i < pageRank.length; i++) {
				pageRank[i] = pageRankTmp[i];
				pageRankTmp[i] = 0f;
			}
		} while (!noChange);
		return pageRank;
	}

}
