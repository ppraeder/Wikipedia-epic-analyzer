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
    "rating",
    "score"
})
public class EmotionalTone {

    @JsonProperty("rating")
    private String rating;
    @JsonProperty("score")
    private Double score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
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
