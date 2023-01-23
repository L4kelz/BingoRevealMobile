package com.bpg.bingorevealmobile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.aware.PublishConfig;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    public static int numberOfLinesCount = 0;
    public static String numberOfListCount = "0";
    private Context context;
    Activity activity;

    private ArrayList bingo_id, bingo_cname, bingo_b1, bingo_b2, bingo_b3, bingo_b4, bingo_b5, bingo_i1, bingo_i2, bingo_i3, bingo_i4, bingo_i5, bingo_n1, bingo_n2, bingo_n4, bingo_n5,bingo_g1, bingo_g2, bingo_g3,bingo_g4,bingo_g5,bingo_o1,bingo_o2,bingo_o3,bingo_o4,bingo_o5 ;



    CustomAdapter(Activity activity, Context context, ArrayList bingo_id, ArrayList<String> bingo_cname,ArrayList<String> bingo_b1, ArrayList<String> bingo_b2, ArrayList<String> bingo_b3, ArrayList<String> bingo_b4, ArrayList<String> bingo_b5,
                  ArrayList bingo_i1, ArrayList bingo_i2, ArrayList bingo_i3, ArrayList bingo_i4, ArrayList bingo_i5,
                  ArrayList bingo_n1, ArrayList bingo_n2, ArrayList bingo_n4, ArrayList bingo_n5,
                  ArrayList bingo_g1, ArrayList bingo_g2, ArrayList bingo_g3, ArrayList bingo_g4, ArrayList bingo_g5,
                  ArrayList bingo_o1, ArrayList bingo_o2, ArrayList bingo_o3, ArrayList bingo_o4, ArrayList bingo_o5){
        this.context = context;
        this.activity = activity;
        this.bingo_id = bingo_id;
        this.bingo_cname = bingo_cname;
        this.bingo_b1 = bingo_b1;
        this.bingo_b2 = bingo_b2;
        this.bingo_b3 = bingo_b3;
        this.bingo_b4 = bingo_b4;
        this.bingo_b5 = bingo_b5;
        this.bingo_i1 = bingo_i1;
        this.bingo_i2 = bingo_i2;
        this.bingo_i3 = bingo_i3;
        this.bingo_i4 = bingo_i4;
        this.bingo_i5 = bingo_i5;
        this.bingo_n1 = bingo_n1;
        this.bingo_n2 = bingo_n2;
        this.bingo_n4 = bingo_n4;
        this.bingo_n5 = bingo_n5;
        this.bingo_g1 = bingo_g1;
        this.bingo_g2 = bingo_g2;
        this.bingo_g3 = bingo_g3;
        this.bingo_g4 = bingo_g4;
        this.bingo_g5 = bingo_g5;
        this.bingo_o1 = bingo_o1;
        this.bingo_o2 = bingo_o2;
        this.bingo_o3 = bingo_o3;
        this.bingo_o4 = bingo_o4;
        this.bingo_o5 = bingo_o5;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.bingo_cname_txt.setText(String.valueOf(bingo_cname.get(position)));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id",String.valueOf(bingo_id.get(position)));
                intent.putExtra("cname",String.valueOf(bingo_cname.get(position)));
                intent.putExtra("b1",String.valueOf(bingo_b1.get(position)));
                intent.putExtra("b2",String.valueOf(bingo_b2.get(position)));
                intent.putExtra("b3",String.valueOf(bingo_b3.get(position)));
                intent.putExtra("b4",String.valueOf(bingo_b4.get(position)));
                intent.putExtra("b5",String.valueOf(bingo_b5.get(position)));
                intent.putExtra("i1",String.valueOf(bingo_i1.get(position)));
                intent.putExtra("i2",String.valueOf(bingo_i2.get(position)));
                intent.putExtra("i3",String.valueOf(bingo_i3.get(position)));
                intent.putExtra("i4",String.valueOf(bingo_i4.get(position)));
                intent.putExtra("i5",String.valueOf(bingo_i5.get(position)));
                intent.putExtra("n1",String.valueOf(bingo_n1.get(position)));
                intent.putExtra("n2",String.valueOf(bingo_n2.get(position)));
                intent.putExtra("n4",String.valueOf(bingo_n4.get(position)));
                intent.putExtra("n5",String.valueOf(bingo_n5.get(position)));
                intent.putExtra("g1",String.valueOf(bingo_g1.get(position)));
                intent.putExtra("g2",String.valueOf(bingo_g2.get(position)));
                intent.putExtra("g3",String.valueOf(bingo_g3.get(position)));
                intent.putExtra("g4",String.valueOf(bingo_g4.get(position)));
                intent.putExtra("g5",String.valueOf(bingo_g5.get(position)));
                intent.putExtra("o1",String.valueOf(bingo_o1.get(position)));
                intent.putExtra("o2",String.valueOf(bingo_o2.get(position)));
                intent.putExtra("o3",String.valueOf(bingo_o3.get(position)));
                intent.putExtra("o4",String.valueOf(bingo_o4.get(position)));
                intent.putExtra("o5",String.valueOf(bingo_o5.get(position)));
                activity.startActivityForResult(intent,1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bingo_cname.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView bingo_id_txt, bingo_cname_txt, bingo_b1_txt, bingo_b2_txt, bingo_b3_txt, bingo_b4_txt, bingo_b5_txt;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bingo_cname_txt = itemView.findViewById(R.id.id_number);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
