package com.cconnachan.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CountriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        TopCountries topCountries = new TopCountries();
        ArrayList<Country> countryList = topCountries.getList();

        TopCountriesAdapter topCountriesAdapter = new TopCountriesAdapter(this, countryList);

        ListView countriesListView = findViewById(R.id.countriesListViewId);
        countriesListView.setAdapter(topCountriesAdapter);

    }
}
