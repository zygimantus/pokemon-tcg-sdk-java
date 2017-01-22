package com.doeiqts.pokemon.tcg.domain.pokemon;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.doeiqts.pokemon.tcg.domain.Type;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Pokemon extends Card {
    @JsonProperty("name")
    private int hp;

    @JsonProperty("types")
    private List<Type> types;

    @JsonProperty("ancientTrait")
    private AncientTrait ancientTrait;

    @JsonProperty("ability")
    private Ability ability; // This should be a list of abilities once a bug is fixed. https://github.com/PokemonTCG/pokemon-tcg-api/issues/34

    @JsonProperty("attacks")
    private List<Attack> attacks;

    @JsonProperty("weaknesses")
    private List<Weakness> weaknesses;

    @JsonProperty("resistances")
    private List<Resistance> resistances;

    @JsonProperty("retreatCost")
    private List<Type> retreatCost;

    @JsonIgnore
    private boolean ex;

    @JsonIgnore
    private boolean gx;
}
