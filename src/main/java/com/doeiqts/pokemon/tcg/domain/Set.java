package com.doeiqts.pokemon.tcg.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Set {
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("series")
    private String series;

    @JsonProperty("totalCards")
    private int totalCards;

    @JsonProperty("standardLegal")
    private boolean standardLegal;

    @JsonProperty("expandedLegal")
    private boolean expandedLegal;

    @JsonProperty("releaseDate")
    private String releaseDate; // should this be date?
}
