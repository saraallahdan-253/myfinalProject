package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class calculate extends AppCompatActivity {
    private buldingClass b1;
    private buldingClass b2;
    private buldingClass b3;
    private buldingClass b4;
    private buldingClass b5;
    private buldingClass b6;
    private buldingClass b7;
    private buldingClass b8;
    private buldingClass b9;
    private buldingClass b10;
    private buldingClass b11;
    private buldingClass b12;
    private buldingClass b13;
    private buldingClass b14;
    private buldingClass b15;
    private buldingClass b16;
    private buldingClass b17;
    private buldingClass b18;
    private buldingClass b19;
    private buldingClass b20;
    private buldingClass b21;
    private buldingClass b22;
    private buldingClass b23;
    private buldingClass b24;
    private buldingClass b25;
    private buldingClass b26;
    private buldingClass b27;
    private buldingClass b28;
    private buldingClass b29;
    private buldingClass b30;
    private buldingClass b31;
    private buldingClass b32;
    private buldingClass b33;
    private buldingClass b34;
    private buldingClass b35;
    private buldingClass b36;
    private buldingClass b37;
    private buldingClass b38;
    private buldingClass b39;
    private buldingClass b40;
    private buldingClass b41;
    private buldingClass b42;
    private buldingClass b43;
    private buldingClass b44;
    private buldingClass b45;
    private buldingClass b46;
    private buldingClass b47;
    private buldingClass b48;
    private EditText spaceEditText;
    private EditText floursEditText;
    private RadioButton radiob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        spaceEditText = findViewById(R.id.SpaceEditText);
        floursEditText = findViewById(R.id.FloarsEditText);
        Button mycalculate = findViewById(R.id.button);
        radiob = findViewById(R.id.radioButton);

        ArrayList<buldingClass> myBulding = new ArrayList<>();

        b1 = new buldingClass(300, 1, 1, 118750);
        b2 = new buldingClass(300, 2, 1, 159191);
        b3 = new buldingClass(300, 3, 1, 199994);
        b4 = new buldingClass(300, 1, 0, 73091);
        b5 = new buldingClass(300, 2, 0, 113954);
        b6 = new buldingClass(300, 3, 0, 154467);
        b7 = new buldingClass(400, 1, 1, 151530);
        b8 = new buldingClass(400, 2, 1, 194032);
        b9 = new buldingClass(400, 3, 1, 237092);
        b10 = new buldingClass(400, 1, 0, 92673);
        b11 = new buldingClass(400, 2, 0, 135215);
        b12 = new buldingClass(400, 3, 0, 177924);
        b13= new buldingClass(500, 1, 1, 159981);
        b14 = new buldingClass(500, 2, 1, 212294);
        b15 = new buldingClass(500, 3, 1, 264745);
        b16 = new buldingClass(500, 1, 0, 87134);
        b17 = new buldingClass(500, 2, 0, 139721);
        b18 = new buldingClass(500, 3, 0, 192334);
        b19 = new buldingClass(600, 1, 1, 184248);
        b20 = new buldingClass(600, 2, 1, 246063);
        b21 = new buldingClass(600, 3, 1, 307750);
        b22 = new buldingClass(600, 1, 0, 98041);
        b23 = new buldingClass(600, 2, 0, 184248);
        b24 = new buldingClass(600, 3, 0, 246063);
        b25 = new buldingClass(700, 1, 1, 207990);
        b26 = new buldingClass(700, 2, 1, 279259);
        b27 = new buldingClass(700, 3, 1, 350405);
        b28 = new buldingClass(700, 1, 0,108550);
        b29 = new buldingClass(700, 2, 0,180222);
        b30= new buldingClass(700, 3, 0, 251571);
        b31= new buldingClass(800, 1, 1, 231932);
        b32 = new buldingClass(800, 2, 1, 312253);
        b33 = new buldingClass(800, 3, 1, 392784);
        b34 = new buldingClass(800, 1, 0,119332);
        b35 = new buldingClass(800, 2, 0,200097);
        b36= new buldingClass(800, 3, 0, 280889);
        b37= new buldingClass(900, 1, 1, 255450);
        b38 = new buldingClass(900, 2, 1, 345072);
        b39 = new buldingClass(900, 3, 1, 434639);
        b40 = new buldingClass(900, 1, 0,129712);
        b41 = new buldingClass(900, 2, 0,219872);
        b42= new buldingClass(900, 3, 0, 309731);
        b43= new buldingClass(1000, 1, 1, 279191);
        b44 = new buldingClass(1000, 2, 1,377767 );
        b45 = new buldingClass(1000, 3, 1, 476643);
        b46 = new buldingClass(1000, 1, 0,140396);
        b47 = new buldingClass(1000, 2, 0,239573);
        b48= new buldingClass(1000, 3, 0, 338749);

        mycalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fl = Integer.parseInt(floursEditText.getText().toString());
                int sp = Integer.parseInt(spaceEditText.getText().toString());
                int bs = 0;
                boolean y = radiob.isChecked();
                if (y)
                    bs = 1;

                int x = matching(fl,sp,bs);
                Intent i1 = new Intent(calculate.this, Price.class);
                i1.putExtra("value", x);
                startActivity(i1);
            }
        });

    }
       public int matching(int fl, int sp, int bs){
        if( fl == b1.getFloors() && sp == b1.getSpace() && bs== b1.getCrypt())
            return b1.getTotal();

         else if( fl == b2.getFloors() && sp == b2.getSpace() && bs== b2.getCrypt())
            return b2.getTotal();

        else if( fl == b3.getFloors() && sp == b3.getSpace() && bs== b3.getCrypt())
            return b3.getTotal();

        else if( fl == b4.getFloors() && sp == b4.getSpace() && bs== b4.getCrypt())
            return b4.getTotal();

       else if( fl == b5.getFloors() && sp == b5.getSpace() && bs== b5.getCrypt())
          return b5.getTotal();

      else if( fl == b6.getFloors() && sp == b6.getSpace() && bs== b6.getCrypt())
          return b6.getTotal();

      else if( fl == b7.getFloors() && sp == b7.getSpace() && bs== b7.getCrypt())
          return b7.getTotal();

      else if( fl == b8.getFloors() && sp == b8.getSpace() && bs== b8.getCrypt())
          return b8.getTotal();

       else if( fl == b9.getFloors() && sp == b9.getSpace() && bs== b9.getCrypt())
          return b9.getTotal();

      else if( fl == b10.getFloors() && sp == b10.getSpace() && bs== b10.getCrypt())
          return b10.getTotal();

      else if( fl == b11.getFloors() && sp == b11.getSpace() && bs== b11.getCrypt())
          return b11.getTotal();

      else if( fl == b12.getFloors() && sp == b12.getSpace() && bs== b12.getCrypt())
          return b12.getTotal();


      else if( fl == b13.getFloors() && sp == b13.getSpace() && bs== b13.getCrypt())
          return b13.getTotal();

      else if( fl == b14.getFloors() && sp == b14.getSpace() && bs== b14.getCrypt())
          return b14.getTotal();

      else if( fl == b15.getFloors() && sp == b15.getSpace() && bs== b15.getCrypt())
          return b15.getTotal();

     else if( fl == b16.getFloors() && sp == b16.getSpace() && bs== b16.getCrypt())
          return b16.getTotal();

      else if( fl == b17.getFloors() && sp == b17.getSpace() && bs== b17.getCrypt())
          return b17.getTotal();

      else if( fl == b18.getFloors() && sp == b18.getSpace() && bs== b18.getCrypt())
          return b18.getTotal();

      else if( fl == b19.getFloors() && sp == b19.getSpace() && bs== b19.getCrypt())
          return b19.getTotal();

        else if( fl == b20.getFloors() && sp == b20.getSpace() && bs== b20.getCrypt())
            return b20.getTotal();

        else if( fl == b21.getFloors() && sp == b21.getSpace() && bs== b21.getCrypt())
            return b21.getTotal();

        else if( fl == b22.getFloors() && sp == b22.getSpace() && bs== b22.getCrypt())
            return b22.getTotal();

        else if( fl == b23.getFloors() && sp == b23.getSpace() && bs== b23.getCrypt())
            return b23.getTotal();

        else if( fl == b24.getFloors() && sp == b24.getSpace() && bs== b24.getCrypt())
            return b24.getTotal();

        else if( fl == b25.getFloors() && sp == b25.getSpace() && bs== b25.getCrypt())
            return b25.getTotal();

        else if( fl == b26.getFloors() && sp == b26.getSpace() && bs== b26.getCrypt())
            return b26.getTotal();

        else if( fl == b27.getFloors() && sp == b27.getSpace() && bs== b27.getCrypt())
            return b27.getTotal();

        else if( fl == b28.getFloors() && sp == b28.getSpace() && bs== b28.getCrypt())
            return b28.getTotal();

        else if( fl == b29.getFloors() && sp == b29.getSpace() && bs== b29.getCrypt())
            return b29.getTotal();

        else if( fl == b30.getFloors() && sp == b30.getSpace() && bs== b30.getCrypt())
            return b30.getTotal();

        else if( fl == b31.getFloors() && sp == b31.getSpace() && bs== b31.getCrypt())
            return b31.getTotal();

        else if( fl == b32.getFloors() && sp == b32.getSpace() && bs== b32.getCrypt())
            return b32.getTotal();

        else if( fl == b33.getFloors() && sp == b33.getSpace() && bs== b33.getCrypt())
            return b33.getTotal();

        else if( fl == b34.getFloors() && sp == b34.getSpace() && bs== b34.getCrypt())
            return b34.getTotal();

        else if( fl == b35.getFloors() && sp == b35.getSpace() && bs== b35.getCrypt())
            return b35.getTotal();

        else if( fl == b36.getFloors() && sp == b36.getSpace() && bs== b36.getCrypt())
            return b36.getTotal();

        else if( fl == b37.getFloors() && sp == b37.getSpace() && bs== b37.getCrypt())
            return b37.getTotal();

        else if( fl == b38.getFloors() && sp == b38.getSpace() && bs== b38.getCrypt())
            return b38.getTotal();

        else if( fl == b39.getFloors() && sp == b39.getSpace() && bs== b39.getCrypt())
            return b39.getTotal();

        else if( fl == b40.getFloors() && sp == b40.getSpace() && bs== b40.getCrypt())
            return b40.getTotal();

        else if( fl == b41.getFloors() && sp == b41.getSpace() && bs== b41.getCrypt())
            return b41.getTotal();

        else if( fl == b42.getFloors() && sp == b42.getSpace() && bs== b42.getCrypt())
            return b42.getTotal();

        else if( fl == b43.getFloors() && sp == b43.getSpace() && bs== b43.getCrypt())
            return b43.getTotal();

        else if( fl == b44.getFloors() && sp == b44.getSpace() && bs== b44.getCrypt())
            return b44.getTotal();

        else if( fl == b45.getFloors() && sp == b45.getSpace() && bs== b45.getCrypt())
            return b45.getTotal();

        else if( fl == b46.getFloors() && sp == b46.getSpace() && bs== b46.getCrypt())
            return b46.getTotal();

        else if( fl == b47.getFloors() && sp == b47.getSpace() && bs== b47.getCrypt())
            return b47.getTotal();

        else if( fl == b48.getFloors() && sp == b48.getSpace() && bs== b48.getCrypt())
            return b48.getTotal();
      else
            return 0;

    }





    }
