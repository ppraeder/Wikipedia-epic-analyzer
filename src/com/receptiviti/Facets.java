
package com.receptiviti;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "anger",
    "fear",
    "sad"
})
public class Facets {

    @JsonProperty("anger")
    private Integer anger;
    @JsonProperty("fear")
    private Integer fear;
    @JsonProperty("sad")
    private Integer sad;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("anger")
    public Integer getAnger() {
        return anger;
    }

    @JsonProperty("anger")
    public void setAnger(Integer anger) {
        this.anger = anger;
    }

    @JsonProperty("fear")
    public Integer getFear() {
        return fear;
    }

    @JsonProperty("fear")
    public void setFear(Integer fear) {
        this.fear = fear;
    }

    @JsonProperty("sad")
    public Integer getSad() {
        return sad;
    }

    @JsonProperty("sad")
    public void setSad(Integer sad) {
        this.sad = sad;
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
