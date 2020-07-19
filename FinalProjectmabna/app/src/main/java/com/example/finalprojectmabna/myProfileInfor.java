package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class myProfileInfor extends AppCompatActivity {
Bundle bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile_infor);
        TextView myusern = findViewById(R.id.myUserna);
        TextView myem = findViewById(R.id.myEmail);

        bu=getIntent().getExtras();
        myusern.setText(bu.getString("o4"));
        myem.setText(bu.getString("o3"));
    }
}