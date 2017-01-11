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
@JsonPropertyOrder({ "percentiles", "raw_scores", "warnings" })
public class ReceptivitiScores {

	/** The percentiles. */
	@JsonProperty("percentiles")
	private Percentiles percentiles;

	/** The raw scores. */
	@JsonProperty("raw_scores")
	private RawScores rawScores;

	/** The warnings. */
	@JsonProperty("warnings")
	private Warnings warnings;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the percentiles.
	 *
	 * @return the percentiles
	 */
	@JsonProperty("percentiles")
	public Percentiles getPercentiles() {
		return percentiles;
	}

	/**
	 * Sets the percentiles.
	 *
	 * @param percentiles
	 *            the new percentiles
	 */
	@JsonProperty("percentiles")
	public void setPercentiles(Percentiles percentiles) {
		this.percentiles = percentiles;
	}

	/**
	 * Gets the raw scores.
	 *
	 * @return the raw scores
	 */
	@JsonProperty("raw_scores")
	public RawScores getRawScores() {
		return rawScores;
	}

	/**
	 * Sets the raw scores.
	 *
	 * @param rawScores
	 *            the new raw scores
	 */
	@JsonProperty("raw_scores")
	public void setRawScores(RawScores rawScores) {
		this.rawScores = rawScores;
	}

	/**
	 * Gets the warnings.
	 *
	 * @return the warnings
	 */
	@JsonProperty("warnings")
	public Warnings getWarnings() {
		return warnings;
	}

	/**
	 * Sets the warnings.
	 *
	 * @param warnings
	 *            the new warnings
	 */
	@JsonProperty("warnings")
	public void setWarnings(Warnings warnings) {
		this.warnings = warnings;
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
