package com.doeiqts.pokemon.tcg.sdk;

import com.doeiqts.pokemon.tcg.domain.Card;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.util.List;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

public class CardFactory {

    private final Client client = Client.create(generateClientConfig());

    public Card getCard(String id) {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/cards/" + id);

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Card.class);
    }

    public List<Card> searchCards(MultivaluedMap<String, String> searchCriteria) {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/cards/")
                .queryParams(searchCriteria);

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Cards.class);
    }

    private ClientConfig generateClientConfig() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);

        JacksonJaxbJsonProvider jacksonProvider
                = new JacksonJaxbJsonProvider(objectMapper, JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS);

        ClientConfig config = new DefaultClientConfig();
        config.getSingletons().add(jacksonProvider);

        return config;
    }

    private ClientResponse callAPI(WebResource webResource) {
        return webResource
                .accept("application/json")
                .header(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.1 Safari/537.36")
                .get(ClientResponse.class);
    }

    private void handleErrors(ClientResponse response) {
        if (response.getStatus() != 200) {
            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
    }

}
