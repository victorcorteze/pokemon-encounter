package br.com.galerinha.pokemon.service;

import br.com.galerinha.pokemon.dto.PokemonDataEncounter;
import br.com.galerinha.pokemon.dto.TrainersInfo;
import br.com.galerinha.pokemon.dto.location.PokeApiLocationDetails;
import br.com.galerinha.pokemon.dto.location_area.PokeApiLocationAreaDetails;
import br.com.galerinha.pokemon.repository.PokeApiEntrypoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private PokeApiEntrypoint pokeApiEntrypoint;

    @Autowired
    private EncounterService encounterService;

    @Autowired
    private CaptureService captureService;

    public List<PokemonDataEncounter> runEncounterEvent(TrainersInfo trainerInfo, List<String> locations) {
        List<PokemonDataEncounter> pokemonDataEncounters = new ArrayList<>();

        locations.forEach(s -> {
            try {
                PokeApiLocationDetails location = this.pokeApiEntrypoint.findLocation(s);
                location.getAreas().forEach(area -> {
                    try {
                        PokeApiLocationAreaDetails locationArea = this.pokeApiEntrypoint.findLocationArea(area.getName());
                        if(this.encounterService.sortIfTrainerEncounterPokemon(locationArea)) {
                            List<PokemonDataEncounter> possiblePokemonWithEncounterRate = this.encounterService.getPossiblePokemonWithEncounterRate(locationArea);
                            if(!possiblePokemonWithEncounterRate.isEmpty()) {
                                PokemonDataEncounter pokemonDataEncounter = this.encounterService.sortPokemonByListDataEncounter(possiblePokemonWithEncounterRate);
                                PokemonDataEncounter updatedPokemonEncounter = this.captureService.capturePokemon(pokemonDataEncounter);
                                pokemonDataEncounters.add(updatedPokemonEncounter);
                            }
                        }
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                });
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });
        return pokemonDataEncounters;
    }

}
