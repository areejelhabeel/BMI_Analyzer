package com.areejelhabeel.bmianalyzer.OOP;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areejelhabeel.bmianalyzer.R;

public class BMIRecordHolder extends RecyclerView.ViewHolder {
    private final TextView date;
    private final TextView weight;
    private final TextView message;
    private final TextView _length;
    private BMIRecord record;

    public BMIRecordHolder(@NonNull View itemView) {
        super(itemView);
        this.weight = itemView.findViewById(R.id.weight);
        this.date = itemView.findViewById(R.id.date);
        this.message = itemView.findViewById(R.id.time);
        this._length = itemView.findViewById(R.id.length);
    }

    public void setBMIRecord(BMIRecord record) {
        this.record = record;
        date.setText(record.getDate());
        message.setText(record.getMassege());
        weight.setText(String.valueOf(record.getWeight()));
        _length.setText(String.valueOf(record.getLength()));
    }



}