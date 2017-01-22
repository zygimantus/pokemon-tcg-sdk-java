package com.doeiqts.pokemon.tcg.domain.pokemon;

import com.doeiqts.pokemon.tcg.domain.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Attack {
    @JsonProperty("name")
    private String name;

    @JsonProperty("cost")
    private List<Type> cost;

    @JsonProperty("damage")
    private String damage;

    @JsonProperty("text")
    private String text;
}
