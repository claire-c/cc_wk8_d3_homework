package com.cconnachan.listapp;

public class Country {

    private String countryName;
    private Integer dateVisited;
    private String bestPart;

    public Country(String countryName, int dateVisited, String bestPart){
        this.countryName = countryName;
        this.bestPart = bestPart;
        this.dateVisited = dateVisited;
    }


    public Integer getDateVisited() {
        return dateVisited;
    }

    public String getBestPart() {
        return bestPart;
    }

    public String getCountryName() {
        return countryName;
    }
}
