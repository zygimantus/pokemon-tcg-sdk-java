package com.doeiqts.pokemon.tcg.sdk;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.doeiqts.pokemon.tcg.sdk.domain.CardResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.DeserializationConfig;

import javax.ws.rs.core.HttpHeaders;

public class CardFactory {

    public Card getCard(String id) {
        Card card = null;

        Client client = Client.create();

        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/cards/" + id);

        ClientResponse response = webResource.accept("application/json")
                .header(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.1 Safari/537.36")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        CardResponse cardResponse = response.getEntity(CardResponse.class);

        return cardResponse.getCard();
    }

}
