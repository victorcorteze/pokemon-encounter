package br.com.galerinha.pokemon.dto;

import br.com.galerinha.pokemon.enums.Pokebola;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TrainersInfo {

    private Pokebola pokebola = Pokebola.POKEBALL;
    private List<String> methods = List.of("walk", "old-rod");
    private List<TrainersPokemon> trainersPokemon = List.of(new TrainersPokemon(), new TrainersPokemon(), new TrainersPokemon(), new TrainersPokemon(), new TrainersPokemon(), new TrainersPokemon());
}
