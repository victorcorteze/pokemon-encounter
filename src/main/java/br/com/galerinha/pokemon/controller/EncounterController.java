package br.com.galerinha.pokemon.controller;

import br.com.galerinha.pokemon.dto.PokemonDataEncounter;
import br.com.galerinha.pokemon.dto.TrainersInfo;
import br.com.galerinha.pokemon.dto.location.Area;
import br.com.galerinha.pokemon.dto.location_area.Pokemon;
import br.com.galerinha.pokemon.dto.location_area.PokemonEncounter;
import br.com.galerinha.pokemon.dto.region.Location;
import br.com.galerinha.pokemon.repository.PokeApiEntrypoint;
import br.com.galerinha.pokemon.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EncounterController {

    @Autowired
    private PokeApiEntrypoint pokeApiEntrypoint;

    @Autowired
    private EventService eventService;

    @GetMapping(value = "/location", params = {"region"})
    public List<String> findAllLocationByRegion(@RequestParam String region) throws URISyntaxException {
        return this.pokeApiEntrypoint.findRegion(region).getLocations().stream().map(Location::getName).collect(Collectors.toList());
    }

    @GetMapping(value = "/area", params = {"location"})
    public List<String> findAllAreaByLocation(@RequestParam String location) throws URISyntaxException {
        return this.pokeApiEntrypoint.findLocation(location).getAreas().stream().map(Area::getName).collect(Collectors.toList());
    }

    @GetMapping(value = "/pokemonEncounter", params = {"area"})
    public List<String> findAllPokemonEncountersByArea(@RequestParam String area) throws URISyntaxException {
        return this.pokeApiEntrypoint.findLocationArea(area).getPokemonEncounters().stream().map(PokemonEncounter::getPokemon).map(Pokemon::getName).collect(Collectors.toList());
    }

    @GetMapping(value = "/pokemonEncounter", params = {"location"})
    public List<String> findAllPokemonEncountersByLocation(@RequestParam String location) throws URISyntaxException {
        List<String> allPokemons = new ArrayList<>();
        this.pokeApiEntrypoint.findLocation(location).getAreas().forEach(area ->{
            try {
                this.pokeApiEntrypoint.findLocationArea(area.getName()).getPokemonEncounters().stream().map(PokemonEncounter::getPokemon).map(Pokemon::getName).forEach(s -> {
                    if(!allPokemons.contains(s))
                        allPokemons.add(s);
                });
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });
        return allPokemons;
    }

    @GetMapping(value = "/encounterEvent", params = {"trainerId"})
    public ResponseEntity<List<PokemonDataEncounter>> doEncounterPokemonEvent(@RequestParam Long trainerId,
                                                          @RequestBody List<String> locations){
        //TODO: Trocar as linhas comentadas quando tiver o banco
//        TrainersInfo trainerInfo = this.trainerRepository.findById(trainerId);
//        if(trainerInfo == null || locations.isEmpty())
//            return ResponseEntity.badRequest().build();
        if(locations.isEmpty())
            return ResponseEntity.badRequest().build();

        TrainersInfo trainerInfo = new TrainersInfo();

        return ResponseEntity.ok(this.eventService.runEncounterEvent(trainerInfo, locations));
    }


}
