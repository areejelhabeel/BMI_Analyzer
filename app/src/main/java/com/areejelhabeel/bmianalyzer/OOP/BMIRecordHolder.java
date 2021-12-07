package com.areejelhabeel.bmianalyzer.OOP;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areejelhabeel.bmianalyzer.R;

public class BMIRecordHolder extends RecyclerView.ViewHolder {
    private  final TextView date;
    private final TextView weight;
    private final TextView massege;
    private final TextView length;
    private BMIRecord record;
    private View itemView;



    public BMIRecordHolder( @NonNull View itemView) {
        super(itemView);
        this.weight = itemView.findViewById(R.id.weight);
        this.itemView=itemView;
        this.date=itemView.findViewById(R.id.date3);
        this.massege=itemView.findViewById(R.id.time1);
        this.length=itemView.findViewById(R.id.length);
    }
    public void setBMIRecord(BMIRecord record){
        this.record=record;
        date.setText(record.getDate());
       massege.setText(record.getMassege());
        weight.setText(record.getWeight());
        length.setText(record.getLength());
    }

}