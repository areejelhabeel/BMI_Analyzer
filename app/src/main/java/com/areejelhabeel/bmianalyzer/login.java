package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity  {
EditText e_mail;
EditText password;
TextView signup;
Button login;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity);
        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        e_mail=findViewById(R.id.e_mail);
        password=findViewById(R.id.password);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text_sign()  ;
            }
        });
     login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                  if(e_mail.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
                      btn_login();}
                  else{
                      Toast.makeText(login.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                  }
            }
        });
     }

    public void text_sign() {
        Intent intent=new Intent(login.this, signup.class);
        startActivity(intent);
    }
    public void btn_login() {
        Intent intent=new Intent(login.this, home.class);
        finish();
        startActivity(intent);
    }
}