package com.example.finalprojectmabna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class officesActivity extends AppCompatActivity {
private RecyclerView mRecyclerView;
private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offices);
        mAuth =FirebaseAuth.getInstance();
        mRecyclerView =(RecyclerView) findViewById(R.id.recyclerview_books);
        new firebaseDatabaseHelper().readOffices(new firebaseDatabaseHelper.DataStatus() {
            @Override
            public void DataIsLoaded(List<Offices> office, List<String> keys) {
                findViewById(R.id.Loading_pb).setVisibility(View.GONE);
                new Recyclerview_Config().setConfig(mRecyclerView,officesActivity.this, office,keys);
            }
            @Override
            public void DataIsInserted() {
            }
            @Override
            public void DataIsUpdated() {
            }
            @Override
            public void DataIsDeleted() {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        FirebaseUser user = mAuth.getCurrentUser();
        getMenuInflater().inflate(R.menu.officelist_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        FirebaseUser user = mAuth.getCurrentUser();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.new_office:
                startActivity(new Intent(this,NewOfficeActivity.class));
                return true;
            case R.id.sign_out:
                mAuth.signOut();
                invalidateOptionsMenu();
                Recyclerview_Config.logout();
                startActivity(new Intent(this,logInPage.class));
                return true;


        }
        return super.onOptionsItemSelected(item);

    }
}