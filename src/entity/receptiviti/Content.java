/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package entity.receptiviti;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * This class contains the parameters which are submitted in a call to the API of receptivity (Pennebaker)
 * 
 * See https://app.receptiviti.com/v2/api/spec for further information on how to use this in an API call
 */
public class Content {
	@JsonIgnore
	public String id;

	@JsonIgnore
	public List<String> snapshot;

	@JsonProperty(value = "content_handle")
	public String name;

	@JsonProperty(value = "language_content")
	public String content;

	@JsonProperty(value = "content_source")
	public Integer source;

	public Content(String textToAnalzye) {
		this.id = null;
		this.source = 0;
		this.content = textToAnalzye;
	}

	public Content(Content content) {
		this.id = content.id;
		this.source = content.source;
		this.name = content.name;
		this.content = content.content;
	}
}
