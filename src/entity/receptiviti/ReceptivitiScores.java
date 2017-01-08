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
    "percentiles",
    "raw_scores",
    "warnings"
})
public class ReceptivitiScores {

    @JsonProperty("percentiles")
    private Percentiles percentiles;
    @JsonProperty("raw_scores")
    private RawScores rawScores;
    @JsonProperty("warnings")
    private Warnings warnings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("percentiles")
    public Percentiles getPercentiles() {
        return percentiles;
    }

    @JsonProperty("percentiles")
    public void setPercentiles(Percentiles percentiles) {
        this.percentiles = percentiles;
    }

    @JsonProperty("raw_scores")
    public RawScores getRawScores() {
        return rawScores;
    }

    @JsonProperty("raw_scores")
    public void setRawScores(RawScores rawScores) {
        this.rawScores = rawScores;
    }

    @JsonProperty("warnings")
    public Warnings getWarnings() {
        return warnings;
    }

    @JsonProperty("warnings")
    public void setWarnings(Warnings warnings) {
        this.warnings = warnings;
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
