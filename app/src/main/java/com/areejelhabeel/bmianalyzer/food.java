package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.areejelhabeel.bmianalyzer.OOP.BMIFood;
import com.areejelhabeel.bmianalyzer.OOP.BMIFoodAdapter;
import com.areejelhabeel.bmianalyzer.OOP.BMIRecord;
import com.areejelhabeel.bmianalyzer.OOP.BMIRecordAdapter;

import java.util.ArrayList;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
}