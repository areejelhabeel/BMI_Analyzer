package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    EditText e_mail;
    EditText password;
    EditText re_password;
    EditText name;
    TextView login1;
    Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        login1=findViewById(R.id.login1);
       create=findViewById(R.id.create);
        e_mail=findViewById(R.id.e_mail);
        password=findViewById(R.id.password1);
       name=findViewById(R.id.name);
        re_password=findViewById(R.id.re_password);
        create.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                btn_complete()  ;
            }
        });
       login1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text_login()  ;
            }
        });
    }
    public void text_login(){
        Intent intent=new Intent(signup.this, login.class);
        startActivity(intent);
    }
    public void btn_complete(){
        Intent intent=new Intent(signup.this,complete_information.class);
        startActivity(intent);
    }}
