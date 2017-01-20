package com.doeiqts.pokemon.tcg.domain.energy;

import com.doeiqts.pokemon.tcg.domain.pokemon.Type;

import java.util.List;

public class SpecialEnergy extends Energy {
    private List<Type> types;
    private int amount;
    private String text;
}
