package com.doeiqts.pokemon.tcg.domain.energy;

import com.doeiqts.pokemon.tcg.domain.Type;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SpecialEnergy extends Energy {
    @JsonIgnore
    private List<Type> types;

    @JsonIgnore
    private int amount;

    @JsonProperty("text")
    private String text;
}
