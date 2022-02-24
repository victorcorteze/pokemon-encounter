package br.com.galerinha.pokemon.service;

import br.com.galerinha.pokemon.dto.PokemonDataEncounter;
import br.com.galerinha.pokemon.dto.TrainersInfo;
import br.com.galerinha.pokemon.dto.pokemon_species.PokeApiPokemonSpeciesDetails;
import br.com.galerinha.pokemon.repository.PokeApiEntrypoint;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.Random;

@Service
public class CaptureService {

    PokeApiEntrypoint pokeApiEntrypoint;

    public CaptureService(PokeApiEntrypoint pokeApiEntrypoint) {
        this.pokeApiEntrypoint = pokeApiEntrypoint;
    }

    public PokemonDataEncounter capturePokemon(PokemonDataEncounter pokemonDataEncounter) throws URISyntaxException {
        PokeApiPokemonSpeciesDetails pokemonSpecies = this.pokeApiEntrypoint.findPokemonSpecies(pokemonDataEncounter.getPokemon());
        pokemonDataEncounter.setRateCapture(pokemonSpecies.getCaptureRate());
        TrainersInfo trainer = new TrainersInfo();
        System.out.println("Dados do treinador: " + trainer);
        System.out.println("--------------------Pokebola arremessada--------------------------");
        //TODO: REVISAR A FORMULA POIS ESTA CONTENDO VALORES DEFAULT DE HP MAXIMO E CURRENT HP
        double x = ((((3 * 50) - (2 * 50)) * pokemonDataEncounter.getRateCapture() * trainer.getPokebola().getBonus()) / (3 * 50)) * 1;
        System.out.println("Resultado da formula: " + x);
        if (x >= 255){
            System.out.println("Pokemon Capturado");
        } else {
            for (int p = 1; p <= 10; p++){
                System.out.println("--------------------------Pokebola " + p + " lançada!--------------------------");
                for(int c = 1; c <= 4; c++) {
                    int randomNumber = new Random().nextInt(65535);
                    double y = Math.floor(1048560 / Math.sqrt(Math.sqrt(16711680 / x)));
                    System.out.println(randomNumber + " x " + y);
                    if (randomNumber >= y){
                        if (c == 1) {
                            System.out.println("Oh no! The Pokémon broke free!");
                            break;
                        }
                        if (c == 2) {
                            System.out.println("Aww! It appeared to be caught!");
                            break;
                        }
                        if (c == 3) {
                            System.out.println("Aargh! Almost had it!");
                            break;
                        }
                        if (c == 4) {
                            System.out.println("Shoot! It was so close, too!");
                            break;
                        }
                    } else {
                        System.out.println("*shake*");
                        if (c == 4) {
                            System.out.println("--------------------------*****Pokemon " + pokemonDataEncounter.getPokemon().toUpperCase() + " capturado!*****--------------------------");
                            p = 11;
                            pokemonDataEncounter.setGotcha(true);
                            return pokemonDataEncounter;
                        }
                    }
                }
            }
        }
        System.out.println("Pokemon fugiu!");
        pokemonDataEncounter.setGotcha(false);
        return pokemonDataEncounter;
    }
    //https://www.dragonflycave.com/mechanics/gen-iii-iv-capturing#calculator
    // catch rate formula = ((3M-2H).(C.B)/3M)*S
    // M - Max hp
    // H - Current hp
    // C - Capture rate
    // B - Ball bonus
    // S - Status

}
