package com.doeiqts.pokemon.tcg.sdk;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.doeiqts.pokemon.tcg.domain.Rarity;
import com.doeiqts.pokemon.tcg.domain.Set;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;
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
        expectedCard.setSet(new Set("BREAKthrough"));
        expectedCard.setImageUrl("https://images.pokemontcg.io/xy8/15.png");

        CardFactory objectUnderTest = new CardFactory();

        Card result = objectUnderTest.getCard("xy8-15");

        Assert.assertEquals("The cards didn't match.", expectedCard, result);
    }

    @Test
    public void testSearchCards() {
        Card ditto1 = new Card();
        ditto1.setId("bw7-108");
        ditto1.setName("Ditto");
        ditto1.setNumber("108");
        ditto1.setRarity(Rarity.RARE_HOLO);
        ditto1.setSet(new Set("Boundaries Crossed"));
        ditto1.setImageUrl("https://images.pokemontcg.io/bw7/108.png");

        Card ditto2 = new Card();
        ditto2.setId("gym2-10");
        ditto2.setName("Koga's Ditto");
        ditto2.setNumber("10");
        ditto2.setRarity(Rarity.RARE);
        ditto2.setSet(new Set("Gym Challenge"));
        ditto2.setImageUrl("https://images.pokemontcg.io/gym2/10.png");

        List<Card> expectedCards = new ArrayList<>();
        expectedCards.add(ditto1);
        expectedCards.add(ditto2);

        MultivaluedMap<String, String> searchCriteria = new MultivaluedMapImpl();
        searchCriteria.add("name", "Ditto");
        searchCriteria.add("set", "Boundaries Crossed|Gym Challenge");

        CardFactory objectUnderTest = new CardFactory();

        List<Card> result = objectUnderTest.searchCards(searchCriteria);

        Assert.assertEquals("The cards didn't match.", expectedCards, result);
    }
}
