
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
    "level_learned_at",
    "move_learn_method",
    "version_group"
})
@Generated("jsonschema2pojo")
public class VersionGroupDetail {

    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    private MoveLearnMethod moveLearnMethod;
    @JsonProperty("version_group")
    private VersionGroup versionGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("level_learned_at")
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    @JsonProperty("level_learned_at")
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    @JsonProperty("move_learn_method")
    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    @JsonProperty("move_learn_method")
    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    @JsonProperty("version_group")
    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    @JsonProperty("version_group")
    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
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
        sb.append(VersionGroupDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("levelLearnedAt");
        sb.append('=');
        sb.append(((this.levelLearnedAt == null)?"<null>":this.levelLearnedAt));
        sb.append(',');
        sb.append("moveLearnMethod");
        sb.append('=');
        sb.append(((this.moveLearnMethod == null)?"<null>":this.moveLearnMethod));
        sb.append(',');
        sb.append("versionGroup");
        sb.append('=');
        sb.append(((this.versionGroup == null)?"<null>":this.versionGroup));
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
