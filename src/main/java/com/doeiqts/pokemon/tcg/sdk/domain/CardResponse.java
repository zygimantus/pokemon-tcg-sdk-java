package com.doeiqts.pokemon.tcg.sdk.domain;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CardResponse {
    @JsonProperty("card")
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
