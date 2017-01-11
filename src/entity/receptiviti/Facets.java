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
@JsonPropertyOrder({ "anger", "fear", "sad" })
public class Facets {

	/** The anger. */
	@JsonProperty("anger")
	private Double anger;

	/** The fear. */
	@JsonProperty("fear")
	private Double fear;

	/** The sad. */
	@JsonProperty("sad")
	private Double sad;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the anger.
	 *
	 * @return the anger
	 */
	@JsonProperty("anger")
	public Double getAnger() {
		return anger;
	}

	/**
	 * Sets the anger.
	 *
	 * @param anger
	 *            the new anger
	 */
	@JsonProperty("anger")
	public void setAnger(Double anger) {
		this.anger = anger;
	}

	/**
	 * Gets the fear.
	 *
	 * @return the fear
	 */
	@JsonProperty("fear")
	public Double getFear() {
		return fear;
	}

	/**
	 * Sets the fear.
	 *
	 * @param fear
	 *            the new fear
	 */
	@JsonProperty("fear")
	public void setFear(Double fear) {
		this.fear = fear;
	}

	/**
	 * Gets the sad.
	 *
	 * @return the sad
	 */
	@JsonProperty("sad")
	public Double getSad() {
		return sad;
	}

	/**
	 * Sets the sad.
	 *
	 * @param sad
	 *            the new sad
	 */
	@JsonProperty("sad")
	public void setSad(Double sad) {
		this.sad = sad;
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
