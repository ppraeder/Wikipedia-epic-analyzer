package com.receptiviti.samples.personality;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
