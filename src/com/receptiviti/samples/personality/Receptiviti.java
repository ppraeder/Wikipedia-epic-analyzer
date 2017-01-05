package com.receptiviti.samples.personality;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class Receptiviti {
	String server;
	String api_key;
	String api_secret;

	public Receptiviti(String server, String api_key, String api_secret) {
		this.server = server;
		this.api_key = api_key;
		this.api_secret = api_secret;
		Unirest.setDefaultHeader("X-API-KEY", this.api_key);
		Unirest.setDefaultHeader("X-API-SECRET-KEY", this.api_secret);

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

	public Person getPersonID(Person person) throws UnirestException {
		String url = String.format("%s/v2/api/person", this.server);
		HttpResponse<JsonNode> response;
		String id = null;

		response = Unirest.get(url).queryString("person_handle", person.handle).asJson();
		if (response.getStatus() == 200) {
			if (response.getBody().getArray().length() == 1) {
				try {
					id = response.getBody().getArray().getJSONObject(0).getString("_id");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {

		}

		Person p = new Person(person);
		p.id = id;
		return p;
	}

	public Person savePerson(Person person) throws UnirestException {
		String url = String.format("%s/v2/api/person", this.server);
		HttpResponse<JsonNode> response;
		String id = null;

		response = Unirest.post(url).header("Content-Type", "application/json").body(person).asJson();
		if (response.getStatus() == 200) {
			try {
				id = response.getBody().getArray().getJSONObject(0).getString("_id");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

		}

		Person p = new Person(person);
		p.id = id;
		return p;
	}

	public Content analyseContent(Person person, Content content) throws UnirestException, JSONException {
		String url = String.format("%s/v2/api/person/%s/contents", this.server, person.id);
		HttpResponse<JsonNode> response;
		String id = null;
		ArrayList<String> snapshot = new ArrayList<>();

		response = Unirest.post(url).header("Content-Type", "application/json").body(content).asJson();
		if (response.getStatus() == 200) {
			try {
				id = response.getBody().getObject().getString("_id");
				JSONArray array;

				array = response.getBody().getObject().getJSONArray("personality_snapshot");

				for (int i = 0; i < array.length(); i++) {
					try {
						snapshot.add(array.getJSONObject(i).getString("summary") + ": "
								+ array.getJSONObject(i).getString("description"));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {

		}

		Content i = new Content(content);
		i.id = id;
		i.snapshot = snapshot;
		return i;
	}
}
