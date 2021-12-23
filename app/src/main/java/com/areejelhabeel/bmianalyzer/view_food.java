package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.areejelhabeel.bmianalyzer.OOP.BMIFood;
import com.areejelhabeel.bmianalyzer.OOP.BMIFoodAdapter;


import java.util.ArrayList;

public class view_food extends AppCompatActivity {
    RecyclerView view_food;
    ArrayList<BMIFood> foods;
    BMIFoodAdapter foodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_food);
  view_food = findViewById(R.id.view_food);
        view_food.setLayoutManager(new LinearLayoutManager(this));
       foods = (new User()).getFood();
        foodAdapter = new BMIFoodAdapter(foods, this);
        view_food.setAdapter(foodAdapter);
    }
    public void backToPreviousActivity(View v) {
        Intent intent=new Intent(this,home.class);
        startActivity(intent);
}}