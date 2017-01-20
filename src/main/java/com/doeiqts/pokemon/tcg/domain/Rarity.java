package com.doeiqts.pokemon.tcg.domain;

public enum Rarity {
    COMMON("Common"),
    UNCOMMON("Uncommon"),
    RARE("Rare"),
    RARE_HOLO("Rare Holo"),
    RARE_BREAK("Rare BREAK"),
    RARE_HOLO_EX("Rare Holo EX"),
    RARE_ULTRA("Rare Ultra"),
    RARE_SECRET("Rare Secret");

    private String rarity;

    Rarity(final String rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return this.rarity;
    }
}
