


package com.areejelhabeel.bmianalyzer.OOP;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areejelhabeel.bmianalyzer.R;

import java.util.ArrayList;

public class BMIRecordAdapter extends RecyclerView.Adapter<BMIRecordHolder> {
    private ArrayList<BMIRecord> records;
    private Context context;

    public BMIRecordAdapter(ArrayList<BMIRecord> records,Context context){
        this.records=records;
        this.context=context;
    }


    @NonNull
    @Override
    public BMIRecordHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_bmi_records,parent,false);
        return new BMIRecordHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BMIRecordHolder holder, int position) {
        BMIRecord record;
        record = records.get(position);
        holder.setBMIRecord(record);
    }

    @Override
    public int getItemCount(){
        return records.size();
    }

}
