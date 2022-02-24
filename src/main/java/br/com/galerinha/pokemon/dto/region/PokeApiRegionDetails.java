
package br.com.galerinha.pokemon.dto.region;

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
    "id",
    "locations",
    "main_generation",
    "name",
    "names",
    "pokedexes",
    "version_groups"
})
@Generated("jsonschema2pojo")
public class PokeApiRegionDetails {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("locations")
    private List<Location> locations = null;
    @JsonProperty("main_generation")
    private MainGeneration mainGeneration;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Name> names = null;
    @JsonProperty("pokedexes")
    private List<Pokedex> pokedexes = null;
    @JsonProperty("version_groups")
    private List<VersionGroup> versionGroups = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("main_generation")
    public MainGeneration getMainGeneration() {
        return mainGeneration;
    }

    @JsonProperty("main_generation")
    public void setMainGeneration(MainGeneration mainGeneration) {
        this.mainGeneration = mainGeneration;
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

    @JsonProperty("pokedexes")
    public List<Pokedex> getPokedexes() {
        return pokedexes;
    }

    @JsonProperty("pokedexes")
    public void setPokedexes(List<Pokedex> pokedexes) {
        this.pokedexes = pokedexes;
    }

    @JsonProperty("version_groups")
    public List<VersionGroup> getVersionGroups() {
        return versionGroups;
    }

    @JsonProperty("version_groups")
    public void setVersionGroups(List<VersionGroup> versionGroups) {
        this.versionGroups = versionGroups;
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
        sb.append(PokeApiRegionDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("mainGeneration");
        sb.append('=');
        sb.append(((this.mainGeneration == null)?"<null>":this.mainGeneration));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("pokedexes");
        sb.append('=');
        sb.append(((this.pokedexes == null)?"<null>":this.pokedexes));
        sb.append(',');
        sb.append("versionGroups");
        sb.append('=');
        sb.append(((this.versionGroups == null)?"<null>":this.versionGroups));
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
