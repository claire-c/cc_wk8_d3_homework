package com.cconnachan.listapp;

import android.graphics.Movie;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TopCountriesTest {

    private TopCountries topCountries;
    private Country country1;
    private Country country2;
    private Country country3;

    @Before
    public void setup(){
        country1 = new Country("France", 1999, "The food");
        country2 = new Country("Netherlands", 2015, "The cycling");
        country3 = new Country("Spain", 2017, "The sunshine");
        topCountries = new TopCountries();
    }

    @Test
    public void canGetCountriesList(){
        assertEquals(8, topCountries.getList().size());
    }




}
