
package br.com.galerinha.pokemon.dto.location_area;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chance",
    "condition_values",
    "max_level",
    "method",
    "min_level"
})
@Generated("jsonschema2pojo")
public class EncounterDetail {

    @JsonProperty("chance")
    private Integer chance;
    @JsonProperty("condition_values")
    private List<ConditionValue> conditionValues = null;
    @JsonProperty("max_level")
    private Integer maxLevel;
    @JsonProperty("method")
    private Method method;
    @JsonProperty("min_level")
    private Integer minLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chance")
    public Integer getChance() {
        return chance;
    }

    @JsonProperty("chance")
    public void setChance(Integer chance) {
        this.chance = chance;
    }

    @JsonProperty("condition_values")
    public List<ConditionValue> getConditionValues() {
        return conditionValues;
    }

    @JsonProperty("condition_values")
    public void setConditionValues(List<ConditionValue> conditionValues) {
        this.conditionValues = conditionValues;
    }

    @JsonProperty("max_level")
    public Integer getMaxLevel() {
        return maxLevel;
    }

    @JsonProperty("max_level")
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    @JsonProperty("method")
    public Method getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(Method method) {
        this.method = method;
    }

    @JsonProperty("min_level")
    public Integer getMinLevel() {
        return minLevel;
    }

    @JsonProperty("min_level")
    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EncounterDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chance");
        sb.append('=');
        sb.append(((this.chance == null)?"<null>":this.chance));
        sb.append(',');
        sb.append("conditionValues");
        sb.append('=');
        sb.append(((this.conditionValues == null)?"<null>":this.conditionValues));
        sb.append(',');
        sb.append("maxLevel");
        sb.append('=');
        sb.append(((this.maxLevel == null)?"<null>":this.maxLevel));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("minLevel");
        sb.append('=');
        sb.append(((this.minLevel == null)?"<null>":this.minLevel));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
