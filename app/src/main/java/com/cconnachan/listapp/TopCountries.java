package com.cconnachan.listapp;

import java.util.ArrayList;

public class TopCountries {

    private ArrayList<Country> list;

    public TopCountries(){
        list = new ArrayList<Country>();
        list.add(new Country("New Zealand", 2007, "The scenery"));
        list.add(new Country("Costa Rica", 2001, "The animals"));
        list.add(new Country("Arizona", 2002, "The geology"));
        list.add(new Country("Spain", 2017, "The sunshine"));
        list.add(new Country("Netherlands", 2015, "The cycling"));
        list.add(new Country("California", 2011, "The variety"));
        list.add(new Country("Germany", 2000, "The architecture"));
        list.add(new Country("Italy", 2018, "The food"));
    }

    public ArrayList<Country> getList() {
        return new ArrayList<Country>(list);
    }
}
