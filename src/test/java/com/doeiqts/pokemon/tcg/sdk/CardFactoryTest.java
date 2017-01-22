package com.doeiqts.pokemon.tcg.sdk;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.doeiqts.pokemon.tcg.domain.Rarity;
import com.doeiqts.pokemon.tcg.domain.Set;
import org.junit.Assert;
import org.junit.Test;

public class CardFactoryTest {

    @Test
    public void testGetCard() {
        Card expectedCard = new Card();
        expectedCard.setId("xy8-15");
        expectedCard.setName("Vivillon");
        expectedCard.setNumber("15");
        expectedCard.setRarity(Rarity.RARE_HOLO);
        expectedCard.setSet(new Set());
        expectedCard.setImageUrl("https://s3.amazonaws.com/pokemontcg/xy8/15.png");

        CardFactory objectUnderTest = new CardFactory();

        Card result = objectUnderTest.getCard("xy8-15");

        Assert.assertEquals("The cards didn't match.", expectedCard, result);
    }
}
