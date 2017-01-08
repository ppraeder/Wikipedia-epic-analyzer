/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package masterThesis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONException;

import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;
import com.mashape.unirest.http.exceptions.UnirestException;

import entity.Person;
import util.ApiCaller;
import util.CommonFunctions;
import util.IO;
import util.LinkApi;
import util.ToneAnalyzerUtil;
import util.database.DbConnector;
import util.database.SqlConstants;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {

		String path = "C:/Users/praed/Desktop/Neues Textdokument.txt";
		List<String> category = new ArrayList<>();
		// category.add("Epic poems");
		// category.add("Epic poems in French‎");
		// category.add("Epic poems in German");
		// category.add("Epic poems in English");
		// category.add("Turkic epic poems‎");
		// category.add("Epic poems in Spanish");
		// category.add("Epic poems in Italian");
		// category.add("Epic poems in Hungarian");
		// category.add("Epic poems in Greek");
		// category.add("A_Song_of_Ice_and_Fire_books");
		IO io = new IO();
		// io.writeToCSV(io.getExtractsFromDatabase(),
		// "C:/Users/praed/Desktop/Neues Textdokument.csv");
//		try {
//			io.getLIWCTone();
//		} catch (UnirestException | JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		io.getIBMTone();
		
		
		// LinkApi la = new LinkApi();
		// for (Person p : personList) {
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
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}
