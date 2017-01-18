package com.doeiqts.pokemon.tcg.domain;

public abstract class Card {
    private String name;
    private String set; // Should this be an enum? (probably)
    private String number;
    private Rarity rarity;
    private String image; // Should this be URL?
}
