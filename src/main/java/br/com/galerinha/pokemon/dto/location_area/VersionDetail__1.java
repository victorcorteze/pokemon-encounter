
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
    "encounter_details",
    "max_chance",
    "version"
})
@Generated("jsonschema2pojo")
public class VersionDetail__1 {

    @JsonProperty("encounter_details")
    private List<EncounterDetail> encounterDetails = null;
    @JsonProperty("max_chance")
    private Integer maxChance;
    @JsonProperty("version")
    private Version__1 version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("encounter_details")
    public List<EncounterDetail> getEncounterDetails() {
        return encounterDetails;
    }

    @JsonProperty("encounter_details")
    public void setEncounterDetails(List<EncounterDetail> encounterDetails) {
        this.encounterDetails = encounterDetails;
    }

    @JsonProperty("max_chance")
    public Integer getMaxChance() {
        return maxChance;
    }

    @JsonProperty("max_chance")
    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    @JsonProperty("version")
    public Version__1 getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Version__1 version) {
        this.version = version;
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
        sb.append(VersionDetail__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("encounterDetails");
        sb.append('=');
        sb.append(((this.encounterDetails == null)?"<null>":this.encounterDetails));
        sb.append(',');
        sb.append("maxChance");
        sb.append('=');
        sb.append(((this.maxChance == null)?"<null>":this.maxChance));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
