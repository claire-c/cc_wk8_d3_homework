package com.cconnachan.listapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TopCountriesAdapter extends ArrayAdapter<Country> {

    public TopCountriesAdapter(Context context, ArrayList<Country> countries){
        super(context, 0, countries);
    }






}
