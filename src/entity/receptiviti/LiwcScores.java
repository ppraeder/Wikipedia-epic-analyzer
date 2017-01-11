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

// TODO: Auto-generated Javadoc
/**
 * This class is part of the analysis result when calling the receptivity API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiwcScores {

	/** The tone. */
	@JsonProperty("tone")
	private Double tone;

	/** The six ltr. */
	@JsonProperty("sixLtr")
	private Double sixLtr;

	/** The clout. */
	@JsonProperty("clout")
	private Double clout;

	/** The wps. */
	@JsonProperty("wps")
	private Double wps;

	/** The analytic. */
	@JsonProperty("analytic")
	private Double analytic;

	/** The wc. */
	@JsonProperty("wc")
	private Double wc;

	/** The dic. */
	@JsonProperty("dic")
	private Double dic;

	/** The authentic. */
	@JsonProperty("authentic")
	private Double authentic;

	/** The categories. */
	@JsonProperty("categories")
	private Categories categories;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the tone.
	 *
	 * @return the tone
	 */
	@JsonProperty("tone")
	public Double getTone() {
		return tone;
	}

	/**
	 * Sets the tone.
	 *
	 * @param tone
	 *            the new tone
	 */
	@JsonProperty("tone")
	public void setTone(Double tone) {
		this.tone = tone;
	}

	/**
	 * Gets the six ltr.
	 *
	 * @return the six ltr
	 */
	@JsonProperty("sixLtr")
	public Double getSixLtr() {
		return sixLtr;
	}

	/**
	 * Sets the six ltr.
	 *
	 * @param sixLtr
	 *            the new six ltr
	 */
	@JsonProperty("sixLtr")
	public void setSixLtr(Double sixLtr) {
		this.sixLtr = sixLtr;
	}

	/**
	 * Gets the clout.
	 *
	 * @return the clout
	 */
	@JsonProperty("clout")
	public Double getClout() {
		return clout;
	}

	/**
	 * Sets the clout.
	 *
	 * @param clout
	 *            the new clout
	 */
	@JsonProperty("clout")
	public void setClout(Double clout) {
		this.clout = clout;
	}

	/**
	 * Gets the wps.
	 *
	 * @return the wps
	 */
	@JsonProperty("wps")
	public Double getWps() {
		return wps;
	}

	/**
	 * Sets the wps.
	 *
	 * @param wps
	 *            the new wps
	 */
	@JsonProperty("wps")
	public void setWps(Double wps) {
		this.wps = wps;
	}

	/**
	 * Gets the analytic.
	 *
	 * @return the analytic
	 */
	@JsonProperty("analytic")
	public Double getAnalytic() {
		return analytic;
	}

	/**
	 * Sets the analytic.
	 *
	 * @param analytic
	 *            the new analytic
	 */
	@JsonProperty("analytic")
	public void setAnalytic(Double analytic) {
		this.analytic = analytic;
	}

	/**
	 * Gets the wc.
	 *
	 * @return the wc
	 */
	@JsonProperty("wc")
	public Double getWc() {
		return wc;
	}

	/**
	 * Sets the wc.
	 *
	 * @param wc
	 *            the new wc
	 */
	@JsonProperty("wc")
	public void setWc(Double wc) {
		this.wc = wc;
	}

	/**
	 * Gets the dic.
	 *
	 * @return the dic
	 */
	@JsonProperty("dic")
	public Double getDic() {
		return dic;
	}

	/**
	 * Sets the dic.
	 *
	 * @param dic
	 *            the new dic
	 */
	@JsonProperty("dic")
	public void setDic(Double dic) {
		this.dic = dic;
	}

	/**
	 * Gets the authentic.
	 *
	 * @return the authentic
	 */
	@JsonProperty("authentic")
	public Double getAuthentic() {
		return authentic;
	}

	/**
	 * Sets the authentic.
	 *
	 * @param authentic
	 *            the new authentic
	 */
	@JsonProperty("authentic")
	public void setAuthentic(Double authentic) {
		this.authentic = authentic;
	}

	/**
	 * Gets the categories.
	 *
	 * @return the categories
	 */
	@JsonProperty("categories")
	public Categories getCategories() {
		return categories;
	}

	/**
	 * Sets the categories.
	 *
	 * @param categories
	 *            the new categories
	 */
	@JsonProperty("categories")
	public void setCategories(Categories categories) {
		this.categories = categories;
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
