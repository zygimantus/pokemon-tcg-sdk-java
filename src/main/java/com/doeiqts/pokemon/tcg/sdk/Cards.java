package com.doeiqts.pokemon.tcg.sdk;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;

@JsonRootName(value = "cards")
public class Cards extends ArrayList<Card> {

}
