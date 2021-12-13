package com.areejelhabeel.bmianalyzer.OOP;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areejelhabeel.bmianalyzer.R;

import java.util.ArrayList;

public class BMIFoodAdapter extends RecyclerView.Adapter<BMIFoodHolder> {
    private final ArrayList<BMIFood> foods;
    private Context context;

    public BMIFoodAdapter(ArrayList<BMIFood> foods, Context context){
        this.foods=foods;
        this.context=context;
    }


    @NonNull
    @Override
    public BMIFoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.activity_bmi_food,parent,false);
    return new BMIFoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BMIFoodHolder holder, int position) {
        BMIFood food;
        food = foods.get(position);
        holder.setBMIFood(food);
    }




    @Override
    public int getItemCount(){
        return foods.size();
    }

}
