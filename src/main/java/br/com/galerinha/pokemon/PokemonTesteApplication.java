package br.com.galerinha.pokemon;

import br.com.galerinha.pokemon.dto.PokemonDataEncounter;
import br.com.galerinha.pokemon.dto.location.PokeApiLocationDetails;
import br.com.galerinha.pokemon.dto.location_area.PokeApiLocationAreaDetails;
import br.com.galerinha.pokemon.dto.pokemon_list.Result;
import br.com.galerinha.pokemon.repository.PokeApiEntrypoint;
import br.com.galerinha.pokemon.service.CaptureService;
import br.com.galerinha.pokemon.service.EncounterService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@CommonsLog
public class PokemonTesteApplication implements CommandLineRunner {

	@Autowired
	private PokeApiEntrypoint pokeApiEntrypoint;

	@Autowired
	private EncounterService encounterService;

	@Autowired
	private CaptureService captureService;

	public static List<String> regioesPermitidas = List.of("kanto");
	public static List<String> jogosPermitidos = List.of("leafgreen", "firered", "firered-leafgreen");
	public static List<String> pokemonPermitidos = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(PokemonTesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		pokemonPermitidos.addAll(pokeApiEntrypoint.findPokemonListByLimit("151").getResults().stream().map(Result::getName).collect(Collectors.toList()));

//		List<PokemonDataEncounter> resultadoDosEncontros = new ArrayList<>();
//
//		String locationChosen = "cerulean-cave";
//		PokeApiLocationDetails location = this.pokeApiEntrypoint.findLocation(locationChosen);
//		System.out.println("Entrando na area " + location.getName());
//		System.out.println("Areas disponíveis: ");
//		location.getAreas().forEach(area -> System.out.println(area.getName()));
//		location.getAreas().forEach(area -> {
//			System.out.println("--------------Procurando Pokemon " + area.getName() + "----------------");
//			try {
//				PokeApiLocationAreaDetails locationArea =
//						this.pokeApiEntrypoint.findLocationArea(area.getName());
//				List<PokemonDataEncounter> possiblePokemonWithEncounterRate = this.encounterService.getPossiblePokemonWithEncounterRate(locationArea);
//				if(possiblePokemonWithEncounterRate.isEmpty())
//					return;
//				System.out.println("------------Lista de pokemon disponivel para captura------------");
//				possiblePokemonWithEncounterRate.forEach(System.out::println);
//				System.out.println("--------------------Pokemon Encontrado--------------------------");
//				PokemonDataEncounter pokemonDataEncounter = this.encounterService.sortPokemonByListDataEncounter(possiblePokemonWithEncounterRate);
//				System.out.println(pokemonDataEncounter);
//				pokemonDataEncounter.setGotcha(this.captureService.capturePokemon(pokemonDataEncounter));
//				resultadoDosEncontros.add(pokemonDataEncounter);
//			} catch (URISyntaxException e) {
//				e.printStackTrace();
//			}
//		});
//		System.out.println("-------------------------------------------------------------------------");
//		System.out.println("---------------------------Resultado-------------------------------------");
//		resultadoDosEncontros.forEach(System.out::println);
	}
}
