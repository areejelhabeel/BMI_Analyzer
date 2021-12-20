package com.areejelhabeel.bmianalyzer.OOP;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areejelhabeel.bmianalyzer.R;

public class BMIFoodHolder  extends RecyclerView.ViewHolder {
    private final TextView name;
    private final TextView catogery;
    private final TextView calory;
    private final ImageView image;
    private BMIFood food;

    public BMIFoodHolder(@NonNull View itemView) {
        super(itemView);
        this.name = itemView.findViewById(R.id.name);
        this.catogery = itemView.findViewById(R.id.category);
        this.calory = itemView.findViewById(R.id.calory);
        this.image=itemView.findViewById(R.id.image);
    }
public void setBMIFood(BMIFood food){
 this.food=food;
 name.setText(food.getName());
 catogery.setText(food.getCategory());
 calory.setText(food.getCalory());
 image.setImageResource(food.getImage());
}
  }}

