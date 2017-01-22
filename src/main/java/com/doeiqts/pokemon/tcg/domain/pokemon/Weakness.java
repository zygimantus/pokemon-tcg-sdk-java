package com.doeiqts.pokemon.tcg.domain.pokemon;

import com.doeiqts.pokemon.tcg.domain.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weakness {
    @JsonProperty("type")
    private Type type;

    @JsonProperty("value")
    private String value; // Thinking about splitting this into operator and amount.
}
