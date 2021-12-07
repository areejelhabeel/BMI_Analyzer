package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class food_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void backToPreviousActivity(View v) {
        Intent intent=new Intent(this,home.class);
        startActivity(intent);
    }
}