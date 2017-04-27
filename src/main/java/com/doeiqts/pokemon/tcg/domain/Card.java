package com.doeiqts.pokemon.tcg.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "card")
public class Card {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("set")
    private Set set;

    @JsonProperty("number")
    private String number;

    @JsonProperty("rarity")
    private Rarity rarity;

    @JsonProperty("imageUrl")
    private String imageUrl; // Should this be URL?

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (id != null ? !id.equals(card.id) : card.id != null) return false;
        if (name != null ? !name.equals(card.name) : card.name != null) return false;
        if (set != null ? !set.equals(card.set) : card.set != null) return false;
        if (number != null ? !number.equals(card.number) : card.number != null) return false;
        if (rarity != card.rarity) return false;
        return imageUrl != null ? imageUrl.equals(card.imageUrl) : card.imageUrl == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (set != null ? set.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (rarity != null ? rarity.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
