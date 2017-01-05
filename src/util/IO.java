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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang.StringEscapeUtils;

import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ElementTone;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.SentenceTone;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneCategory;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneScore;

import entity.PageExtract;
import entity.Person;
import util.database.DbConnector;
import util.database.SqlConstants;

/**
 * 
 * The class is used to access the contents of a Json formatted text.
 *
 */
public class IO {

	private String liwcApiKey = "584da1446c904d05b7115169";
	private String liwcApiSecretKey = "pd6fl5353JU6yIksMvjoM0uGkwbjydD44QtpvFztT4c";
	private String liwcPersonId = "584da2a3f86167081ba4e8ff";

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
			Person p = new Person(pageId, title);
			ResultSet rs = db.executeQuery(SqlConstants.PAGE_EXTRACT_GET, Arrays.asList(String.valueOf(pageId)));
			List<PageExtract> peList = new ArrayList<>();
			while (rs.next()) {
				String heading = rs.getString("heading");
				String content = rs.getString("content");
				ToneAnalysis ibmTone = gson.fromJson(rs.getString("ibmTone"), ToneAnalysis.class);
				peList.add(new PageExtract(heading, content, ibmTone));
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
		out.write(
				"pageId;title;heading;content;Anger;Disgust;Fear;Joy;Sadness;Analytical;Confident;Tentative;Openness;Conscientiousness;Extraversion;Agreeableness;Emotional Range;");
		out.write("\n");
		for (Person person : personList) {
			int pageId = person.getPageid();
			String title = person.getTitle();
			for (PageExtract pageExtract : person.getPageExtracts()) {
				String heading = pageExtract.getHeading();
				String content = StringEscapeUtils.escapeJava(pageExtract.getContent().replaceAll(";", "|"));
				ToneAnalysis ibmTone = pageExtract.getIbmTone();

				if (ibmTone != null) {
					out.write(pageId + ";" + title + ";" + heading + ";" + content + ";");
					ElementTone documentTone = ibmTone.getDocumentTone();
					List<ToneCategory> toneCategories = documentTone.getTones();
					for (ToneCategory toneCategory : toneCategories) {
						List<ToneScore> toneScores = toneCategory.getTones();
						for (ToneScore toneScore : toneScores) {
							String name = toneScore.getName();
							double score = toneScore.getScore();
							out.write(String.valueOf(score).replace('.', ','));
							out.write(";");
						}
					}
					List<SentenceTone> sentencesTone = ibmTone.getSentencesTone();
					out.write("\n");
				}

			}

		}
		out.close();
		return;

	}

	public void getIbmTone() {

	}

	public void getLIWCTone() {
		try {

			String url = "https://app.receptiviti.com/v2/api/person/" + liwcPersonId + "/contents";

			URL obj = new URL(url);
			
			HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setDoOutput(true);

			conn.setRequestMethod("PUT");

			String userpass = "user" + ":" + "pass";
			String basicAuth = "Basic "
					+ javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes("UTF-8"));
			conn.setRequestProperty("Authorization", basicAuth);

			String data = "{\"format\":\"json\",\"pattern\":\"#\"}";
			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
			out.write(data);
			out.close();

			new InputStreamReader(conn.getInputStream());

		} catch (Exception e) {
			e.printStackTrace();
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
