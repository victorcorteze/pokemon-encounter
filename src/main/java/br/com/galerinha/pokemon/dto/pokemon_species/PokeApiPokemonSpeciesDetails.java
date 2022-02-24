
package br.com.galerinha.pokemon.dto.pokemon_species;

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
    "base_happiness",
    "capture_rate",
    "color",
    "egg_groups",
    "evolution_chain",
    "evolves_from_species",
    "flavor_text_entries",
    "form_descriptions",
    "forms_switchable",
    "gender_rate",
    "genera",
    "generation",
    "growth_rate",
    "habitat",
    "has_gender_differences",
    "hatch_counter",
    "id",
    "is_baby",
    "is_legendary",
    "is_mythical",
    "name",
    "names",
    "order",
    "pal_park_encounters",
    "pokedex_numbers",
    "shape",
    "varieties"
})
@Generated("jsonschema2pojo")
public class PokeApiPokemonSpeciesDetails {

    @JsonProperty("base_happiness")
    private Integer baseHappiness;
    @JsonProperty("capture_rate")
    private Integer captureRate;
    @JsonProperty("color")
    private Color color;
    @JsonProperty("egg_groups")
    private List<EggGroup> eggGroups = null;
    @JsonProperty("evolution_chain")
    private EvolutionChain evolutionChain;
    @JsonProperty("evolves_from_species")
    private EvolvesFromSpecies evolvesFromSpecies;
    @JsonProperty("flavor_text_entries")
    private List<FlavorTextEntry> flavorTextEntries = null;
    @JsonProperty("form_descriptions")
    private List<Object> formDescriptions = null;
    @JsonProperty("forms_switchable")
    private Boolean formsSwitchable;
    @JsonProperty("gender_rate")
    private Integer genderRate;
    @JsonProperty("genera")
    private List<Genera> genera = null;
    @JsonProperty("generation")
    private Generation generation;
    @JsonProperty("growth_rate")
    private GrowthRate growthRate;
    @JsonProperty("habitat")
    private Habitat habitat;
    @JsonProperty("has_gender_differences")
    private Boolean hasGenderDifferences;
    @JsonProperty("hatch_counter")
    private Integer hatchCounter;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_baby")
    private Boolean isBaby;
    @JsonProperty("is_legendary")
    private Boolean isLegendary;
    @JsonProperty("is_mythical")
    private Boolean isMythical;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Name> names = null;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("pal_park_encounters")
    private List<PalParkEncounter> palParkEncounters = null;
    @JsonProperty("pokedex_numbers")
    private List<PokedexNumber> pokedexNumbers = null;
    @JsonProperty("shape")
    private Shape shape;
    @JsonProperty("varieties")
    private List<Variety> varieties = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base_happiness")
    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    @JsonProperty("base_happiness")
    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    @JsonProperty("capture_rate")
    public Integer getCaptureRate() {
        return captureRate;
    }

    @JsonProperty("capture_rate")
    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    @JsonProperty("color")
    public Color getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Color color) {
        this.color = color;
    }

    @JsonProperty("egg_groups")
    public List<EggGroup> getEggGroups() {
        return eggGroups;
    }

    @JsonProperty("egg_groups")
    public void setEggGroups(List<EggGroup> eggGroups) {
        this.eggGroups = eggGroups;
    }

    @JsonProperty("evolution_chain")
    public EvolutionChain getEvolutionChain() {
        return evolutionChain;
    }

    @JsonProperty("evolution_chain")
    public void setEvolutionChain(EvolutionChain evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    @JsonProperty("evolves_from_species")
    public EvolvesFromSpecies getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    @JsonProperty("evolves_from_species")
    public void setEvolvesFromSpecies(EvolvesFromSpecies evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    @JsonProperty("flavor_text_entries")
    public List<FlavorTextEntry> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    @JsonProperty("flavor_text_entries")
    public void setFlavorTextEntries(List<FlavorTextEntry> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    @JsonProperty("form_descriptions")
    public List<Object> getFormDescriptions() {
        return formDescriptions;
    }

    @JsonProperty("form_descriptions")
    public void setFormDescriptions(List<Object> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    @JsonProperty("forms_switchable")
    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }

    @JsonProperty("forms_switchable")
    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    @JsonProperty("gender_rate")
    public Integer getGenderRate() {
        return genderRate;
    }

    @JsonProperty("gender_rate")
    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    @JsonProperty("genera")
    public List<Genera> getGenera() {
        return genera;
    }

    @JsonProperty("genera")
    public void setGenera(List<Genera> genera) {
        this.genera = genera;
    }

    @JsonProperty("generation")
    public Generation getGeneration() {
        return generation;
    }

    @JsonProperty("generation")
    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    @JsonProperty("growth_rate")
    public GrowthRate getGrowthRate() {
        return growthRate;
    }

    @JsonProperty("growth_rate")
    public void setGrowthRate(GrowthRate growthRate) {
        this.growthRate = growthRate;
    }

    @JsonProperty("habitat")
    public Habitat getHabitat() {
        return habitat;
    }

    @JsonProperty("habitat")
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @JsonProperty("has_gender_differences")
    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    @JsonProperty("has_gender_differences")
    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    @JsonProperty("hatch_counter")
    public Integer getHatchCounter() {
        return hatchCounter;
    }

    @JsonProperty("hatch_counter")
    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("is_baby")
    public Boolean getIsBaby() {
        return isBaby;
    }

    @JsonProperty("is_baby")
    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    @JsonProperty("is_legendary")
    public Boolean getIsLegendary() {
        return isLegendary;
    }

    @JsonProperty("is_legendary")
    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    @JsonProperty("is_mythical")
    public Boolean getIsMythical() {
        return isMythical;
    }

    @JsonProperty("is_mythical")
    public void setIsMythical(Boolean isMythical) {
        this.isMythical = isMythical;
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

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("pal_park_encounters")
    public List<PalParkEncounter> getPalParkEncounters() {
        return palParkEncounters;
    }

    @JsonProperty("pal_park_encounters")
    public void setPalParkEncounters(List<PalParkEncounter> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    @JsonProperty("pokedex_numbers")
    public List<PokedexNumber> getPokedexNumbers() {
        return pokedexNumbers;
    }

    @JsonProperty("pokedex_numbers")
    public void setPokedexNumbers(List<PokedexNumber> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    @JsonProperty("shape")
    public Shape getShape() {
        return shape;
    }

    @JsonProperty("shape")
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @JsonProperty("varieties")
    public List<Variety> getVarieties() {
        return varieties;
    }

    @JsonProperty("varieties")
    public void setVarieties(List<Variety> varieties) {
        this.varieties = varieties;
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
        sb.append(PokeApiPokemonSpeciesDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseHappiness");
        sb.append('=');
        sb.append(((this.baseHappiness == null)?"<null>":this.baseHappiness));
        sb.append(',');
        sb.append("captureRate");
        sb.append('=');
        sb.append(((this.captureRate == null)?"<null>":this.captureRate));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("eggGroups");
        sb.append('=');
        sb.append(((this.eggGroups == null)?"<null>":this.eggGroups));
        sb.append(',');
        sb.append("evolutionChain");
        sb.append('=');
        sb.append(((this.evolutionChain == null)?"<null>":this.evolutionChain));
        sb.append(',');
        sb.append("evolvesFromSpecies");
        sb.append('=');
        sb.append(((this.evolvesFromSpecies == null)?"<null>":this.evolvesFromSpecies));
        sb.append(',');
        sb.append("flavorTextEntries");
        sb.append('=');
        sb.append(((this.flavorTextEntries == null)?"<null>":this.flavorTextEntries));
        sb.append(',');
        sb.append("formDescriptions");
        sb.append('=');
        sb.append(((this.formDescriptions == null)?"<null>":this.formDescriptions));
        sb.append(',');
        sb.append("formsSwitchable");
        sb.append('=');
        sb.append(((this.formsSwitchable == null)?"<null>":this.formsSwitchable));
        sb.append(',');
        sb.append("genderRate");
        sb.append('=');
        sb.append(((this.genderRate == null)?"<null>":this.genderRate));
        sb.append(',');
        sb.append("genera");
        sb.append('=');
        sb.append(((this.genera == null)?"<null>":this.genera));
        sb.append(',');
        sb.append("generation");
        sb.append('=');
        sb.append(((this.generation == null)?"<null>":this.generation));
        sb.append(',');
        sb.append("growthRate");
        sb.append('=');
        sb.append(((this.growthRate == null)?"<null>":this.growthRate));
        sb.append(',');
        sb.append("habitat");
        sb.append('=');
        sb.append(((this.habitat == null)?"<null>":this.habitat));
        sb.append(',');
        sb.append("hasGenderDifferences");
        sb.append('=');
        sb.append(((this.hasGenderDifferences == null)?"<null>":this.hasGenderDifferences));
        sb.append(',');
        sb.append("hatchCounter");
        sb.append('=');
        sb.append(((this.hatchCounter == null)?"<null>":this.hatchCounter));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isBaby");
        sb.append('=');
        sb.append(((this.isBaby == null)?"<null>":this.isBaby));
        sb.append(',');
        sb.append("isLegendary");
        sb.append('=');
        sb.append(((this.isLegendary == null)?"<null>":this.isLegendary));
        sb.append(',');
        sb.append("isMythical");
        sb.append('=');
        sb.append(((this.isMythical == null)?"<null>":this.isMythical));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("palParkEncounters");
        sb.append('=');
        sb.append(((this.palParkEncounters == null)?"<null>":this.palParkEncounters));
        sb.append(',');
        sb.append("pokedexNumbers");
        sb.append('=');
        sb.append(((this.pokedexNumbers == null)?"<null>":this.pokedexNumbers));
        sb.append(',');
        sb.append("shape");
        sb.append('=');
        sb.append(((this.shape == null)?"<null>":this.shape));
        sb.append(',');
        sb.append("varieties");
        sb.append('=');
        sb.append(((this.varieties == null)?"<null>":this.varieties));
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
