package com.areejelhabeel.bmianalyzer.OOP;

import android.media.Image;

public class BMIFood {
    String name;
    String category;
    int calory;

    public BMIFood(String name,String category,int calory) {
        this.name = name;
        this.category= category;
        this.calory = calory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }


}