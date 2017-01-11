/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util.external;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import entity.receptiviti.Content;
import entity.receptiviti.ReceptivitiAnalysis;

import org.json.JSONException;
import java.io.IOException;

/**
 * This class contains the API keys and instance call for Receptiviti (LIWC) see
 * http://www.receptiviti.ai/ for further information.
 *
 */
public class ReceptivitiUtil {

	private static ReceptivitiUtil instance;

	/**
	 * Create your own API key at https://app.receptiviti.com
	 */
	private static final String LIWS_API_KEY = "584da1446c904d05b7115169";
	/**
	 * Create your own API secret key at https://app.receptiviti.com
	 */
	private static final String LIWC_API_SECRET = "qPym2BVXN7xWgXeXjGQ2znOOHQDd4yeogYpJ3kvbPAo";
	/**
	 * You have to generate a person manually in https://app.receptiviti.com and
	 * add the persons id to get the service running
	 */
	private static final String LIWC_PERSON_ID = "584da2a3f86167081ba4e8ff";
	/**
	 * 
	 */
	private static final String LIWC_SERVER = "https://app.receptiviti.com";

	private static final String SERVER_PATH = "%s/v2/api/person/%s/contents";

	/**
	 * Constructor for the class. It creates the Unirest and set the default
	 * values. see http://www.receptiviti.ai/entity.receptiviti-api-user-manual/
	 * for further information
	 */
	private ReceptivitiUtil() {
		/**
		 * For more information see http://unirest.io/java.html
		 */
		Unirest.setDefaultHeader("X-API-KEY", ReceptivitiUtil.LIWS_API_KEY);
		Unirest.setDefaultHeader("X-API-SECRET-KEY", ReceptivitiUtil.LIWC_API_SECRET);

		/**
		 * Create the object mapper
		 */
		Unirest.setObjectMapper(new ObjectMapper() {

			private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

			public <T> T readValue(String value, Class<T> valueType) {
				try {
					return jacksonObjectMapper.readValue(value, valueType);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			public String writeValue(Object value) {
				try {
					return jacksonObjectMapper.writeValueAsString(value);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	/**
	 *
	 * @return the singleton instance
	 */
	public static synchronized ReceptivitiUtil getInstance() {
		if (ReceptivitiUtil.instance == null) {
			ReceptivitiUtil.instance = new ReceptivitiUtil();
		}
		return ReceptivitiUtil.instance;
	}

	/**
	 * Retrieves receptivity analysis from server.
	 * 
	 * @param content
	 *            The text to be analyzed
	 * @return The analysis or null if the response code is not 200
	 * @throws UnirestException
	 * @throws JSONException
	 */
	public ReceptivitiAnalysis analyseContent(Content content) throws UnirestException, JSONException {
		String url = String.format(ReceptivitiUtil.SERVER_PATH, ReceptivitiUtil.LIWC_SERVER,
				ReceptivitiUtil.LIWC_PERSON_ID);
		HttpResponse<ReceptivitiAnalysis> analysis;
		analysis = Unirest.post(url).header("Content-Type", "application/json").body(content)
				.asObject(ReceptivitiAnalysis.class);
		if (analysis.getStatus() == 200) {
			return analysis.getBody();
		} else {
			return null;
		}
	}
}
