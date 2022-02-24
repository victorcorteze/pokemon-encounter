package br.com.galerinha.pokemon.repository;

import br.com.galerinha.pokemon.config.ConfigProperties;
import br.com.galerinha.pokemon.dto.location.PokeApiLocationDetails;
import br.com.galerinha.pokemon.dto.location_area.PokeApiLocationAreaDetails;
import br.com.galerinha.pokemon.dto.pokemon.PokeApiPokemonDetails;
import br.com.galerinha.pokemon.dto.pokemon_encounter.PokeApiPokemonEncounterDetail;
import br.com.galerinha.pokemon.dto.pokemon_list.PokeApiPokemonListByLimit;
import br.com.galerinha.pokemon.dto.pokemon_species.PokeApiPokemonSpeciesDetails;
import br.com.galerinha.pokemon.dto.region.PokeApiRegionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PokeApiEntrypoint {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConfigProperties props;

    public PokeApiRegionDetails findRegion(String region) throws URISyntaxException {
        URI url = new URI(props.getPokeApiHost()).resolve("region/" + region);
        try{
            ResponseEntity<PokeApiRegionDetails> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, PokeApiRegionDetails.class);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new PokeApiRegionDetails();
        }
    }

    public PokeApiLocationDetails findLocation(String location) throws URISyntaxException {
        URI url = new URI(props.getPokeApiHost()).resolve("location/" + location);

        try{
            ResponseEntity<PokeApiLocationDetails> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, PokeApiLocationDetails.class);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new PokeApiLocationDetails();
        }
    }

    public PokeApiLocationAreaDetails findLocationArea(String locationArea) throws URISyntaxException {

        URI url = new URI(props.getPokeApiHost()).resolve("location-area/" + locationArea);
        try{
            ResponseEntity<PokeApiLocationAreaDetails> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, PokeApiLocationAreaDetails.class);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new PokeApiLocationAreaDetails();
        }

    }

    public PokeApiPokemonDetails findPokemon(String pokemon) throws URISyntaxException {

        URI url = new URI(props.getPokeApiHost()).resolve("pokemon/" + pokemon);
        try{
            ResponseEntity<PokeApiPokemonDetails> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, PokeApiPokemonDetails.class);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new PokeApiPokemonDetails();
        }

    }

    public List<PokeApiPokemonEncounterDetail> findPokemonEncounters(String pokemon) throws URISyntaxException {
        ParameterizedTypeReference<List<PokeApiPokemonEncounterDetail>> parameterizedTypeReference = new ParameterizedTypeReference<>() {};
        URI url = new URI(props.getPokeApiHost()).resolve("pokemon/" + pokemon + "/encounters");
        try{
            ResponseEntity<List<PokeApiPokemonEncounterDetail>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, parameterizedTypeReference);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    public PokeApiPokemonListByLimit findPokemonListByLimit(String limit) throws URISyntaxException {
//        ParameterizedTypeReference<List<PokeApiPokemonListByLimit>> parameterizedTypeReference = new ParameterizedTypeReference<>() {};
        URI url = new URI(props.getPokeApiHost()).resolve("pokemon?limit=" + limit);
        try{
            ResponseEntity<PokeApiPokemonListByLimit> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, PokeApiPokemonListByLimit.class);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new PokeApiPokemonListByLimit();
        }

    }

    public PokeApiPokemonSpeciesDetails findPokemonSpecies(String pokemon) throws URISyntaxException {
        URI url = new URI(props.getPokeApiHost()).resolve("pokemon-species/" + pokemon);
        try{
            ResponseEntity<PokeApiPokemonSpeciesDetails> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, PokeApiPokemonSpeciesDetails.class);
            return responseEntity.getBody();
        } catch (Exception e){
            e.printStackTrace();
            return new PokeApiPokemonSpeciesDetails();
        }
    }
}
