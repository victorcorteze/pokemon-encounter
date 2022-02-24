
package br.com.galerinha.pokemon.dto.pokemon;

import java.util.HashMap;
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
    "base_stat",
    "effort",
    "stat"
})
@Generated("jsonschema2pojo")
public class Stat {

    @JsonProperty("base_stat")
    private Integer baseStat;
    @JsonProperty("effort")
    private Integer effort;
    @JsonProperty("stat")
    private Stat__1 stat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base_stat")
    public Integer getBaseStat() {
        return baseStat;
    }

    @JsonProperty("base_stat")
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("effort")
    public Integer getEffort() {
        return effort;
    }

    @JsonProperty("effort")
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    @JsonProperty("stat")
    public Stat__1 getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(Stat__1 stat) {
        this.stat = stat;
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
        sb.append(Stat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseStat");
        sb.append('=');
        sb.append(((this.baseStat == null)?"<null>":this.baseStat));
        sb.append(',');
        sb.append("effort");
        sb.append('=');
        sb.append(((this.effort == null)?"<null>":this.effort));
        sb.append(',');
        sb.append("stat");
        sb.append('=');
        sb.append(((this.stat == null)?"<null>":this.stat));
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
