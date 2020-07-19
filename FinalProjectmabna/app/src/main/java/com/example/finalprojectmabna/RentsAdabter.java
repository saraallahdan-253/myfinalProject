package com.example.finalprojectmabna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RentsAdabter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<rentsClass> rArray;
    Context c ;

    public RentsAdabter(ArrayList<rentsClass> rArray, Context c) {
        this.rArray = rArray;
        this.c = c;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.resouce_rent,parent,false);
      ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder,final int position) {
        ((ViewHolder) holder).rimage.setImageResource(rArray.get(position).getImg());
        ((ViewHolder) holder).rprice.setText(rArray.get(position).getPrice()+ "");
        ((ViewHolder) holder).rrspace.setText(rArray.get(position).getrPlace() + "");
        ((ViewHolder) holder).rlocation.setText(rArray.get(position).getLocation());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c, rentsDetails.class);
                i.putExtra("rent", rArray.get(position));
                c.startActivity(i);
            }
        });
        //((ViewHolder) holder).rcall.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
               // Intent call = new Intent(Intent.ACTION_DIAL);
               // call.setData(Uri.parse("tel:"+rArray.get(position).getPhone()));
              //  c.startActivity(call);
           // }
        //});
    }
    @Override
    public int getItemCount() {
        return rArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView rimage;
       public TextView rprice;
        public TextView rrspace;
        public TextView rlocation;
       // public ImageView rcall;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           view =itemView;
            rimage = itemView.findViewById(R.id.imageView7);
           // rcall = itemView.findViewById(R.id.callImage);
            rprice = itemView.findViewById(R.id.textView3);
            rlocation = itemView.findViewById(R.id.textView);
            rrspace= itemView.findViewById(R.id.textView14);
        }
    }
}
