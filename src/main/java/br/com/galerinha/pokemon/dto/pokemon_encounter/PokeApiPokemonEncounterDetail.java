
package br.com.galerinha.pokemon.dto.pokemon_encounter;

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
    "location_area",
    "version_details"
})
@Generated("jsonschema2pojo")
public class PokeApiPokemonEncounterDetail {

    @JsonProperty("location_area")
    private LocationArea locationArea;
    @JsonProperty("version_details")
    private List<VersionDetail> versionDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("location_area")
    public LocationArea getLocationArea() {
        return locationArea;
    }

    @JsonProperty("location_area")
    public void setLocationArea(LocationArea locationArea) {
        this.locationArea = locationArea;
    }

    @JsonProperty("version_details")
    public List<VersionDetail> getVersionDetails() {
        return versionDetails;
    }

    @JsonProperty("version_details")
    public void setVersionDetails(List<VersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
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
        sb.append(PokeApiPokemonEncounterDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locationArea");
        sb.append('=');
        sb.append(((this.locationArea == null)?"<null>":this.locationArea));
        sb.append(',');
        sb.append("versionDetails");
        sb.append('=');
        sb.append(((this.versionDetails == null)?"<null>":this.versionDetails));
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
