package br.com.galerinha.pokemon.dto;

import br.com.galerinha.pokemon.PokemonTesteApplication;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Random;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TrainersPokemon {

    private String name = PokemonTesteApplication.pokemonPermitidos.get(new Random().nextInt(PokemonTesteApplication.pokemonPermitidos.size()));
    private List<MoveTest> moves = new MoveTest().generateTestList();

}
