package com.areejelhabeel.bmianalyzer.OOP;

import java.util.ArrayList;

public class User {
    private ArrayList<BMIRecord> records;
    private ArrayList<BMIFood> foods;

    public User() {

        this.records = new ArrayList<BMIRecord>();
        records.add(new BMIRecord(80, 170, "9/12/2021", "Normal"));
        records.add(new BMIRecord(70, 190, "9/1/2021", "Normal"));
        records.add(new BMIRecord(50, 150, "1/5/2021", "Normal"));
this.foods= new ArrayList<BMIFood>();
       foods.add(new BMIFood("Salamon", "Fish", "22 cal/g"));
        foods.add(new BMIFood("Rais", "Carbohydrates", "30 cal/g"));
       foods.add(new BMIFood("Apple", "Fruit", "4 cal/g"));
        foods.add(new BMIFood("Orange", "Fruit", "2 cal/g"));
    }

    public ArrayList<BMIRecord> getRecords() {
        return records;
    }
    public ArrayList<BMIFood> getFood() {
        return foods;
    }
}
