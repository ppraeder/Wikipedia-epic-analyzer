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

/**
 * 
 * This class is part of the analysis result when calling the receptivity API
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facets",
    "emotional_tone"
})
public class EmotionalAnalysis {

    @JsonProperty("facets")
    private Facets facets;
    @JsonProperty("emotional_tone")
    private EmotionalTone emotionalTone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("facets")
    public Facets getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    @JsonProperty("emotional_tone")
    public EmotionalTone getEmotionalTone() {
        return emotionalTone;
    }

    @JsonProperty("emotional_tone")
    public void setEmotionalTone(EmotionalTone emotionalTone) {
        this.emotionalTone = emotionalTone;
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
