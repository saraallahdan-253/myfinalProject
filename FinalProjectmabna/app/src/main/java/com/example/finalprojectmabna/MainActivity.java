package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler(getMainLooper());
        final ProgressBar ppp = findViewById(R.id.progressBaar);
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,logInPage.class);
                ppp.setVisibility(View.VISIBLE);
                startActivity(in);
            }
        };
        handler.postDelayed(r,6000);
    }
}