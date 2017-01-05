package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entity.Person;

// TODO: Auto-generated Javadoc
/**
 * The Class PageApi.
 */
public class PageApi {

	/** The apcontinue. */
	private String apcontinue = "";

	/** The ap continue list. */
	private List<String> apContinueList;

	private String contentQuery = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&explaintext&pageids=";

	/**
	 * Gets the page info.
	 *
	 * @param json
	 *            the json
	 * @return the page info
	 * @throws JSONException
	 *             the JSON exception
	 */
	public List<Person> getPageInfo(JSONObject json) throws JSONException {
		if (!json.has("query")) {
			return null;
		}
		JSONArray jsonArray = CommonFunctions.getSubJSON(json, "query").getJSONArray("allpages");

		List<Person> returnList = new ArrayList<Person>();
		for (int i = 0; i < jsonArray.length(); i++) {
			Gson gson = new Gson();
			Person p = gson.fromJson(jsonArray.getJSONObject(i).toString(), Person.class);

			returnList.add(p);
		}

		return returnList;
	}

	/**
	 * Gets the page info from category list.
	 *
	 * @param json
	 *            the json
	 * @return the page info from category list
	 * @throws JSONException
	 *             the JSON exception
	 */
	public List<Person> getPageInfoFromCategoryList(JSONObject json) throws JSONException {
		if (!json.has("query")) {
			return null;
		}
		JSONArray jsonArray = CommonFunctions.getSubJSON(json, "query").getJSONArray("categorymembers");

		Gson gson = new Gson();
		List<Person> returnList = gson.fromJson(jsonArray.toString(), new TypeToken<List<Person>>() {
		}.getType());
		HttpUtil h = new HttpUtil();
		for (Person person : returnList) {
			int pageId = person.getPageid();
			String result = null;
			try {
				result = h.sendGet(contentQuery + pageId);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			json = CommonFunctions.getJSON(result);
			Object strippedJson = ((JSONObject) ((JSONObject) json.get("query")).get("pages"))
					.get(String.valueOf(pageId));
			Person p = gson.fromJson(strippedJson.toString(), new TypeToken<Person>() {
			}.getType());
			if (p.getPageid() == pageId) {
				person.setExtract(p.getExtract());
			}

		}
		return returnList;
	}

	/**
	 * Gets the page info from link list.
	 *
	 * @param json
	 *            the json
	 * @param page
	 *            the page
	 * @return the page info from link list
	 * @throws JSONException
	 *             the JSON exception
	 */
	public List<Person> getPageInfoFromLinkList(JSONObject json, Person page) throws JSONException {
		if (!json.has("query")) {
			return null;
		}

		JSONObject j = CommonFunctions.getSubJSON(json, "query").getJSONObject("pages")
				.getJSONObject(String.valueOf(page.getPageid()));
		if(!j.has("links"))
		{
			return new ArrayList<Person>();
		}
		JSONArray jsonArray = j.getJSONArray("links");
		Gson gson = new Gson();
		List<Person> returnList = gson.fromJson(jsonArray.toString(), new TypeToken<List<Person>>() {
		}.getType());

		return returnList;
	}

	/**
	 * Gets the pagination index.
	 *
	 * @param json
	 *            the json
	 * @return the ap continue
	 * @throws JSONException
	 *             the JSON exception
	 */
	public boolean getApContinue(JSONObject json) throws JSONException {
		if (!json.has("query-continue")) {
			apcontinue = "";
			return false;
		}
		apcontinue = CommonFunctions.getSubJSON(json, "query-continue").getJSONObject("allpages")
				.getString("apcontinue");
		apContinueList.add(apcontinue);

		return true;
	}
}
