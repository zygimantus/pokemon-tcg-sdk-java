package com.doeiqts.pokemon.tcg.domain.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AncientTrait {
    @JsonProperty("name")
    private String name;

    @JsonProperty("text")
    private String text;
}
