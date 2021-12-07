
package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

    public class complete_information extends AppCompatActivity {
        EditText etDate;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_complete_information);
            etDate=findViewById(R.id.date2);
            Calendar celendar=Calendar.getInstance();
            final int year=celendar.get(Calendar.YEAR);
            final int month=celendar.get(Calendar.MONTH);
            final int day=celendar.get(Calendar.DAY_OF_MONTH);
            etDate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DatePickerDialog datePickerDialog=new DatePickerDialog(com.areejelhabeel.bmianalyzer.complete_information.this, new DatePickerDialog.OnDateSetListener() {
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
        }
    }