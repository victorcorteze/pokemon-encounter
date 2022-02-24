
package br.com.galerinha.pokemon.dto.location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import br.com.galerinha.pokemon.dto.region.Name;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "areas",
    "game_indices",
    "id",
    "name",
    "names",
    "region"
})
@Generated("jsonschema2pojo")
public class PokeApiLocationDetails {

    @JsonProperty("areas")
    private List<Area> areas = null;
    @JsonProperty("game_indices")
    private List<GameIndex> gameIndices = null;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Name> names = null;
    @JsonProperty("region")
    private Region region;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("areas")
    public List<Area> getAreas() {
        return areas;
    }

    @JsonProperty("areas")
    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    @JsonProperty("game_indices")
    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    @JsonProperty("game_indices")
    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
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
        sb.append(PokeApiLocationDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("areas");
        sb.append('=');
        sb.append(((this.areas == null)?"<null>":this.areas));
        sb.append(',');
        sb.append("gameIndices");
        sb.append('=');
        sb.append(((this.gameIndices == null)?"<null>":this.gameIndices));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
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
