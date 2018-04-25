package com.cconnachan.listapp;

import org.junit.Before;

import java.util.ArrayList;

public class TopCountriesTest {

    private ArrayList<Country> topCountries;
    private Country country1;
    private Country country2;
    private Country country3;

    @Before
    public void setup(){
        country1 = new Country("France", 1999, "The food");
        country2 = new Country("Netherlands", 2015, "The cycling");
        country3 = new Country("Spain", 2017, "The sunshine");
        topCountries = new ArrayList<Country>();
        topCountries.add(country1);
        topCountries.add(country2);
        topCountries.add(country3);
    }

    public void 

}
