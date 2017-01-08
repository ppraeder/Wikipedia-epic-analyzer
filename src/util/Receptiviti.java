/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package util;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import entity.receptiviti.Content;
import entity.receptiviti.ReceptivitiAnalysis;

import org.json.JSONException;
import java.io.IOException;

public class Receptiviti {

	/**
	 * Create your own API key at https://app.receptiviti.com
	 */
	private String liwcApiKey = "584da1446c904d05b7115169";
	/**
	 * Create your own API secret key at https://app.receptiviti.com
	 */
	private String liwcApiSecretKey = "qPym2BVXN7xWgXeXjGQ2znOOHQDd4yeogYpJ3kvbPAo";
	/**
	 * You have to generate a person manually in https://app.receptiviti.com and
	 * add the persons id to get the service running
	 */
	private String liwcPersonId = "584da2a3f86167081ba4e8ff";
	/**
	 * 
	 */
	private String liwcServer = "https://app.receptiviti.com";

	private final String SERVER_PATH = "%s/v2/api/person/%s/contents";

	/**
	 * Constructor for the class. It creates the Unirest and set the default
	 * values.
	 * see http://www.receptiviti.ai/entity.receptiviti-api-user-manual/ for further information
	 */
	public Receptiviti() {
		/**
		 * For more information see http://unirest.io/java.html
		 */
		Unirest.setDefaultHeader("X-API-KEY", this.liwcApiKey);
		Unirest.setDefaultHeader("X-API-SECRET-KEY", this.liwcApiSecretKey);

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
	 * Retrieves receptivity analysis from server.
	 * 
	 * @param content
	 *            The text to be analyzed
	 * @return The analysis or null if the response code is not 200
	 * @throws UnirestException
	 * @throws JSONException
	 */
	public ReceptivitiAnalysis analyseContent(Content content) throws UnirestException, JSONException {
		String url = String.format(this.SERVER_PATH, this.liwcServer, this.liwcPersonId);
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
