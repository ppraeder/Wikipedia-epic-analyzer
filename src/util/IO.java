package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import entity.Person;
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
				db.executeUpdate(SqlConstants.PAGE_CONTENT_INSERT, Arrays.asList(String.valueOf(person.getPageid()),
						person.getExtract()));
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
