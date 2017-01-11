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
@JsonPropertyOrder({ "rating", "score" })
public class EmotionalTone {

	/** The rating. */
	@JsonProperty("rating")
	private String rating;

	/** The score. */
	@JsonProperty("score")
	private Double score;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	@JsonProperty("rating")
	public String getRating() {
		return rating;
	}

	/**
	 * Sets the rating.
	 *
	 * @param rating
	 *            the new rating
	 */
	@JsonProperty("rating")
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	@JsonProperty("score")
	public Double getScore() {
		return score;
	}

	/**
	 * Sets the score.
	 *
	 * @param score
	 *            the new score
	 */
	@JsonProperty("score")
	public void setScore(Double score) {
		this.score = score;
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
