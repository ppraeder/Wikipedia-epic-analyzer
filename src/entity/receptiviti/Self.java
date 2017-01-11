/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */

package entity.receptiviti;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * This class is part of the analysis result when calling the receptivity API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "href", "method" })
public class Self {

	/** The href. */
	@JsonProperty("href")
	private String href;

	/** The method. */
	@JsonProperty("method")
	private String method;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the href.
	 *
	 * @return the href
	 */
	@JsonProperty("href")
	public String getHref() {
		return href;
	}

	/**
	 * Sets the href.
	 *
	 * @param href
	 *            the new href
	 */
	@JsonProperty("href")
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * Gets the method.
	 *
	 * @return the method
	 */
	@JsonProperty("method")
	public String getMethod() {
		return method;
	}

	/**
	 * Sets the method.
	 *
	 * @param method
	 *            the new method
	 */
	@JsonProperty("method")
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * Gets the additional properties.
	 *
	 * @return the additional properties
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Sets the additional property.
	 *
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 */
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
