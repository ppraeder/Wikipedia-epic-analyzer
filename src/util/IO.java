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
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang.StringEscapeUtils;
import org.json.JSONException;

import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ElementTone;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.SentenceTone;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneCategory;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneScore;
import com.mashape.unirest.http.exceptions.UnirestException;

import entity.PageExtract;
import entity.Person;
import entity.receptiviti.Content;
import entity.receptiviti.ReceptivitiAnalysis;
import util.database.DbConnector;
import util.database.SqlConstants;

/**
 * 
 * The class is used to access the contents of a Json formatted text.
 *
 */
public class IO {
	/**
	 * A content is read from a file and is converted to a person object
	 * 
	 * @param path
	 *            a path to a file with content to convert
	 * @return a list of person objects
	 * 
	 */
	public List<Person> readFromJsonFile(String path) throws FileNotFoundException {
		Scanner testScanner = new Scanner(new BufferedReader(new FileReader(path)));
		Gson g = new Gson();
		List<Person> pageList = new ArrayList<>();
		while (testScanner.hasNext()) {
			pageList.add(g.fromJson(testScanner.nextLine(), Person.class));
		}
		g = null;
		testScanner.close();
		path = null;
		return pageList;
	}

	/**
	 * A method to write a list of persons in Json format to file
	 * 
	 * @param personList
	 *            a list of person objects
	 * @param path
	 *            a path to a file, where the list of persons should be written
	 * 
	 */
	public void writeToJsonFile(List<Person> personList, String path) throws IOException {
		Gson g = new Gson();
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
		for (Iterator<Person> iterator = personList.iterator(); iterator.hasNext();) {
			out.write(g.toJson(iterator.next()) + "\n");
		}
		out.close();
	}

	public List<Person> getExtractsFromDatabase() throws SQLException {
		DbConnector db = null;
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet pageResult = db.executeQuery("SELECT * FROM pages");
		List<Person> personList = new ArrayList<>();
		Gson gson = new Gson();
		while (pageResult.next()) {
			int pageId = pageResult.getInt("pageId");
			String title = pageResult.getString("title");
			ToneAnalysis ibmTone = gson.fromJson(pageResult.getString("ibmTone"), ToneAnalysis.class);
			ReceptivitiAnalysis liwcTone = gson.fromJson(pageResult.getString("liwcTone"), ReceptivitiAnalysis.class);
			Person p = new Person(pageId, title);
			p.setIbmTone(ibmTone);
			p.setLiwcTone(liwcTone);
			ResultSet rs = db.executeQuery(SqlConstants.PAGE_EXTRACT_GET, Arrays.asList(String.valueOf(pageId)));
			List<PageExtract> peList = new ArrayList<>();
			while (rs.next()) {
				String heading = rs.getString("heading");
				String content = rs.getString("content");
				// ToneAnalysis ibmTone = gson.fromJson(rs.getString("ibmTone"),
				// ToneAnalysis.class);
				// ReceptivitiAnalysis liwcTone =
				// gson.fromJson(rs.getString("liwcTone"),
				// ReceptivitiAnalysis.class);
				PageExtract pe = new PageExtract(heading, content);
				pe.setLiwcTone(liwcTone);
				peList.add(pe);
			}
			rs.close();
			p.setPageExtracts(peList);
			personList.add(p);
		}
		pageResult.close();
		return personList;
	}

	public void writeToCSV(List<Person> personList, String path) throws IOException {
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
		// Titel
		out.write("pageId;title;earliestYear;latestYear;heading;content;");
		// IBM
		out.write(
				"Anger;Disgust;Fear;Joy;Sadness;Analytical;Confident;Tentative;Openness;Conscientiousness;Extraversion;Agreeableness;Emotional Range;");
		// LIWC
		out.write(
				"LIWC;Word Count;Analytical thinking;Clout;Authentic;Emotional tone;Positive Emotion;Negative Emotion;Anxiety;Anger;Sadness;Tentative;Certainty,Power;Risk;Death");
		out.write("\n");
		for (Person person : personList) {
			int pageId = person.getPageid();
			String title = person.getTitle();
			for (PageExtract pageExtract : person.getPageExtracts()) {
				String heading = pageExtract.getHeading();
				String content = StringEscapeUtils.escapeJava(pageExtract.getContent().replaceAll(";", "|"));
				ToneAnalysis ibmTone = pageExtract.getIbmTone();
				ReceptivitiAnalysis liwcTone = pageExtract.getLiwcTone();

				if (ibmTone != null) {
					out.write(pageId + ";" + title + ";" + heading + ";" + content + ";");
					ElementTone documentTone = ibmTone.getDocumentTone();
					List<ToneCategory> toneCategories = documentTone.getTones();
					for (ToneCategory toneCategory : toneCategories) {
						List<ToneScore> toneScores = toneCategory.getTones();
						for (ToneScore toneScore : toneScores) {
//							String name = toneScore.getName();
							double score = toneScore.getScore();
							out.write(String.valueOf(score).replace('.', ','));
							out.write(";");
						}
					}

					// List<SentenceTone> sentencesTone =
					// ibmTone.getSentencesTone();
					out.write(";");

					if (liwcTone != null) {
						Integer wordCount = liwcTone.getLiwcScores().getWc();
						Double analyticalThinking = liwcTone.getLiwcScores().getAnalytic();
						int clout = liwcTone.getLiwcScores().getClout();
						int authentic = liwcTone.getLiwcScores().getAuthentic();
						Double emotionalTone = liwcTone.getLiwcScores().getTone();
						int wordsPerSentence = liwcTone.getLiwcScores().getWps();
						int dictionaryWords = liwcTone.getLiwcScores().getDic();

						int posEmo = liwcTone.getLiwcScores().getCategories().getPosemo();
						int negEmo = liwcTone.getLiwcScores().getCategories().getNegemo();
						int anxiety = liwcTone.getLiwcScores().getCategories().getAnx();
						int anger = liwcTone.getLiwcScores().getCategories().getAnger();
						int sadness = liwcTone.getLiwcScores().getCategories().getSad();
						int tentative = liwcTone.getLiwcScores().getCategories().getTentat();
						int certainty = liwcTone.getLiwcScores().getCategories().getCertain();
						int power = liwcTone.getLiwcScores().getCategories().getPower();
						int risk = liwcTone.getLiwcScores().getCategories().getRisk();
						int death = liwcTone.getLiwcScores().getCategories().getDeath();

						out.write(wordCount + ";");
						out.write(String.valueOf(analyticalThinking).replace('.', ',') + ";");
						out.write(clout + ";");
						out.write(authentic + ";");
						out.write(String.valueOf(emotionalTone).replace('.', ',') + ";");
						out.write(dictionaryWords + ";");
						out.write(posEmo + ";");
						out.write(negEmo + ";");
						out.write(anxiety + ";");
						out.write(anger + ";");
						out.write(sadness + ";");
						out.write(tentative + ";");
						out.write(certainty + ";");
						out.write(power + ";");
						out.write(risk + ";");
						out.write(death + ";");
					}
				}
				out.write("\n");

			}
			out.close();
			return;
		}

	}

	public void getIBMTone() throws SQLException {
		for (List<PageExtract> splitList : CommonFunctions.split(getList(), 30)) {
			getIBMToneThreadList(splitList);
		}
	}

	public void getLIWCTone() throws UnirestException, JSONException, SQLException {
		for (List<PageExtract> splitList : CommonFunctions.split(getList(), 30)) {
			getLIWCToneThreadList(splitList);
		}
	}

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

	public void getLIWCToneThreadList(final List<PageExtract> pl) {
		final Receptiviti r = new Receptiviti(liwcServer, liwcApiKey, liwcApiSecretKey);

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
								ReceptivitiAnalysis a = r.analyseContent(liwcPersonId, new Content(content));
								db.executeUpdate(SqlConstants.PAGE_LIWC_TONE_UPDATE,
										Arrays.asList(g.toJson(a), String.valueOf(p.getPageId())));
							} catch (UnirestException | JSONException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
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

	public void getIBMToneThreadList(final List<PageExtract> pl) {
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
								ToneAnalysis a = ToneAnalyzerUtil.getInstance().getTone(content);

								db.executeUpdate(SqlConstants.PAGE_IBM_TONE_UPDATE,
										Arrays.asList(a.toString(), String.valueOf(p.getPageId())));
							} catch (SQLException e) {
								// TODO Auto-generated catch block
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

	public void writeToDatabase(List<Person> personList) {
		DbConnector db = null;
		try {
			db = new DbConnector();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (Person person : personList) {
			try {
				db.executeUpdate(SqlConstants.PAGE_INSERT, Arrays.asList(String.valueOf(person.getPageid()),
						person.getTitle(), String.valueOf(person.getNs()), "EN"));
				db.executeUpdate(SqlConstants.PAGE_CONTENT_INSERT,
						Arrays.asList(String.valueOf(person.getPageid()), person.getExtract()));
				int position = 0;
				for (String key : person.getExtractMap().keySet()) {
					String fullText = "";
					LinkedHashMap<String, String> textMap = person.getExtractMap().get(key);
					for (String textMapKey : textMap.keySet()) {
						fullText += textMap.get(textMapKey);
					}
					db.executeUpdate(SqlConstants.PAGE_EXTRACT_INSERT,
							Arrays.asList(String.valueOf(person.getPageid()), key, fullText, String.valueOf(position)));
					position++;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
