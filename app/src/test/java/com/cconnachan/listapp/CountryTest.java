package com.cconnachan.listapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTest {

    private Country newZealand;

    @Before
    public void setup(){
        newZealand = new Country("New Zealand", 2007, "The mountains");
    }

    @Test
    public void canGetCountryName(){
        assertEquals("New Zealand", newZealand.getCountryName());
    }

    @Test
    public void canGetDateVisited(){
        assertEquals((Integer) 2007, newZealand.getDateVisited());
    }

    @Test
    public void canGetBestPart(){
        assertEquals("The mountains", newZealand.getBestPart());
    }


}
