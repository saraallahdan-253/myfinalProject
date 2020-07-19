package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RentsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rents_page);
        ArrayList<rentsClass> myRents = new ArrayList<>();
        rentsClass r1=new rentsClass(R.drawable.house17,400,250,"الجابريه قطعه 3",999333322,"3غرف,2حمام,صاله,مطبخ");
        rentsClass r2=new rentsClass(R.drawable.house2,500,350,"السره قطعه3",888666622,"3غرف,3حمام,صاله,مطبخ,غرفة غسيل");
        rentsClass r3=new rentsClass(R.drawable.house17,460,235,"القصور قطعه 1",777733655,"3غرف, 3حمام,صاله,مطبخ");
        rentsClass r4=new rentsClass(R.drawable.house4,600,350,"السالميه قطعه 5",976344422,"3غرف,2حمام,صاله,مطبخ");
        rentsClass r5=new rentsClass(R.drawable.house5,440,250,"الجابريه قطعه4",888833000,"3غرف,2حمام,صاله,مطبخ");
        rentsClass r6=new rentsClass(R.drawable.house6,500,280,"صباح السالم قطعه2",999333322,"3غرف,3حمام,صاله,مطبخ, مخزن");
        rentsClass r7=new rentsClass(R.drawable.house7,460,340,"عبدالله مبارك قطعه3",777773322,"3غرف,2حمام,صاله,مطبخ");
        rentsClass r8=new rentsClass(R.drawable.house8,550,320,"الزهراء قطعه 2",338888822,"4غرف,3حمام,صاله,مطبخ,مخزن");
        rentsClass r9=new rentsClass(R.drawable.house9,530,250,"مشرف قطعه6",444433322,"3غرف,2حمام,صاله,مطبخ");
        rentsClass r10=new rentsClass(R.drawable.house10,400,200,"المنقف قطعه 3",888883322,"3غرف,2حمام,صاله,مطبخ");
        rentsClass r11=new rentsClass(R.drawable.house11,500,280,"ابو فطيره قطعه 1",444448882,"3غرف,2حمام,صاله,مطبخ,غرفة غسيل");
        rentsClass r12=new rentsClass(R.drawable.house12,560,280,"العقيله قطعه 3",988888322,"3غرف,2حمام,صاله,مطبخ,مخزن");
        rentsClass r13=new rentsClass(R.drawable.house13,520,200,"العدان قطعه1",390000322,"3غرف,2حمام,صاله,مطبخ,غرفة غسيل");
        rentsClass r14=new rentsClass(R.drawable.house14,450,230,"المسايل قطعه 4",444433322,"3غرف,3حمام,صاله,مطبخ,غرفة خادم");
        rentsClass r15=new rentsClass(R.drawable.house15,500,250,"بيان قطعه 6",555533322,"3غرف2حمام,صاله,مطبخ,غرفة غسيل");
        rentsClass r16=new rentsClass(R.drawable.house16,550,230,"سلوى قطعه 3",777773322,"3غرف,2حمام,صاله,مطبخ,مخزن,غرفة غسيل");

        myRents.add(r1);
        myRents.add(r2);
        myRents.add(r3);
        myRents.add(r4);
        myRents.add(r5);
        myRents.add(r6);
        myRents.add(r7);
        myRents.add(r8);
        myRents.add(r9);
        myRents.add(r10);
        myRents.add(r11);
        myRents.add(r12);
        myRents.add(r13);
        myRents.add(r14);
        myRents.add(r15);
        myRents.add(r16);

        RecyclerView rv = findViewById(R.id.recyclerv);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        RentsAdabter adapters =new RentsAdabter(myRents,this);
        rv.setAdapter(adapters);




    }

}