package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class optionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
       TextView count = findViewById(R.id.ButtonOption2);
       TextView rentt = findViewById(R.id.ButtonOption3);
       TextView ofices = findViewById(R.id.ButtonOption1);
       ImageView myPr =findViewById(R.id.myProfile);

         Bundle bu=getIntent().getExtras();
      final String myyy= bu.getString("o1");
       final String myy=bu.getString("o2");

        rentt.setText(bu.getString("o2"));

        rentt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gorents = new Intent(optionsActivity.this,RentsPage.class);
                startActivity(gorents);
            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gocount = new Intent(optionsActivity.this,calculate.class);
                startActivity(gocount);
            }
        });
        ofices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goofices = new Intent(optionsActivity.this,officesActivity.class);
                startActivity(goofices);
            }
        });
        myPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gomypr =new Intent(optionsActivity.this,myProfileInfor.class);
                gomypr.putExtra("o3",myyy);
                gomypr.putExtra("o4",myy);
                startActivity(gomypr);
            }
        });
    }
}