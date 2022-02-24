
package br.com.galerinha.pokemon.dto.location;

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
    "game_index",
    "generation"
})
@Generated("jsonschema2pojo")
public class GameIndex {

    @JsonProperty("game_index")
    private Integer gameIndex;
    @JsonProperty("generation")
    private Generation generation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("game_index")
    public Integer getGameIndex() {
        return gameIndex;
    }

    @JsonProperty("game_index")
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    @JsonProperty("generation")
    public Generation getGeneration() {
        return generation;
    }

    @JsonProperty("generation")
    public void setGeneration(Generation generation) {
        this.generation = generation;
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
        sb.append(GameIndex.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gameIndex");
        sb.append('=');
        sb.append(((this.gameIndex == null)?"<null>":this.gameIndex));
        sb.append(',');
        sb.append("generation");
        sb.append('=');
        sb.append(((this.generation == null)?"<null>":this.generation));
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
