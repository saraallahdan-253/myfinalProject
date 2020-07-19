package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class rentsDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rents_details);
        Bundle b =getIntent().getExtras();
        rentsClass p =(rentsClass) b.getSerializable("rent");

        TextView locate = findViewById(R.id.detailsLocation);
        ImageView imgg = findViewById(R.id.detailsImage);
        TextView prc = findViewById(R.id.detailsPrice);
        TextView spc = findViewById(R.id.detailsSpace);
        TextView dtls = findViewById(R.id.detailsdDetails);
        TextView fon = findViewById(R.id.detailsPhone);

        locate.setText(p.getLocation());
        imgg.setImageResource(p.getImg());
        prc.setText( "المبلغ:    "+p.getPrice()+"");
        spc.setText("المساحه :    "+p.getrPlace()+"");
        dtls.setText(p.getDetails());
        fon.setText(p.getPhone()+"");





    }
}