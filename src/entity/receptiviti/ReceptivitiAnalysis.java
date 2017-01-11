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
import java.util.List;
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
public class ReceptivitiAnalysis {

	/** The id. */
	@JsonProperty("_id")
	private String id;

	/** The created. */
	@JsonProperty("created")
	private String created;

	/** The updated. */
	@JsonProperty("updated")
	private String updated;

	/** The custom fields. */
	@JsonProperty("custom_fields")
	private CustomFields customFields;

	/** The content source. */
	@JsonProperty("content_source")
	private Integer contentSource;

	/** The liwc scores. */
	@JsonProperty("liwc_scores")
	private LiwcScores liwcScores;

	/** The content date. */
	@JsonProperty("content_date")
	private String contentDate;

	/** The content tags. */
	@JsonProperty("content_tags")
	private List<Object> contentTags = null;

	/** The user. */
	@JsonProperty("user")
	private String user;

	/** The language. */
	@JsonProperty("language")
	private String language;

	/** The person. */
	@JsonProperty("person")
	private String person;

	/** The communication recommendation. */
	@JsonProperty("communication_recommendation")
	private String communicationRecommendation;

	/** The receptiviti scores. */
	@JsonProperty("receptiviti_scores")
	private ReceptivitiScores receptivitiScores;

	/** The personality snapshot. */
	@JsonProperty("personality_snapshot")
	private List<PersonalitySnapshot> personalitySnapshot = null;

	/** The emotional analysis. */
	@JsonProperty("emotional_analysis")
	private EmotionalAnalysis emotionalAnalysis;

	/** The links. */
	@JsonProperty("_links")
	private Links links;

	/** The additional properties. */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	@JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the created.
	 *
	 * @return the created
	 */
	@JsonProperty("created")
	public String getCreated() {
		return created;
	}

	/**
	 * Sets the created.
	 *
	 * @param created
	 *            the new created
	 */
	@JsonProperty("created")
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * Gets the updated.
	 *
	 * @return the updated
	 */
	@JsonProperty("updated")
	public String getUpdated() {
		return updated;
	}

	/**
	 * Sets the updated.
	 *
	 * @param updated
	 *            the new updated
	 */
	@JsonProperty("updated")
	public void setUpdated(String updated) {
		this.updated = updated;
	}

	/**
	 * Gets the custom fields.
	 *
	 * @return the custom fields
	 */
	@JsonProperty("custom_fields")
	public CustomFields getCustomFields() {
		return customFields;
	}

	/**
	 * Sets the custom fields.
	 *
	 * @param customFields
	 *            the new custom fields
	 */
	@JsonProperty("custom_fields")
	public void setCustomFields(CustomFields customFields) {
		this.customFields = customFields;
	}

	/**
	 * Gets the content source.
	 *
	 * @return the content source
	 */
	@JsonProperty("content_source")
	public Integer getContentSource() {
		return contentSource;
	}

	/**
	 * Sets the content source.
	 *
	 * @param contentSource
	 *            the new content source
	 */
	@JsonProperty("content_source")
	public void setContentSource(Integer contentSource) {
		this.contentSource = contentSource;
	}

	/**
	 * Gets the liwc scores.
	 *
	 * @return the liwc scores
	 */
	@JsonProperty("liwc_scores")
	public LiwcScores getLiwcScores() {
		return liwcScores;
	}

	/**
	 * Sets the liwc scores.
	 *
	 * @param liwcScores
	 *            the new liwc scores
	 */
	@JsonProperty("liwc_scores")
	public void setLiwcScores(LiwcScores liwcScores) {
		this.liwcScores = liwcScores;
	}

	/**
	 * Gets the content date.
	 *
	 * @return the content date
	 */
	@JsonProperty("content_date")
	public String getContentDate() {
		return contentDate;
	}

	/**
	 * Sets the content date.
	 *
	 * @param contentDate
	 *            the new content date
	 */
	@JsonProperty("content_date")
	public void setContentDate(String contentDate) {
		this.contentDate = contentDate;
	}

	/**
	 * Gets the content tags.
	 *
	 * @return the content tags
	 */
	@JsonProperty("content_tags")
	public List<Object> getContentTags() {
		return contentTags;
	}

	/**
	 * Sets the content tags.
	 *
	 * @param contentTags
	 *            the new content tags
	 */
	@JsonProperty("content_tags")
	public void setContentTags(List<Object> contentTags) {
		this.contentTags = contentTags;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	@JsonProperty("user")
	public String getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user
	 *            the new user
	 */
	@JsonProperty("user")
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language
	 *            the new language
	 */
	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the person.
	 *
	 * @return the person
	 */
	@JsonProperty("person")
	public String getPerson() {
		return person;
	}

	/**
	 * Sets the person.
	 *
	 * @param person
	 *            the new person
	 */
	@JsonProperty("person")
	public void setPerson(String person) {
		this.person = person;
	}

	/**
	 * Gets the communication recommendation.
	 *
	 * @return the communication recommendation
	 */
	@JsonProperty("communication_recommendation")
	public String getCommunicationRecommendation() {
		return communicationRecommendation;
	}

	/**
	 * Sets the communication recommendation.
	 *
	 * @param communicationRecommendation
	 *            the new communication recommendation
	 */
	@JsonProperty("communication_recommendation")
	public void setCommunicationRecommendation(String communicationRecommendation) {
		this.communicationRecommendation = communicationRecommendation;
	}

	/**
	 * Gets the receptiviti scores.
	 *
	 * @return the receptiviti scores
	 */
	@JsonProperty("receptiviti_scores")
	public ReceptivitiScores getReceptivitiScores() {
		return receptivitiScores;
	}

	/**
	 * Sets the receptiviti scores.
	 *
	 * @param receptivitiScores
	 *            the new receptiviti scores
	 */
	@JsonProperty("receptiviti_scores")
	public void setReceptivitiScores(ReceptivitiScores receptivitiScores) {
		this.receptivitiScores = receptivitiScores;
	}

	/**
	 * Gets the personality snapshot.
	 *
	 * @return the personality snapshot
	 */
	@JsonProperty("personality_snapshot")
	public List<PersonalitySnapshot> getPersonalitySnapshot() {
		return personalitySnapshot;
	}

	/**
	 * Sets the personality snapshot.
	 *
	 * @param personalitySnapshot
	 *            the new personality snapshot
	 */
	@JsonProperty("personality_snapshot")
	public void setPersonalitySnapshot(List<PersonalitySnapshot> personalitySnapshot) {
		this.personalitySnapshot = personalitySnapshot;
	}

	/**
	 * Gets the emotional analysis.
	 *
	 * @return the emotional analysis
	 */
	@JsonProperty("emotional_analysis")
	public EmotionalAnalysis getEmotionalAnalysis() {
		return emotionalAnalysis;
	}

	/**
	 * Sets the emotional analysis.
	 *
	 * @param emotionalAnalysis
	 *            the new emotional analysis
	 */
	@JsonProperty("emotional_analysis")
	public void setEmotionalAnalysis(EmotionalAnalysis emotionalAnalysis) {
		this.emotionalAnalysis = emotionalAnalysis;
	}

	/**
	 * Gets the links.
	 *
	 * @return the links
	 */
	@JsonProperty("_links")
	public Links getLinks() {
		return links;
	}

	/**
	 * Sets the links.
	 *
	 * @param links
	 *            the new links
	 */
	@JsonProperty("_links")
	public void setLinks(Links links) {
		this.links = links;
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
