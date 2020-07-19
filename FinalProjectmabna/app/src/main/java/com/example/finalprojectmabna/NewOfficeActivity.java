package com.example.finalprojectmabna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class NewOfficeActivity extends AppCompatActivity {
private EditText mName_edittext;
private EditText mPhone_edittext;
private EditText mdetail_edittext;
private Button mAdd_btn;
private Button mBack_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_office);
        mName_edittext =(EditText) findViewById(R.id.namess_edittext);
        mPhone_edittext =(EditText) findViewById(R.id.phonee_edittext);
        mdetail_edittext =(EditText) findViewById(R.id.detaill_edittext);

        mAdd_btn = (Button) findViewById(R.id.add_button);
        mBack_btn  =(Button) findViewById(R.id.back_button);

        mAdd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Offices offices = new Offices();
                offices.setName(mName_edittext.getText().toString());
                offices.setDetails(mdetail_edittext.getText().toString());
                offices.setPhone(Integer.parseInt(mPhone_edittext.getText().toString()));

                new firebaseDatabaseHelper().addOffice(offices, new firebaseDatabaseHelper.DataStatus() {
                    @Override
                    public void DataIsLoaded(List<Offices> office, List<String> keys) {

                    }

                    @Override
                    public void DataIsInserted() {
                        Toast.makeText(NewOfficeActivity.this,"تم إضافة مكتبك بنجاح !",Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void DataIsUpdated() {

                    }

                    @Override
                    public void DataIsDeleted() {

                    }
                });
            }
        });
        mBack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); return;
            }
        });

    }
}