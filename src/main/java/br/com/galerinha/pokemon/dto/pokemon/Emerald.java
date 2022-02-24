
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
    "front_default",
    "front_shiny"
})
@Generated("jsonschema2pojo")
public class Emerald {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    @JsonProperty("front_shiny")
    public String getFrontShiny() {
        return frontShiny;
    }

    @JsonProperty("front_shiny")
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
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
        sb.append(Emerald.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frontDefault");
        sb.append('=');
        sb.append(((this.frontDefault == null)?"<null>":this.frontDefault));
        sb.append(',');
        sb.append("frontShiny");
        sb.append('=');
        sb.append(((this.frontShiny == null)?"<null>":this.frontShiny));
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
