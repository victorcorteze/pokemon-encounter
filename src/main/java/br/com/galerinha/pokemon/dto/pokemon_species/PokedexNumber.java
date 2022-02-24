
package br.com.galerinha.pokemon.dto.pokemon_species;

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
    "entry_number",
    "pokedex"
})
@Generated("jsonschema2pojo")
public class PokedexNumber {

    @JsonProperty("entry_number")
    private Integer entryNumber;
    @JsonProperty("pokedex")
    private Pokedex pokedex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("entry_number")
    public Integer getEntryNumber() {
        return entryNumber;
    }

    @JsonProperty("entry_number")
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    @JsonProperty("pokedex")
    public Pokedex getPokedex() {
        return pokedex;
    }

    @JsonProperty("pokedex")
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
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
        sb.append(PokedexNumber.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entryNumber");
        sb.append('=');
        sb.append(((this.entryNumber == null)?"<null>":this.entryNumber));
        sb.append(',');
        sb.append("pokedex");
        sb.append('=');
        sb.append(((this.pokedex == null)?"<null>":this.pokedex));
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
