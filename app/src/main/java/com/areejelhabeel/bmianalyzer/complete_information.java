
package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

    public class complete_information extends AppCompatActivity {
        EditText etDate;
        Button plus;
        Button minis;
        Button plus2;
        Button minis2;
        EditText number;
        EditText number2;
        int count=0;
        int old=0;
        int   current=0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_complete_information);
            etDate=findViewById(R.id.date2);
            plus=findViewById(R.id.plus);
            minis=findViewById(R.id.minis);
            plus2=findViewById(R.id.plus2);
            minis2=findViewById(R.id.minis2);
            number=findViewById(R.id.weight);
            number2=findViewById(R.id.length);
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
           plus.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View view){
                   count=count+1;
                   old=Integer.parseInt(number.getText().toString());
                   current=old+count;
                   number.setText(""+current);
                   current=0;
                   old=0;
                   count=0;

               }
           });
            minis.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    count=count-1;
                    old=Integer.parseInt(number.getText().toString());
                    current=old+count;
                    number.setText(""+current);
                    current=0;
                    old=0;
                    count=0;

                }
            });

      plus2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count=count+1;
                old=Integer.parseInt(number2.getText().toString());
                current=old+count;
                number2.setText(""+current);
                current=0;
                old=0;
                count=0;

            }
        });
            minis2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count=count-1;
                old=Integer.parseInt(number2.getText().toString());
                current=old+count;
                number2.setText(""+current);
                current=0;
                old=0;
                count=0;

            }
        });
    }
    }