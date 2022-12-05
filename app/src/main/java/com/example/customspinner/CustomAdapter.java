package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String countryList[];
    String CountryCapital[];
    Context context;
    int symbols[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext,String[] countryList, int[] symbols, String[] CountryCapital) {
        this.context = applicationContext;
        this.countryList = countryList;
        this.symbols = symbols;
        this.CountryCapital = CountryCapital;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_lv_layout, null);
        TextView country = (TextView) view.findViewById(R.id.tV);
        TextView capital = (TextView) view.findViewById(R.id.tV2);
        ImageView symbol = (ImageView) view.findViewById(R.id.iV);
        country.setText(countryList[i]);
        capital.setText(CountryCapital[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }
}