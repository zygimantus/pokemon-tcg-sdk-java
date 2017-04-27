package com.doeiqts.pokemon.tcg.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Rarity {
    @JsonProperty("Common")
    COMMON("Common"),
    @JsonProperty("Uncommon")
    UNCOMMON("Uncommon"),
    @JsonProperty("Rare")
    RARE("Rare"),
    @JsonProperty("Rare Holo")
    RARE_HOLO("Rare Holo"),
    @JsonProperty("Rare BREAK")
    RARE_BREAK("Rare BREAK"),
    @JsonProperty("Rare Holo EX")
    RARE_HOLO_EX("Rare Holo EX"),
    @JsonProperty("Rare Ultra")
    RARE_ULTRA("Rare Ultra"),
    @JsonProperty("Rare Secret")
    RARE_SECRET("Rare Secret");

    @JsonProperty("rarity")
    private String rarity;

    Rarity(final String rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return this.rarity;
    }
}
