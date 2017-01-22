package com.doeiqts.pokemon.tcg.domain.trainer;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Trainer extends Card {
    @JsonProperty("text")
    private List<String> text;
}
