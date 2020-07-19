package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Price extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);
        TextView pr1 = findViewById(R.id.textView2);

        Bundle p= getIntent().getExtras();
        pr1.setText(p.getInt("value") +"");

    }
}