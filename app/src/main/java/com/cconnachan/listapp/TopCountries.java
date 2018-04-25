package com.cconnachan.listapp;

public class TopCountries {

    private String countryName;
    private int dateVisited;
    private String bestPart;

    public TopCountries(String countryName, int dateVisited, String bestPart){
        this.countryName = countryName;
        this.bestPart = bestPart;
        this.dateVisited = dateVisited;
    }


    public int getDateVisited() {
        return dateVisited;
    }

    public String getBestPart() {
        return bestPart;
    }

    public String getCountryName() {
        return countryName;
    }
}
