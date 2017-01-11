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

// TODO: Auto-generated Javadoc
/**
 * This class contains the parameters which are submitted in a call to the API
 * of receptivity (Pennebaker)
 * 
 * See https://app.receptiviti.com/v2/api/spec for further information on how to
 * use this in an API call
 */
public class Content {

	/** The id. */
	@JsonIgnore
	public String id;

	/** The snapshot. */
	@JsonIgnore
	public List<String> snapshot;

	/** The name. */
	@JsonProperty(value = "content_handle")
	public String name;

	/** The content. */
	@JsonProperty(value = "language_content")
	public String content;

	/** The source. */
	@JsonProperty(value = "content_source")
	public Integer source;

	/**
	 * Instantiates a new content.
	 *
	 * @param textToAnalzye
	 *            the text to analzye
	 */
	public Content(String textToAnalzye) {
		this.id = null;
		this.source = 0;
		this.content = textToAnalzye;
	}

	/**
	 * Instantiates a new content.
	 *
	 * @param content
	 *            the content
	 */
	public Content(Content content) {
		this.id = content.id;
		this.source = content.source;
		this.name = content.name;
		this.content = content.content;
	}
}
