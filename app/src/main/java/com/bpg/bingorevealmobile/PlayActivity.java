package com.bpg.bingorevealmobile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PlayActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    MyDatabaseHelper myDB;
    ArrayList<String> bingo_id, bingo_cname, bingo_b1, bingo_b2, bingo_b3, bingo_b4, bingo_b5,
            bingo_i1, bingo_i2, bingo_i3, bingo_i4, bingo_i5,
            bingo_n1, bingo_n2, bingo_n4, bingo_n5,
            bingo_g1, bingo_g2, bingo_g3, bingo_g4, bingo_g5,
            bingo_o1, bingo_o2, bingo_o3, bingo_o4, bingo_o5;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        recyclerView = findViewById(R.id.recyclerView2);


        myDB = new MyDatabaseHelper(PlayActivity.this);
        bingo_id = new ArrayList<>();
        bingo_cname = new ArrayList<>();
        bingo_b1 = new ArrayList<>();
        bingo_b2 = new ArrayList<>();
        bingo_b3 = new ArrayList<>();
        bingo_b4 = new ArrayList<>();
        bingo_b5 = new ArrayList<>();
        bingo_i1 = new ArrayList<>();
        bingo_i2 = new ArrayList<>();
        bingo_i3 = new ArrayList<>();
        bingo_i4 = new ArrayList<>();
        bingo_i5 = new ArrayList<>();
        bingo_n1 = new ArrayList<>();
        bingo_n2 = new ArrayList<>();
        bingo_n4 = new ArrayList<>();
        bingo_n5 = new ArrayList<>();
        bingo_g1 = new ArrayList<>();
        bingo_g2 = new ArrayList<>();
        bingo_g3 = new ArrayList<>();
        bingo_g4 = new ArrayList<>();
        bingo_g5 = new ArrayList<>();
        bingo_o1 = new ArrayList<>();
        bingo_o2 = new ArrayList<>();
        bingo_o3 = new ArrayList<>();
        bingo_o4 = new ArrayList<>();
        bingo_o5 = new ArrayList<>();

        storeDataInArray();

        customAdapter = new CustomAdapter(PlayActivity.this, this, bingo_id, bingo_cname, bingo_b1, bingo_b2, bingo_b3, bingo_b4, bingo_b5, bingo_i1, bingo_i2, bingo_i3, bingo_i4,bingo_i5, bingo_n1, bingo_n2, bingo_n4, bingo_n5, bingo_g1, bingo_g2, bingo_g3, bingo_g4, bingo_g5, bingo_o1, bingo_o2, bingo_o3, bingo_o4, bingo_o5);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(PlayActivity.this));



    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode == 1){
            recreate();
        }
    }

    void storeDataInArray(){
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0){
            Toast.makeText(this, "No Data!", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                bingo_id.add(cursor.getString(0));
                bingo_cname.add(cursor.getString(1));
                bingo_b1.add(cursor.getString(2));
                bingo_b2.add(cursor.getString(3));
                bingo_b3.add(cursor.getString(4));
                bingo_b4.add(cursor.getString(5));
                bingo_b5.add(cursor.getString(6));
                bingo_i1.add(cursor.getString(7));
                bingo_i2.add(cursor.getString(8));
                bingo_i3.add(cursor.getString(9));
                bingo_i4.add(cursor.getString(10));
                bingo_i5.add(cursor.getString(11));
                bingo_n1.add(cursor.getString(12));
                bingo_n2.add(cursor.getString(13));
                bingo_n4.add(cursor.getString(14));
                bingo_n5.add(cursor.getString(15));
                bingo_g1.add(cursor.getString(16));
                bingo_g2.add(cursor.getString(17));
                bingo_g3.add(cursor.getString(18));
                bingo_g4.add(cursor.getString(19));
                bingo_g5.add(cursor.getString(20));
                bingo_o1.add(cursor.getString(21));
                bingo_o2.add(cursor.getString(22));
                bingo_o3.add(cursor.getString(23));
                bingo_o4.add(cursor.getString(24));
                bingo_o5.add(cursor.getString(25));
            }
        }

    }
}