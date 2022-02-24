
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
    "pokemon",
    "version_details"
})
@Generated("jsonschema2pojo")
public class PokemonEncounter {

    @JsonProperty("pokemon")
    private Pokemon pokemon;
    @JsonProperty("version_details")
    private List<VersionDetail__1> versionDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pokemon")
    public Pokemon getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @JsonProperty("version_details")
    public List<VersionDetail__1> getVersionDetails() {
        return versionDetails;
    }

    @JsonProperty("version_details")
    public void setVersionDetails(List<VersionDetail__1> versionDetails) {
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
        sb.append(PokemonEncounter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pokemon");
        sb.append('=');
        sb.append(((this.pokemon == null)?"<null>":this.pokemon));
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
