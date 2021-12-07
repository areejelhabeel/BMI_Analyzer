package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class home extends AppCompatActivity {

    Button add_record;
 Button add_food;
    Button view_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        add_record=findViewById(R.id.add_record);
        add_food=findViewById(R.id.add_food);
       view_food=findViewById(R.id.view_food);
       add_record.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                btn_record()  ;
            }
        });
        add_food.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            btn_food()  ;
        }
    });
    }

    public void btn_record() {
        Intent intent=new Intent(home.this, new_record.class);
        startActivity(intent);
    }
    public void btn_food() {
        Intent intent=new Intent(home.this, food_details.class);
        startActivity(intent);
    }
}