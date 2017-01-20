package com.doeiqts.pokemon.tcg.domain.pokemon;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.doeiqts.pokemon.tcg.domain.Type;

import java.util.List;

public class Pokemon extends Card {
    private int hp;
    private List<Type> types;
    private AncientTrait ancientTrait;
    private List<Ability> abilities;
    private List<Attack> attacks;
    private List<Weakness> weaknesses;
    private List<Resistance> resistances;
    private List<Type> retreatCost;
    private boolean ex;
    private boolean gx;
}
