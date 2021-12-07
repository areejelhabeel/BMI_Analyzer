package com.areejelhabeel.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    Handler goToNextActivity = new android.os.Handler();
    Runnable nextActivity;
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        next=findViewById(R.id.next);
        setContentView(R.layout.splash_activity);


        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text_next();  ;
            }
        });

    }

    private void moveToNextActivity() {
        goToNextActivity.removeCallbacks(nextActivity);
        Intent intent=new Intent(splash.this, login.class);
        finish();
        startActivity(intent);
    }

    public void text_next(){
        Intent intent=new Intent(splash.this, login.class);
        finish();
        startActivity(intent);

    }


}