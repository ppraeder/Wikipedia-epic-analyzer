/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package masterThesis;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mashape.unirest.http.exceptions.UnirestException;

import entity.Page;
import util.IO;

public class Main {

	public static void main(String[] args) throws SQLException, IOException, JSONException {

		String path = "C:/Users/praed/Desktop/Neues Textdokument.csv";
		List<String> category = new ArrayList<>();
		category.add("Epic poems");
		IO io = new IO();
		// io.writeToCSV(path);
		// io.openBrowser();
//		io.getLinksFromWikipediaConnection();
		io.setDegree();

		// System.out.println(body);

		// io.getAlchemyTone();
		// try {
		// io.getLIWCTone();
		// } catch (UnirestException | JSONException e) {
		// e.printStackTrace();
		// }
		//
		// io.getIBMTone();

		// LinkApi la = new LinkApi();
		// for (Person p : pageList) {
		// try {
		// la.getOutgoingLinks(p);
		// for (Person p2 : p.getLinkList()) {
		// db.executeUpdate(SqlConstants.PERSON_INSERT,
		// Arrays.asList(String.valueOf(p.getPageid()),
		// p2.getTitle(), String.valueOf(p2.getNs()), "EN"));
		// }
		// } catch (Exception e1) {
		//
		// e1.printStackTrace();
		// }
		//
		// }
		// try {
		// api = new ApiCaller(path, category);
		// api.start();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}
}
