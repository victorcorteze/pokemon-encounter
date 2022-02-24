package br.com.galerinha.pokemon.enums;

public enum Pokebola {

    POKEBALL(1.0),
    GREATBALL(1.5),
    ULTRABALL(2.0);

    private final Double bonus;

    Pokebola(Double bonus) {
        this.bonus = bonus;
    }

    public Double getBonus(){
        return bonus;
    }
}
