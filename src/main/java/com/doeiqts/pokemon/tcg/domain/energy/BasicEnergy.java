package com.doeiqts.pokemon.tcg.domain.energy;

import com.doeiqts.pokemon.tcg.domain.Type;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class BasicEnergy extends Energy {
    @JsonIgnore
    private Type type;
}
