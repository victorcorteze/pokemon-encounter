
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
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})
@Generated("jsonschema2pojo")
public class GenerationIii {

    @JsonProperty("emerald")
    private Emerald emerald;
    @JsonProperty("firered-leafgreen")
    private FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    private RubySapphire rubySapphire;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("emerald")
    public Emerald getEmerald() {
        return emerald;
    }

    @JsonProperty("emerald")
    public void setEmerald(Emerald emerald) {
        this.emerald = emerald;
    }

    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen getFireredLeafgreen() {
        return fireredLeafgreen;
    }

    @JsonProperty("firered-leafgreen")
    public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    @JsonProperty("ruby-sapphire")
    public RubySapphire getRubySapphire() {
        return rubySapphire;
    }

    @JsonProperty("ruby-sapphire")
    public void setRubySapphire(RubySapphire rubySapphire) {
        this.rubySapphire = rubySapphire;
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
        sb.append(GenerationIii.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("emerald");
        sb.append('=');
        sb.append(((this.emerald == null)?"<null>":this.emerald));
        sb.append(',');
        sb.append("fireredLeafgreen");
        sb.append('=');
        sb.append(((this.fireredLeafgreen == null)?"<null>":this.fireredLeafgreen));
        sb.append(',');
        sb.append("rubySapphire");
        sb.append('=');
        sb.append(((this.rubySapphire == null)?"<null>":this.rubySapphire));
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
