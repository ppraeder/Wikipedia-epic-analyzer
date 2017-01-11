/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entity.Page;

/**
 * The Class PageApi.
 */
public class PageApi {

	/** The apcontinue. */
	private String apcontinue = "";

	/** The ap continue list. */
	private List<String> apContinueList;

	private String contentQuery = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&explaintext&pageids=";
	private String infoQuery = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=info&titles=";

	/**
	 * Gets the page info.
	 *
	 * @param json
	 *            the json
	 * @return the page info
	 * @throws JSONException
	 *             the JSON exception
	 */
	public List<Page> getPageInfo(JSONObject json) throws JSONException {
		if (!json.has("query")) {
			return null;
		}
		JSONArray jsonArray = CommonFunctions.getSubJSON(json, "query").getJSONArray("allpages");

		List<Page> returnList = new ArrayList<Page>();
		for (int i = 0; i < jsonArray.length(); i++) {
			Gson gson = new Gson();
			Page p = gson.fromJson(jsonArray.getJSONObject(i).toString(), Page.class);

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
	public List<Page> getPageInfoFromCategoryList(JSONObject json) throws JSONException {
		if (!json.has("query")) {
			return null;
		}
		JSONArray jsonArray = CommonFunctions.getSubJSON(json, "query").getJSONArray("categorymembers");

		Gson gson = new Gson();
		List<Page> returnList = gson.fromJson(jsonArray.toString(), new TypeToken<List<Page>>() {
		}.getType());
		HttpUtil h = new HttpUtil();
		for (Page person : returnList) {
			int pageId = person.getPageId();
			String result = null;
			try {
				result = h.sendGet(contentQuery + pageId);
			} catch (IOException e) {
				e.printStackTrace();
			}
			json = CommonFunctions.getJSON(result);
			Object strippedJson = ((JSONObject) ((JSONObject) json.get("query")).get("pages"))
					.get(String.valueOf(pageId));
			Page p = gson.fromJson(strippedJson.toString(), new TypeToken<Page>() {
			}.getType());
			if (p.getPageId() == pageId) {
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
	public List<Page> getPageInfoFromLinkList(JSONObject json, Page page) throws JSONException {
		if (!json.has("query")) {
			return null;
		}

		JSONObject j = CommonFunctions.getSubJSON(json, "query").getJSONObject("pages")
				.getJSONObject(String.valueOf(page.getPageId()));
		if (!j.has("links")) {
			return new ArrayList<Page>();
		}
		JSONArray jsonArray = j.getJSONArray("links");
		Gson gson = new Gson();
		List<Page> returnList = gson.fromJson(jsonArray.toString(), new TypeToken<List<Page>>() {
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

	public Page getPageInfoForTitle(String pageTitle) throws JSONException {
		Gson gson = new Gson();

		HttpUtil h = new HttpUtil();
		String result = null;
		try {
			result = h.sendGet(infoQuery + pageTitle);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JSONObject json = CommonFunctions.getJSON(result);
		JSONObject strippedJson = ((JSONObject) ((JSONObject) json.get("query")).get("pages"));
		Iterator<?> keys = strippedJson.keys();
		Page p = null;
		while (keys.hasNext()) {
			String key = (String) keys.next();
			if (strippedJson.get(key) instanceof JSONObject) {
				Object o = strippedJson.get(key);
				p = gson.fromJson(o.toString(), new TypeToken<Page>() {
				}.getType());
			}
		}

		return p;
	}
}
