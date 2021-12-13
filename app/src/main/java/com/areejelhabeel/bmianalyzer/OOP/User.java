package com.areejelhabeel.bmianalyzer.OOP;

import java.util.ArrayList;
import java.util.List;

public class User {
    private ArrayList<BMIRecord> records;
    String name;
    String birthdate;
   String gender;
   String email;
   String password;
    public User() {
        this.records = new ArrayList<BMIRecord>();
        records.add(new BMIRecord(80, 170, "9/12/2021", "Normal"));
        records.add(new BMIRecord(70, 190, "9/1/2021", "Normal"));
        records.add(new BMIRecord(50, 150, "1/5/2021", "Normal"));

    }

    public ArrayList<BMIRecord> getRecords() {
        return records;
    }
}
