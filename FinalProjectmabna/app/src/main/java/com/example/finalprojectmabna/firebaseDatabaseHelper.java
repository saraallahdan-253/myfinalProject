package com.example.finalprojectmabna;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class firebaseDatabaseHelper {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceOffices;
    private List<Offices> office = new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<Offices> office , List<String>keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }


    public firebaseDatabaseHelper() {
       mDatabase = FirebaseDatabase.getInstance();
       mReferenceOffices = mDatabase.getReference("office");
    }
    public void readOffices(final DataStatus dataStatus){
        mReferenceOffices.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                office.clear();
                List<String> keys =new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    Offices Offfice = keyNode.getValue(Offices.class);
                    office.add(Offfice);
                }
                dataStatus.DataIsLoaded(office,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }                               //
    public void addOffice(Offices offices , final DataStatus dataStatus ){
        String key =mReferenceOffices.push().getKey();
        mReferenceOffices.child(key).setValue(offices)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        dataStatus.DataIsInserted();
                    }
                });
    }
}
