package com.areejelhabeel.bmianalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.areejelhabeel.bmianalyzer.OOP.BMIRecord;
import com.areejelhabeel.bmianalyzer.OOP.BMIRecordAdapter;

import java.util.ArrayList;

public class home extends AppCompatActivity {
    RecyclerView home;
    ArrayList<BMIRecord> records;
    BMIRecordAdapter recordAdapter;
    Button add_record;
    Button add_food;
    Button view_food;
    TextView username,logout;
    static home instance;
EditText status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance=this;
        setContentView(R.layout.activity_home);
        home=findViewById(R.id.home);
        add_record=findViewById(R.id.add_record);
        add_food=findViewById(R.id.add_food);
       view_food=findViewById(R.id.view_food);
       logout=findViewById(R.id.logout);
        status=findViewById(R.id.status);
        username=findViewById(R.id.username);
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
       logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               text_login();  ;
            }
        });
     view_food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               btn_view_food();  ;
            }
        });
        home = findViewById(R.id.home);
        home.setLayoutManager(new LinearLayoutManager(this));
        records = (new User()).getRecords();
        recordAdapter = new BMIRecordAdapter(records, this);
        home.setAdapter(recordAdapter);


    }

    public void btn_record() {
        Intent intent=new Intent(home.this, new_record.class);
        startActivity(intent);
    }
    public void btn_food() {
        Intent intent=new Intent(home.this, food_details.class);
        startActivity(intent);
    }
    public void text_login() {
        Intent intent=new Intent(home.this, login.class);
        startActivity(intent);
    }
    public void btn_view_food() {
        Intent intent=new Intent(home.this, view_food.class);
        startActivity(intent);
    }
   public static void checkBMIChange(){
//        if(instance==null)return;
//        instance.adapter.notifiyDataSetChanged();
//        instance.status.setText(User.user.getHomeMassege());
//        instance.username.setText("Hi"+User.user.getName());
   }
    @Override
    protected void onResume(){
        super.onResume();
        checkBMIChange();
    }
}