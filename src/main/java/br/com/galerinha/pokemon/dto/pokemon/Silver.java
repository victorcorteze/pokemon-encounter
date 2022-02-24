
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
    "back_default",
    "back_shiny",
    "front_default",
    "front_shiny",
    "front_transparent"
})
@Generated("jsonschema2pojo")
public class Silver {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("front_transparent")
    private String frontTransparent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("back_default")
    public String getBackDefault() {
        return backDefault;
    }

    @JsonProperty("back_default")
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    @JsonProperty("back_shiny")
    public String getBackShiny() {
        return backShiny;
    }

    @JsonProperty("back_shiny")
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

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

    @JsonProperty("front_transparent")
    public String getFrontTransparent() {
        return frontTransparent;
    }

    @JsonProperty("front_transparent")
    public void setFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
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
        sb.append(Silver.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("backDefault");
        sb.append('=');
        sb.append(((this.backDefault == null)?"<null>":this.backDefault));
        sb.append(',');
        sb.append("backShiny");
        sb.append('=');
        sb.append(((this.backShiny == null)?"<null>":this.backShiny));
        sb.append(',');
        sb.append("frontDefault");
        sb.append('=');
        sb.append(((this.frontDefault == null)?"<null>":this.frontDefault));
        sb.append(',');
        sb.append("frontShiny");
        sb.append('=');
        sb.append(((this.frontShiny == null)?"<null>":this.frontShiny));
        sb.append(',');
        sb.append("frontTransparent");
        sb.append('=');
        sb.append(((this.frontTransparent == null)?"<null>":this.frontTransparent));
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
