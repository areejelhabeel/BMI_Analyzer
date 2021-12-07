package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class new_record extends AppCompatActivity {
    EditText etDate;
    EditText time;
    int hour,minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        etDate=findViewById(R.id.date3);
        time=findViewById(R.id.time1);
        Calendar celendar=Calendar.getInstance();
        final int year=celendar.get(Calendar.YEAR);
        final int month=celendar.get(Calendar.MONTH);
        final int day=celendar.get(Calendar.DAY_OF_MONTH);
        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(com.areejelhabeel.bmianalyzer.new_record.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        etDate.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            TimePickerDialog timePickerDialog=new TimePickerDialog(com.areejelhabeel.bmianalyzer.new_record.this, new TimePickerDialog.OnTimeSetListener(){
                @Override
                public void onTimeSet(TimePicker timePicker, int hour1, int minute1) {
                    hour=hour1 ;
                    minute=minute1;
                    Calendar calendar=Calendar.getInstance();
                    calendar.set(0,0,0,hour,minute);
                    time.setText(DateFormat.format("hh:mm aa",calendar));
                }

                },12,0,false);
            timePickerDialog.updateTime(hour,minute);
            timePickerDialog.show();
            }
        });

    }
}