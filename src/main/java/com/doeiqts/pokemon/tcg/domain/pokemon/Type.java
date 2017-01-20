package com.doeiqts.pokemon.tcg.domain.pokemon;

public enum Type {
    COLORLESS("Colorless"),
    DARK("Dark"),
    DARKNESS("Darkness"),
    DRAGON("Dragon"),
    FAIRY("Fairy"),
    FIGHTING("Fighting"),
    FIRE("Fire"),
    GRASS("Grass"),
    LIGHTNING("Lightning"),
    METAL("Metal"),
    PSYCHIC("Psychic"),
    WATER("Water");

    private String type;

    Type(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
