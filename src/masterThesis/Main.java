package masterThesis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import util.ApiCaller;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		String path = "C:/Users/praed/Desktop/Neues Textdokument.txt";
		List<String> category = new ArrayList<>();
		category.add("Epic poems");
		category.add("Epic poems in French‎");
		category.add("Epic poems in German");
		category.add("Epic poems in English");
		category.add("Turkic epic poems‎");
		category.add("Epic poems in Spanish");
		category.add("Epic poems in Italian");
		category.add("Epic poems in Hungarian");
		category.add("Epic poems in Greek");

		ApiCaller api;
		try {
			api = new ApiCaller(path, category);
			api.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
