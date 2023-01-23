package com.bpg.bingorevealmobile;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {


    //Test get data
    TextView tvtester;



    TextView txtnumbercatcher;
    TextView txtdito;
    Button btn_okay;
    Button btn_cardsee, btn_play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#293241"));

        // Set BackgroundDrawable
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);




        txtnumbercatcher = findViewById(R.id.txtnumber);
        txtdito = findViewById(R.id.tv1);
        btn_okay= findViewById(R.id.btn_enter);
        btn_cardsee = findViewById(R.id.btncardview);
        btn_play = findViewById(R.id.btn_play);


        tvtester = findViewById(R.id.tvTester);
    CallMe();

        btn_okay.setOnClickListener(view -> {
            // click handling code



            if(txtnumbercatcher.getText().toString().equals("1")){
                //btn represents your button object

                curr_num();
                Toast.makeText(this, "Number 1", Toast.LENGTH_SHORT).show();
            }
            else if (txtnumbercatcher.getText().toString().equals("2")){
                curr_num();
                Toast.makeText(this, "Number 2", Toast.LENGTH_SHORT).show();
            }
            else if (txtnumbercatcher.getText().toString().equals("3")){
                curr_num();
                Toast.makeText(this, "Number 3", Toast.LENGTH_SHORT).show();
            }else if (txtnumbercatcher.getText().toString().equals("4")){
                curr_num();
                Toast.makeText(this, "Number 4", Toast.LENGTH_SHORT).show();
            }else if (txtnumbercatcher.getText().toString().equals("5")){
                curr_num();
                Toast.makeText(this, "Number 5", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Invalid Number", Toast.LENGTH_SHORT).show();
            }
        });


        btn_cardsee.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, CardViewActivity.class);
            MainActivity.this.startActivity(myIntent);
        });
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, LaroActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

    }

    private void curr_num() {



        txtdito.setText(txtnumbercatcher.getText());
    }

    void CallMe(){
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(this);
        Cursor cursor = dbHelper.ViewData();

        StringBuilder stringBuilder = new StringBuilder();

        while (cursor.moveToNext()){
            stringBuilder.append("\nCard Name : " + cursor.getString(1) + "\n" + cursor.getString(2)
            + " " + cursor.getString(3)
                    + " " + cursor.getString(4)
                    + " " + cursor.getString(5)
                    + " " + cursor.getString(6)
                    + " " + cursor.getString(7)
                    + " " + cursor.getString(8)
                    + " " + cursor.getString(9)
                    + " " + cursor.getString(10)
                    + " " + cursor.getString(11)
                    + " " + cursor.getString(12)
                    + " " + cursor.getString(13)
                    + " " + cursor.getString(14)
                    + " " + cursor.getString(15)
                    + " " + cursor.getString(16)
                    + " " + cursor.getString(17)
                    + " " + cursor.getString(18)
                    + " " + cursor.getString(19)
                    + " " + cursor.getString(20)
                    + " " + cursor.getString(21)
                    + " " + cursor.getString(22)
                    + " " + cursor.getString(23)
                    + " " + cursor.getString(24)
                    + " " + cursor.getString(25));
        }
        tvtester.setText(stringBuilder);
    }




}