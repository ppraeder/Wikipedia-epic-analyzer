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
@JsonPropertyOrder({ "facets", "emotional_tone" })
public class EmotionalAnalysis {

	/** The facets. */
	@JsonProperty("facets")
	private Facets facets;

	/** The emotional tone. */
	@JsonProperty("emotional_tone")
	private EmotionalTone emotionalTone;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the facets.
	 *
	 * @return the facets
	 */
	@JsonProperty("facets")
	public Facets getFacets() {
		return facets;
	}

	/**
	 * Sets the facets.
	 *
	 * @param facets
	 *            the new facets
	 */
	@JsonProperty("facets")
	public void setFacets(Facets facets) {
		this.facets = facets;
	}

	/**
	 * Gets the emotional tone.
	 *
	 * @return the emotional tone
	 */
	@JsonProperty("emotional_tone")
	public EmotionalTone getEmotionalTone() {
		return emotionalTone;
	}

	/**
	 * Sets the emotional tone.
	 *
	 * @param emotionalTone
	 *            the new emotional tone
	 */
	@JsonProperty("emotional_tone")
	public void setEmotionalTone(EmotionalTone emotionalTone) {
		this.emotionalTone = emotionalTone;
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
