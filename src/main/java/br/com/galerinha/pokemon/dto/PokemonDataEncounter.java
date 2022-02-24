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
public class PokemonDataEncounter {

    private String pokemon;
    private boolean shiny;
    private boolean gotcha;
    private Integer level;
    private Integer rateEncounter;
    private Integer rateCapture;
    private String method;
    private List<String> moves;

}
