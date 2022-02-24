
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
    "encounter_method_rates",
    "game_index",
    "id",
    "location",
    "name",
    "names",
    "pokemon_encounters"
})
@Generated("jsonschema2pojo")
public class PokeApiLocationAreaDetails {

    @JsonProperty("encounter_method_rates")
    private List<EncounterMethodRate> encounterMethodRates = null;
    @JsonProperty("game_index")
    private Integer gameIndex;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Name> names = null;
    @JsonProperty("pokemon_encounters")
    private List<PokemonEncounter> pokemonEncounters = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("encounter_method_rates")
    public List<EncounterMethodRate> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    @JsonProperty("encounter_method_rates")
    public void setEncounterMethodRates(List<EncounterMethodRate> encounterMethodRates) {
        this.encounterMethodRates = encounterMethodRates;
    }

    @JsonProperty("game_index")
    public Integer getGameIndex() {
        return gameIndex;
    }

    @JsonProperty("game_index")
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("names")
    public List<Name> getNames() {
        return names;
    }

    @JsonProperty("names")
    public void setNames(List<Name> names) {
        this.names = names;
    }

    @JsonProperty("pokemon_encounters")
    public List<PokemonEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }

    @JsonProperty("pokemon_encounters")
    public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
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
        sb.append(PokeApiLocationAreaDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("encounterMethodRates");
        sb.append('=');
        sb.append(((this.encounterMethodRates == null)?"<null>":this.encounterMethodRates));
        sb.append(',');
        sb.append("gameIndex");
        sb.append('=');
        sb.append(((this.gameIndex == null)?"<null>":this.gameIndex));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("pokemonEncounters");
        sb.append('=');
        sb.append(((this.pokemonEncounters == null)?"<null>":this.pokemonEncounters));
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
