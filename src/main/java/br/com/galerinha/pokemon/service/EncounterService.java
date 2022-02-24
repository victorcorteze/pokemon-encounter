package br.com.galerinha.pokemon.service;

import br.com.galerinha.pokemon.PokemonTesteApplication;
import br.com.galerinha.pokemon.dto.PokemonDataEncounter;
import br.com.galerinha.pokemon.dto.TrainersInfo;
import br.com.galerinha.pokemon.dto.location_area.PokeApiLocationAreaDetails;
import br.com.galerinha.pokemon.dto.pokemon.Move;
import br.com.galerinha.pokemon.dto.pokemon.Move__1;
import br.com.galerinha.pokemon.dto.pokemon.PokeApiPokemonDetails;
import br.com.galerinha.pokemon.dto.pokemon.VersionGroupDetail;
import br.com.galerinha.pokemon.dto.pokemon_encounter.PokeApiPokemonEncounterDetail;
import br.com.galerinha.pokemon.repository.PokeApiEntrypoint;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EncounterService {

    @Autowired
    PokeApiEntrypoint pokeApiEntrypoint;

    public List<PokemonDataEncounter> getPossiblePokemonWithEncounterRate(PokeApiLocationAreaDetails locationAreaDetails){
        List<PokemonDataEncounter> pokemonDataEncounterList = new ArrayList<>();
        TrainersInfo trainer = new TrainersInfo();
        locationAreaDetails.getPokemonEncounters().forEach(pokemonEncounter -> {
            try {
                if (!PokemonTesteApplication.pokemonPermitidos.contains(pokemonEncounter.getPokemon().getName())) {
                    return;
                }
                List<PokeApiPokemonEncounterDetail> pokemonEncounterDetails =
                        this.pokeApiEntrypoint.findPokemonEncounters(pokemonEncounter.getPokemon().getName());
                pokemonEncounterDetails
                        .stream()
                        .filter(encounter -> encounter.getLocationArea().getName().equals(locationAreaDetails.getName()))
                        .findFirst()
                        .flatMap(pokeApiPokemonEncounterDetail -> pokeApiPokemonEncounterDetail
                                .getVersionDetails()
                                .stream()
                                .filter(versionDetail -> PokemonTesteApplication.jogosPermitidos.contains(versionDetail.getVersion().getName()))
                                .findFirst()).ifPresent(versionDetail -> versionDetail.getEncounterDetails().forEach(x -> {
                                    if(trainer.getMethods().contains(x.getMethod().getName())) {
                                        pokemonDataEncounterList.add(new PokemonDataEncounter(
                                                pokemonEncounter.getPokemon().getName(),
                                                new Random().nextInt(8191) == 1,
                                                false,
                                                x.getMaxLevel(),
                                                x.getChance(),
                                                null,
                                                x.getMethod().getName(),
                                                new ArrayList<>()
                                        ));
                                    }
                        }));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });

        return pokemonDataEncounterList;
    }

    public PokemonDataEncounter sortPokemonByListDataEncounter(List<PokemonDataEncounter> pokemonDataEncounters){
        List<PokemonDataEncounter> sortList = new ArrayList<>();
        pokemonDataEncounters.forEach(pokemonDataEncounter -> {
            for (int i = 1; i <= pokemonDataEncounter.getRateEncounter(); i ++){
                sortList.add(pokemonDataEncounter);
            }
        });
        PokemonDataEncounter pokemonEncontrado = sortList.get(new Random().nextInt(sortList.size()));
        pokemonEncontrado.getMoves().addAll(this.findMovesForPokemon(pokemonEncontrado));
        return pokemonEncontrado;
    }

    @SneakyThrows
    public List<String> findMovesForPokemon(PokemonDataEncounter pokemon){
        PokeApiPokemonDetails pokemonDetails = this.pokeApiEntrypoint.findPokemon(pokemon.getPokemon());
        List<Move> collect = pokemonDetails
                .getMoves()
                .stream()
                .filter(move ->
                        move.getVersionGroupDetails()
                                .stream()
                                .map(VersionGroupDetail::getMoveLearnMethod)
                                .anyMatch(moveLearnMethod ->
                                        moveLearnMethod
                                                .getName()
                                                .equals("level-up"))
                        && move.getVersionGroupDetails()
                                .stream()
                                .map(VersionGroupDetail::getVersionGroup)
                                .anyMatch(versionGroup ->
                                        PokemonTesteApplication.jogosPermitidos
                                                .contains(versionGroup.getName()))
                        && move.getVersionGroupDetails()
                                .stream()
                                .anyMatch(versionGroupDetail ->
                                        (versionGroupDetail.getLevelLearnedAt() > 0) &&
                                                (versionGroupDetail.getLevelLearnedAt() <= pokemon.getLevel())))
                .collect(Collectors.toList());
        List<String> finalMoveList = new ArrayList<>();
        if(collect.size() <= 4){
            finalMoveList.addAll(collect.stream().map(Move::getMove).collect(Collectors.toList()).stream().map(Move__1::getName).collect(Collectors.toList()));
        } else {
            for (int i = 1; i <= 4; ) {
                Move move = collect.get(new Random().nextInt(collect.size()));
                if (!finalMoveList.contains(move.getMove().getName())) {
                    finalMoveList.add(move.getMove().getName());
                    i++;
                }
            }
        }

        return finalMoveList;
    }

    public boolean sortIfTrainerEncounterPokemon(PokeApiLocationAreaDetails locationArea) {
        return true;
    }

    //TODO: CRIAR METODO PARA CALCULAR O RATE DE ENCONTRO DE POKEMON DA AREA
    //TODO: FAZER LOGICA PARA SETAR O VALOR DO STATUS DO MOVE DO TRAINERSPOKEMON NA FORMULA
}
