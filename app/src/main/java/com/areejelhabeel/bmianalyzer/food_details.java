package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class food_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}