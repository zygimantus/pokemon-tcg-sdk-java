package com.doeiqts.pokemon.tcg.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Set {
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("series")
    private String series;

    @JsonProperty("totalCards")
    private Integer totalCards;

    @JsonProperty("standardLegal")
    private Boolean standardLegal;

    @JsonProperty("expandedLegal")
    private Boolean expandedLegal;

    @JsonProperty("releaseDate")
    private String releaseDate; // should this be date?

    public Set(){

    }

    public Set(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getTotalCards() {
        return totalCards;
    }

    public void setTotalCards(Integer totalCards) {
        this.totalCards = totalCards;
    }

    public Boolean isStandardLegal() {
        return standardLegal;
    }

    public void setStandardLegal(Boolean standardLegal) {
        this.standardLegal = standardLegal;
    }

    public Boolean isExpandedLegal() {
        return expandedLegal;
    }

    public void setExpandedLegal(Boolean expandedLegal) {
        this.expandedLegal = expandedLegal;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Set set = (Set) o;

        if (totalCards != set.totalCards) return false;
        if (standardLegal != set.standardLegal) return false;
        if (expandedLegal != set.expandedLegal) return false;
        if (code != null ? !code.equals(set.code) : set.code != null) return false;
        if (name != null ? !name.equals(set.name) : set.name != null) return false;
        if (series != null ? !series.equals(set.series) : set.series != null) return false;
        return releaseDate != null ? releaseDate.equals(set.releaseDate) : set.releaseDate == null;

    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + totalCards;
        result = 31 * result + (standardLegal ? 1 : 0);
        result = 31 * result + (expandedLegal ? 1 : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        return result;
    }
}
