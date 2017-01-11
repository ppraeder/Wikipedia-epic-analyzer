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
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import entity.Category;
import entity.Page;

/**
 * This Class contains all methods regarding category fetch in wikipedia
 */
public class CategoryApi {

	/** API Call to receive the categorymembers. */
	private final String CATMEMBERS = "http://en.wikipedia.org/w/api.php?action=query&cmlimit=500&format=json&list=categorymembers&cmtype=%s&cmtitle=Category:%s&cmcontinue=%s";

	/** The PageApi. */
	PageApi p;

	/** This is the pagination index */
	private String cmcontinue = "";

	/** The json. */
	JSONObject json = null;

	/**
	 * Instantiates a new category API.
	 */
	public CategoryApi() {
		p = new PageApi();
	}

	public List<Page> getCategoryMembers(Category c) throws Exception {
		return getCategoryMembersOrSubcategories(c, false);
	}

	public List<Page> getCategorySubCategories(Category c) throws Exception {
		return getCategoryMembersOrSubcategories(c, true);
	}

	/**
	 * The method gets a list of pages who belong to a certain category from
	 * Wikipedia.
	 *
	 * @param c
	 *            The category which is common to the result list of pages
	 * @return The list of people who belong to a certain category
	 * @throws Exception
	 *             the exception
	 */
	private List<Page> getCategoryMembersOrSubcategories(Category c, boolean subcategories) throws Exception {
		List<Page> list = new ArrayList<Page>();
		// The parameter cmtype specifies if the query returns subcategories or
		// the pages in the category
		String cmtype = "page";
		do {
			if (subcategories) {
				cmtype = "subcat";
			} else {
				cmtype = "page";
			}
			String query = String.format(CATMEMBERS, cmtype, CommonFunctions.getEncoded(c.getTitle()),
					CommonFunctions.getEncoded(cmcontinue));
			HttpUtil h = new HttpUtil();
			String result = h.sendGet(query);
			json = CommonFunctions.getJSON(result);
			list.addAll(p.getPageInfoFromCategoryList(json));

		} while (getCmContinue());
		return list;
	}

	/**
	 * A method for determining whether a json query has more results.
	 *
	 * @return The method returns false if the end is reached and true if the
	 *         end is not reached
	 * @throws JSONException
	 *             the JSON exception
	 */
	public boolean getCmContinue() throws JSONException {
		if (!json.has("query-continue")) {
			cmcontinue = "";
			return false;
		}
		cmcontinue = CommonFunctions.getSubJSON(json, "query-continue").getJSONObject("categorymembers")
				.getString("cmcontinue");

		return true;
	}
}
