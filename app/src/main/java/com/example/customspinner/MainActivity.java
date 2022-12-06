package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] Medinot = {"Choose","Israel", "USA", "Saudi Arabia", "Japan", "UK", "Tunis", "Sweden", "Russia"};
    String[] Capital = {"A Country", "Jerusalem", "Washington", "Riyadh", "Tokyo", "London", "Tunis", "Stockholm", "Moscow"};
    String[] Population = {"", "9.364M", "331.9M", "35.4M", "125.7M", "67.33M", "11.94M", "10.42M", "143.4M"};
    int[] Tmonot = {R.drawable.white, R.drawable.israel, R.drawable.usa, R.drawable.saudi, R.drawable.japan, R.drawable.unitedkingdom, R.drawable.tunis, R.drawable.sweden, R.drawable.russia};

    Spinner spin;
    TextView tV3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = (Spinner) findViewById(R.id.spin);
        tV3 = (TextView) findViewById(R.id.tV3);
        CustomAdapter adp = new CustomAdapter(getApplicationContext(), Medinot, Tmonot, Capital);
        spin.setOnItemSelectedListener(this);
        spin.setAdapter(adp);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long rowid) {
        if(pos >= 1) {
            tV3.setText("Country: " + Medinot[pos] + "\nCapital: " + Capital[pos] + "\nPopulation:  " + Population[pos]);
        }
        else{
            tV3.setText("Country: \nCapital: \nPopulation:  ");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}