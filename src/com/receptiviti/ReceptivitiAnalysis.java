
package com.receptiviti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "created",
    "updated",
    "custom_fields",
    "content_source",
    "liwc_scores",
    "content_date",
    "content_tags",
    "user",
    "language",
    "person",
    "communication_recommendation",
    "receptiviti_scores",
    "personality_snapshot",
    "emotional_analysis",
    "_links"
})
public class ReceptivitiAnalysis {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("custom_fields")
    private CustomFields customFields;
    @JsonProperty("content_source")
    private Integer contentSource;
    @JsonProperty("liwc_scores")
    private LiwcScores liwcScores;
    @JsonProperty("content_date")
    private String contentDate;
    @JsonProperty("content_tags")
    private List<Object> contentTags = null;
    @JsonProperty("user")
    private String user;
    @JsonProperty("language")
    private String language;
    @JsonProperty("person")
    private String person;
    @JsonProperty("communication_recommendation")
    private String communicationRecommendation;
    @JsonProperty("receptiviti_scores")
    private ReceptivitiScores receptivitiScores;
    @JsonProperty("personality_snapshot")
    private List<PersonalitySnapshot> personalitySnapshot = null;
    @JsonProperty("emotional_analysis")
    private EmotionalAnalysis emotionalAnalysis;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("custom_fields")
    public CustomFields getCustomFields() {
        return customFields;
    }

    @JsonProperty("custom_fields")
    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("content_source")
    public Integer getContentSource() {
        return contentSource;
    }

    @JsonProperty("content_source")
    public void setContentSource(Integer contentSource) {
        this.contentSource = contentSource;
    }

    @JsonProperty("liwc_scores")
    public LiwcScores getLiwcScores() {
        return liwcScores;
    }

    @JsonProperty("liwc_scores")
    public void setLiwcScores(LiwcScores liwcScores) {
        this.liwcScores = liwcScores;
    }

    @JsonProperty("content_date")
    public String getContentDate() {
        return contentDate;
    }

    @JsonProperty("content_date")
    public void setContentDate(String contentDate) {
        this.contentDate = contentDate;
    }

    @JsonProperty("content_tags")
    public List<Object> getContentTags() {
        return contentTags;
    }

    @JsonProperty("content_tags")
    public void setContentTags(List<Object> contentTags) {
        this.contentTags = contentTags;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("person")
    public String getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(String person) {
        this.person = person;
    }

    @JsonProperty("communication_recommendation")
    public String getCommunicationRecommendation() {
        return communicationRecommendation;
    }

    @JsonProperty("communication_recommendation")
    public void setCommunicationRecommendation(String communicationRecommendation) {
        this.communicationRecommendation = communicationRecommendation;
    }

    @JsonProperty("receptiviti_scores")
    public ReceptivitiScores getReceptivitiScores() {
        return receptivitiScores;
    }

    @JsonProperty("receptiviti_scores")
    public void setReceptivitiScores(ReceptivitiScores receptivitiScores) {
        this.receptivitiScores = receptivitiScores;
    }

    @JsonProperty("personality_snapshot")
    public List<PersonalitySnapshot> getPersonalitySnapshot() {
        return personalitySnapshot;
    }

    @JsonProperty("personality_snapshot")
    public void setPersonalitySnapshot(List<PersonalitySnapshot> personalitySnapshot) {
        this.personalitySnapshot = personalitySnapshot;
    }

    @JsonProperty("emotional_analysis")
    public EmotionalAnalysis getEmotionalAnalysis() {
        return emotionalAnalysis;
    }

    @JsonProperty("emotional_analysis")
    public void setEmotionalAnalysis(EmotionalAnalysis emotionalAnalysis) {
        this.emotionalAnalysis = emotionalAnalysis;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
