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

/**
 * 
 * This class is part of the analysis result when calling the receptivity API
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiwcScores {

    @JsonProperty("tone")
    private Double tone;
    @JsonProperty("sixLtr")
    private Integer sixLtr;
    @JsonProperty("clout")
    private Integer clout;
    @JsonProperty("wps")
    private Integer wps;
    @JsonProperty("analytic")
    private Double analytic;
    @JsonProperty("wc")
    private Integer wc;
    @JsonProperty("dic")
    private Integer dic;
    @JsonProperty("authentic")
    private Integer authentic;
    @JsonProperty("categories")
    private Categories categories;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tone")
    public Double getTone() {
        return tone;
    }

    @JsonProperty("tone")
    public void setTone(Double tone) {
        this.tone = tone;
    }

    @JsonProperty("sixLtr")
    public Integer getSixLtr() {
        return sixLtr;
    }

    @JsonProperty("sixLtr")
    public void setSixLtr(Integer sixLtr) {
        this.sixLtr = sixLtr;
    }

    @JsonProperty("clout")
    public Integer getClout() {
        return clout;
    }

    @JsonProperty("clout")
    public void setClout(Integer clout) {
        this.clout = clout;
    }

    @JsonProperty("wps")
    public Integer getWps() {
        return wps;
    }

    @JsonProperty("wps")
    public void setWps(Integer wps) {
        this.wps = wps;
    }

    @JsonProperty("analytic")
    public Double getAnalytic() {
        return analytic;
    }

    @JsonProperty("analytic")
    public void setAnalytic(Double analytic) {
        this.analytic = analytic;
    }

    @JsonProperty("wc")
    public Integer getWc() {
        return wc;
    }

    @JsonProperty("wc")
    public void setWc(Integer wc) {
        this.wc = wc;
    }

    @JsonProperty("dic")
    public Integer getDic() {
        return dic;
    }

    @JsonProperty("dic")
    public void setDic(Integer dic) {
        this.dic = dic;
    }

    @JsonProperty("authentic")
    public Integer getAuthentic() {
        return authentic;
    }

    @JsonProperty("authentic")
    public void setAuthentic(Integer authentic) {
        this.authentic = authentic;
    }

    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(Categories categories) {
        this.categories = categories;
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
