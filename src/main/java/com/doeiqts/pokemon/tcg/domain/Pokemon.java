package com.doeiqts.pokemon.tcg.domain;

import java.util.List;

public class Pokemon extends Card {
    private int hp;
    private List<Type> types;
    private List<Ability> abilities;
    private List<Attack> attacks;
    private Weakness weakness;
    private Resistance resistance;
    private List<Type> retreatCost;
}
