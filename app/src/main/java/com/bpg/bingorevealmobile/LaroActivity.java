package com.bpg.bingorevealmobile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Arrays;


public class LaroActivity extends AppCompatActivity {

    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;
    Button btn_number_laro, btn_pattern, btn_reset, btn_RemoveNumber;
    TextView tvAllNumbers, tv_CurrentNumber, tv_Bingo, tv_patternStyle;
    TextView b1_1,	b2_1,	b3_1,	b4_1,	b5_1,	i1_1,	i2_1,	i3_1,	i4_1,	i5_1,	n1_1,	n2_1,	n4_1,	n5_1,	g1_1,	g2_1,	g3_1,	g4_1,	g5_1,	o1_1,	o2_1,	o3_1,	o4_1,	o5_1;
    TextView b1_2,	b2_2,	b3_2,	b4_2,	b5_2,	i1_2,	i2_2,	i3_2,	i4_2,	i5_2,	n1_2,	n2_2,	n4_2,	n5_2,	g1_2,	g2_2,	g3_2,	g4_2,	g5_2,	o1_2,	o2_2,	o3_2,	o4_2,	o5_2;
    TextView b1_3,	b2_3,	b3_3,	b4_3,	b5_3,	i1_3,	i2_3,	i3_3,	i4_3,	i5_3,	n1_3,	n2_3,	n4_3,	n5_3,	g1_3,	g2_3,	g3_3,	g4_3,	g5_3,	o1_3,	o2_3,	o3_3,	o4_3,	o5_3;
    TextView b1_4,	b2_4,	b3_4,	b4_4,	b5_4,	i1_4,	i2_4,	i3_4,	i4_4,	i5_4,	n1_4,	n2_4,	n4_4,	n5_4,	g1_4,	g2_4,	g3_4,	g4_4,	g5_4,	o1_4,	o2_4,	o3_4,	o4_4,	o5_4;
    TextView b1_5,	b2_5,	b3_5,	b4_5,	b5_5,	i1_5,	i2_5,	i3_5,	i4_5,	i5_5,	n1_5,	n2_5,	n4_5,	n5_5,	g1_5,	g2_5,	g3_5,	g4_5,	g5_5,	o1_5,	o2_5,	o3_5,	o4_5,	o5_5;
    TextView b1_6,	b2_6,	b3_6,	b4_6,	b5_6,	i1_6,	i2_6,	i3_6,	i4_6,	i5_6,	n1_6,	n2_6,	n4_6,	n5_6,	g1_6,	g2_6,	g3_6,	g4_6,	g5_6,	o1_6,	o2_6,	o3_6,	o4_6,	o5_6;
    TextView b1_7,	b2_7,	b3_7,	b4_7,	b5_7,	i1_7,	i2_7,	i3_7,	i4_7,	i5_7,	n1_7,	n2_7,	n4_7,	n5_7,	g1_7,	g2_7,	g3_7,	g4_7,	g5_7,	o1_7,	o2_7,	o3_7,	o4_7,	o5_7;
    TextView b1_8,	b2_8,	b3_8,	b4_8,	b5_8,	i1_8,	i2_8,	i3_8,	i4_8,	i5_8,	n1_8,	n2_8,	n4_8,	n5_8,	g1_8,	g2_8,	g3_8,	g4_8,	g5_8,	o1_8,	o2_8,	o3_8,	o4_8,	o5_8;
    TextView b1_9,	b2_9,	b3_9,	b4_9,	b5_9,	i1_9,	i2_9,	i3_9,	i4_9,	i5_9,	n1_9,	n2_9,	n4_9,	n5_9,	g1_9,	g2_9,	g3_9,	g4_9,	g5_9,	o1_9,	o2_9,	o3_9,	o4_9,	o5_9;
    TextView b1_10,	b2_10,	b3_10,	b4_10,	b5_10,	i1_10,	i2_10,	i3_10,	i4_10,	i5_10,	n1_10,	n2_10,	n4_10,	n5_10,	g1_10,	g2_10,	g3_10,	g4_10,	g5_10,	o1_10,	o2_10,	o3_10,	o4_10,	o5_10;
    String bingoRow1 = "", bingoRow2 = "", bingoRow3 = "", bingoRow4 = "", bingoRow5 = "", bingoRow6 = "", bingoRow7 = "", bingoRow8 = "", bingoRow9 = "", bingoRow10 = "";
    String HiddenNumbers, HiddenNames;
    String ConverterLine;
    String Line1StringIsValid = "0", Line2StringIsValid="0",Line3StringIsValid = "0",Line4StringIsValid = "0",Line5StringIsValid = "0",Line6StringIsValid = "0",Line7StringIsValid = "0",Line8StringIsValid = "0",Line9StringIsValid = "0",Line10StringIsValid = "0";
    String[] AllBingoNumbers = {
            "1",	"2",	"3",	"4",	"5",	"6",	"7",	"8",	"9",	"10",	"11",	"12", "13",	"14",	"15",	"16",	"17",	"18",	"19",	"20",	"21",	"22",	"23",	"24",	"25",	"26",	"27",	"28",	"29",	"30",	"31",	"32",	"33",	"34",	"35",	"36",	"37",	"38",	"39",	"40",	"41",	"42",	"43",	"44",	"45",	"46",	"47",	"48",	"49",	"50",	"51",	"52",	"53",	"54",	"55",	"56",	"57",	"58",	"59",	"60",	"61",	"62",	"63",	"64",	"65",	"66",	"67",	"68",	"69",	"70",	"71",	"72",	"73",	"74",	"75"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laro);
        //if (getSupportActionBar() != null) {
          //  getSupportActionBar().hide();
        //}

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
        //actionBar.setTitle("Add Card");

        java.util.Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        textInputLayout = findViewById(R.id.textInputLayout);
        textInputEditText = findViewById(R.id.textInputEditText);
        btn_number_laro = findViewById(R.id.btn_number_laro);
        btn_pattern = findViewById(R.id.btn_pattern);
        btn_reset = findViewById(R.id.btn_reset);
        btn_RemoveNumber = findViewById(R.id.btn_RemoveNumber);
        tvAllNumbers = findViewById(R.id.tvAllNumbers);
        tv_CurrentNumber = findViewById(R.id.tv_CurrentNumber);
        tv_Bingo = findViewById(R.id.tv_Bingo);
        tv_patternStyle = findViewById(R.id.tv_patternStyle);
        b1_1 = findViewById(R.id.b1_1);
        b2_1 = findViewById(R.id.b2_1);
        b3_1 = findViewById(R.id.b3_1);
        b4_1 = findViewById(R.id.b4_1);
        b5_1 = findViewById(R.id.b5_1);
        i1_1 = findViewById(R.id.i1_1);
        i2_1 = findViewById(R.id.i2_1);
        i3_1 = findViewById(R.id.i3_1);
        i4_1 = findViewById(R.id.i4_1);
        i5_1 = findViewById(R.id.i5_1);
        n1_1 = findViewById(R.id.n1_1);
        n2_1 = findViewById(R.id.n2_1);
        n4_1 = findViewById(R.id.n4_1);
        n5_1 = findViewById(R.id.n5_1);
        g1_1 = findViewById(R.id.g1_1);
        g2_1 = findViewById(R.id.g2_1);
        g3_1 = findViewById(R.id.g3_1);
        g4_1 = findViewById(R.id.g4_1);
        g5_1 = findViewById(R.id.g5_1);
        o1_1 = findViewById(R.id.o1_1);
        o2_1 = findViewById(R.id.o2_1);
        o3_1 = findViewById(R.id.o3_1);
        o4_1 = findViewById(R.id.o4_1);
        o5_1 = findViewById(R.id.o5_1);
        b1_2 = findViewById(R.id.b1_2);
        b2_2 = findViewById(R.id.b2_2);
        b3_2 = findViewById(R.id.b3_2);
        b4_2 = findViewById(R.id.b4_2);
        b5_2 = findViewById(R.id.b5_2);
        i1_2 = findViewById(R.id.i1_2);
        i2_2 = findViewById(R.id.i2_2);
        i3_2 = findViewById(R.id.i3_2);
        i4_2 = findViewById(R.id.i4_2);
        i5_2 = findViewById(R.id.i5_2);
        n1_2 = findViewById(R.id.n1_2);
        n2_2 = findViewById(R.id.n2_2);
        n4_2 = findViewById(R.id.n4_2);
        n5_2 = findViewById(R.id.n5_2);
        g1_2 = findViewById(R.id.g1_2);
        g2_2 = findViewById(R.id.g2_2);
        g3_2 = findViewById(R.id.g3_2);
        g4_2 = findViewById(R.id.g4_2);
        g5_2 = findViewById(R.id.g5_2);
        o1_2 = findViewById(R.id.o1_2);
        o2_2 = findViewById(R.id.o2_2);
        o3_2 = findViewById(R.id.o3_2);
        o4_2 = findViewById(R.id.o4_2);
        o5_2 = findViewById(R.id.o5_2);
        b1_3 = findViewById(R.id.b1_3);
        b2_3 = findViewById(R.id.b2_3);
        b3_3 = findViewById(R.id.b3_3);
        b4_3 = findViewById(R.id.b4_3);
        b5_3 = findViewById(R.id.b5_3);
        i1_3 = findViewById(R.id.i1_3);
        i2_3 = findViewById(R.id.i2_3);
        i3_3 = findViewById(R.id.i3_3);
        i4_3 = findViewById(R.id.i4_3);
        i5_3 = findViewById(R.id.i5_3);
        n1_3 = findViewById(R.id.n1_3);
        n2_3 = findViewById(R.id.n2_3);
        n4_3 = findViewById(R.id.n4_3);
        n5_3 = findViewById(R.id.n5_3);
        g1_3 = findViewById(R.id.g1_3);
        g2_3 = findViewById(R.id.g2_3);
        g3_3 = findViewById(R.id.g3_3);
        g4_3 = findViewById(R.id.g4_3);
        g5_3 = findViewById(R.id.g5_3);
        o1_3 = findViewById(R.id.o1_3);
        o2_3 = findViewById(R.id.o2_3);
        o3_3 = findViewById(R.id.o3_3);
        o4_3 = findViewById(R.id.o4_3);
        o5_3 = findViewById(R.id.o5_3);
        b1_4 = findViewById(R.id.b1_4);
        b2_4 = findViewById(R.id.b2_4);
        b3_4 = findViewById(R.id.b3_4);
        b4_4 = findViewById(R.id.b4_4);
        b5_4 = findViewById(R.id.b5_4);
        i1_4 = findViewById(R.id.i1_4);
        i2_4 = findViewById(R.id.i2_4);
        i3_4 = findViewById(R.id.i3_4);
        i4_4 = findViewById(R.id.i4_4);
        i5_4 = findViewById(R.id.i5_4);
        n1_4 = findViewById(R.id.n1_4);
        n2_4 = findViewById(R.id.n2_4);
        n4_4 = findViewById(R.id.n4_4);
        n5_4 = findViewById(R.id.n5_4);
        g1_4 = findViewById(R.id.g1_4);
        g2_4 = findViewById(R.id.g2_4);
        g3_4 = findViewById(R.id.g3_4);
        g4_4 = findViewById(R.id.g4_4);
        g5_4 = findViewById(R.id.g5_4);
        o1_4 = findViewById(R.id.o1_4);
        o2_4 = findViewById(R.id.o2_4);
        o3_4 = findViewById(R.id.o3_4);
        o4_4 = findViewById(R.id.o4_4);
        o5_4 = findViewById(R.id.o5_4);
        b1_5 = findViewById(R.id.b1_5);
        b2_5 = findViewById(R.id.b2_5);
        b3_5 = findViewById(R.id.b3_5);
        b4_5 = findViewById(R.id.b4_5);
        b5_5 = findViewById(R.id.b5_5);
        i1_5 = findViewById(R.id.i1_5);
        i2_5 = findViewById(R.id.i2_5);
        i3_5 = findViewById(R.id.i3_5);
        i4_5 = findViewById(R.id.i4_5);
        i5_5 = findViewById(R.id.i5_5);
        n1_5 = findViewById(R.id.n1_5);
        n2_5 = findViewById(R.id.n2_5);
        n4_5 = findViewById(R.id.n4_5);
        n5_5 = findViewById(R.id.n5_5);
        g1_5 = findViewById(R.id.g1_5);
        g2_5 = findViewById(R.id.g2_5);
        g3_5 = findViewById(R.id.g3_5);
        g4_5 = findViewById(R.id.g4_5);
        g5_5 = findViewById(R.id.g5_5);
        o1_5 = findViewById(R.id.o1_5);
        o2_5 = findViewById(R.id.o2_5);
        o3_5 = findViewById(R.id.o3_5);
        o4_5 = findViewById(R.id.o4_5);
        o5_5 = findViewById(R.id.o5_5);
        b1_6 = findViewById(R.id.b1_6);
        b2_6 = findViewById(R.id.b2_6);
        b3_6 = findViewById(R.id.b3_6);
        b4_6 = findViewById(R.id.b4_6);
        b5_6 = findViewById(R.id.b5_6);
        i1_6 = findViewById(R.id.i1_6);
        i2_6 = findViewById(R.id.i2_6);
        i3_6 = findViewById(R.id.i3_6);
        i4_6 = findViewById(R.id.i4_6);
        i5_6 = findViewById(R.id.i5_6);
        n1_6 = findViewById(R.id.n1_6);
        n2_6 = findViewById(R.id.n2_6);
        n4_6 = findViewById(R.id.n4_6);
        n5_6 = findViewById(R.id.n5_6);
        g1_6 = findViewById(R.id.g1_6);
        g2_6 = findViewById(R.id.g2_6);
        g3_6 = findViewById(R.id.g3_6);
        g4_6 = findViewById(R.id.g4_6);
        g5_6 = findViewById(R.id.g5_6);
        o1_6 = findViewById(R.id.o1_6);
        o2_6 = findViewById(R.id.o2_6);
        o3_6 = findViewById(R.id.o3_6);
        o4_6 = findViewById(R.id.o4_6);
        o5_6 = findViewById(R.id.o5_6);
        b1_7 = findViewById(R.id.b1_7);
        b2_7 = findViewById(R.id.b2_7);
        b3_7 = findViewById(R.id.b3_7);
        b4_7 = findViewById(R.id.b4_7);
        b5_7 = findViewById(R.id.b5_7);
        i1_7 = findViewById(R.id.i1_7);
        i2_7 = findViewById(R.id.i2_7);
        i3_7 = findViewById(R.id.i3_7);
        i4_7 = findViewById(R.id.i4_7);
        i5_7 = findViewById(R.id.i5_7);
        n1_7 = findViewById(R.id.n1_7);
        n2_7 = findViewById(R.id.n2_7);
        n4_7 = findViewById(R.id.n4_7);
        n5_7 = findViewById(R.id.n5_7);
        g1_7 = findViewById(R.id.g1_7);
        g2_7 = findViewById(R.id.g2_7);
        g3_7 = findViewById(R.id.g3_7);
        g4_7 = findViewById(R.id.g4_7);
        g5_7 = findViewById(R.id.g5_7);
        o1_7 = findViewById(R.id.o1_7);
        o2_7 = findViewById(R.id.o2_7);
        o3_7 = findViewById(R.id.o3_7);
        o4_7 = findViewById(R.id.o4_7);
        o5_7 = findViewById(R.id.o5_7);
        b1_8 = findViewById(R.id.b1_8);
        b2_8 = findViewById(R.id.b2_8);
        b3_8 = findViewById(R.id.b3_8);
        b4_8 = findViewById(R.id.b4_8);
        b5_8 = findViewById(R.id.b5_8);
        i1_8 = findViewById(R.id.i1_8);
        i2_8 = findViewById(R.id.i2_8);
        i3_8 = findViewById(R.id.i3_8);
        i4_8 = findViewById(R.id.i4_8);
        i5_8 = findViewById(R.id.i5_8);
        n1_8 = findViewById(R.id.n1_8);
        n2_8 = findViewById(R.id.n2_8);
        n4_8 = findViewById(R.id.n4_8);
        n5_8 = findViewById(R.id.n5_8);
        g1_8 = findViewById(R.id.g1_8);
        g2_8 = findViewById(R.id.g2_8);
        g3_8 = findViewById(R.id.g3_8);
        g4_8 = findViewById(R.id.g4_8);
        g5_8 = findViewById(R.id.g5_8);
        o1_8 = findViewById(R.id.o1_8);
        o2_8 = findViewById(R.id.o2_8);
        o3_8 = findViewById(R.id.o3_8);
        o4_8 = findViewById(R.id.o4_8);
        o5_8 = findViewById(R.id.o5_8);
        b1_9 = findViewById(R.id.b1_9);
        b2_9 = findViewById(R.id.b2_9);
        b3_9 = findViewById(R.id.b3_9);
        b4_9 = findViewById(R.id.b4_9);
        b5_9 = findViewById(R.id.b5_9);
        i1_9 = findViewById(R.id.i1_9);
        i2_9 = findViewById(R.id.i2_9);
        i3_9 = findViewById(R.id.i3_9);
        i4_9 = findViewById(R.id.i4_9);
        i5_9 = findViewById(R.id.i5_9);
        n1_9 = findViewById(R.id.n1_9);
        n2_9 = findViewById(R.id.n2_9);
        n4_9 = findViewById(R.id.n4_9);
        n5_9 = findViewById(R.id.n5_9);
        g1_9 = findViewById(R.id.g1_9);
        g2_9 = findViewById(R.id.g2_9);
        g3_9 = findViewById(R.id.g3_9);
        g4_9 = findViewById(R.id.g4_9);
        g5_9 = findViewById(R.id.g5_9);
        o1_9 = findViewById(R.id.o1_9);
        o2_9 = findViewById(R.id.o2_9);
        o3_9 = findViewById(R.id.o3_9);
        o4_9 = findViewById(R.id.o4_9);
        o5_9 = findViewById(R.id.o5_9);
        b1_10 = findViewById(R.id.b1_10);
        b2_10 = findViewById(R.id.b2_10);
        b3_10 = findViewById(R.id.b3_10);
        b4_10 = findViewById(R.id.b4_10);
        b5_10 = findViewById(R.id.b5_10);
        i1_10 = findViewById(R.id.i1_10);
        i2_10 = findViewById(R.id.i2_10);
        i3_10 = findViewById(R.id.i3_10);
        i4_10 = findViewById(R.id.i4_10);
        i5_10 = findViewById(R.id.i5_10);
        n1_10 = findViewById(R.id.n1_10);
        n2_10 = findViewById(R.id.n2_10);
        n4_10 = findViewById(R.id.n4_10);
        n5_10 = findViewById(R.id.n5_10);
        g1_10 = findViewById(R.id.g1_10);
        g2_10 = findViewById(R.id.g2_10);
        g3_10 = findViewById(R.id.g3_10);
        g4_10 = findViewById(R.id.g4_10);
        g5_10 = findViewById(R.id.g5_10);
        o1_10 = findViewById(R.id.o1_10);
        o2_10 = findViewById(R.id.o2_10);
        o3_10 = findViewById(R.id.o3_10);
        o4_10 = findViewById(R.id.o4_10);
        o5_10 = findViewById(R.id.o5_10);

        CallMeNumbers(); //GET NUMBERS FROM DATABASE

        NumbersUpdate(); //GET THE NUMBERS THAT HAS BEEN ENTERED
        getMyLineCount(); //GET LINE COUNT FROM TEXTVIEW FROM DATABASE
        LoadNumberFromDB(); //SHOW OR LOAD NUMBERS FROM DATABASE TO TEXTVIEW
        PatternUpdate(); //GET FROM PATTERNS ACTIVITY
        btn_number_laro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toFind = textInputEditText.getText().toString();
                boolean found = Arrays.stream(AllBingoNumbers).anyMatch(t -> t.equals(toFind));

                if (found){
                    AllCardsEquals();
                    PatternClassOnly.BingoCurrentNumber = textInputEditText.getText().toString();

                    if (PatternClassOnly.myNumbersList.contains(textInputEditText.getText().toString())){
                        //Do Nothing
                    }else {
                        tv_CurrentNumber.setText("Current Number : " + textInputEditText.getText().toString());
                        if (PatternClassOnly.patternStyle.equals("1")){
                            BingoCheckerFirstXNumbers();
                        }else {
                            BingoChecker();
                        }


                        PatternClassOnly.myNumbersList.add(textInputEditText.getText().toString());
                        //Toast.makeText(LaroActivity.this, PatternClassOnly.myNumbersList.toString(), Toast.LENGTH_SHORT).show();
                    }
                    textInputEditText.selectAll();


                } else {
                    textInputEditText.setError("Please enter valid number");
                    textInputEditText.selectAll();
                }
            }
        });

        btn_pattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaroActivity.this, PatternActivity.class);
                startActivity(intent);
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmDialog();
            }
        });
        btn_RemoveNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toFind = textInputEditText.getText().toString();
                boolean found = Arrays.stream(AllBingoNumbers).anyMatch(t -> t.equals(toFind));

                if (found){

                    if (PatternClassOnly.myNumbersList.contains(textInputEditText.getText().toString())){
                        //Do Nothing
                        confirmDialog2();

                    }else {
                    }
                    textInputEditText.selectAll();


                } else {
                    textInputEditText.setError("Please enter valid number");
                    textInputEditText.selectAll();
                }
            }
        });


    }


    void BingoCheckerFirstXNumbers(){

        long requiredNumber = Integer.parseInt(PatternClassOnly.patternFirstXNumbers);

        int row_b1_1 = Integer.parseInt(PatternClassOnly.row_b1_1);
        int row_b2_1 = Integer.parseInt(PatternClassOnly.row_b2_1);
        int row_b3_1 = Integer.parseInt(PatternClassOnly.row_b3_1);
        int row_b4_1 = Integer.parseInt(PatternClassOnly.row_b4_1);
        int row_b5_1 = Integer.parseInt(PatternClassOnly.row_b5_1);
        int row_i1_1 = Integer.parseInt(PatternClassOnly.row_i1_1);
        int row_i2_1 = Integer.parseInt(PatternClassOnly.row_i2_1);
        int row_i3_1 = Integer.parseInt(PatternClassOnly.row_i3_1);
        int row_i4_1 = Integer.parseInt(PatternClassOnly.row_i4_1);
        int row_i5_1 = Integer.parseInt(PatternClassOnly.row_i5_1);
        int row_n1_1 = Integer.parseInt(PatternClassOnly.row_n1_1);
        int row_n2_1 = Integer.parseInt(PatternClassOnly.row_n2_1);
        int row_n4_1 = Integer.parseInt(PatternClassOnly.row_n4_1);
        int row_n5_1 = Integer.parseInt(PatternClassOnly.row_n5_1);
        int row_g1_1 = Integer.parseInt(PatternClassOnly.row_g1_1);
        int row_g2_1 = Integer.parseInt(PatternClassOnly.row_g2_1);
        int row_g3_1 = Integer.parseInt(PatternClassOnly.row_g3_1);
        int row_g4_1 = Integer.parseInt(PatternClassOnly.row_g4_1);
        int row_g5_1 = Integer.parseInt(PatternClassOnly.row_g5_1);
        int row_o1_1 = Integer.parseInt(PatternClassOnly.row_o1_1);
        int row_o2_1 = Integer.parseInt(PatternClassOnly.row_o2_1);
        int row_o3_1 = Integer.parseInt(PatternClassOnly.row_o3_1);
        int row_o4_1 = Integer.parseInt(PatternClassOnly.row_o4_1);
        int row_o5_1 = Integer.parseInt(PatternClassOnly.row_o5_1);
        int row_b1_2 = Integer.parseInt(PatternClassOnly.row_b1_2);
        int row_b2_2 = Integer.parseInt(PatternClassOnly.row_b2_2);
        int row_b3_2 = Integer.parseInt(PatternClassOnly.row_b3_2);
        int row_b4_2 = Integer.parseInt(PatternClassOnly.row_b4_2);
        int row_b5_2 = Integer.parseInt(PatternClassOnly.row_b5_2);
        int row_i1_2 = Integer.parseInt(PatternClassOnly.row_i1_2);
        int row_i2_2 = Integer.parseInt(PatternClassOnly.row_i2_2);
        int row_i3_2 = Integer.parseInt(PatternClassOnly.row_i3_2);
        int row_i4_2 = Integer.parseInt(PatternClassOnly.row_i4_2);
        int row_i5_2 = Integer.parseInt(PatternClassOnly.row_i5_2);
        int row_n1_2 = Integer.parseInt(PatternClassOnly.row_n1_2);
        int row_n2_2 = Integer.parseInt(PatternClassOnly.row_n2_2);
        int row_n4_2 = Integer.parseInt(PatternClassOnly.row_n4_2);
        int row_n5_2 = Integer.parseInt(PatternClassOnly.row_n5_2);
        int row_g1_2 = Integer.parseInt(PatternClassOnly.row_g1_2);
        int row_g2_2 = Integer.parseInt(PatternClassOnly.row_g2_2);
        int row_g3_2 = Integer.parseInt(PatternClassOnly.row_g3_2);
        int row_g4_2 = Integer.parseInt(PatternClassOnly.row_g4_2);
        int row_g5_2 = Integer.parseInt(PatternClassOnly.row_g5_2);
        int row_o1_2 = Integer.parseInt(PatternClassOnly.row_o1_2);
        int row_o2_2 = Integer.parseInt(PatternClassOnly.row_o2_2);
        int row_o3_2 = Integer.parseInt(PatternClassOnly.row_o3_2);
        int row_o4_2 = Integer.parseInt(PatternClassOnly.row_o4_2);
        int row_o5_2 = Integer.parseInt(PatternClassOnly.row_o5_2);
        int row_b1_3 = Integer.parseInt(PatternClassOnly.row_b1_3);
        int row_b2_3 = Integer.parseInt(PatternClassOnly.row_b2_3);
        int row_b3_3 = Integer.parseInt(PatternClassOnly.row_b3_3);
        int row_b4_3 = Integer.parseInt(PatternClassOnly.row_b4_3);
        int row_b5_3 = Integer.parseInt(PatternClassOnly.row_b5_3);
        int row_i1_3 = Integer.parseInt(PatternClassOnly.row_i1_3);
        int row_i2_3 = Integer.parseInt(PatternClassOnly.row_i2_3);
        int row_i3_3 = Integer.parseInt(PatternClassOnly.row_i3_3);
        int row_i4_3 = Integer.parseInt(PatternClassOnly.row_i4_3);
        int row_i5_3 = Integer.parseInt(PatternClassOnly.row_i5_3);
        int row_n1_3 = Integer.parseInt(PatternClassOnly.row_n1_3);
        int row_n2_3 = Integer.parseInt(PatternClassOnly.row_n2_3);
        int row_n4_3 = Integer.parseInt(PatternClassOnly.row_n4_3);
        int row_n5_3 = Integer.parseInt(PatternClassOnly.row_n5_3);
        int row_g1_3 = Integer.parseInt(PatternClassOnly.row_g1_3);
        int row_g2_3 = Integer.parseInt(PatternClassOnly.row_g2_3);
        int row_g3_3 = Integer.parseInt(PatternClassOnly.row_g3_3);
        int row_g4_3 = Integer.parseInt(PatternClassOnly.row_g4_3);
        int row_g5_3 = Integer.parseInt(PatternClassOnly.row_g5_3);
        int row_o1_3 = Integer.parseInt(PatternClassOnly.row_o1_3);
        int row_o2_3 = Integer.parseInt(PatternClassOnly.row_o2_3);
        int row_o3_3 = Integer.parseInt(PatternClassOnly.row_o3_3);
        int row_o4_3 = Integer.parseInt(PatternClassOnly.row_o4_3);
        int row_o5_3 = Integer.parseInt(PatternClassOnly.row_o5_3);
        int row_b1_4 = Integer.parseInt(PatternClassOnly.row_b1_4);
        int row_b2_4 = Integer.parseInt(PatternClassOnly.row_b2_4);
        int row_b3_4 = Integer.parseInt(PatternClassOnly.row_b3_4);
        int row_b4_4 = Integer.parseInt(PatternClassOnly.row_b4_4);
        int row_b5_4 = Integer.parseInt(PatternClassOnly.row_b5_4);
        int row_i1_4 = Integer.parseInt(PatternClassOnly.row_i1_4);
        int row_i2_4 = Integer.parseInt(PatternClassOnly.row_i2_4);
        int row_i3_4 = Integer.parseInt(PatternClassOnly.row_i3_4);
        int row_i4_4 = Integer.parseInt(PatternClassOnly.row_i4_4);
        int row_i5_4 = Integer.parseInt(PatternClassOnly.row_i5_4);
        int row_n1_4 = Integer.parseInt(PatternClassOnly.row_n1_4);
        int row_n2_4 = Integer.parseInt(PatternClassOnly.row_n2_4);
        int row_n4_4 = Integer.parseInt(PatternClassOnly.row_n4_4);
        int row_n5_4 = Integer.parseInt(PatternClassOnly.row_n5_4);
        int row_g1_4 = Integer.parseInt(PatternClassOnly.row_g1_4);
        int row_g2_4 = Integer.parseInt(PatternClassOnly.row_g2_4);
        int row_g3_4 = Integer.parseInt(PatternClassOnly.row_g3_4);
        int row_g4_4 = Integer.parseInt(PatternClassOnly.row_g4_4);
        int row_g5_4 = Integer.parseInt(PatternClassOnly.row_g5_4);
        int row_o1_4 = Integer.parseInt(PatternClassOnly.row_o1_4);
        int row_o2_4 = Integer.parseInt(PatternClassOnly.row_o2_4);
        int row_o3_4 = Integer.parseInt(PatternClassOnly.row_o3_4);
        int row_o4_4 = Integer.parseInt(PatternClassOnly.row_o4_4);
        int row_o5_4 = Integer.parseInt(PatternClassOnly.row_o5_4);
        int row_b1_5 = Integer.parseInt(PatternClassOnly.row_b1_5);
        int row_b2_5 = Integer.parseInt(PatternClassOnly.row_b2_5);
        int row_b3_5 = Integer.parseInt(PatternClassOnly.row_b3_5);
        int row_b4_5 = Integer.parseInt(PatternClassOnly.row_b4_5);
        int row_b5_5 = Integer.parseInt(PatternClassOnly.row_b5_5);
        int row_i1_5 = Integer.parseInt(PatternClassOnly.row_i1_5);
        int row_i2_5 = Integer.parseInt(PatternClassOnly.row_i2_5);
        int row_i3_5 = Integer.parseInt(PatternClassOnly.row_i3_5);
        int row_i4_5 = Integer.parseInt(PatternClassOnly.row_i4_5);
        int row_i5_5 = Integer.parseInt(PatternClassOnly.row_i5_5);
        int row_n1_5 = Integer.parseInt(PatternClassOnly.row_n1_5);
        int row_n2_5 = Integer.parseInt(PatternClassOnly.row_n2_5);
        int row_n4_5 = Integer.parseInt(PatternClassOnly.row_n4_5);
        int row_n5_5 = Integer.parseInt(PatternClassOnly.row_n5_5);
        int row_g1_5 = Integer.parseInt(PatternClassOnly.row_g1_5);
        int row_g2_5 = Integer.parseInt(PatternClassOnly.row_g2_5);
        int row_g3_5 = Integer.parseInt(PatternClassOnly.row_g3_5);
        int row_g4_5 = Integer.parseInt(PatternClassOnly.row_g4_5);
        int row_g5_5 = Integer.parseInt(PatternClassOnly.row_g5_5);
        int row_o1_5 = Integer.parseInt(PatternClassOnly.row_o1_5);
        int row_o2_5 = Integer.parseInt(PatternClassOnly.row_o2_5);
        int row_o3_5 = Integer.parseInt(PatternClassOnly.row_o3_5);
        int row_o4_5 = Integer.parseInt(PatternClassOnly.row_o4_5);
        int row_o5_5 = Integer.parseInt(PatternClassOnly.row_o5_5);
        int row_b1_6 = Integer.parseInt(PatternClassOnly.row_b1_6);
        int row_b2_6 = Integer.parseInt(PatternClassOnly.row_b2_6);
        int row_b3_6 = Integer.parseInt(PatternClassOnly.row_b3_6);
        int row_b4_6 = Integer.parseInt(PatternClassOnly.row_b4_6);
        int row_b5_6 = Integer.parseInt(PatternClassOnly.row_b5_6);
        int row_i1_6 = Integer.parseInt(PatternClassOnly.row_i1_6);
        int row_i2_6 = Integer.parseInt(PatternClassOnly.row_i2_6);
        int row_i3_6 = Integer.parseInt(PatternClassOnly.row_i3_6);
        int row_i4_6 = Integer.parseInt(PatternClassOnly.row_i4_6);
        int row_i5_6 = Integer.parseInt(PatternClassOnly.row_i5_6);
        int row_n1_6 = Integer.parseInt(PatternClassOnly.row_n1_6);
        int row_n2_6 = Integer.parseInt(PatternClassOnly.row_n2_6);
        int row_n4_6 = Integer.parseInt(PatternClassOnly.row_n4_6);
        int row_n5_6 = Integer.parseInt(PatternClassOnly.row_n5_6);
        int row_g1_6 = Integer.parseInt(PatternClassOnly.row_g1_6);
        int row_g2_6 = Integer.parseInt(PatternClassOnly.row_g2_6);
        int row_g3_6 = Integer.parseInt(PatternClassOnly.row_g3_6);
        int row_g4_6 = Integer.parseInt(PatternClassOnly.row_g4_6);
        int row_g5_6 = Integer.parseInt(PatternClassOnly.row_g5_6);
        int row_o1_6 = Integer.parseInt(PatternClassOnly.row_o1_6);
        int row_o2_6 = Integer.parseInt(PatternClassOnly.row_o2_6);
        int row_o3_6 = Integer.parseInt(PatternClassOnly.row_o3_6);
        int row_o4_6 = Integer.parseInt(PatternClassOnly.row_o4_6);
        int row_o5_6 = Integer.parseInt(PatternClassOnly.row_o5_6);
        int row_b1_7 = Integer.parseInt(PatternClassOnly.row_b1_7);
        int row_b2_7 = Integer.parseInt(PatternClassOnly.row_b2_7);
        int row_b3_7 = Integer.parseInt(PatternClassOnly.row_b3_7);
        int row_b4_7 = Integer.parseInt(PatternClassOnly.row_b4_7);
        int row_b5_7 = Integer.parseInt(PatternClassOnly.row_b5_7);
        int row_i1_7 = Integer.parseInt(PatternClassOnly.row_i1_7);
        int row_i2_7 = Integer.parseInt(PatternClassOnly.row_i2_7);
        int row_i3_7 = Integer.parseInt(PatternClassOnly.row_i3_7);
        int row_i4_7 = Integer.parseInt(PatternClassOnly.row_i4_7);
        int row_i5_7 = Integer.parseInt(PatternClassOnly.row_i5_7);
        int row_n1_7 = Integer.parseInt(PatternClassOnly.row_n1_7);
        int row_n2_7 = Integer.parseInt(PatternClassOnly.row_n2_7);
        int row_n4_7 = Integer.parseInt(PatternClassOnly.row_n4_7);
        int row_n5_7 = Integer.parseInt(PatternClassOnly.row_n5_7);
        int row_g1_7 = Integer.parseInt(PatternClassOnly.row_g1_7);
        int row_g2_7 = Integer.parseInt(PatternClassOnly.row_g2_7);
        int row_g3_7 = Integer.parseInt(PatternClassOnly.row_g3_7);
        int row_g4_7 = Integer.parseInt(PatternClassOnly.row_g4_7);
        int row_g5_7 = Integer.parseInt(PatternClassOnly.row_g5_7);
        int row_o1_7 = Integer.parseInt(PatternClassOnly.row_o1_7);
        int row_o2_7 = Integer.parseInt(PatternClassOnly.row_o2_7);
        int row_o3_7 = Integer.parseInt(PatternClassOnly.row_o3_7);
        int row_o4_7 = Integer.parseInt(PatternClassOnly.row_o4_7);
        int row_o5_7 = Integer.parseInt(PatternClassOnly.row_o5_7);
        int row_b1_8 = Integer.parseInt(PatternClassOnly.row_b1_8);
        int row_b2_8 = Integer.parseInt(PatternClassOnly.row_b2_8);
        int row_b3_8 = Integer.parseInt(PatternClassOnly.row_b3_8);
        int row_b4_8 = Integer.parseInt(PatternClassOnly.row_b4_8);
        int row_b5_8 = Integer.parseInt(PatternClassOnly.row_b5_8);
        int row_i1_8 = Integer.parseInt(PatternClassOnly.row_i1_8);
        int row_i2_8 = Integer.parseInt(PatternClassOnly.row_i2_8);
        int row_i3_8 = Integer.parseInt(PatternClassOnly.row_i3_8);
        int row_i4_8 = Integer.parseInt(PatternClassOnly.row_i4_8);
        int row_i5_8 = Integer.parseInt(PatternClassOnly.row_i5_8);
        int row_n1_8 = Integer.parseInt(PatternClassOnly.row_n1_8);
        int row_n2_8 = Integer.parseInt(PatternClassOnly.row_n2_8);
        int row_n4_8 = Integer.parseInt(PatternClassOnly.row_n4_8);
        int row_n5_8 = Integer.parseInt(PatternClassOnly.row_n5_8);
        int row_g1_8 = Integer.parseInt(PatternClassOnly.row_g1_8);
        int row_g2_8 = Integer.parseInt(PatternClassOnly.row_g2_8);
        int row_g3_8 = Integer.parseInt(PatternClassOnly.row_g3_8);
        int row_g4_8 = Integer.parseInt(PatternClassOnly.row_g4_8);
        int row_g5_8 = Integer.parseInt(PatternClassOnly.row_g5_8);
        int row_o1_8 = Integer.parseInt(PatternClassOnly.row_o1_8);
        int row_o2_8 = Integer.parseInt(PatternClassOnly.row_o2_8);
        int row_o3_8 = Integer.parseInt(PatternClassOnly.row_o3_8);
        int row_o4_8 = Integer.parseInt(PatternClassOnly.row_o4_8);
        int row_o5_8 = Integer.parseInt(PatternClassOnly.row_o5_8);
        int row_b1_9 = Integer.parseInt(PatternClassOnly.row_b1_9);
        int row_b2_9 = Integer.parseInt(PatternClassOnly.row_b2_9);
        int row_b3_9 = Integer.parseInt(PatternClassOnly.row_b3_9);
        int row_b4_9 = Integer.parseInt(PatternClassOnly.row_b4_9);
        int row_b5_9 = Integer.parseInt(PatternClassOnly.row_b5_9);
        int row_i1_9 = Integer.parseInt(PatternClassOnly.row_i1_9);
        int row_i2_9 = Integer.parseInt(PatternClassOnly.row_i2_9);
        int row_i3_9 = Integer.parseInt(PatternClassOnly.row_i3_9);
        int row_i4_9 = Integer.parseInt(PatternClassOnly.row_i4_9);
        int row_i5_9 = Integer.parseInt(PatternClassOnly.row_i5_9);
        int row_n1_9 = Integer.parseInt(PatternClassOnly.row_n1_9);
        int row_n2_9 = Integer.parseInt(PatternClassOnly.row_n2_9);
        int row_n4_9 = Integer.parseInt(PatternClassOnly.row_n4_9);
        int row_n5_9 = Integer.parseInt(PatternClassOnly.row_n5_9);
        int row_g1_9 = Integer.parseInt(PatternClassOnly.row_g1_9);
        int row_g2_9 = Integer.parseInt(PatternClassOnly.row_g2_9);
        int row_g3_9 = Integer.parseInt(PatternClassOnly.row_g3_9);
        int row_g4_9 = Integer.parseInt(PatternClassOnly.row_g4_9);
        int row_g5_9 = Integer.parseInt(PatternClassOnly.row_g5_9);
        int row_o1_9 = Integer.parseInt(PatternClassOnly.row_o1_9);
        int row_o2_9 = Integer.parseInt(PatternClassOnly.row_o2_9);
        int row_o3_9 = Integer.parseInt(PatternClassOnly.row_o3_9);
        int row_o4_9 = Integer.parseInt(PatternClassOnly.row_o4_9);
        int row_o5_9 = Integer.parseInt(PatternClassOnly.row_o5_9);
        int row_b1_10 = Integer.parseInt(PatternClassOnly.row_b1_10);
        int row_b2_10 = Integer.parseInt(PatternClassOnly.row_b2_10);
        int row_b3_10 = Integer.parseInt(PatternClassOnly.row_b3_10);
        int row_b4_10 = Integer.parseInt(PatternClassOnly.row_b4_10);
        int row_b5_10 = Integer.parseInt(PatternClassOnly.row_b5_10);
        int row_i1_10 = Integer.parseInt(PatternClassOnly.row_i1_10);
        int row_i2_10 = Integer.parseInt(PatternClassOnly.row_i2_10);
        int row_i3_10 = Integer.parseInt(PatternClassOnly.row_i3_10);
        int row_i4_10 = Integer.parseInt(PatternClassOnly.row_i4_10);
        int row_i5_10 = Integer.parseInt(PatternClassOnly.row_i5_10);
        int row_n1_10 = Integer.parseInt(PatternClassOnly.row_n1_10);
        int row_n2_10 = Integer.parseInt(PatternClassOnly.row_n2_10);
        int row_n4_10 = Integer.parseInt(PatternClassOnly.row_n4_10);
        int row_n5_10 = Integer.parseInt(PatternClassOnly.row_n5_10);
        int row_g1_10 = Integer.parseInt(PatternClassOnly.row_g1_10);
        int row_g2_10 = Integer.parseInt(PatternClassOnly.row_g2_10);
        int row_g3_10 = Integer.parseInt(PatternClassOnly.row_g3_10);
        int row_g4_10 = Integer.parseInt(PatternClassOnly.row_g4_10);
        int row_g5_10 = Integer.parseInt(PatternClassOnly.row_g5_10);
        int row_o1_10 = Integer.parseInt(PatternClassOnly.row_o1_10);
        int row_o2_10 = Integer.parseInt(PatternClassOnly.row_o2_10);
        int row_o3_10 = Integer.parseInt(PatternClassOnly.row_o3_10);
        int row_o4_10 = Integer.parseInt(PatternClassOnly.row_o4_10);
        int row_o5_10 = Integer.parseInt(PatternClassOnly.row_o5_10);

        long sumRow1 = row_b1_1 +row_b2_1 +	row_b3_1 +	row_b4_1 +	row_b5_1 +	row_i1_1 +	row_i2_1 +	row_i3_1 +	row_i4_1 +	row_i5_1 +	row_n1_1 +	row_n2_1 +	row_n4_1 +	row_n5_1 +	row_g1_1 +	row_g2_1 +	row_g3_1 +	row_g4_1 +	row_g5_1 +	row_o1_1 +	row_o2_1 +	row_o3_1 +	row_o4_1 +	row_o5_1;
        long sumRow2 = row_b1_2 +	row_b2_2+	row_b3_2+	row_b4_2+	row_b5_2+	row_i1_2+	row_i2_2+	row_i3_2+	row_i4_2+	row_i5_2+	row_n1_2+	row_n2_2+	row_n4_2+	row_n5_2+	row_g1_2+	row_g2_2+	row_g3_2+	row_g4_2+	row_g5_2+	row_o1_2+	row_o2_2+	row_o3_2+	row_o4_2+	row_o5_2;

        long sumRow3 = row_b1_3+	row_b2_3+	row_b3_3+	row_b4_3+	row_b5_3+	row_i1_3+	row_i2_3+	row_i3_3+	row_i4_3+	row_i5_3+	row_n1_3+	row_n2_3+	row_n4_3+	row_n5_3+	row_g1_3+	row_g2_3+	row_g3_3+	row_g4_3+	row_g5_3+	row_o1_3+	row_o2_3+	row_o3_3+	row_o4_3+	row_o5_3;

        long sumRow4 = row_b1_4 +	row_b2_4 +	row_b3_4 +	row_b4_4 +	row_b5_4 +	row_i1_4 +	row_i2_4 +	row_i3_4 +	row_i4_4 +	row_i5_4 +	row_n1_4 +	row_n2_4 +	row_n4_4 +	row_n5_4 +	row_g1_4 +	row_g2_4 +	row_g3_4 +	row_g4_4 +	row_g5_4 +	row_o1_4 +	row_o2_4 +	row_o3_4 +	row_o4_4 +	row_o5_4;

        long sumRow5 = row_b1_5 +	row_b2_5 +	row_b3_5 +	row_b4_5 +	row_b5_5 +	row_i1_5 +	row_i2_5 +	row_i3_5 +	row_i4_5 +	row_i5_5 +	row_n1_5 +	row_n2_5 +	row_n4_5 +	row_n5_5 +	row_g1_5 +	row_g2_5 +	row_g3_5 +	row_g4_5 +	row_g5_5 +	row_o1_5 +	row_o2_5 +	row_o3_5 +	row_o4_5 +	row_o5_5;

        long sumRow6 = row_b1_6 +	row_b2_6 +	row_b3_6 +	row_b4_6 +	row_b5_6 +	row_i1_6 +	row_i2_6 +	row_i3_6 +	row_i4_6 +	row_i5_6 +	row_n1_6 +	row_n2_6 +	row_n4_6 +	row_n5_6 +	row_g1_6 +	row_g2_6 +	row_g3_6 +	row_g4_6 +	row_g5_6 +	row_o1_6 +	row_o2_6 +	row_o3_6 +	row_o4_6 +	row_o5_6;

        long sumRow7 = row_b1_7 +	row_b2_7 +	row_b3_7 +	row_b4_7 +	row_b5_7 +	row_i1_7 +	row_i2_7 +	row_i3_7 +	row_i4_7 +	row_i5_7 +	row_n1_7 +	row_n2_7 +	row_n4_7 +	row_n5_7 +	row_g1_7 +	row_g2_7 +	row_g3_7 +	row_g4_7 +	row_g5_7 +	row_o1_7 +	row_o2_7 +	row_o3_7 +	row_o4_7 +	row_o5_7;

        long sumRow8 = row_b1_8 +	row_b2_8 +	row_b3_8 +	row_b4_8 +	row_b5_8 +	row_i1_8 +	row_i2_8 +	row_i3_8 +	row_i4_8 +	row_i5_8 +	row_n1_8 +	row_n2_8 +	row_n4_8 +	row_n5_8 +	row_g1_8 +	row_g2_8 +	row_g3_8 +	row_g4_8 +	row_g5_8 +	row_o1_8 +	row_o2_8 +	row_o3_8 +	row_o4_8 +	row_o5_8;

        long sumRow9 = row_b1_9 +	row_b2_9 +	row_b3_9 +	row_b4_9 +	row_b5_9 +	row_i1_9 +	row_i2_9 +	row_i3_9 +	row_i4_9 +	row_i5_9 +	row_n1_9 +	row_n2_9 +	row_n4_9 +	row_n5_9 +	row_g1_9 +	row_g2_9 +	row_g3_9 +	row_g4_9 +	row_g5_9 +	row_o1_9 +	row_o2_9 +	row_o3_9 +	row_o4_9 +	row_o5_9;

        long sumRow10 = row_b1_10 +	row_b2_10 +	row_b3_10 +	row_b4_10 +	row_b5_10 +	row_i1_10 +	row_i2_10 +	row_i3_10 +	row_i4_10 +	row_i5_10 +	row_n1_10 +	row_n2_10 +	row_n4_10 +	row_n5_10 +	row_g1_10 +	row_g2_10 +	row_g3_10 +	row_g4_10 +	row_g5_10 +	row_o1_10 +	row_o2_10 +	row_o3_10 +	row_o4_10 +	row_o5_10;

        //ROW_1
        if (sumRow1 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow1 = Rows[0];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow1, Toast.LENGTH_SHORT).show();
        }

        //ROW_2
        if (sumRow2 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow2 = Rows[1];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow2, Toast.LENGTH_SHORT).show();
        }
        //ROW_3
        if (sumRow3 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow3 = Rows[2];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow3, Toast.LENGTH_SHORT).show();
        }
        //ROW_4
        if (sumRow4 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow4 = Rows[3];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow4, Toast.LENGTH_SHORT).show();
        }
        //ROW_5
        if (sumRow5 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow5 = Rows[4];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow5, Toast.LENGTH_SHORT).show();
        }
        //ROW_6
        if (sumRow6 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow6 = Rows[5];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow6, Toast.LENGTH_SHORT).show();
        }
        //ROW_7
        if (sumRow7 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow7 = Rows[6];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow7, Toast.LENGTH_SHORT).show();
        }
        //ROW_8
        if (sumRow8 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow8 = Rows[7];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow8, Toast.LENGTH_SHORT).show();
        }
        //ROW_9
        if (sumRow9 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow9 = Rows[8];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow9, Toast.LENGTH_SHORT).show();
        }
        //ROW_10
        if (sumRow10 == requiredNumber){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow10 = Rows[9];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            Toast.makeText(this, "BINGO! " + bingoRow10, Toast.LENGTH_SHORT).show();
        }


    }
    void BingoChecker(){



        //BINGO CARD NUMBER 1
        if ((b1_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_1.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_1.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow1 = Rows[0];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + bingoRow1, Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }

        //BINGO CARD NUMBER 2
        if ((b1_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_2.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_2.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow2 = Rows[1];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[1], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 3
        if ((b1_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_3.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_3.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow3 = Rows[2];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[2], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 4
        if ((b1_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_4.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_4.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow4 = Rows[3];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[3], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 5
        if ((b1_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_5.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_5.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow5 = Rows[5];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[4], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 6
        if ((b1_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_6.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_6.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow6 = Rows[5];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[5], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 7
        if ((b1_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_7.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_7.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow7 = Rows[6];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[6], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 8
        if ((b1_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_8.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_8.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow8 = Rows[7];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[7], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 9
        if ((b1_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_9.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_9.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow9 = Rows[8];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[8], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
        //BINGO CARD NUMBER 10
        if ((b1_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b2_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b3_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b4_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (b5_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i1_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i2_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i3_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i4_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (i5_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n1_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n2_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n4_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (n5_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g1_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g2_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g3_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g4_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (g5_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o1_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o2_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o3_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o4_10.getCurrentTextColor()&0xffffff) == 0xff0000
                && (o5_10.getCurrentTextColor()&0xffffff) == 0xff0000){
            //GET ALL LINES OF HIDDEN NAMES
            String multilines = HiddenNames.toString();
            String[] Rows;
            String delimiter = "\n";
            Rows = multilines.split(delimiter);
            bingoRow10 = Rows[9];
            tv_Bingo.setText("BINGO : " + bingoRow1 + " " + bingoRow2 + " " + bingoRow3 + " " + bingoRow4 + " " + bingoRow5 + " " + bingoRow6 + " " + bingoRow7 + " " + bingoRow8 + " " + bingoRow9 + " " + bingoRow10);
            tv_Bingo.setVisibility(View.VISIBLE);
            PatternClassOnly.bingoNameWinner = tv_Bingo.getText().toString();
            Toast.makeText(this, "BINGO! " + Rows[9], Toast.LENGTH_SHORT).show();
        }else {
            //Do Nothing
        }
    }
    void CallMeNumbers(){
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(this);
        Cursor cursor = dbHelper.ViewData();
        StringBuilder stringBuilder = new StringBuilder();

        while (cursor.moveToNext()){
            stringBuilder.append("\n " + cursor.getString(2)
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
        HiddenNumbers = stringBuilder.toString();

        Cursor cursornames = dbHelper.ViewData();
        StringBuilder stringBuilderNames = new StringBuilder();
        while (cursornames.moveToNext()){
            stringBuilderNames.append(cursornames.getString(1) + "\n");
        }
        HiddenNames = stringBuilderNames.toString();
        //int NoOfLines = stringBuilderNames.toString().split(System.getProperty("line.separator")).length;
        //HiddenNames = String.valueOf(NoOfLines);
        //Toast.makeText(this, HiddenNames, Toast.LENGTH_SHORT).show();
    }

    void getMyLineCount(){
        tvAllNumbers.setText(HiddenNumbers);
        int NoOfLines = tvAllNumbers.getText().toString().split(System.getProperty("line.separator")).length;
        ConverterLine = String.valueOf(NoOfLines);


        boolean result1 = ConverterLine.equals("1");
        if (result1){

        }
        boolean result2 = ConverterLine.equals("2");
        if (result2){
            Line1StringIsValid = "1";

        }
        boolean result3 = ConverterLine.equals("3");
        if (result3){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
        }
        boolean result4 = ConverterLine.equals("4");
        if (result4){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";

        }
        boolean result5 = ConverterLine.equals("5");
        if (result5){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";

        }
        boolean result6 = ConverterLine.equals("6");
        if (result6){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";
            Line5StringIsValid = "1";

        }
        boolean result7 = ConverterLine.equals("7");
        if (result7){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";
            Line5StringIsValid = "1";
            Line6StringIsValid = "1";

        }
        boolean result8 = ConverterLine.equals("8");
        if (result8){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";
            Line5StringIsValid = "1";
            Line6StringIsValid = "1";
            Line7StringIsValid = "1";

        }
        boolean result9 = ConverterLine.equals("9");
        if (result9){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";
            Line5StringIsValid = "1";
            Line6StringIsValid = "1";
            Line7StringIsValid = "1";
            Line8StringIsValid = "1";

        }
        boolean result10 = ConverterLine.equals("10");
        if (result10){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";
            Line5StringIsValid = "1";
            Line6StringIsValid = "1";
            Line7StringIsValid = "1";
            Line8StringIsValid = "1";
            Line9StringIsValid = "1";
        }
        boolean result11 = ConverterLine.equals("10");
        if (result10){
            Line1StringIsValid = "1";
            Line2StringIsValid = "1";
            Line3StringIsValid = "1";
            Line4StringIsValid = "1";
            Line5StringIsValid = "1";
            Line6StringIsValid = "1";
            Line7StringIsValid = "1";
            Line8StringIsValid = "1";
            Line9StringIsValid = "1";
            Line10StringIsValid = "1";
        }
    }
    void LoadNumberFromDB(){
        //GET ALL LINES
        String multilines = HiddenNumbers.toString();
        String[] Rows;
        String delimiter = "\n";
        Rows = multilines.split(delimiter);

        if (Line1StringIsValid.equals("1")){
            //ROW 1
            String multiLinesRow1 = Rows[1].toString();
            String[] Row1;
            String delimiterRow1 = " ";
            Row1 = multiLinesRow1.split(delimiterRow1);
            b1_1.setText(Row1[1]);
            b2_1.setText(Row1[2]);
            b3_1.setText(Row1[3]);
            b4_1.setText(Row1[4]);
            b5_1.setText(Row1[5]);
            i1_1.setText(Row1[6]);
            i2_1.setText(Row1[7]);
            i3_1.setText(Row1[8]);
            i4_1.setText(Row1[9]);
            i5_1.setText(Row1[10]);
            n1_1.setText(Row1[11]);
            n2_1.setText(Row1[12]);
            n4_1.setText(Row1[13]);
            n5_1.setText(Row1[14]);
            g1_1.setText(Row1[15]);
            g2_1.setText(Row1[16]);
            g3_1.setText(Row1[17]);
            g4_1.setText(Row1[18]);
            g5_1.setText(Row1[19]);
            o1_1.setText(Row1[20]);
            o2_1.setText(Row1[21]);
            o3_1.setText(Row1[22]);
            o4_1.setText(Row1[23]);
            o5_1.setText(Row1[24]);
            b1_1.setVisibility(View.VISIBLE);
            b2_1.setVisibility(View.VISIBLE);
            b3_1.setVisibility(View.VISIBLE);
            b4_1.setVisibility(View.VISIBLE);
            b5_1.setVisibility(View.VISIBLE);
            i1_1.setVisibility(View.VISIBLE);
            i2_1.setVisibility(View.VISIBLE);
            i3_1.setVisibility(View.VISIBLE);
            i4_1.setVisibility(View.VISIBLE);
            i5_1.setVisibility(View.VISIBLE);
            n1_1.setVisibility(View.VISIBLE);
            n2_1.setVisibility(View.VISIBLE);
            n4_1.setVisibility(View.VISIBLE);
            n5_1.setVisibility(View.VISIBLE);
            g1_1.setVisibility(View.VISIBLE);
            g2_1.setVisibility(View.VISIBLE);
            g3_1.setVisibility(View.VISIBLE);
            g4_1.setVisibility(View.VISIBLE);
            g5_1.setVisibility(View.VISIBLE);
            o1_1.setVisibility(View.VISIBLE);
            o2_1.setVisibility(View.VISIBLE);
            o3_1.setVisibility(View.VISIBLE);
            o4_1.setVisibility(View.VISIBLE);
            o5_1.setVisibility(View.VISIBLE);

        }else {

        }



        if (Line2StringIsValid.equals("1")){
            //ROW 2
            String multiLinesRow2 = Rows[2].toString();
            String[] Row2;
            String delimiterRow2 = " ";
            Row2 = multiLinesRow2.split(delimiterRow2);
            b1_2.setText(Row2[1]);
            b2_2.setText(Row2[2]);
            b3_2.setText(Row2[3]);
            b4_2.setText(Row2[4]);
            b5_2.setText(Row2[5]);
            i1_2.setText(Row2[6]);
            i2_2.setText(Row2[7]);
            i3_2.setText(Row2[8]);
            i4_2.setText(Row2[9]);
            i5_2.setText(Row2[10]);
            n1_2.setText(Row2[11]);
            n2_2.setText(Row2[12]);
            n4_2.setText(Row2[13]);
            n5_2.setText(Row2[14]);
            g1_2.setText(Row2[15]);
            g2_2.setText(Row2[16]);
            g3_2.setText(Row2[17]);
            g4_2.setText(Row2[18]);
            g5_2.setText(Row2[19]);
            o1_2.setText(Row2[20]);
            o2_2.setText(Row2[21]);
            o3_2.setText(Row2[22]);
            o4_2.setText(Row2[23]);
            o5_2.setText(Row2[24]);
            b1_2.setVisibility(View.VISIBLE);
            b2_2.setVisibility(View.VISIBLE);
            b3_2.setVisibility(View.VISIBLE);
            b4_2.setVisibility(View.VISIBLE);
            b5_2.setVisibility(View.VISIBLE);
            i1_2.setVisibility(View.VISIBLE);
            i2_2.setVisibility(View.VISIBLE);
            i3_2.setVisibility(View.VISIBLE);
            i4_2.setVisibility(View.VISIBLE);
            i5_2.setVisibility(View.VISIBLE);
            n1_2.setVisibility(View.VISIBLE);
            n2_2.setVisibility(View.VISIBLE);
            n4_2.setVisibility(View.VISIBLE);
            n5_2.setVisibility(View.VISIBLE);
            g1_2.setVisibility(View.VISIBLE);
            g2_2.setVisibility(View.VISIBLE);
            g3_2.setVisibility(View.VISIBLE);
            g4_2.setVisibility(View.VISIBLE);
            g5_2.setVisibility(View.VISIBLE);
            o1_2.setVisibility(View.VISIBLE);
            o2_2.setVisibility(View.VISIBLE);
            o3_2.setVisibility(View.VISIBLE);
            o4_2.setVisibility(View.VISIBLE);
            o5_2.setVisibility(View.VISIBLE);

        }else {

        }

        if (Line3StringIsValid.equals("1")){
            //ROW 3
            String multiLinesRow3 = Rows[3].toString();
            String[] Row3;
            String delimiterRow3 = " ";
            Row3 = multiLinesRow3.split(delimiterRow3);
            b1_3.setText(Row3[1]);
            b2_3.setText(Row3[2]);
            b3_3.setText(Row3[3]);
            b4_3.setText(Row3[4]);
            b5_3.setText(Row3[5]);
            i1_3.setText(Row3[6]);
            i2_3.setText(Row3[7]);
            i3_3.setText(Row3[8]);
            i4_3.setText(Row3[9]);
            i5_3.setText(Row3[10]);
            n1_3.setText(Row3[11]);
            n2_3.setText(Row3[12]);
            n4_3.setText(Row3[13]);
            n5_3.setText(Row3[14]);
            g1_3.setText(Row3[15]);
            g2_3.setText(Row3[16]);
            g3_3.setText(Row3[17]);
            g4_3.setText(Row3[18]);
            g5_3.setText(Row3[19]);
            o1_3.setText(Row3[20]);
            o2_3.setText(Row3[21]);
            o3_3.setText(Row3[22]);
            o4_3.setText(Row3[23]);
            o5_3.setText(Row3[24]);
            b1_3.setVisibility(View.VISIBLE);
            b2_3.setVisibility(View.VISIBLE);
            b3_3.setVisibility(View.VISIBLE);
            b4_3.setVisibility(View.VISIBLE);
            b5_3.setVisibility(View.VISIBLE);
            i1_3.setVisibility(View.VISIBLE);
            i2_3.setVisibility(View.VISIBLE);
            i3_3.setVisibility(View.VISIBLE);
            i4_3.setVisibility(View.VISIBLE);
            i5_3.setVisibility(View.VISIBLE);
            n1_3.setVisibility(View.VISIBLE);
            n2_3.setVisibility(View.VISIBLE);
            n4_3.setVisibility(View.VISIBLE);
            n5_3.setVisibility(View.VISIBLE);
            g1_3.setVisibility(View.VISIBLE);
            g2_3.setVisibility(View.VISIBLE);
            g3_3.setVisibility(View.VISIBLE);
            g4_3.setVisibility(View.VISIBLE);
            g5_3.setVisibility(View.VISIBLE);
            o1_3.setVisibility(View.VISIBLE);
            o2_3.setVisibility(View.VISIBLE);
            o3_3.setVisibility(View.VISIBLE);
            o4_3.setVisibility(View.VISIBLE);
            o5_3.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line4StringIsValid.equals("1")){
            //ROW 4
            String multiLinesRow4 = Rows[4].toString();
            String[] Row4;
            String delimiterRow4 = " ";
            Row4 = multiLinesRow4.split(delimiterRow4);
            b1_4.setText(Row4[1]);
            b2_4.setText(Row4[2]);
            b3_4.setText(Row4[3]);
            b4_4.setText(Row4[4]);
            b5_4.setText(Row4[5]);
            i1_4.setText(Row4[6]);
            i2_4.setText(Row4[7]);
            i3_4.setText(Row4[8]);
            i4_4.setText(Row4[9]);
            i5_4.setText(Row4[10]);
            n1_4.setText(Row4[11]);
            n2_4.setText(Row4[12]);
            n4_4.setText(Row4[13]);
            n5_4.setText(Row4[14]);
            g1_4.setText(Row4[15]);
            g2_4.setText(Row4[16]);
            g3_4.setText(Row4[17]);
            g4_4.setText(Row4[18]);
            g5_4.setText(Row4[19]);
            o1_4.setText(Row4[20]);
            o2_4.setText(Row4[21]);
            o3_4.setText(Row4[22]);
            o4_4.setText(Row4[23]);
            o5_4.setText(Row4[24]);
            b1_4.setVisibility(View.VISIBLE);
            b2_4.setVisibility(View.VISIBLE);
            b3_4.setVisibility(View.VISIBLE);
            b4_4.setVisibility(View.VISIBLE);
            b5_4.setVisibility(View.VISIBLE);
            i1_4.setVisibility(View.VISIBLE);
            i2_4.setVisibility(View.VISIBLE);
            i3_4.setVisibility(View.VISIBLE);
            i4_4.setVisibility(View.VISIBLE);
            i5_4.setVisibility(View.VISIBLE);
            n1_4.setVisibility(View.VISIBLE);
            n2_4.setVisibility(View.VISIBLE);
            n4_4.setVisibility(View.VISIBLE);
            n5_4.setVisibility(View.VISIBLE);
            g1_4.setVisibility(View.VISIBLE);
            g2_4.setVisibility(View.VISIBLE);
            g3_4.setVisibility(View.VISIBLE);
            g4_4.setVisibility(View.VISIBLE);
            g5_4.setVisibility(View.VISIBLE);
            o1_4.setVisibility(View.VISIBLE);
            o2_4.setVisibility(View.VISIBLE);
            o3_4.setVisibility(View.VISIBLE);
            o4_4.setVisibility(View.VISIBLE);
            o5_4.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line5StringIsValid.equals("1")){
            //ROW 5
            String multiLinesRow5 = Rows[5].toString();
            String[] Row5;
            String delimiterRow5 = " ";
            Row5 = multiLinesRow5.split(delimiterRow5);
            b1_5.setText(Row5[1]);
            b2_5.setText(Row5[2]);
            b3_5.setText(Row5[3]);
            b4_5.setText(Row5[4]);
            b5_5.setText(Row5[5]);
            i1_5.setText(Row5[6]);
            i2_5.setText(Row5[7]);
            i3_5.setText(Row5[8]);
            i4_5.setText(Row5[9]);
            i5_5.setText(Row5[10]);
            n1_5.setText(Row5[11]);
            n2_5.setText(Row5[12]);
            n4_5.setText(Row5[13]);
            n5_5.setText(Row5[14]);
            g1_5.setText(Row5[15]);
            g2_5.setText(Row5[16]);
            g3_5.setText(Row5[17]);
            g4_5.setText(Row5[18]);
            g5_5.setText(Row5[19]);
            o1_5.setText(Row5[20]);
            o2_5.setText(Row5[21]);
            o3_5.setText(Row5[22]);
            o4_5.setText(Row5[23]);
            o5_5.setText(Row5[24]);
            b1_5.setVisibility(View.VISIBLE);
            b2_5.setVisibility(View.VISIBLE);
            b3_5.setVisibility(View.VISIBLE);
            b4_5.setVisibility(View.VISIBLE);
            b5_5.setVisibility(View.VISIBLE);
            i1_5.setVisibility(View.VISIBLE);
            i2_5.setVisibility(View.VISIBLE);
            i3_5.setVisibility(View.VISIBLE);
            i4_5.setVisibility(View.VISIBLE);
            i5_5.setVisibility(View.VISIBLE);
            n1_5.setVisibility(View.VISIBLE);
            n2_5.setVisibility(View.VISIBLE);
            n4_5.setVisibility(View.VISIBLE);
            n5_5.setVisibility(View.VISIBLE);
            g1_5.setVisibility(View.VISIBLE);
            g2_5.setVisibility(View.VISIBLE);
            g3_5.setVisibility(View.VISIBLE);
            g4_5.setVisibility(View.VISIBLE);
            g5_5.setVisibility(View.VISIBLE);
            o1_5.setVisibility(View.VISIBLE);
            o2_5.setVisibility(View.VISIBLE);
            o3_5.setVisibility(View.VISIBLE);
            o4_5.setVisibility(View.VISIBLE);
            o5_5.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line6StringIsValid.equals("1")){
            //ROW 6
            String multiLinesRow6 = Rows[6].toString();
            String[] Row6;
            String delimiterRow6 = " ";
            Row6 = multiLinesRow6.split(delimiterRow6);
            b1_6.setText(Row6[1]);
            b2_6.setText(Row6[2]);
            b3_6.setText(Row6[3]);
            b4_6.setText(Row6[4]);
            b5_6.setText(Row6[5]);
            i1_6.setText(Row6[6]);
            i2_6.setText(Row6[7]);
            i3_6.setText(Row6[8]);
            i4_6.setText(Row6[9]);
            i5_6.setText(Row6[10]);
            n1_6.setText(Row6[11]);
            n2_6.setText(Row6[12]);
            n4_6.setText(Row6[13]);
            n5_6.setText(Row6[14]);
            g1_6.setText(Row6[15]);
            g2_6.setText(Row6[16]);
            g3_6.setText(Row6[17]);
            g4_6.setText(Row6[18]);
            g5_6.setText(Row6[19]);
            o1_6.setText(Row6[20]);
            o2_6.setText(Row6[21]);
            o3_6.setText(Row6[22]);
            o4_6.setText(Row6[23]);
            o5_6.setText(Row6[24]);
            b1_6.setVisibility(View.VISIBLE);
            b2_6.setVisibility(View.VISIBLE);
            b3_6.setVisibility(View.VISIBLE);
            b4_6.setVisibility(View.VISIBLE);
            b5_6.setVisibility(View.VISIBLE);
            i1_6.setVisibility(View.VISIBLE);
            i2_6.setVisibility(View.VISIBLE);
            i3_6.setVisibility(View.VISIBLE);
            i4_6.setVisibility(View.VISIBLE);
            i5_6.setVisibility(View.VISIBLE);
            n1_6.setVisibility(View.VISIBLE);
            n2_6.setVisibility(View.VISIBLE);
            n4_6.setVisibility(View.VISIBLE);
            n5_6.setVisibility(View.VISIBLE);
            g1_6.setVisibility(View.VISIBLE);
            g2_6.setVisibility(View.VISIBLE);
            g3_6.setVisibility(View.VISIBLE);
            g4_6.setVisibility(View.VISIBLE);
            g5_6.setVisibility(View.VISIBLE);
            o1_6.setVisibility(View.VISIBLE);
            o2_6.setVisibility(View.VISIBLE);
            o3_6.setVisibility(View.VISIBLE);
            o4_6.setVisibility(View.VISIBLE);
            o5_6.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line7StringIsValid.equals("1")){
            //ROW 7
            String multiLinesRow7 = Rows[7].toString();
            String[] Row7;
            String delimiterRow7 = " ";
            Row7 = multiLinesRow7.split(delimiterRow7);
            b1_7.setText(Row7[1]);
            b2_7.setText(Row7[2]);
            b3_7.setText(Row7[3]);
            b4_7.setText(Row7[4]);
            b5_7.setText(Row7[5]);
            i1_7.setText(Row7[6]);
            i2_7.setText(Row7[7]);
            i3_7.setText(Row7[8]);
            i4_7.setText(Row7[9]);
            i5_7.setText(Row7[10]);
            n1_7.setText(Row7[11]);
            n2_7.setText(Row7[12]);
            n4_7.setText(Row7[13]);
            n5_7.setText(Row7[14]);
            g1_7.setText(Row7[15]);
            g2_7.setText(Row7[16]);
            g3_7.setText(Row7[17]);
            g4_7.setText(Row7[18]);
            g5_7.setText(Row7[19]);
            o1_7.setText(Row7[20]);
            o2_7.setText(Row7[21]);
            o3_7.setText(Row7[22]);
            o4_7.setText(Row7[23]);
            o5_7.setText(Row7[24]);
            b1_7.setVisibility(View.VISIBLE);
            b2_7.setVisibility(View.VISIBLE);
            b3_7.setVisibility(View.VISIBLE);
            b4_7.setVisibility(View.VISIBLE);
            b5_7.setVisibility(View.VISIBLE);
            i1_7.setVisibility(View.VISIBLE);
            i2_7.setVisibility(View.VISIBLE);
            i3_7.setVisibility(View.VISIBLE);
            i4_7.setVisibility(View.VISIBLE);
            i5_7.setVisibility(View.VISIBLE);
            n1_7.setVisibility(View.VISIBLE);
            n2_7.setVisibility(View.VISIBLE);
            n4_7.setVisibility(View.VISIBLE);
            n5_7.setVisibility(View.VISIBLE);
            g1_7.setVisibility(View.VISIBLE);
            g2_7.setVisibility(View.VISIBLE);
            g3_7.setVisibility(View.VISIBLE);
            g4_7.setVisibility(View.VISIBLE);
            g5_7.setVisibility(View.VISIBLE);
            o1_7.setVisibility(View.VISIBLE);
            o2_7.setVisibility(View.VISIBLE);
            o3_7.setVisibility(View.VISIBLE);
            o4_7.setVisibility(View.VISIBLE);
            o5_7.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line8StringIsValid.equals("1")){
            //ROW 8
            String multiLinesRow8 = Rows[8].toString();
            String[] Row8;
            String delimiterRow8 = " ";
            Row8 = multiLinesRow8.split(delimiterRow8);
            b1_8.setText(Row8[1]);
            b2_8.setText(Row8[2]);
            b3_8.setText(Row8[3]);
            b4_8.setText(Row8[4]);
            b5_8.setText(Row8[5]);
            i1_8.setText(Row8[6]);
            i2_8.setText(Row8[7]);
            i3_8.setText(Row8[8]);
            i4_8.setText(Row8[9]);
            i5_8.setText(Row8[10]);
            n1_8.setText(Row8[11]);
            n2_8.setText(Row8[12]);
            n4_8.setText(Row8[13]);
            n5_8.setText(Row8[14]);
            g1_8.setText(Row8[15]);
            g2_8.setText(Row8[16]);
            g3_8.setText(Row8[17]);
            g4_8.setText(Row8[18]);
            g5_8.setText(Row8[19]);
            o1_8.setText(Row8[20]);
            o2_8.setText(Row8[21]);
            o3_8.setText(Row8[22]);
            o4_8.setText(Row8[23]);
            o5_8.setText(Row8[24]);
            b1_8.setVisibility(View.VISIBLE);
            b2_8.setVisibility(View.VISIBLE);
            b3_8.setVisibility(View.VISIBLE);
            b4_8.setVisibility(View.VISIBLE);
            b5_8.setVisibility(View.VISIBLE);
            i1_8.setVisibility(View.VISIBLE);
            i2_8.setVisibility(View.VISIBLE);
            i3_8.setVisibility(View.VISIBLE);
            i4_8.setVisibility(View.VISIBLE);
            i5_8.setVisibility(View.VISIBLE);
            n1_8.setVisibility(View.VISIBLE);
            n2_8.setVisibility(View.VISIBLE);
            n4_8.setVisibility(View.VISIBLE);
            n5_8.setVisibility(View.VISIBLE);
            g1_8.setVisibility(View.VISIBLE);
            g2_8.setVisibility(View.VISIBLE);
            g3_8.setVisibility(View.VISIBLE);
            g4_8.setVisibility(View.VISIBLE);
            g5_8.setVisibility(View.VISIBLE);
            o1_8.setVisibility(View.VISIBLE);
            o2_8.setVisibility(View.VISIBLE);
            o3_8.setVisibility(View.VISIBLE);
            o4_8.setVisibility(View.VISIBLE);
            o5_8.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line9StringIsValid.equals("1")){
            //ROW 9
            String multiLinesRow9 = Rows[9].toString();
            String[] Row9;
            String delimiterRow9 = " ";
            Row9 = multiLinesRow9.split(delimiterRow9);
            b1_9.setText(Row9[1]);
            b2_9.setText(Row9[2]);
            b3_9.setText(Row9[3]);
            b4_9.setText(Row9[4]);
            b5_9.setText(Row9[5]);
            i1_9.setText(Row9[6]);
            i2_9.setText(Row9[7]);
            i3_9.setText(Row9[8]);
            i4_9.setText(Row9[9]);
            i5_9.setText(Row9[10]);
            n1_9.setText(Row9[11]);
            n2_9.setText(Row9[12]);
            n4_9.setText(Row9[13]);
            n5_9.setText(Row9[14]);
            g1_9.setText(Row9[15]);
            g2_9.setText(Row9[16]);
            g3_9.setText(Row9[17]);
            g4_9.setText(Row9[18]);
            g5_9.setText(Row9[19]);
            o1_9.setText(Row9[20]);
            o2_9.setText(Row9[21]);
            o3_9.setText(Row9[22]);
            o4_9.setText(Row9[23]);
            o5_9.setText(Row9[24]);
            b1_9.setVisibility(View.VISIBLE);
            b2_9.setVisibility(View.VISIBLE);
            b3_9.setVisibility(View.VISIBLE);
            b4_9.setVisibility(View.VISIBLE);
            b5_9.setVisibility(View.VISIBLE);
            i1_9.setVisibility(View.VISIBLE);
            i2_9.setVisibility(View.VISIBLE);
            i3_9.setVisibility(View.VISIBLE);
            i4_9.setVisibility(View.VISIBLE);
            i5_9.setVisibility(View.VISIBLE);
            n1_9.setVisibility(View.VISIBLE);
            n2_9.setVisibility(View.VISIBLE);
            n4_9.setVisibility(View.VISIBLE);
            n5_9.setVisibility(View.VISIBLE);
            g1_9.setVisibility(View.VISIBLE);
            g2_9.setVisibility(View.VISIBLE);
            g3_9.setVisibility(View.VISIBLE);
            g4_9.setVisibility(View.VISIBLE);
            g5_9.setVisibility(View.VISIBLE);
            o1_9.setVisibility(View.VISIBLE);
            o2_9.setVisibility(View.VISIBLE);
            o3_9.setVisibility(View.VISIBLE);
            o4_9.setVisibility(View.VISIBLE);
            o5_9.setVisibility(View.VISIBLE);

        }else {

        }
        if (Line10StringIsValid.equals("1")){
            //ROW 10
            String multiLinesRow10 = Rows[10].toString();
            String[] Row10;
            String delimiterRow10 = " ";
            Row10 = multiLinesRow10.split(delimiterRow10);
            b1_10.setText(Row10[1]);
            b2_10.setText(Row10[2]);
            b3_10.setText(Row10[3]);
            b4_10.setText(Row10[4]);
            b5_10.setText(Row10[5]);
            i1_10.setText(Row10[6]);
            i2_10.setText(Row10[7]);
            i3_10.setText(Row10[8]);
            i4_10.setText(Row10[9]);
            i5_10.setText(Row10[10]);
            n1_10.setText(Row10[11]);
            n2_10.setText(Row10[12]);
            n4_10.setText(Row10[13]);
            n5_10.setText(Row10[14]);
            g1_10.setText(Row10[15]);
            g2_10.setText(Row10[16]);
            g3_10.setText(Row10[17]);
            g4_10.setText(Row10[18]);
            g5_10.setText(Row10[19]);
            o1_10.setText(Row10[20]);
            o2_10.setText(Row10[21]);
            o3_10.setText(Row10[22]);
            o4_10.setText(Row10[23]);
            o5_10.setText(Row10[24]);
            b1_10.setVisibility(View.VISIBLE);
            b2_10.setVisibility(View.VISIBLE);
            b3_10.setVisibility(View.VISIBLE);
            b4_10.setVisibility(View.VISIBLE);
            b5_10.setVisibility(View.VISIBLE);
            i1_10.setVisibility(View.VISIBLE);
            i2_10.setVisibility(View.VISIBLE);
            i3_10.setVisibility(View.VISIBLE);
            i4_10.setVisibility(View.VISIBLE);
            i5_10.setVisibility(View.VISIBLE);
            n1_10.setVisibility(View.VISIBLE);
            n2_10.setVisibility(View.VISIBLE);
            n4_10.setVisibility(View.VISIBLE);
            n5_10.setVisibility(View.VISIBLE);
            g1_10.setVisibility(View.VISIBLE);
            g2_10.setVisibility(View.VISIBLE);
            g3_10.setVisibility(View.VISIBLE);
            g4_10.setVisibility(View.VISIBLE);
            g5_10.setVisibility(View.VISIBLE);
            o1_10.setVisibility(View.VISIBLE);
            o2_10.setVisibility(View.VISIBLE);
            o3_10.setVisibility(View.VISIBLE);
            o4_10.setVisibility(View.VISIBLE);
            o5_10.setVisibility(View.VISIBLE);

        }else {

        }
    }

    void Row1SetText(){

    }

    void AllCardsEquals(){

        //ROW 1 B's
        if (b1_1.getText().toString().equals(textInputEditText.getText().toString())){
            b1_1.setBackgroundColor(Color.GREEN);
            b1_1.setTextColor(Color.RED);
            PatternClassOnly.row_b1_1 = "1";
        } else if (b2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_1.setBackgroundColor(Color.GREEN);
            b2_1.setTextColor(Color.RED);
            PatternClassOnly.row_b2_1 = "1";
        } else if (b3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_1.setBackgroundColor(Color.GREEN);
            b3_1.setTextColor(Color.RED);
            PatternClassOnly.row_b3_1 = "1";
        } else if (b4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_1.setBackgroundColor(Color.GREEN);
            b4_1.setTextColor(Color.RED);
            PatternClassOnly.row_b4_1 = "1";
        } else if (b5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_1.setBackgroundColor(Color.GREEN);
            b5_1.setTextColor(Color.RED);
            PatternClassOnly.row_b5_1 = "1";
        }

        //ROW 1 I's
        if (i1_1.getText().toString().equals(textInputEditText.getText().toString())){
            i1_1.setBackgroundColor(Color.GREEN);
            i1_1.setTextColor(Color.RED);
            PatternClassOnly.row_i1_1 = "1";
        } else if (i2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_1.setBackgroundColor(Color.GREEN);
            i2_1.setTextColor(Color.RED);
            PatternClassOnly.row_i2_1 = "1";
        } else if (i3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_1.setBackgroundColor(Color.GREEN);
            i3_1.setTextColor(Color.RED);
            PatternClassOnly.row_i3_1 = "1";
        } else if (i4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_1.setBackgroundColor(Color.GREEN);
            i4_1.setTextColor(Color.RED);
            PatternClassOnly.row_i4_1 = "1";
        } else if (i5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_1.setBackgroundColor(Color.GREEN);
            i5_1.setTextColor(Color.RED);
            PatternClassOnly.row_i5_1 = "1";
        }


        //ROW 1 N's
        if (n1_1.getText().toString().equals(textInputEditText.getText().toString())){
            n1_1.setBackgroundColor(Color.GREEN);
            n1_1.setTextColor(Color.RED);
            PatternClassOnly.row_n1_1 = "1";
        } else if (n2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_1.setBackgroundColor(Color.GREEN);
            n2_1.setTextColor(Color.RED);
            PatternClassOnly.row_n2_1 = "1";
        } else if (n4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_1.setBackgroundColor(Color.GREEN);
            n4_1.setTextColor(Color.RED);
            PatternClassOnly.row_n4_1 = "1";
        } else if (n5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_1.setBackgroundColor(Color.GREEN);
            n5_1.setTextColor(Color.RED);
            PatternClassOnly.row_n5_1 = "1";
        }

        //ROW 1 G's
        if (g1_1.getText().toString().equals(textInputEditText.getText().toString())){
            g1_1.setBackgroundColor(Color.GREEN);
            g1_1.setTextColor(Color.RED);
            PatternClassOnly.row_g1_1 = "1";
        } else if (g2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_1.setBackgroundColor(Color.GREEN);
            g2_1.setTextColor(Color.RED);
            PatternClassOnly.row_g2_1 = "1";
        } else if (g3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_1.setBackgroundColor(Color.GREEN);
            g3_1.setTextColor(Color.RED);
            PatternClassOnly.row_g3_1 = "1";
        } else if (g4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_1.setBackgroundColor(Color.GREEN);
            g4_1.setTextColor(Color.RED);
            PatternClassOnly.row_g4_1 = "1";
        } else if (g5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_1.setBackgroundColor(Color.GREEN);
            g5_1.setTextColor(Color.RED);
            PatternClassOnly.row_g5_1 = "1";
        }

        //ROW 1 O's
        if (o1_1.getText().toString().equals(textInputEditText.getText().toString())){
            o1_1.setBackgroundColor(Color.GREEN);
            o1_1.setTextColor(Color.RED);
            PatternClassOnly.row_o1_1 = "1";
        } else if (o2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_1.setBackgroundColor(Color.GREEN);
            o2_1.setTextColor(Color.RED);
            PatternClassOnly.row_o2_1 = "1";
        } else if (o3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_1.setBackgroundColor(Color.GREEN);
            o3_1.setTextColor(Color.RED);
            PatternClassOnly.row_o3_1 = "1";
        } else if (o4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_1.setBackgroundColor(Color.GREEN);
            o4_1.setTextColor(Color.RED);
            PatternClassOnly.row_o4_1 = "1";
        } else if (o5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_1.setBackgroundColor(Color.GREEN);
            o5_1.setTextColor(Color.RED);
            PatternClassOnly.row_o5_1 = "1";
        }


        //ROW 2 B's
        if (b1_2.getText().toString().equals(textInputEditText.getText().toString())){
            b1_2.setBackgroundColor(Color.GREEN);
            b1_2.setTextColor(Color.RED);
            PatternClassOnly.row_b1_2 = "1";
        } else if (b2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_2.setBackgroundColor(Color.GREEN);
            b2_2.setTextColor(Color.RED);
            PatternClassOnly.row_b2_2 = "1";
        } else if (b3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_2.setBackgroundColor(Color.GREEN);
            b3_2.setTextColor(Color.RED);
            PatternClassOnly.row_b3_2 = "1";
        } else if (b4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_2.setBackgroundColor(Color.GREEN);
            b4_2.setTextColor(Color.RED);
            PatternClassOnly.row_b4_2 = "1";
        } else if (b5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_2.setBackgroundColor(Color.GREEN);
            b5_2.setTextColor(Color.RED);
            PatternClassOnly.row_b5_2 = "1";
        }
        //ROW 2 I's
        if (i1_2.getText().toString().equals(textInputEditText.getText().toString())){
            i1_2.setBackgroundColor(Color.GREEN);
            i1_2.setTextColor(Color.RED);
            PatternClassOnly.row_i1_2 = "1";
        } else if (i2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_2.setBackgroundColor(Color.GREEN);
            i2_2.setTextColor(Color.RED);
            PatternClassOnly.row_i2_2 = "1";
        } else if (i3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_2.setBackgroundColor(Color.GREEN);
            i3_2.setTextColor(Color.RED);
            PatternClassOnly.row_i3_2 = "1";
        } else if (i4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_2.setBackgroundColor(Color.GREEN);
            i4_2.setTextColor(Color.RED);
            PatternClassOnly.row_i4_2 = "1";
        } else if (i5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_2.setBackgroundColor(Color.GREEN);
            i5_2.setTextColor(Color.RED);
            PatternClassOnly.row_i5_2 = "1";
        }


        //ROW 2 N's
        if (n1_2.getText().toString().equals(textInputEditText.getText().toString())){
            n1_2.setBackgroundColor(Color.GREEN);
            n1_2.setTextColor(Color.RED);
            PatternClassOnly.row_n1_2 = "1";
        } else if (n2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_2.setBackgroundColor(Color.GREEN);
            n2_2.setTextColor(Color.RED);
            PatternClassOnly.row_n2_2 = "1";
        } else if (n4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_2.setBackgroundColor(Color.GREEN);
            n4_2.setTextColor(Color.RED);
            PatternClassOnly.row_n4_2 = "1";
        } else if (n5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_2.setBackgroundColor(Color.GREEN);
            n5_2.setTextColor(Color.RED);
            PatternClassOnly.row_n5_2 = "1";
        }

        //ROW 2 G's
        if (g1_2.getText().toString().equals(textInputEditText.getText().toString())){
            g1_2.setBackgroundColor(Color.GREEN);
            g1_2.setTextColor(Color.RED);
            PatternClassOnly.row_g1_2 = "1";
        } else if (g2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_2.setBackgroundColor(Color.GREEN);
            g2_2.setTextColor(Color.RED);
            PatternClassOnly.row_g2_2 = "1";
        } else if (g3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_2.setBackgroundColor(Color.GREEN);
            g3_2.setTextColor(Color.RED);
            PatternClassOnly.row_g3_2 = "1";
        } else if (g4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_2.setBackgroundColor(Color.GREEN);
            g4_2.setTextColor(Color.RED);
            PatternClassOnly.row_g4_2 = "1";
        } else if (g5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_2.setBackgroundColor(Color.GREEN);
            g5_2.setTextColor(Color.RED);
            PatternClassOnly.row_g5_2 = "1";
        }

        //ROW 2 O's
        if (o1_2.getText().toString().equals(textInputEditText.getText().toString())){
            o1_2.setBackgroundColor(Color.GREEN);
            o1_2.setTextColor(Color.RED);
            PatternClassOnly.row_o1_2 = "1";
        } else if (o2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_2.setBackgroundColor(Color.GREEN);
            o2_2.setTextColor(Color.RED);
            PatternClassOnly.row_o2_2 = "1";
        } else if (o3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_2.setBackgroundColor(Color.GREEN);
            o3_2.setTextColor(Color.RED);
            PatternClassOnly.row_o3_2 = "1";
        } else if (o4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_2.setBackgroundColor(Color.GREEN);
            o4_2.setTextColor(Color.RED);
            PatternClassOnly.row_o4_2 = "1";
        } else if (o5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_2.setBackgroundColor(Color.GREEN);
            o5_2.setTextColor(Color.RED);
            PatternClassOnly.row_o5_2 = "1";
        }

        //ROW 3 B's
        if (b1_3.getText().toString().equals(textInputEditText.getText().toString())){
            b1_3.setBackgroundColor(Color.GREEN);
            b1_3.setTextColor(Color.RED);
            PatternClassOnly.row_b1_3 = "1";
        } else if (b2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_3.setBackgroundColor(Color.GREEN);
            b2_3.setTextColor(Color.RED);
            PatternClassOnly.row_b2_3 = "1";
        } else if (b3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_3.setBackgroundColor(Color.GREEN);
            b3_3.setTextColor(Color.RED);
            PatternClassOnly.row_b3_3 = "1";
        } else if (b4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_3.setBackgroundColor(Color.GREEN);
            b4_3.setTextColor(Color.RED);
            PatternClassOnly.row_b4_3 = "1";
        } else if (b5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_3.setBackgroundColor(Color.GREEN);
            b5_3.setTextColor(Color.RED);
            PatternClassOnly.row_b5_3 = "1";
        }
        //ROW 3 I's
        if (i1_3.getText().toString().equals(textInputEditText.getText().toString())){
            i1_3.setBackgroundColor(Color.GREEN);
            i1_3.setTextColor(Color.RED);
            PatternClassOnly.row_i1_3 = "1";
        } else if (i2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_3.setBackgroundColor(Color.GREEN);
            i2_3.setTextColor(Color.RED);
            PatternClassOnly.row_i2_3 = "1";
        } else if (i3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_3.setBackgroundColor(Color.GREEN);
            i3_3.setTextColor(Color.RED);
            PatternClassOnly.row_i3_3 = "1";
        } else if (i4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_3.setBackgroundColor(Color.GREEN);
            i4_3.setTextColor(Color.RED);
            PatternClassOnly.row_i4_3 = "1";
        } else if (i5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_3.setBackgroundColor(Color.GREEN);
            i5_3.setTextColor(Color.RED);
            PatternClassOnly.row_i5_3 = "1";
        }


        //ROW 3 N's
        if (n1_3.getText().toString().equals(textInputEditText.getText().toString())){
            n1_3.setBackgroundColor(Color.GREEN);
            n1_3.setTextColor(Color.RED);
            PatternClassOnly.row_n1_3 = "1";
        } else if (n2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_3.setBackgroundColor(Color.GREEN);
            n2_3.setTextColor(Color.RED);
            PatternClassOnly.row_n2_3 = "1";
        } else if (n4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_3.setBackgroundColor(Color.GREEN);
            n4_3.setTextColor(Color.RED);
            PatternClassOnly.row_n4_3 = "1";
        } else if (n5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_3.setBackgroundColor(Color.GREEN);
            n5_3.setTextColor(Color.RED);
            PatternClassOnly.row_n5_3 = "1";
        }

        //ROW 3 G's
        if (g1_3.getText().toString().equals(textInputEditText.getText().toString())){
            g1_3.setBackgroundColor(Color.GREEN);
            g1_3.setTextColor(Color.RED);
            PatternClassOnly.row_g1_3 = "1";
        } else if (g2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_3.setBackgroundColor(Color.GREEN);
            g2_3.setTextColor(Color.RED);
            PatternClassOnly.row_g2_3 = "1";
        } else if (g3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_3.setBackgroundColor(Color.GREEN);
            g3_3.setTextColor(Color.RED);
            PatternClassOnly.row_g3_3 = "1";
        } else if (g4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_3.setBackgroundColor(Color.GREEN);
            g4_3.setTextColor(Color.RED);
            PatternClassOnly.row_g4_3 = "1";
        } else if (g5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_3.setBackgroundColor(Color.GREEN);
            g5_3.setTextColor(Color.RED);
            PatternClassOnly.row_g5_3 = "1";
        }

        //ROW 3 O's
        if (o1_3.getText().toString().equals(textInputEditText.getText().toString())){
            o1_3.setBackgroundColor(Color.GREEN);
            o1_3.setTextColor(Color.RED);
            PatternClassOnly.row_o1_3 = "1";
        } else if (o2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_3.setBackgroundColor(Color.GREEN);
            o2_3.setTextColor(Color.RED);
            PatternClassOnly.row_o2_3 = "1";
        } else if (o3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_3.setBackgroundColor(Color.GREEN);
            o3_3.setTextColor(Color.RED);
            PatternClassOnly.row_o3_3 = "1";
        } else if (o4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_3.setBackgroundColor(Color.GREEN);
            o4_3.setTextColor(Color.RED);
            PatternClassOnly.row_o4_3 = "1";
        } else if (o5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_3.setBackgroundColor(Color.GREEN);
            o5_3.setTextColor(Color.RED);
            PatternClassOnly.row_o5_3 = "1";
        }
        //ROW_4 B's
        if (b1_4.getText().toString().equals(textInputEditText.getText().toString())){
            b1_4.setBackgroundColor(Color.GREEN);
            b1_4.setTextColor(Color.RED);
            PatternClassOnly.row_b1_4 = "1";
        } else if (b2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_4.setBackgroundColor(Color.GREEN);
            b2_4.setTextColor(Color.RED);
            PatternClassOnly.row_b2_4 = "1";
        } else if (b3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_4.setBackgroundColor(Color.GREEN);
            b3_4.setTextColor(Color.RED);
            PatternClassOnly.row_b3_4 = "1";
        } else if (b4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_4.setBackgroundColor(Color.GREEN);
            b4_4.setTextColor(Color.RED);
            PatternClassOnly.row_b4_4 = "1";
        } else if (b5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_4.setBackgroundColor(Color.GREEN);
            b5_4.setTextColor(Color.RED);
            PatternClassOnly.row_b5_4 = "1";
        }
        //ROW_4 I's
        if (i1_4.getText().toString().equals(textInputEditText.getText().toString())){
            i1_4.setBackgroundColor(Color.GREEN);
            i1_4.setTextColor(Color.RED);
            PatternClassOnly.row_i1_4 = "1";
        } else if (i2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_4.setBackgroundColor(Color.GREEN);
            i2_4.setTextColor(Color.RED);
            PatternClassOnly.row_i2_4 = "1";
        } else if (i3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_4.setBackgroundColor(Color.GREEN);
            i3_4.setTextColor(Color.RED);
            PatternClassOnly.row_i3_4 = "1";
        } else if (i4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_4.setBackgroundColor(Color.GREEN);
            i4_4.setTextColor(Color.RED);
            PatternClassOnly.row_i4_4 = "1";
        } else if (i5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_4.setBackgroundColor(Color.GREEN);
            i5_4.setTextColor(Color.RED);
            PatternClassOnly.row_i5_4 = "1";
        }
        //ROW_4 N's
        if (n1_4.getText().toString().equals(textInputEditText.getText().toString())){
            n1_4.setBackgroundColor(Color.GREEN);
            n1_4.setTextColor(Color.RED);
            PatternClassOnly.row_n1_4 = "1";
        } else if (n2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_4.setBackgroundColor(Color.GREEN);
            n2_4.setTextColor(Color.RED);
            PatternClassOnly.row_n2_4 = "1";
        } else if (n4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_4.setBackgroundColor(Color.GREEN);
            n4_4.setTextColor(Color.RED);
            PatternClassOnly.row_n4_4 = "1";
        } else if (n5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_4.setBackgroundColor(Color.GREEN);
            n5_4.setTextColor(Color.RED);
            PatternClassOnly.row_n5_4 = "1";
        }

        //ROW_4 G's
        if (g1_4.getText().toString().equals(textInputEditText.getText().toString())){
            g1_4.setBackgroundColor(Color.GREEN);
            g1_4.setTextColor(Color.RED);
            PatternClassOnly.row_g1_4 = "1";
        } else if (g2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_4.setBackgroundColor(Color.GREEN);
            g2_4.setTextColor(Color.RED);
            PatternClassOnly.row_g2_4 = "1";
        } else if (g3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_4.setBackgroundColor(Color.GREEN);
            g3_4.setTextColor(Color.RED);
            PatternClassOnly.row_g3_4 = "1";
        } else if (g4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_4.setBackgroundColor(Color.GREEN);
            g4_4.setTextColor(Color.RED);
            PatternClassOnly.row_g4_4 = "1";
        } else if (g5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_4.setBackgroundColor(Color.GREEN);
            g5_4.setTextColor(Color.RED);
            PatternClassOnly.row_g5_4 = "1";
        }

        //ROW_4 O's
        if (o1_4.getText().toString().equals(textInputEditText.getText().toString())){
            o1_4.setBackgroundColor(Color.GREEN);
            o1_4.setTextColor(Color.RED);
            PatternClassOnly.row_o1_4 = "1";
        } else if (o2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_4.setBackgroundColor(Color.GREEN);
            o2_4.setTextColor(Color.RED);
            PatternClassOnly.row_o2_4 = "1";
        } else if (o3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_4.setBackgroundColor(Color.GREEN);
            o3_4.setTextColor(Color.RED);
            PatternClassOnly.row_o3_4 = "1";
        } else if (o4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_4.setBackgroundColor(Color.GREEN);
            o4_4.setTextColor(Color.RED);
            PatternClassOnly.row_o4_4 = "1";
        } else if (o5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_4.setBackgroundColor(Color.GREEN);
            o5_4.setTextColor(Color.RED);
            PatternClassOnly.row_o5_4 = "1";
        }
        //ROW_5 B's
        if (b1_5.getText().toString().equals(textInputEditText.getText().toString())){
            b1_5.setBackgroundColor(Color.GREEN);
            b1_5.setTextColor(Color.RED);
            PatternClassOnly.row_b1_5 = "1";
        } else if (b2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_5.setBackgroundColor(Color.GREEN);
            b2_5.setTextColor(Color.RED);
            PatternClassOnly.row_b2_5 = "1";
        } else if (b3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_5.setBackgroundColor(Color.GREEN);
            b3_5.setTextColor(Color.RED);
            PatternClassOnly.row_b3_5 = "1";
        } else if (b4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_5.setBackgroundColor(Color.GREEN);
            b4_5.setTextColor(Color.RED);
            PatternClassOnly.row_b4_5 = "1";
        } else if (b5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_5.setBackgroundColor(Color.GREEN);
            b5_5.setTextColor(Color.RED);
            PatternClassOnly.row_b5_5 = "1";
        }
        //ROW_5 I's
        if (i1_5.getText().toString().equals(textInputEditText.getText().toString())){
            i1_5.setBackgroundColor(Color.GREEN);
            i1_5.setTextColor(Color.RED);
            PatternClassOnly.row_i1_5 = "1";
        } else if (i2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_5.setBackgroundColor(Color.GREEN);
            i2_5.setTextColor(Color.RED);
            PatternClassOnly.row_i2_5 = "1";
        } else if (i3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_5.setBackgroundColor(Color.GREEN);
            i3_5.setTextColor(Color.RED);
            PatternClassOnly.row_i3_5 = "1";
        } else if (i4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_5.setBackgroundColor(Color.GREEN);
            i4_5.setTextColor(Color.RED);
            PatternClassOnly.row_i4_5 = "1";
        } else if (i5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_5.setBackgroundColor(Color.GREEN);
            i5_5.setTextColor(Color.RED);
            PatternClassOnly.row_i5_5 = "1";
        }
        //ROW_5 N's
        if (n1_5.getText().toString().equals(textInputEditText.getText().toString())){
            n1_5.setBackgroundColor(Color.GREEN);
            n1_5.setTextColor(Color.RED);
            PatternClassOnly.row_n1_5 = "1";
        } else if (n2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_5.setBackgroundColor(Color.GREEN);
            n2_5.setTextColor(Color.RED);
            PatternClassOnly.row_n2_5 = "1";
        } else if (n4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_5.setBackgroundColor(Color.GREEN);
            n4_5.setTextColor(Color.RED);
            PatternClassOnly.row_n4_5 = "1";
        } else if (n5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_5.setBackgroundColor(Color.GREEN);
            n5_5.setTextColor(Color.RED);
            PatternClassOnly.row_n5_5 = "1";
        }
        //ROW_5 G's
        if (g1_5.getText().toString().equals(textInputEditText.getText().toString())){
            g1_5.setBackgroundColor(Color.GREEN);
            g1_5.setTextColor(Color.RED);
            PatternClassOnly.row_g1_5 = "1";
        } else if (g2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_5.setBackgroundColor(Color.GREEN);
            g2_5.setTextColor(Color.RED);
            PatternClassOnly.row_g2_5 = "1";
        } else if (g3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_5.setBackgroundColor(Color.GREEN);
            g3_5.setTextColor(Color.RED);
            PatternClassOnly.row_g3_5 = "1";
        } else if (g4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_5.setBackgroundColor(Color.GREEN);
            g4_5.setTextColor(Color.RED);
            PatternClassOnly.row_g4_5 = "1";
        } else if (g5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_5.setBackgroundColor(Color.GREEN);
            g5_5.setTextColor(Color.RED);
            PatternClassOnly.row_g5_5 = "1";
        }
        //ROW_5 O's
        if (o1_5.getText().toString().equals(textInputEditText.getText().toString())){
            o1_5.setBackgroundColor(Color.GREEN);
            o1_5.setTextColor(Color.RED);
            PatternClassOnly.row_o1_5 = "1";
        } else if (o2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_5.setBackgroundColor(Color.GREEN);
            o2_5.setTextColor(Color.RED);
            PatternClassOnly.row_o2_5 = "1";
        } else if (o3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_5.setBackgroundColor(Color.GREEN);
            o3_5.setTextColor(Color.RED);
            PatternClassOnly.row_o3_5 = "1";
        } else if (o4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_5.setBackgroundColor(Color.GREEN);
            o4_5.setTextColor(Color.RED);
            PatternClassOnly.row_o4_5 = "1";
        } else if (o5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_5.setBackgroundColor(Color.GREEN);
            o5_5.setTextColor(Color.RED);
            PatternClassOnly.row_o5_5 = "1";
        }
        //ROW_6 B's
        if (b1_6.getText().toString().equals(textInputEditText.getText().toString())){
            b1_6.setBackgroundColor(Color.GREEN);
            b1_6.setTextColor(Color.RED);
            PatternClassOnly.row_b1_6 = "1";
        } else if (b2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_6.setBackgroundColor(Color.GREEN);
            b2_6.setTextColor(Color.RED);
            PatternClassOnly.row_b2_6 = "1";
        } else if (b3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_6.setBackgroundColor(Color.GREEN);
            b3_6.setTextColor(Color.RED);
            PatternClassOnly.row_b3_6 = "1";
        } else if (b4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_6.setBackgroundColor(Color.GREEN);
            b4_6.setTextColor(Color.RED);
            PatternClassOnly.row_b4_6 = "1";
        } else if (b5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_6.setBackgroundColor(Color.GREEN);
            b5_6.setTextColor(Color.RED);
            PatternClassOnly.row_b5_6 = "1";
        }
        //ROW_6 I's
        if (i1_6.getText().toString().equals(textInputEditText.getText().toString())){
            i1_6.setBackgroundColor(Color.GREEN);
            i1_6.setTextColor(Color.RED);
            PatternClassOnly.row_i1_6 = "1";
        } else if (i2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_6.setBackgroundColor(Color.GREEN);
            i2_6.setTextColor(Color.RED);
            PatternClassOnly.row_i2_6 = "1";
        } else if (i3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_6.setBackgroundColor(Color.GREEN);
            i3_6.setTextColor(Color.RED);
            PatternClassOnly.row_i3_6 = "1";
        } else if (i4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_6.setBackgroundColor(Color.GREEN);
            i4_6.setTextColor(Color.RED);
            PatternClassOnly.row_i4_6 = "1";
        } else if (i5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_6.setBackgroundColor(Color.GREEN);
            i5_6.setTextColor(Color.RED);
            PatternClassOnly.row_i5_6 = "1";
        }


        //ROW_6 N's
        if (n1_6.getText().toString().equals(textInputEditText.getText().toString())){
            n1_6.setBackgroundColor(Color.GREEN);
            n1_6.setTextColor(Color.RED);
            PatternClassOnly.row_n1_6 = "1";
        } else if (n2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_6.setBackgroundColor(Color.GREEN);
            n2_6.setTextColor(Color.RED);
            PatternClassOnly.row_n2_6 = "1";
        } else if (n4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_6.setBackgroundColor(Color.GREEN);
            n4_6.setTextColor(Color.RED);
            PatternClassOnly.row_n4_6 = "1";
        } else if (n5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_6.setBackgroundColor(Color.GREEN);
            n5_6.setTextColor(Color.RED);
            PatternClassOnly.row_n5_6 = "1";
        }

        //ROW_6 G's
        if (g1_6.getText().toString().equals(textInputEditText.getText().toString())){
            g1_6.setBackgroundColor(Color.GREEN);
            g1_6.setTextColor(Color.RED);
            PatternClassOnly.row_g1_6 = "1";
        } else if (g2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_6.setBackgroundColor(Color.GREEN);
            g2_6.setTextColor(Color.RED);
            PatternClassOnly.row_g2_6 = "1";
        } else if (g3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_6.setBackgroundColor(Color.GREEN);
            g3_6.setTextColor(Color.RED);
            PatternClassOnly.row_g3_6 = "1";
        } else if (g4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_6.setBackgroundColor(Color.GREEN);
            g4_6.setTextColor(Color.RED);
            PatternClassOnly.row_g4_6 = "1";
        } else if (g5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_6.setBackgroundColor(Color.GREEN);
            g5_6.setTextColor(Color.RED);
            PatternClassOnly.row_g5_6 = "1";
        }

        //ROW_6 O's
        if (o1_6.getText().toString().equals(textInputEditText.getText().toString())){
            o1_6.setBackgroundColor(Color.GREEN);
            o1_6.setTextColor(Color.RED);
            PatternClassOnly.row_o1_6 = "1";
        } else if (o2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_6.setBackgroundColor(Color.GREEN);
            o2_6.setTextColor(Color.RED);
            PatternClassOnly.row_o2_6 = "1";
        } else if (o3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_6.setBackgroundColor(Color.GREEN);
            o3_6.setTextColor(Color.RED);
            PatternClassOnly.row_o3_6 = "1";
        } else if (o4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_6.setBackgroundColor(Color.GREEN);
            o4_6.setTextColor(Color.RED);
            PatternClassOnly.row_o4_6 = "1";
        } else if (o5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_6.setBackgroundColor(Color.GREEN);
            o5_6.setTextColor(Color.RED);
            PatternClassOnly.row_o5_6 = "1";
        }
        //ROW_7 B's
        if (b1_7.getText().toString().equals(textInputEditText.getText().toString())){
            b1_7.setBackgroundColor(Color.GREEN);
            b1_7.setTextColor(Color.RED);
            PatternClassOnly.row_b1_7 = "1";
        } else if (b2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_7.setBackgroundColor(Color.GREEN);
            b2_7.setTextColor(Color.RED);
            PatternClassOnly.row_b2_7 = "1";
        } else if (b3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_7.setBackgroundColor(Color.GREEN);
            b3_7.setTextColor(Color.RED);
            PatternClassOnly.row_b3_7 = "1";
        } else if (b4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_7.setBackgroundColor(Color.GREEN);
            b4_7.setTextColor(Color.RED);
            PatternClassOnly.row_b4_7 = "1";
        } else if (b5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_7.setBackgroundColor(Color.GREEN);
            b5_7.setTextColor(Color.RED);
            PatternClassOnly.row_b5_7 = "1";
        }
        //ROW_7 I's
        if (i1_7.getText().toString().equals(textInputEditText.getText().toString())){
            i1_7.setBackgroundColor(Color.GREEN);
            i1_7.setTextColor(Color.RED);
            PatternClassOnly.row_i1_7 = "1";
        } else if (i2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_7.setBackgroundColor(Color.GREEN);
            i2_7.setTextColor(Color.RED);
            PatternClassOnly.row_i2_7 = "1";
        } else if (i3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_7.setBackgroundColor(Color.GREEN);
            i3_7.setTextColor(Color.RED);
            PatternClassOnly.row_i3_7 = "1";
        } else if (i4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_7.setBackgroundColor(Color.GREEN);
            i4_7.setTextColor(Color.RED);
            PatternClassOnly.row_i4_7 = "1";
        } else if (i5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_7.setBackgroundColor(Color.GREEN);
            i5_7.setTextColor(Color.RED);
            PatternClassOnly.row_i5_7 = "1";
        }


        //ROW_7 N's
        if (n1_7.getText().toString().equals(textInputEditText.getText().toString())){
            n1_7.setBackgroundColor(Color.GREEN);
            n1_7.setTextColor(Color.RED);
            PatternClassOnly.row_n1_7 = "1";
        } else if (n2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_7.setBackgroundColor(Color.GREEN);
            n2_7.setTextColor(Color.RED);
            PatternClassOnly.row_n2_7 = "1";
        } else if (n4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_7.setBackgroundColor(Color.GREEN);
            n4_7.setTextColor(Color.RED);
            PatternClassOnly.row_n4_7 = "1";
        } else if (n5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_7.setBackgroundColor(Color.GREEN);
            n5_7.setTextColor(Color.RED);
            PatternClassOnly.row_n5_7 = "1";
        }

        //ROW_7 G's
        if (g1_7.getText().toString().equals(textInputEditText.getText().toString())){
            g1_7.setBackgroundColor(Color.GREEN);
            g1_7.setTextColor(Color.RED);
            PatternClassOnly.row_g1_7 = "1";
        } else if (g2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_7.setBackgroundColor(Color.GREEN);
            g2_7.setTextColor(Color.RED);
            PatternClassOnly.row_g2_7 = "1";
        } else if (g3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_7.setBackgroundColor(Color.GREEN);
            g3_7.setTextColor(Color.RED);
            PatternClassOnly.row_g3_7 = "1";
        } else if (g4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_7.setBackgroundColor(Color.GREEN);
            g4_7.setTextColor(Color.RED);
            PatternClassOnly.row_g4_7 = "1";
        } else if (g5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_7.setBackgroundColor(Color.GREEN);
            g5_7.setTextColor(Color.RED);
            PatternClassOnly.row_g5_7 = "1";
        }

        //ROW_7 O's
        if (o1_7.getText().toString().equals(textInputEditText.getText().toString())){
            o1_7.setBackgroundColor(Color.GREEN);
            o1_7.setTextColor(Color.RED);
            PatternClassOnly.row_o1_7 = "1";
        } else if (o2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_7.setBackgroundColor(Color.GREEN);
            o2_7.setTextColor(Color.RED);
            PatternClassOnly.row_o2_7 = "1";
        } else if (o3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_7.setBackgroundColor(Color.GREEN);
            o3_7.setTextColor(Color.RED);
            PatternClassOnly.row_o3_7 = "1";
        } else if (o4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_7.setBackgroundColor(Color.GREEN);
            o4_7.setTextColor(Color.RED);
            PatternClassOnly.row_o4_7 = "1";
        } else if (o5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_7.setBackgroundColor(Color.GREEN);
            o5_7.setTextColor(Color.RED);
            PatternClassOnly.row_o5_7 = "1";
        }
        //ROW_8 B's
        if (b1_8.getText().toString().equals(textInputEditText.getText().toString())){
            b1_8.setBackgroundColor(Color.GREEN);
            b1_8.setTextColor(Color.RED);
            PatternClassOnly.row_b1_8 = "1";
        } else if (b2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_8.setBackgroundColor(Color.GREEN);
            b2_8.setTextColor(Color.RED);
            PatternClassOnly.row_b2_8 = "1";
        } else if (b3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_8.setBackgroundColor(Color.GREEN);
            b3_8.setTextColor(Color.RED);
            PatternClassOnly.row_b3_8 = "1";
        } else if (b4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_8.setBackgroundColor(Color.GREEN);
            b4_8.setTextColor(Color.RED);
            PatternClassOnly.row_b4_8 = "1";
        } else if (b5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_8.setBackgroundColor(Color.GREEN);
            b5_8.setTextColor(Color.RED);
            PatternClassOnly.row_b5_8 = "1";
        }
        //ROW_8 I's
        if (i1_8.getText().toString().equals(textInputEditText.getText().toString())){
            i1_8.setBackgroundColor(Color.GREEN);
            i1_8.setTextColor(Color.RED);
            PatternClassOnly.row_i1_8 = "1";
        } else if (i2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_8.setBackgroundColor(Color.GREEN);
            i2_8.setTextColor(Color.RED);
            PatternClassOnly.row_i2_8 = "1";
        } else if (i3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_8.setBackgroundColor(Color.GREEN);
            i3_8.setTextColor(Color.RED);
            PatternClassOnly.row_i3_8 = "1";
        } else if (i4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_8.setBackgroundColor(Color.GREEN);
            i4_8.setTextColor(Color.RED);
            PatternClassOnly.row_i4_8 = "1";
        } else if (i5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_8.setBackgroundColor(Color.GREEN);
            i5_8.setTextColor(Color.RED);
            PatternClassOnly.row_i5_8 = "1";
        }


        //ROW_8 N's
        if (n1_8.getText().toString().equals(textInputEditText.getText().toString())){
            n1_8.setBackgroundColor(Color.GREEN);
            n1_8.setTextColor(Color.RED);
            PatternClassOnly.row_n1_8 = "1";
        } else if (n2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_8.setBackgroundColor(Color.GREEN);
            n2_8.setTextColor(Color.RED);
            PatternClassOnly.row_n2_8 = "1";
        } else if (n4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_8.setBackgroundColor(Color.GREEN);
            n4_8.setTextColor(Color.RED);
            PatternClassOnly.row_n4_8 = "1";
        } else if (n5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_8.setBackgroundColor(Color.GREEN);
            n5_8.setTextColor(Color.RED);
            PatternClassOnly.row_n5_8 = "1";
        }

        //ROW_8 G's
        if (g1_8.getText().toString().equals(textInputEditText.getText().toString())){
            g1_8.setBackgroundColor(Color.GREEN);
            g1_8.setTextColor(Color.RED);
            PatternClassOnly.row_g1_8 = "1";
        } else if (g2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_8.setBackgroundColor(Color.GREEN);
            g2_8.setTextColor(Color.RED);
            PatternClassOnly.row_g2_8 = "1";
        } else if (g3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_8.setBackgroundColor(Color.GREEN);
            g3_8.setTextColor(Color.RED);
            PatternClassOnly.row_g3_8 = "1";
        } else if (g4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_8.setBackgroundColor(Color.GREEN);
            g4_8.setTextColor(Color.RED);
            PatternClassOnly.row_g4_8 = "1";
        } else if (g5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_8.setBackgroundColor(Color.GREEN);
            g5_8.setTextColor(Color.RED);
            PatternClassOnly.row_g5_8 = "1";
        }

        //ROW_8 O's
        if (o1_8.getText().toString().equals(textInputEditText.getText().toString())){
            o1_8.setBackgroundColor(Color.GREEN);
            o1_8.setTextColor(Color.RED);
            PatternClassOnly.row_o1_8 = "1";
        } else if (o2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_8.setBackgroundColor(Color.GREEN);
            o2_8.setTextColor(Color.RED);
            PatternClassOnly.row_o2_8 = "1";
        } else if (o3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_8.setBackgroundColor(Color.GREEN);
            o3_8.setTextColor(Color.RED);
            PatternClassOnly.row_o3_8 = "1";
        } else if (o4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_8.setBackgroundColor(Color.GREEN);
            o4_8.setTextColor(Color.RED);
            PatternClassOnly.row_o4_8 = "1";
        } else if (o5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_8.setBackgroundColor(Color.GREEN);
            o5_8.setTextColor(Color.RED);
            PatternClassOnly.row_o5_8 = "1";
        }
        //ROW_9 B's
        if (b1_9.getText().toString().equals(textInputEditText.getText().toString())){
            b1_9.setBackgroundColor(Color.GREEN);
            b1_9.setTextColor(Color.RED);
            PatternClassOnly.row_b1_9 = "1";
        } else if (b2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_9.setBackgroundColor(Color.GREEN);
            b2_9.setTextColor(Color.RED);
            PatternClassOnly.row_b2_9 = "1";
        } else if (b3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_9.setBackgroundColor(Color.GREEN);
            b3_9.setTextColor(Color.RED);
            PatternClassOnly.row_b3_9 = "1";
        } else if (b4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_9.setBackgroundColor(Color.GREEN);
            b4_9.setTextColor(Color.RED);
            PatternClassOnly.row_b4_9 = "1";
        } else if (b5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_9.setBackgroundColor(Color.GREEN);
            b5_9.setTextColor(Color.RED);
            PatternClassOnly.row_b5_9 = "1";
        }
        //ROW_9 I's
        if (i1_9.getText().toString().equals(textInputEditText.getText().toString())){
            i1_9.setBackgroundColor(Color.GREEN);
            i1_9.setTextColor(Color.RED);
            PatternClassOnly.row_i1_9 = "1";
        } else if (i2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_9.setBackgroundColor(Color.GREEN);
            i2_9.setTextColor(Color.RED);
            PatternClassOnly.row_i2_9 = "1";
        } else if (i3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_9.setBackgroundColor(Color.GREEN);
            i3_9.setTextColor(Color.RED);
            PatternClassOnly.row_i3_9 = "1";
        } else if (i4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_9.setBackgroundColor(Color.GREEN);
            i4_9.setTextColor(Color.RED);
            PatternClassOnly.row_i4_9 = "1";
        } else if (i5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_9.setBackgroundColor(Color.GREEN);
            i5_9.setTextColor(Color.RED);
            PatternClassOnly.row_i5_9 = "1";
        }


        //ROW_9 N's
        if (n1_9.getText().toString().equals(textInputEditText.getText().toString())){
            n1_9.setBackgroundColor(Color.GREEN);
            n1_9.setTextColor(Color.RED);
            PatternClassOnly.row_n1_9 = "1";
        } else if (n2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_9.setBackgroundColor(Color.GREEN);
            n2_9.setTextColor(Color.RED);
            PatternClassOnly.row_n2_9 = "1";
        } else if (n4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_9.setBackgroundColor(Color.GREEN);
            n4_9.setTextColor(Color.RED);
            PatternClassOnly.row_n4_9 = "1";
        } else if (n5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_9.setBackgroundColor(Color.GREEN);
            n5_9.setTextColor(Color.RED);
            PatternClassOnly.row_n5_9 = "1";
        }

        //ROW_9 G's
        if (g1_9.getText().toString().equals(textInputEditText.getText().toString())){
            g1_9.setBackgroundColor(Color.GREEN);
            g1_9.setTextColor(Color.RED);
            PatternClassOnly.row_g1_9 = "1";
        } else if (g2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_9.setBackgroundColor(Color.GREEN);
            g2_9.setTextColor(Color.RED);
            PatternClassOnly.row_g2_9 = "1";
        } else if (g3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_9.setBackgroundColor(Color.GREEN);
            g3_9.setTextColor(Color.RED);
            PatternClassOnly.row_g3_9 = "1";
        } else if (g4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_9.setBackgroundColor(Color.GREEN);
            g4_9.setTextColor(Color.RED);
            PatternClassOnly.row_g4_9 = "1";
        } else if (g5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_9.setBackgroundColor(Color.GREEN);
            g5_9.setTextColor(Color.RED);
            PatternClassOnly.row_g5_9 = "1";
        }

        //ROW_9 O's
        if (o1_9.getText().toString().equals(textInputEditText.getText().toString())){
            o1_9.setBackgroundColor(Color.GREEN);
            o1_9.setTextColor(Color.RED);
            PatternClassOnly.row_o1_9 = "1";
        } else if (o2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_9.setBackgroundColor(Color.GREEN);
            o2_9.setTextColor(Color.RED);
            PatternClassOnly.row_o2_9 = "1";
        } else if (o3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_9.setBackgroundColor(Color.GREEN);
            o3_9.setTextColor(Color.RED);
            PatternClassOnly.row_o3_9 = "1";
        } else if (o4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_9.setBackgroundColor(Color.GREEN);
            o4_9.setTextColor(Color.RED);
            PatternClassOnly.row_o4_9 = "1";
        } else if (o5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_9.setBackgroundColor(Color.GREEN);
            o5_9.setTextColor(Color.RED);
            PatternClassOnly.row_o5_9 = "1";
        }
        //ROW_10 B's
        if (b1_10.getText().toString().equals(textInputEditText.getText().toString())){
            b1_10.setBackgroundColor(Color.GREEN);
            b1_10.setTextColor(Color.RED);
            PatternClassOnly.row_b1_10 = "1";
        } else if (b2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_10.setBackgroundColor(Color.GREEN);
            b2_10.setTextColor(Color.RED);
            PatternClassOnly.row_b2_10 = "1";
        } else if (b3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_10.setBackgroundColor(Color.GREEN);
            b3_10.setTextColor(Color.RED);
            PatternClassOnly.row_b3_10 = "1";
        } else if (b4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_10.setBackgroundColor(Color.GREEN);
            b4_10.setTextColor(Color.RED);
            PatternClassOnly.row_b4_10 = "1";
        } else if (b5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_10.setBackgroundColor(Color.GREEN);
            b5_10.setTextColor(Color.RED);
            PatternClassOnly.row_b5_10 = "1";
        }
        //ROW_10 I's
        if (i1_10.getText().toString().equals(textInputEditText.getText().toString())){
            i1_10.setBackgroundColor(Color.GREEN);
            i1_10.setTextColor(Color.RED);
            PatternClassOnly.row_i1_10 = "1";
        } else if (i2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_10.setBackgroundColor(Color.GREEN);
            i2_10.setTextColor(Color.RED);
            PatternClassOnly.row_i2_10 = "1";
        } else if (i3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_10.setBackgroundColor(Color.GREEN);
            i3_10.setTextColor(Color.RED);
            PatternClassOnly.row_i3_10 = "1";
        } else if (i4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_10.setBackgroundColor(Color.GREEN);
            i4_10.setTextColor(Color.RED);
            PatternClassOnly.row_i4_10 = "1";
        } else if (i5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_10.setBackgroundColor(Color.GREEN);
            i5_10.setTextColor(Color.RED);
            PatternClassOnly.row_i5_10 = "1";
        }


        //ROW_10 N's
        if (n1_10.getText().toString().equals(textInputEditText.getText().toString())){
            n1_10.setBackgroundColor(Color.GREEN);
            n1_10.setTextColor(Color.RED);
            PatternClassOnly.row_n1_10 = "1";
        } else if (n2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_10.setBackgroundColor(Color.GREEN);
            n2_10.setTextColor(Color.RED);
            PatternClassOnly.row_n2_10 = "1";
        } else if (n4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_10.setBackgroundColor(Color.GREEN);
            n4_10.setTextColor(Color.RED);
            PatternClassOnly.row_n4_10 = "1";
        } else if (n5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_10.setBackgroundColor(Color.GREEN);
            n5_10.setTextColor(Color.RED);
            PatternClassOnly.row_n5_10 = "1";
        }

        //ROW_10 G's
        if (g1_10.getText().toString().equals(textInputEditText.getText().toString())){
            g1_10.setBackgroundColor(Color.GREEN);
            g1_10.setTextColor(Color.RED);
            PatternClassOnly.row_g1_10 = "1";
        } else if (g2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_10.setBackgroundColor(Color.GREEN);
            g2_10.setTextColor(Color.RED);
            PatternClassOnly.row_g2_10 = "1";
        } else if (g3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_10.setBackgroundColor(Color.GREEN);
            g3_10.setTextColor(Color.RED);
            PatternClassOnly.row_g3_10 = "1";
        } else if (g4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_10.setBackgroundColor(Color.GREEN);
            g4_10.setTextColor(Color.RED);
            PatternClassOnly.row_g4_10 = "1";
        } else if (g5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_10.setBackgroundColor(Color.GREEN);
            g5_10.setTextColor(Color.RED);
            PatternClassOnly.row_g5_10 = "1";
        }

        //ROW_10 O's
        if (o1_10.getText().toString().equals(textInputEditText.getText().toString())){
            o1_10.setBackgroundColor(Color.GREEN);
            o1_10.setTextColor(Color.RED);
            PatternClassOnly.row_o1_10 = "1";
        } else if (o2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_10.setBackgroundColor(Color.GREEN);
            o2_10.setTextColor(Color.RED);
            PatternClassOnly.row_o2_10 = "1";
        } else if (o3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_10.setBackgroundColor(Color.GREEN);
            o3_10.setTextColor(Color.RED);
            PatternClassOnly.row_o3_10 = "1";
        } else if (o4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_10.setBackgroundColor(Color.GREEN);
            o4_10.setTextColor(Color.RED);
            PatternClassOnly.row_o4_10 = "1";
        } else if (o5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_10.setBackgroundColor(Color.GREEN);
            o5_10.setTextColor(Color.RED);
            PatternClassOnly.row_o5_10 = "1";
        }
    }
    void AllCardsNotEquals(){

        //ROW 1 B's
        if (b1_1.getText().toString().equals(textInputEditText.getText().toString())){
            b1_1.setBackgroundColor(Color.TRANSPARENT);
            b1_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_1 = "0";
        } else if (b2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_1.setBackgroundColor(Color.TRANSPARENT);
            b2_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_1 = "0";
        } else if (b3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_1.setBackgroundColor(Color.TRANSPARENT);
            b3_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_1 = "0";
        } else if (b4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_1.setBackgroundColor(Color.TRANSPARENT);
            b4_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_1 = "0";
        } else if (b5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_1.setBackgroundColor(Color.TRANSPARENT);
            b5_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_1 = "0";
        }

        //ROW 1 I's
        if (i1_1.getText().toString().equals(textInputEditText.getText().toString())){
            i1_1.setBackgroundColor(Color.TRANSPARENT);
            i1_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_1 = "0";
        } else if (i2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_1.setBackgroundColor(Color.TRANSPARENT);
            i2_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_1 = "0";
        } else if (i3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_1.setBackgroundColor(Color.TRANSPARENT);
            i3_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_1 = "0";
        } else if (i4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_1.setBackgroundColor(Color.TRANSPARENT);
            i4_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_1 = "0";
        } else if (i5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_1.setBackgroundColor(Color.TRANSPARENT);
            i5_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_1 = "0";
        }


        //ROW 1 N's
        if (n1_1.getText().toString().equals(textInputEditText.getText().toString())){
            n1_1.setBackgroundColor(Color.TRANSPARENT);
            n1_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_1 = "0";
        } else if (n2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_1.setBackgroundColor(Color.TRANSPARENT);
            n2_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_1 = "0";
        } else if (n4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_1.setBackgroundColor(Color.TRANSPARENT);
            n4_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_1 = "0";
        } else if (n5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_1.setBackgroundColor(Color.TRANSPARENT);
            n5_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_1 = "0";
        }

        //ROW 1 G's
        if (g1_1.getText().toString().equals(textInputEditText.getText().toString())){
            g1_1.setBackgroundColor(Color.TRANSPARENT);
            g1_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_1 = "0";
        } else if (g2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_1.setBackgroundColor(Color.TRANSPARENT);
            g2_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_1 = "0";
        } else if (g3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_1.setBackgroundColor(Color.TRANSPARENT);
            g3_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_1 = "0";
        } else if (g4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_1.setBackgroundColor(Color.TRANSPARENT);
            g4_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_1 = "0";
        } else if (g5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_1.setBackgroundColor(Color.TRANSPARENT);
            g5_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_1 = "0";
        }

        //ROW 1 O's
        if (o1_1.getText().toString().equals(textInputEditText.getText().toString())){
            o1_1.setBackgroundColor(Color.TRANSPARENT);
            o1_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_1 = "0";
        } else if (o2_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_1.setBackgroundColor(Color.TRANSPARENT);
            o2_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_1 = "0";
        } else if (o3_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_1.setBackgroundColor(Color.TRANSPARENT);
            o3_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_1 = "0";
        } else if (o4_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_1.setBackgroundColor(Color.TRANSPARENT);
            o4_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_1 = "0";
        } else if (o5_1.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_1.setBackgroundColor(Color.TRANSPARENT);
            o5_1.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_1 = "0";
        }


        //ROW 2 B's
        if (b1_2.getText().toString().equals(textInputEditText.getText().toString())){
            b1_2.setBackgroundColor(Color.TRANSPARENT);
            b1_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_2 = "0";
        } else if (b2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_2.setBackgroundColor(Color.TRANSPARENT);
            b2_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_2 = "0";
        } else if (b3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_2.setBackgroundColor(Color.TRANSPARENT);
            b3_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_2 = "0";
        } else if (b4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_2.setBackgroundColor(Color.TRANSPARENT);
            b4_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_2 = "0";
        } else if (b5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_2.setBackgroundColor(Color.TRANSPARENT);
            b5_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_2 = "0";
        }
        //ROW 2 I's
        if (i1_2.getText().toString().equals(textInputEditText.getText().toString())){
            i1_2.setBackgroundColor(Color.TRANSPARENT);
            i1_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_2 = "0";
        } else if (i2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_2.setBackgroundColor(Color.TRANSPARENT);
            i2_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_2 = "0";
        } else if (i3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_2.setBackgroundColor(Color.TRANSPARENT);
            i3_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_2 = "0";
        } else if (i4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_2.setBackgroundColor(Color.TRANSPARENT);
            i4_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_2 = "0";
        } else if (i5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_2.setBackgroundColor(Color.TRANSPARENT);
            i5_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_2 = "0";
        }


        //ROW 2 N's
        if (n1_2.getText().toString().equals(textInputEditText.getText().toString())){
            n1_2.setBackgroundColor(Color.TRANSPARENT);
            n1_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_2 = "0";
        } else if (n2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_2.setBackgroundColor(Color.TRANSPARENT);
            n2_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_2 = "0";
        } else if (n4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_2.setBackgroundColor(Color.TRANSPARENT);
            n4_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_2 = "0";
        } else if (n5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_2.setBackgroundColor(Color.TRANSPARENT);
            n5_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_2 = "0";
        }

        //ROW 2 G's
        if (g1_2.getText().toString().equals(textInputEditText.getText().toString())){
            g1_2.setBackgroundColor(Color.TRANSPARENT);
            g1_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_2 = "0";
        } else if (g2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_2.setBackgroundColor(Color.TRANSPARENT);
            g2_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_2 = "0";
        } else if (g3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_2.setBackgroundColor(Color.TRANSPARENT);
            g3_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_2 = "0";
        } else if (g4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_2.setBackgroundColor(Color.TRANSPARENT);
            g4_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_2 = "0";
        } else if (g5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_2.setBackgroundColor(Color.TRANSPARENT);
            g5_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_2 = "0";
        }

        //ROW 2 O's
        if (o1_2.getText().toString().equals(textInputEditText.getText().toString())){
            o1_2.setBackgroundColor(Color.TRANSPARENT);
            o1_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_2 = "0";
        } else if (o2_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_2.setBackgroundColor(Color.TRANSPARENT);
            o2_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_2 = "0";
        } else if (o3_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_2.setBackgroundColor(Color.TRANSPARENT);
            o3_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_2 = "0";
        } else if (o4_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_2.setBackgroundColor(Color.TRANSPARENT);
            o4_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_2 = "0";
        } else if (o5_2.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_2.setBackgroundColor(Color.TRANSPARENT);
            o5_2.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_2 = "0";
        }

        //ROW 3 B's
        if (b1_3.getText().toString().equals(textInputEditText.getText().toString())){
            b1_3.setBackgroundColor(Color.TRANSPARENT);
            b1_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_3 = "0";
        } else if (b2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_3.setBackgroundColor(Color.TRANSPARENT);
            b2_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_3 = "0";
        } else if (b3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_3.setBackgroundColor(Color.TRANSPARENT);
            b3_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_3 = "0";
        } else if (b4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_3.setBackgroundColor(Color.TRANSPARENT);
            b4_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_3 = "0";
        } else if (b5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_3.setBackgroundColor(Color.TRANSPARENT);
            b5_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_3 = "0";
        }
        //ROW 3 I's
        if (i1_3.getText().toString().equals(textInputEditText.getText().toString())){
            i1_3.setBackgroundColor(Color.TRANSPARENT);
            i1_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_3 = "0";
        } else if (i2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_3.setBackgroundColor(Color.TRANSPARENT);
            i2_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_3 = "0";
        } else if (i3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_3.setBackgroundColor(Color.TRANSPARENT);
            i3_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_3 = "0";
        } else if (i4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_3.setBackgroundColor(Color.TRANSPARENT);
            i4_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_3 = "0";
        } else if (i5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_3.setBackgroundColor(Color.TRANSPARENT);
            i5_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_3 = "0";
        }


        //ROW 3 N's
        if (n1_3.getText().toString().equals(textInputEditText.getText().toString())){
            n1_3.setBackgroundColor(Color.TRANSPARENT);
            n1_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_3 = "0";
        } else if (n2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_3.setBackgroundColor(Color.TRANSPARENT);
            n2_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_3 = "0";
        } else if (n4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_3.setBackgroundColor(Color.TRANSPARENT);
            n4_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_3 = "0";
        } else if (n5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_3.setBackgroundColor(Color.TRANSPARENT);
            n5_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_3 = "0";
        }

        //ROW 3 G's
        if (g1_3.getText().toString().equals(textInputEditText.getText().toString())){
            g1_3.setBackgroundColor(Color.TRANSPARENT);
            g1_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_3 = "0";
        } else if (g2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_3.setBackgroundColor(Color.TRANSPARENT);
            g2_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_3 = "0";
        } else if (g3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_3.setBackgroundColor(Color.TRANSPARENT);
            g3_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_3 = "0";
        } else if (g4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_3.setBackgroundColor(Color.TRANSPARENT);
            g4_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_3 = "0";
        } else if (g5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_3.setBackgroundColor(Color.TRANSPARENT);
            g5_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_3 = "0";
        }

        //ROW 3 O's
        if (o1_3.getText().toString().equals(textInputEditText.getText().toString())){
            o1_3.setBackgroundColor(Color.TRANSPARENT);
            o1_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_3 = "0";
        } else if (o2_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_3.setBackgroundColor(Color.TRANSPARENT);
            o2_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_3 = "0";
        } else if (o3_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_3.setBackgroundColor(Color.TRANSPARENT);
            o3_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_3 = "0";
        } else if (o4_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_3.setBackgroundColor(Color.TRANSPARENT);
            o4_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_3 = "0";
        } else if (o5_3.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_3.setBackgroundColor(Color.TRANSPARENT);
            o5_3.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_3 = "0";
        }
        //ROW_4 B's
        if (b1_4.getText().toString().equals(textInputEditText.getText().toString())){
            b1_4.setBackgroundColor(Color.TRANSPARENT);
            b1_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_4 = "0";
        } else if (b2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_4.setBackgroundColor(Color.TRANSPARENT);
            b2_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_4 = "0";
        } else if (b3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_4.setBackgroundColor(Color.TRANSPARENT);
            b3_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_4 = "0";
        } else if (b4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_4.setBackgroundColor(Color.TRANSPARENT);
            b4_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_4 = "0";
        } else if (b5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_4.setBackgroundColor(Color.TRANSPARENT);
            b5_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_4 = "0";
        }
        //ROW_4 I's
        if (i1_4.getText().toString().equals(textInputEditText.getText().toString())){
            i1_4.setBackgroundColor(Color.TRANSPARENT);
            i1_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_4 = "0";
        } else if (i2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_4.setBackgroundColor(Color.TRANSPARENT);
            i2_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_4 = "0";
        } else if (i3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_4.setBackgroundColor(Color.TRANSPARENT);
            i3_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_4 = "0";
        } else if (i4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_4.setBackgroundColor(Color.TRANSPARENT);
            i4_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_4 = "0";
        } else if (i5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_4.setBackgroundColor(Color.TRANSPARENT);
            i5_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_4 = "0";
        }
        //ROW_4 N's
        if (n1_4.getText().toString().equals(textInputEditText.getText().toString())){
            n1_4.setBackgroundColor(Color.TRANSPARENT);
            n1_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_4 = "0";
        } else if (n2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_4.setBackgroundColor(Color.TRANSPARENT);
            n2_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_4 = "0";
        } else if (n4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_4.setBackgroundColor(Color.TRANSPARENT);
            n4_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_4 = "0";
        } else if (n5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_4.setBackgroundColor(Color.TRANSPARENT);
            n5_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_4 = "0";
        }

        //ROW_4 G's
        if (g1_4.getText().toString().equals(textInputEditText.getText().toString())){
            g1_4.setBackgroundColor(Color.TRANSPARENT);
            g1_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_4 = "0";
        } else if (g2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_4.setBackgroundColor(Color.TRANSPARENT);
            g2_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_4 = "0";
        } else if (g3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_4.setBackgroundColor(Color.TRANSPARENT);
            g3_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_4 = "0";
        } else if (g4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_4.setBackgroundColor(Color.TRANSPARENT);
            g4_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_4 = "0";
        } else if (g5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_4.setBackgroundColor(Color.TRANSPARENT);
            g5_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_4 = "0";
        }

        //ROW_4 O's
        if (o1_4.getText().toString().equals(textInputEditText.getText().toString())){
            o1_4.setBackgroundColor(Color.TRANSPARENT);
            o1_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_4 = "0";
        } else if (o2_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_4.setBackgroundColor(Color.TRANSPARENT);
            o2_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_4 = "0";
        } else if (o3_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_4.setBackgroundColor(Color.TRANSPARENT);
            o3_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_4 = "0";
        } else if (o4_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_4.setBackgroundColor(Color.TRANSPARENT);
            o4_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_4 = "0";
        } else if (o5_4.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_4.setBackgroundColor(Color.TRANSPARENT);
            o5_4.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_4 = "0";
        }
        //ROW_5 B's
        if (b1_5.getText().toString().equals(textInputEditText.getText().toString())){
            b1_5.setBackgroundColor(Color.TRANSPARENT);
            b1_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_5 = "0";
        } else if (b2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_5.setBackgroundColor(Color.TRANSPARENT);
            b2_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_5 = "0";
        } else if (b3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_5.setBackgroundColor(Color.TRANSPARENT);
            b3_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_5 = "0";
        } else if (b4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_5.setBackgroundColor(Color.TRANSPARENT);
            b4_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_5 = "0";
        } else if (b5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_5.setBackgroundColor(Color.TRANSPARENT);
            b5_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_5 = "0";
        }
        //ROW_5 I's
        if (i1_5.getText().toString().equals(textInputEditText.getText().toString())){
            i1_5.setBackgroundColor(Color.TRANSPARENT);
            i1_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_5 = "0";
        } else if (i2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_5.setBackgroundColor(Color.TRANSPARENT);
            i2_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_5 = "0";
        } else if (i3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_5.setBackgroundColor(Color.TRANSPARENT);
            i3_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_5 = "0";
        } else if (i4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_5.setBackgroundColor(Color.TRANSPARENT);
            i4_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_5 = "0";
        } else if (i5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_5.setBackgroundColor(Color.TRANSPARENT);
            i5_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_5 = "0";
        }
        //ROW_5 N's
        if (n1_5.getText().toString().equals(textInputEditText.getText().toString())){
            n1_5.setBackgroundColor(Color.TRANSPARENT);
            n1_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_5 = "0";
        } else if (n2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_5.setBackgroundColor(Color.TRANSPARENT);
            n2_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_5 = "0";
        } else if (n4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_5.setBackgroundColor(Color.TRANSPARENT);
            n4_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_5 = "0";
        } else if (n5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_5.setBackgroundColor(Color.TRANSPARENT);
            n5_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_5 = "0";
        }
        //ROW_5 G's
        if (g1_5.getText().toString().equals(textInputEditText.getText().toString())){
            g1_5.setBackgroundColor(Color.TRANSPARENT);
            g1_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_5 = "0";
        } else if (g2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_5.setBackgroundColor(Color.TRANSPARENT);
            g2_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_5 = "0";
        } else if (g3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_5.setBackgroundColor(Color.TRANSPARENT);
            g3_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_5 = "0";
        } else if (g4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_5.setBackgroundColor(Color.TRANSPARENT);
            g4_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_5 = "0";
        } else if (g5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_5.setBackgroundColor(Color.TRANSPARENT);
            g5_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_5 = "0";
        }
        //ROW_5 O's
        if (o1_5.getText().toString().equals(textInputEditText.getText().toString())){
            o1_5.setBackgroundColor(Color.TRANSPARENT);
            o1_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_5 = "0";
        } else if (o2_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_5.setBackgroundColor(Color.TRANSPARENT);
            o2_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_5 = "0";
        } else if (o3_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_5.setBackgroundColor(Color.TRANSPARENT);
            o3_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_5 = "0";
        } else if (o4_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_5.setBackgroundColor(Color.TRANSPARENT);
            o4_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_5 = "0";
        } else if (o5_5.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_5.setBackgroundColor(Color.TRANSPARENT);
            o5_5.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_5 = "0";
        }
        //ROW_6 B's
        if (b1_6.getText().toString().equals(textInputEditText.getText().toString())){
            b1_6.setBackgroundColor(Color.TRANSPARENT);
            b1_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_6 = "0";
        } else if (b2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_6.setBackgroundColor(Color.TRANSPARENT);
            b2_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_6 = "0";
        } else if (b3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_6.setBackgroundColor(Color.TRANSPARENT);
            b3_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_6 = "0";
        } else if (b4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_6.setBackgroundColor(Color.TRANSPARENT);
            b4_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_6 = "0";
        } else if (b5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_6.setBackgroundColor(Color.TRANSPARENT);
            b5_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_6 = "0";
        }
        //ROW_6 I's
        if (i1_6.getText().toString().equals(textInputEditText.getText().toString())){
            i1_6.setBackgroundColor(Color.TRANSPARENT);
            i1_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_6 = "0";
        } else if (i2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_6.setBackgroundColor(Color.TRANSPARENT);
            i2_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_6 = "0";
        } else if (i3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_6.setBackgroundColor(Color.TRANSPARENT);
            i3_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_6 = "0";
        } else if (i4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_6.setBackgroundColor(Color.TRANSPARENT);
            i4_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_6 = "0";
        } else if (i5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_6.setBackgroundColor(Color.TRANSPARENT);
            i5_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_6 = "0";
        }


        //ROW_6 N's
        if (n1_6.getText().toString().equals(textInputEditText.getText().toString())){
            n1_6.setBackgroundColor(Color.TRANSPARENT);
            n1_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_6 = "0";
        } else if (n2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_6.setBackgroundColor(Color.TRANSPARENT);
            n2_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_6 = "0";
        } else if (n4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_6.setBackgroundColor(Color.TRANSPARENT);
            n4_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_6 = "0";
        } else if (n5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_6.setBackgroundColor(Color.TRANSPARENT);
            n5_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_6 = "0";
        }

        //ROW_6 G's
        if (g1_6.getText().toString().equals(textInputEditText.getText().toString())){
            g1_6.setBackgroundColor(Color.TRANSPARENT);
            g1_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_6 = "0";
        } else if (g2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_6.setBackgroundColor(Color.TRANSPARENT);
            g2_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_6 = "0";
        } else if (g3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_6.setBackgroundColor(Color.TRANSPARENT);
            g3_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_6 = "0";
        } else if (g4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_6.setBackgroundColor(Color.TRANSPARENT);
            g4_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_6 = "0";
        } else if (g5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_6.setBackgroundColor(Color.TRANSPARENT);
            g5_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_6 = "0";
        }

        //ROW_6 O's
        if (o1_6.getText().toString().equals(textInputEditText.getText().toString())){
            o1_6.setBackgroundColor(Color.TRANSPARENT);
            o1_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_6 = "0";
        } else if (o2_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_6.setBackgroundColor(Color.TRANSPARENT);
            o2_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_6 = "0";
        } else if (o3_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_6.setBackgroundColor(Color.TRANSPARENT);
            o3_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_6 = "0";
        } else if (o4_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_6.setBackgroundColor(Color.TRANSPARENT);
            o4_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_6 = "0";
        } else if (o5_6.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_6.setBackgroundColor(Color.TRANSPARENT);
            o5_6.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_6 = "0";
        }
        //ROW_7 B's
        if (b1_7.getText().toString().equals(textInputEditText.getText().toString())){
            b1_7.setBackgroundColor(Color.TRANSPARENT);
            b1_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_7 = "0";
        } else if (b2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_7.setBackgroundColor(Color.TRANSPARENT);
            b2_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_7 = "0";
        } else if (b3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_7.setBackgroundColor(Color.TRANSPARENT);
            b3_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_7 = "0";
        } else if (b4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_7.setBackgroundColor(Color.TRANSPARENT);
            b4_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_7 = "0";
        } else if (b5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_7.setBackgroundColor(Color.TRANSPARENT);
            b5_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_7 = "0";
        }
        //ROW_7 I's
        if (i1_7.getText().toString().equals(textInputEditText.getText().toString())){
            i1_7.setBackgroundColor(Color.TRANSPARENT);
            i1_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_7 = "0";
        } else if (i2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_7.setBackgroundColor(Color.TRANSPARENT);
            i2_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_7 = "0";
        } else if (i3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_7.setBackgroundColor(Color.TRANSPARENT);
            i3_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_7 = "0";
        } else if (i4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_7.setBackgroundColor(Color.TRANSPARENT);
            i4_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_7 = "0";
        } else if (i5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_7.setBackgroundColor(Color.TRANSPARENT);
            i5_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_7 = "0";
        }


        //ROW_7 N's
        if (n1_7.getText().toString().equals(textInputEditText.getText().toString())){
            n1_7.setBackgroundColor(Color.TRANSPARENT);
            n1_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_7 = "0";
        } else if (n2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_7.setBackgroundColor(Color.TRANSPARENT);
            n2_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_7 = "0";
        } else if (n4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_7.setBackgroundColor(Color.TRANSPARENT);
            n4_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_7 = "0";
        } else if (n5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_7.setBackgroundColor(Color.TRANSPARENT);
            n5_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_7 = "0";
        }

        //ROW_7 G's
        if (g1_7.getText().toString().equals(textInputEditText.getText().toString())){
            g1_7.setBackgroundColor(Color.TRANSPARENT);
            g1_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_7 = "0";
        } else if (g2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_7.setBackgroundColor(Color.TRANSPARENT);
            g2_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_7 = "0";
        } else if (g3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_7.setBackgroundColor(Color.TRANSPARENT);
            g3_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_7 = "0";
        } else if (g4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_7.setBackgroundColor(Color.TRANSPARENT);
            g4_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_7 = "0";
        } else if (g5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_7.setBackgroundColor(Color.TRANSPARENT);
            g5_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_7 = "0";
        }

        //ROW_7 O's
        if (o1_7.getText().toString().equals(textInputEditText.getText().toString())){
            o1_7.setBackgroundColor(Color.TRANSPARENT);
            o1_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_7 = "0";
        } else if (o2_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_7.setBackgroundColor(Color.TRANSPARENT);
            o2_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_7 = "0";
        } else if (o3_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_7.setBackgroundColor(Color.TRANSPARENT);
            o3_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_7 = "0";
        } else if (o4_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_7.setBackgroundColor(Color.TRANSPARENT);
            o4_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_7 = "0";
        } else if (o5_7.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_7.setBackgroundColor(Color.TRANSPARENT);
            o5_7.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_7 = "0";
        }
        //ROW_8 B's
        if (b1_8.getText().toString().equals(textInputEditText.getText().toString())){
            b1_8.setBackgroundColor(Color.TRANSPARENT);
            b1_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_8 = "0";
        } else if (b2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_8.setBackgroundColor(Color.TRANSPARENT);
            b2_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_8 = "0";
        } else if (b3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_8.setBackgroundColor(Color.TRANSPARENT);
            b3_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_8 = "0";
        } else if (b4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_8.setBackgroundColor(Color.TRANSPARENT);
            b4_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_8 = "0";
        } else if (b5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_8.setBackgroundColor(Color.TRANSPARENT);
            b5_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_8 = "0";
        }
        //ROW_8 I's
        if (i1_8.getText().toString().equals(textInputEditText.getText().toString())){
            i1_8.setBackgroundColor(Color.TRANSPARENT);
            i1_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_8 = "0";
        } else if (i2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_8.setBackgroundColor(Color.TRANSPARENT);
            i2_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_8 = "0";
        } else if (i3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_8.setBackgroundColor(Color.TRANSPARENT);
            i3_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_8 = "0";
        } else if (i4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_8.setBackgroundColor(Color.TRANSPARENT);
            i4_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_8 = "0";
        } else if (i5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_8.setBackgroundColor(Color.TRANSPARENT);
            i5_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_8 = "0";
        }


        //ROW_8 N's
        if (n1_8.getText().toString().equals(textInputEditText.getText().toString())){
            n1_8.setBackgroundColor(Color.TRANSPARENT);
            n1_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_8 = "0";
        } else if (n2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_8.setBackgroundColor(Color.TRANSPARENT);
            n2_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_8 = "0";
        } else if (n4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_8.setBackgroundColor(Color.TRANSPARENT);
            n4_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_8 = "0";
        } else if (n5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_8.setBackgroundColor(Color.TRANSPARENT);
            n5_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_8 = "0";
        }

        //ROW_8 G's
        if (g1_8.getText().toString().equals(textInputEditText.getText().toString())){
            g1_8.setBackgroundColor(Color.TRANSPARENT);
            g1_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_8 = "0";
        } else if (g2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_8.setBackgroundColor(Color.TRANSPARENT);
            g2_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_8 = "0";
        } else if (g3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_8.setBackgroundColor(Color.TRANSPARENT);
            g3_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_8 = "0";
        } else if (g4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_8.setBackgroundColor(Color.TRANSPARENT);
            g4_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_8 = "0";
        } else if (g5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_8.setBackgroundColor(Color.TRANSPARENT);
            g5_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_8 = "0";
        }

        //ROW_8 O's
        if (o1_8.getText().toString().equals(textInputEditText.getText().toString())){
            o1_8.setBackgroundColor(Color.TRANSPARENT);
            o1_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_8 = "0";
        } else if (o2_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_8.setBackgroundColor(Color.TRANSPARENT);
            o2_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_8 = "0";
        } else if (o3_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_8.setBackgroundColor(Color.TRANSPARENT);
            o3_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_8 = "0";
        } else if (o4_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_8.setBackgroundColor(Color.TRANSPARENT);
            o4_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_8 = "0";
        } else if (o5_8.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_8.setBackgroundColor(Color.TRANSPARENT);
            o5_8.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_8 = "0";
        }
        //ROW_9 B's
        if (b1_9.getText().toString().equals(textInputEditText.getText().toString())){
            b1_9.setBackgroundColor(Color.TRANSPARENT);
            b1_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_9 = "0";
        } else if (b2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_9.setBackgroundColor(Color.TRANSPARENT);
            b2_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_9 = "0";
        } else if (b3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_9.setBackgroundColor(Color.TRANSPARENT);
            b3_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_9 = "0";
        } else if (b4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_9.setBackgroundColor(Color.TRANSPARENT);
            b4_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_9 = "0";
        } else if (b5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_9.setBackgroundColor(Color.TRANSPARENT);
            b5_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_9 = "0";
        }
        //ROW_9 I's
        if (i1_9.getText().toString().equals(textInputEditText.getText().toString())){
            i1_9.setBackgroundColor(Color.TRANSPARENT);
            i1_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_9 = "0";
        } else if (i2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_9.setBackgroundColor(Color.TRANSPARENT);
            i2_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_9 = "0";
        } else if (i3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_9.setBackgroundColor(Color.TRANSPARENT);
            i3_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_9 = "0";
        } else if (i4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_9.setBackgroundColor(Color.TRANSPARENT);
            i4_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_9 = "0";
        } else if (i5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_9.setBackgroundColor(Color.TRANSPARENT);
            i5_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_9 = "0";
        }


        //ROW_9 N's
        if (n1_9.getText().toString().equals(textInputEditText.getText().toString())){
            n1_9.setBackgroundColor(Color.TRANSPARENT);
            n1_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_9 = "0";
        } else if (n2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_9.setBackgroundColor(Color.TRANSPARENT);
            n2_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_9 = "0";
        } else if (n4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_9.setBackgroundColor(Color.TRANSPARENT);
            n4_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_9 = "0";
        } else if (n5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_9.setBackgroundColor(Color.TRANSPARENT);
            n5_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_9 = "0";
        }

        //ROW_9 G's
        if (g1_9.getText().toString().equals(textInputEditText.getText().toString())){
            g1_9.setBackgroundColor(Color.TRANSPARENT);
            g1_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_9 = "0";
        } else if (g2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_9.setBackgroundColor(Color.TRANSPARENT);
            g2_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_9 = "0";
        } else if (g3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_9.setBackgroundColor(Color.TRANSPARENT);
            g3_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_9 = "0";
        } else if (g4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_9.setBackgroundColor(Color.TRANSPARENT);
            g4_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_9 = "0";
        } else if (g5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_9.setBackgroundColor(Color.TRANSPARENT);
            g5_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_9 = "0";
        }

        //ROW_9 O's
        if (o1_9.getText().toString().equals(textInputEditText.getText().toString())){
            o1_9.setBackgroundColor(Color.TRANSPARENT);
            o1_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_9 = "0";
        } else if (o2_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_9.setBackgroundColor(Color.TRANSPARENT);
            o2_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_9 = "0";
        } else if (o3_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_9.setBackgroundColor(Color.TRANSPARENT);
            o3_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_9 = "0";
        } else if (o4_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_9.setBackgroundColor(Color.TRANSPARENT);
            o4_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_9 = "0";
        } else if (o5_9.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_9.setBackgroundColor(Color.TRANSPARENT);
            o5_9.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_9 = "0";
        }
        //ROW_10 B's
        if (b1_10.getText().toString().equals(textInputEditText.getText().toString())){
            b1_10.setBackgroundColor(Color.TRANSPARENT);
            b1_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_b1_10 = "0";
        } else if (b2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b2_10.setBackgroundColor(Color.TRANSPARENT);
            b2_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_b2_10 = "0";
        } else if (b3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b3_10.setBackgroundColor(Color.TRANSPARENT);
            b3_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_b3_10 = "0";
        } else if (b4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b4_10.setBackgroundColor(Color.TRANSPARENT);
            b4_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_b4_10 = "0";
        } else if (b5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            b5_10.setBackgroundColor(Color.TRANSPARENT);
            b5_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_b5_10 = "0";
        }
        //ROW_10 I's
        if (i1_10.getText().toString().equals(textInputEditText.getText().toString())){
            i1_10.setBackgroundColor(Color.TRANSPARENT);
            i1_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_i1_10 = "0";
        } else if (i2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i2_10.setBackgroundColor(Color.TRANSPARENT);
            i2_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_i2_10 = "0";
        } else if (i3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i3_10.setBackgroundColor(Color.TRANSPARENT);
            i3_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_i3_10 = "0";
        } else if (i4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i4_10.setBackgroundColor(Color.TRANSPARENT);
            i4_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_i4_10 = "0";
        } else if (i5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            i5_10.setBackgroundColor(Color.TRANSPARENT);
            i5_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_i5_10 = "0";
        }


        //ROW_10 N's
        if (n1_10.getText().toString().equals(textInputEditText.getText().toString())){
            n1_10.setBackgroundColor(Color.TRANSPARENT);
            n1_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_n1_10 = "0";
        } else if (n2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            n2_10.setBackgroundColor(Color.TRANSPARENT);
            n2_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_n2_10 = "0";
        } else if (n4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            n4_10.setBackgroundColor(Color.TRANSPARENT);
            n4_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_n4_10 = "0";
        } else if (n5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            n5_10.setBackgroundColor(Color.TRANSPARENT);
            n5_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_n5_10 = "0";
        }

        //ROW_10 G's
        if (g1_10.getText().toString().equals(textInputEditText.getText().toString())){
            g1_10.setBackgroundColor(Color.TRANSPARENT);
            g1_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_g1_10 = "0";
        } else if (g2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g2_10.setBackgroundColor(Color.TRANSPARENT);
            g2_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_g2_10 = "0";
        } else if (g3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g3_10.setBackgroundColor(Color.TRANSPARENT);
            g3_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_g3_10 = "0";
        } else if (g4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g4_10.setBackgroundColor(Color.TRANSPARENT);
            g4_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_g4_10 = "0";
        } else if (g5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            g5_10.setBackgroundColor(Color.TRANSPARENT);
            g5_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_g5_10 = "0";
        }

        //ROW_10 O's
        if (o1_10.getText().toString().equals(textInputEditText.getText().toString())){
            o1_10.setBackgroundColor(Color.TRANSPARENT);
            o1_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_o1_10 = "0";
        } else if (o2_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o2_10.setBackgroundColor(Color.TRANSPARENT);
            o2_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_o2_10 = "0";
        } else if (o3_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o3_10.setBackgroundColor(Color.TRANSPARENT);
            o3_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_o3_10 = "0";
        } else if (o4_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o4_10.setBackgroundColor(Color.TRANSPARENT);
            o4_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_o4_10 = "0";
        } else if (o5_10.getText().toString().equals(textInputEditText.getText().toString())) {
            o5_10.setBackgroundColor(Color.TRANSPARENT);
            o5_10.setTextColor(Color.GRAY);
            PatternClassOnly.row_o5_10 = "0";
        }
    }

    void PatternUpdate(){
        if (PatternClassOnly.pb1.equals("0")){
            b1_1.setBackgroundColor(Color.GREEN);
            b1_1.setTextColor(Color.RED);
            b1_1.setVisibility(View.INVISIBLE);
            b1_2.setBackgroundColor(Color.GREEN);
            b1_2.setTextColor(Color.RED);
            b1_2.setVisibility(View.INVISIBLE);
            b1_3.setBackgroundColor(Color.GREEN);
            b1_3.setTextColor(Color.RED);
            b1_3.setVisibility(View.INVISIBLE);
            b1_4.setBackgroundColor(Color.GREEN);
            b1_4.setTextColor(Color.RED);
            b1_4.setVisibility(View.INVISIBLE);
            b1_5.setBackgroundColor(Color.GREEN);
            b1_5.setTextColor(Color.RED);
            b1_5.setVisibility(View.INVISIBLE);
            b1_6.setBackgroundColor(Color.GREEN);
            b1_6.setTextColor(Color.RED);
            b1_6.setVisibility(View.INVISIBLE);
            b1_7.setBackgroundColor(Color.GREEN);
            b1_7.setTextColor(Color.RED);
            b1_7.setVisibility(View.INVISIBLE);
            b1_8.setBackgroundColor(Color.GREEN);
            b1_8.setTextColor(Color.RED);
            b1_8.setVisibility(View.INVISIBLE);
            b1_9.setBackgroundColor(Color.GREEN);
            b1_9.setTextColor(Color.RED);
            b1_9.setVisibility(View.INVISIBLE);
            b1_10.setBackgroundColor(Color.GREEN);
            b1_10.setTextColor(Color.RED);
            b1_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pb2.equals("0")){
            b2_1.setBackgroundColor(Color.GREEN);
            b2_1.setTextColor(Color.RED);
            b2_1.setVisibility(View.INVISIBLE);
            b2_2.setBackgroundColor(Color.GREEN);
            b2_2.setTextColor(Color.RED);
            b2_2.setVisibility(View.INVISIBLE);
            b2_3.setBackgroundColor(Color.GREEN);
            b2_3.setTextColor(Color.RED);
            b2_3.setVisibility(View.INVISIBLE);
            b2_4.setBackgroundColor(Color.GREEN);
            b2_4.setTextColor(Color.RED);
            b2_4.setVisibility(View.INVISIBLE);
            b2_5.setBackgroundColor(Color.GREEN);
            b2_5.setTextColor(Color.RED);
            b2_5.setVisibility(View.INVISIBLE);
            b2_6.setBackgroundColor(Color.GREEN);
            b2_6.setTextColor(Color.RED);
            b2_6.setVisibility(View.INVISIBLE);
            b2_7.setBackgroundColor(Color.GREEN);
            b2_7.setTextColor(Color.RED);
            b2_7.setVisibility(View.INVISIBLE);
            b2_8.setBackgroundColor(Color.GREEN);
            b2_8.setTextColor(Color.RED);
            b2_8.setVisibility(View.INVISIBLE);
            b2_9.setBackgroundColor(Color.GREEN);
            b2_9.setTextColor(Color.RED);
            b2_9.setVisibility(View.INVISIBLE);
            b2_10.setBackgroundColor(Color.GREEN);
            b2_10.setTextColor(Color.RED);
            b2_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pb3.equals("0")){
            b3_1.setBackgroundColor(Color.GREEN);
            b3_1.setTextColor(Color.RED);
            b3_1.setVisibility(View.INVISIBLE);
            b3_2.setBackgroundColor(Color.GREEN);
            b3_2.setTextColor(Color.RED);
            b3_2.setVisibility(View.INVISIBLE);
            b3_3.setBackgroundColor(Color.GREEN);
            b3_3.setTextColor(Color.RED);
            b3_3.setVisibility(View.INVISIBLE);
            b3_4.setBackgroundColor(Color.GREEN);
            b3_4.setTextColor(Color.RED);
            b3_4.setVisibility(View.INVISIBLE);
            b3_5.setBackgroundColor(Color.GREEN);
            b3_5.setTextColor(Color.RED);
            b3_5.setVisibility(View.INVISIBLE);
            b3_6.setBackgroundColor(Color.GREEN);
            b3_6.setTextColor(Color.RED);
            b3_6.setVisibility(View.INVISIBLE);
            b3_7.setBackgroundColor(Color.GREEN);
            b3_7.setTextColor(Color.RED);
            b3_7.setVisibility(View.INVISIBLE);
            b3_8.setBackgroundColor(Color.GREEN);
            b3_8.setTextColor(Color.RED);
            b3_8.setVisibility(View.INVISIBLE);
            b3_9.setBackgroundColor(Color.GREEN);
            b3_9.setTextColor(Color.RED);
            b3_9.setVisibility(View.INVISIBLE);
            b3_10.setBackgroundColor(Color.GREEN);
            b3_10.setTextColor(Color.RED);
            b3_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pb4.equals("0")){
            b4_1.setBackgroundColor(Color.GREEN);
            b4_1.setTextColor(Color.RED);
            b4_1.setVisibility(View.INVISIBLE);
            b4_2.setBackgroundColor(Color.GREEN);
            b4_2.setTextColor(Color.RED);
            b4_2.setVisibility(View.INVISIBLE);
            b4_3.setBackgroundColor(Color.GREEN);
            b4_3.setTextColor(Color.RED);
            b4_3.setVisibility(View.INVISIBLE);
            b4_4.setBackgroundColor(Color.GREEN);
            b4_4.setTextColor(Color.RED);
            b4_4.setVisibility(View.INVISIBLE);
            b4_5.setBackgroundColor(Color.GREEN);
            b4_5.setTextColor(Color.RED);
            b4_5.setVisibility(View.INVISIBLE);
            b4_6.setBackgroundColor(Color.GREEN);
            b4_6.setTextColor(Color.RED);
            b4_6.setVisibility(View.INVISIBLE);
            b4_7.setBackgroundColor(Color.GREEN);
            b4_7.setTextColor(Color.RED);
            b4_7.setVisibility(View.INVISIBLE);
            b4_8.setBackgroundColor(Color.GREEN);
            b4_8.setTextColor(Color.RED);
            b4_8.setVisibility(View.INVISIBLE);
            b4_9.setBackgroundColor(Color.GREEN);
            b4_9.setTextColor(Color.RED);
            b4_9.setVisibility(View.INVISIBLE);
            b4_10.setBackgroundColor(Color.GREEN);
            b4_10.setTextColor(Color.RED);
            b4_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pb5.equals("0")){
            b5_1.setBackgroundColor(Color.GREEN);
            b5_1.setTextColor(Color.RED);
            b5_1.setVisibility(View.INVISIBLE);
            b5_2.setBackgroundColor(Color.GREEN);
            b5_2.setTextColor(Color.RED);
            b5_2.setVisibility(View.INVISIBLE);
            b5_3.setBackgroundColor(Color.GREEN);
            b5_3.setTextColor(Color.RED);
            b5_3.setVisibility(View.INVISIBLE);
            b5_4.setBackgroundColor(Color.GREEN);
            b5_4.setTextColor(Color.RED);
            b5_4.setVisibility(View.INVISIBLE);
            b5_5.setBackgroundColor(Color.GREEN);
            b5_5.setTextColor(Color.RED);
            b5_5.setVisibility(View.INVISIBLE);
            b5_6.setBackgroundColor(Color.GREEN);
            b5_6.setTextColor(Color.RED);
            b5_6.setVisibility(View.INVISIBLE);
            b5_7.setBackgroundColor(Color.GREEN);
            b5_7.setTextColor(Color.RED);
            b5_7.setVisibility(View.INVISIBLE);
            b5_8.setBackgroundColor(Color.GREEN);
            b5_8.setTextColor(Color.RED);
            b5_8.setVisibility(View.INVISIBLE);
            b5_9.setBackgroundColor(Color.GREEN);
            b5_9.setTextColor(Color.RED);
            b5_9.setVisibility(View.INVISIBLE);
            b5_10.setBackgroundColor(Color.GREEN);
            b5_10.setTextColor(Color.RED);
            b5_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pi1.equals("0")){
            i1_1.setBackgroundColor(Color.GREEN);
            i1_1.setTextColor(Color.RED);
            i1_1.setVisibility(View.INVISIBLE);
            i1_2.setBackgroundColor(Color.GREEN);
            i1_2.setTextColor(Color.RED);
            i1_2.setVisibility(View.INVISIBLE);
            i1_3.setBackgroundColor(Color.GREEN);
            i1_3.setTextColor(Color.RED);
            i1_3.setVisibility(View.INVISIBLE);
            i1_4.setBackgroundColor(Color.GREEN);
            i1_4.setTextColor(Color.RED);
            i1_4.setVisibility(View.INVISIBLE);
            i1_5.setBackgroundColor(Color.GREEN);
            i1_5.setTextColor(Color.RED);
            i1_5.setVisibility(View.INVISIBLE);
            i1_6.setBackgroundColor(Color.GREEN);
            i1_6.setTextColor(Color.RED);
            i1_6.setVisibility(View.INVISIBLE);
            i1_7.setBackgroundColor(Color.GREEN);
            i1_7.setTextColor(Color.RED);
            i1_7.setVisibility(View.INVISIBLE);
            i1_8.setBackgroundColor(Color.GREEN);
            i1_8.setTextColor(Color.RED);
            i1_8.setVisibility(View.INVISIBLE);
            i1_9.setBackgroundColor(Color.GREEN);
            i1_9.setTextColor(Color.RED);
            i1_9.setVisibility(View.INVISIBLE);
            i1_10.setBackgroundColor(Color.GREEN);
            i1_10.setTextColor(Color.RED);
            i1_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pi2.equals("0")){
            i2_1.setBackgroundColor(Color.GREEN);
            i2_1.setTextColor(Color.RED);
            i2_1.setVisibility(View.INVISIBLE);
            i2_2.setBackgroundColor(Color.GREEN);
            i2_2.setTextColor(Color.RED);
            i2_2.setVisibility(View.INVISIBLE);
            i2_3.setBackgroundColor(Color.GREEN);
            i2_3.setTextColor(Color.RED);
            i2_3.setVisibility(View.INVISIBLE);
            i2_4.setBackgroundColor(Color.GREEN);
            i2_4.setTextColor(Color.RED);
            i2_4.setVisibility(View.INVISIBLE);
            i2_5.setBackgroundColor(Color.GREEN);
            i2_5.setTextColor(Color.RED);
            i2_5.setVisibility(View.INVISIBLE);
            i2_6.setBackgroundColor(Color.GREEN);
            i2_6.setTextColor(Color.RED);
            i2_6.setVisibility(View.INVISIBLE);
            i2_7.setBackgroundColor(Color.GREEN);
            i2_7.setTextColor(Color.RED);
            i2_7.setVisibility(View.INVISIBLE);
            i2_8.setBackgroundColor(Color.GREEN);
            i2_8.setTextColor(Color.RED);
            i2_8.setVisibility(View.INVISIBLE);
            i2_9.setBackgroundColor(Color.GREEN);
            i2_9.setTextColor(Color.RED);
            i2_9.setVisibility(View.INVISIBLE);
            i2_10.setBackgroundColor(Color.GREEN);
            i2_10.setTextColor(Color.RED);
            i2_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pi3.equals("0")){
            i3_1.setBackgroundColor(Color.GREEN);
            i3_1.setTextColor(Color.RED);
            i3_1.setVisibility(View.INVISIBLE);
            i3_2.setBackgroundColor(Color.GREEN);
            i3_2.setTextColor(Color.RED);
            i3_2.setVisibility(View.INVISIBLE);
            i3_3.setBackgroundColor(Color.GREEN);
            i3_3.setTextColor(Color.RED);
            i3_3.setVisibility(View.INVISIBLE);
            i3_4.setBackgroundColor(Color.GREEN);
            i3_4.setTextColor(Color.RED);
            i3_4.setVisibility(View.INVISIBLE);
            i3_5.setBackgroundColor(Color.GREEN);
            i3_5.setTextColor(Color.RED);
            i3_5.setVisibility(View.INVISIBLE);
            i3_6.setBackgroundColor(Color.GREEN);
            i3_6.setTextColor(Color.RED);
            i3_6.setVisibility(View.INVISIBLE);
            i3_7.setBackgroundColor(Color.GREEN);
            i3_7.setTextColor(Color.RED);
            i3_7.setVisibility(View.INVISIBLE);
            i3_8.setBackgroundColor(Color.GREEN);
            i3_8.setTextColor(Color.RED);
            i3_8.setVisibility(View.INVISIBLE);
            i3_9.setBackgroundColor(Color.GREEN);
            i3_9.setTextColor(Color.RED);
            i3_9.setVisibility(View.INVISIBLE);
            i3_10.setBackgroundColor(Color.GREEN);
            i3_10.setTextColor(Color.RED);
            i3_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pi4.equals("0")){
            i4_1.setBackgroundColor(Color.GREEN);
            i4_1.setTextColor(Color.RED);
            i4_1.setVisibility(View.INVISIBLE);
            i4_2.setBackgroundColor(Color.GREEN);
            i4_2.setTextColor(Color.RED);
            i4_2.setVisibility(View.INVISIBLE);
            i4_3.setBackgroundColor(Color.GREEN);
            i4_3.setTextColor(Color.RED);
            i4_3.setVisibility(View.INVISIBLE);
            i4_4.setBackgroundColor(Color.GREEN);
            i4_4.setTextColor(Color.RED);
            i4_4.setVisibility(View.INVISIBLE);
            i4_5.setBackgroundColor(Color.GREEN);
            i4_5.setTextColor(Color.RED);
            i4_5.setVisibility(View.INVISIBLE);
            i4_6.setBackgroundColor(Color.GREEN);
            i4_6.setTextColor(Color.RED);
            i4_6.setVisibility(View.INVISIBLE);
            i4_7.setBackgroundColor(Color.GREEN);
            i4_7.setTextColor(Color.RED);
            i4_7.setVisibility(View.INVISIBLE);
            i4_8.setBackgroundColor(Color.GREEN);
            i4_8.setTextColor(Color.RED);
            i4_8.setVisibility(View.INVISIBLE);
            i4_9.setBackgroundColor(Color.GREEN);
            i4_9.setTextColor(Color.RED);
            i4_9.setVisibility(View.INVISIBLE);
            i4_10.setBackgroundColor(Color.GREEN);
            i4_10.setTextColor(Color.RED);
            i4_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pi5.equals("0")){
            i5_1.setBackgroundColor(Color.GREEN);
            i5_1.setTextColor(Color.RED);
            i5_1.setVisibility(View.INVISIBLE);
            i5_2.setBackgroundColor(Color.GREEN);
            i5_2.setTextColor(Color.RED);
            i5_2.setVisibility(View.INVISIBLE);
            i5_3.setBackgroundColor(Color.GREEN);
            i5_3.setTextColor(Color.RED);
            i5_3.setVisibility(View.INVISIBLE);
            i5_4.setBackgroundColor(Color.GREEN);
            i5_4.setTextColor(Color.RED);
            i5_4.setVisibility(View.INVISIBLE);
            i5_5.setBackgroundColor(Color.GREEN);
            i5_5.setTextColor(Color.RED);
            i5_5.setVisibility(View.INVISIBLE);
            i5_6.setBackgroundColor(Color.GREEN);
            i5_6.setTextColor(Color.RED);
            i5_6.setVisibility(View.INVISIBLE);
            i5_7.setBackgroundColor(Color.GREEN);
            i5_7.setTextColor(Color.RED);
            i5_7.setVisibility(View.INVISIBLE);
            i5_8.setBackgroundColor(Color.GREEN);
            i5_8.setTextColor(Color.RED);
            i5_8.setVisibility(View.INVISIBLE);
            i5_9.setBackgroundColor(Color.GREEN);
            i5_9.setTextColor(Color.RED);
            i5_9.setVisibility(View.INVISIBLE);
            i5_10.setBackgroundColor(Color.GREEN);
            i5_10.setTextColor(Color.RED);
            i5_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pn1.equals("0")){
            n1_1.setBackgroundColor(Color.GREEN);
            n1_1.setTextColor(Color.RED);
            n1_1.setVisibility(View.INVISIBLE);
            n1_2.setBackgroundColor(Color.GREEN);
            n1_2.setTextColor(Color.RED);
            n1_2.setVisibility(View.INVISIBLE);
            n1_3.setBackgroundColor(Color.GREEN);
            n1_3.setTextColor(Color.RED);
            n1_3.setVisibility(View.INVISIBLE);
            n1_4.setBackgroundColor(Color.GREEN);
            n1_4.setTextColor(Color.RED);
            n1_4.setVisibility(View.INVISIBLE);
            n1_5.setBackgroundColor(Color.GREEN);
            n1_5.setTextColor(Color.RED);
            n1_5.setVisibility(View.INVISIBLE);
            n1_6.setBackgroundColor(Color.GREEN);
            n1_6.setTextColor(Color.RED);
            n1_6.setVisibility(View.INVISIBLE);
            n1_7.setBackgroundColor(Color.GREEN);
            n1_7.setTextColor(Color.RED);
            n1_7.setVisibility(View.INVISIBLE);
            n1_8.setBackgroundColor(Color.GREEN);
            n1_8.setTextColor(Color.RED);
            n1_8.setVisibility(View.INVISIBLE);
            n1_9.setBackgroundColor(Color.GREEN);
            n1_9.setTextColor(Color.RED);
            n1_9.setVisibility(View.INVISIBLE);
            n1_10.setBackgroundColor(Color.GREEN);
            n1_10.setTextColor(Color.RED);
            n1_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pn2.equals("0")){
            n2_1.setBackgroundColor(Color.GREEN);
            n2_1.setTextColor(Color.RED);
            n2_1.setVisibility(View.INVISIBLE);
            n2_2.setBackgroundColor(Color.GREEN);
            n2_2.setTextColor(Color.RED);
            n2_2.setVisibility(View.INVISIBLE);
            n2_3.setBackgroundColor(Color.GREEN);
            n2_3.setTextColor(Color.RED);
            n2_3.setVisibility(View.INVISIBLE);
            n2_4.setBackgroundColor(Color.GREEN);
            n2_4.setTextColor(Color.RED);
            n2_4.setVisibility(View.INVISIBLE);
            n2_5.setBackgroundColor(Color.GREEN);
            n2_5.setTextColor(Color.RED);
            n2_5.setVisibility(View.INVISIBLE);
            n2_6.setBackgroundColor(Color.GREEN);
            n2_6.setTextColor(Color.RED);
            n2_6.setVisibility(View.INVISIBLE);
            n2_7.setBackgroundColor(Color.GREEN);
            n2_7.setTextColor(Color.RED);
            n2_7.setVisibility(View.INVISIBLE);
            n2_8.setBackgroundColor(Color.GREEN);
            n2_8.setTextColor(Color.RED);
            n2_8.setVisibility(View.INVISIBLE);
            n2_9.setBackgroundColor(Color.GREEN);
            n2_9.setTextColor(Color.RED);
            n2_9.setVisibility(View.INVISIBLE);
            n2_10.setBackgroundColor(Color.GREEN);
            n2_10.setTextColor(Color.RED);
            n2_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pn4.equals("0")){
            n4_1.setBackgroundColor(Color.GREEN);
            n4_1.setTextColor(Color.RED);
            n4_1.setVisibility(View.INVISIBLE);
            n4_2.setBackgroundColor(Color.GREEN);
            n4_2.setTextColor(Color.RED);
            n4_2.setVisibility(View.INVISIBLE);
            n4_3.setBackgroundColor(Color.GREEN);
            n4_3.setTextColor(Color.RED);
            n4_3.setVisibility(View.INVISIBLE);
            n4_4.setBackgroundColor(Color.GREEN);
            n4_4.setTextColor(Color.RED);
            n4_4.setVisibility(View.INVISIBLE);
            n4_5.setBackgroundColor(Color.GREEN);
            n4_5.setTextColor(Color.RED);
            n4_5.setVisibility(View.INVISIBLE);
            n4_6.setBackgroundColor(Color.GREEN);
            n4_6.setTextColor(Color.RED);
            n4_6.setVisibility(View.INVISIBLE);
            n4_7.setBackgroundColor(Color.GREEN);
            n4_7.setTextColor(Color.RED);
            n4_7.setVisibility(View.INVISIBLE);
            n4_8.setBackgroundColor(Color.GREEN);
            n4_8.setTextColor(Color.RED);
            n4_8.setVisibility(View.INVISIBLE);
            n4_9.setBackgroundColor(Color.GREEN);
            n4_9.setTextColor(Color.RED);
            n4_9.setVisibility(View.INVISIBLE);
            n4_10.setBackgroundColor(Color.GREEN);
            n4_10.setTextColor(Color.RED);
            n4_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pn5.equals("0")){
            n5_1.setBackgroundColor(Color.GREEN);
            n5_1.setTextColor(Color.RED);
            n5_1.setVisibility(View.INVISIBLE);
            n5_2.setBackgroundColor(Color.GREEN);
            n5_2.setTextColor(Color.RED);
            n5_2.setVisibility(View.INVISIBLE);
            n5_3.setBackgroundColor(Color.GREEN);
            n5_3.setTextColor(Color.RED);
            n5_3.setVisibility(View.INVISIBLE);
            n5_4.setBackgroundColor(Color.GREEN);
            n5_4.setTextColor(Color.RED);
            n5_4.setVisibility(View.INVISIBLE);
            n5_5.setBackgroundColor(Color.GREEN);
            n5_5.setTextColor(Color.RED);
            n5_5.setVisibility(View.INVISIBLE);
            n5_6.setBackgroundColor(Color.GREEN);
            n5_6.setTextColor(Color.RED);
            n5_6.setVisibility(View.INVISIBLE);
            n5_7.setBackgroundColor(Color.GREEN);
            n5_7.setTextColor(Color.RED);
            n5_7.setVisibility(View.INVISIBLE);
            n5_8.setBackgroundColor(Color.GREEN);
            n5_8.setTextColor(Color.RED);
            n5_8.setVisibility(View.INVISIBLE);
            n5_9.setBackgroundColor(Color.GREEN);
            n5_9.setTextColor(Color.RED);
            n5_9.setVisibility(View.INVISIBLE);
            n5_10.setBackgroundColor(Color.GREEN);
            n5_10.setTextColor(Color.RED);
            n5_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pg1.equals("0")){
            g1_1.setBackgroundColor(Color.GREEN);
            g1_1.setTextColor(Color.RED);
            g1_1.setVisibility(View.INVISIBLE);
            g1_2.setBackgroundColor(Color.GREEN);
            g1_2.setTextColor(Color.RED);
            g1_2.setVisibility(View.INVISIBLE);
            g1_3.setBackgroundColor(Color.GREEN);
            g1_3.setTextColor(Color.RED);
            g1_3.setVisibility(View.INVISIBLE);
            g1_4.setBackgroundColor(Color.GREEN);
            g1_4.setTextColor(Color.RED);
            g1_4.setVisibility(View.INVISIBLE);
            g1_5.setBackgroundColor(Color.GREEN);
            g1_5.setTextColor(Color.RED);
            g1_5.setVisibility(View.INVISIBLE);
            g1_6.setBackgroundColor(Color.GREEN);
            g1_6.setTextColor(Color.RED);
            g1_6.setVisibility(View.INVISIBLE);
            g1_7.setBackgroundColor(Color.GREEN);
            g1_7.setTextColor(Color.RED);
            g1_7.setVisibility(View.INVISIBLE);
            g1_8.setBackgroundColor(Color.GREEN);
            g1_8.setTextColor(Color.RED);
            g1_8.setVisibility(View.INVISIBLE);
            g1_9.setBackgroundColor(Color.GREEN);
            g1_9.setTextColor(Color.RED);
            g1_9.setVisibility(View.INVISIBLE);
            g1_10.setBackgroundColor(Color.GREEN);
            g1_10.setTextColor(Color.RED);
            g1_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pg2.equals("0")){
            g2_1.setBackgroundColor(Color.GREEN);
            g2_1.setTextColor(Color.RED);
            g2_1.setVisibility(View.INVISIBLE);
            g2_2.setBackgroundColor(Color.GREEN);
            g2_2.setTextColor(Color.RED);
            g2_2.setVisibility(View.INVISIBLE);
            g2_3.setBackgroundColor(Color.GREEN);
            g2_3.setTextColor(Color.RED);
            g2_3.setVisibility(View.INVISIBLE);
            g2_4.setBackgroundColor(Color.GREEN);
            g2_4.setTextColor(Color.RED);
            g2_4.setVisibility(View.INVISIBLE);
            g2_5.setBackgroundColor(Color.GREEN);
            g2_5.setTextColor(Color.RED);
            g2_5.setVisibility(View.INVISIBLE);
            g2_6.setBackgroundColor(Color.GREEN);
            g2_6.setTextColor(Color.RED);
            g2_6.setVisibility(View.INVISIBLE);
            g2_7.setBackgroundColor(Color.GREEN);
            g2_7.setTextColor(Color.RED);
            g2_7.setVisibility(View.INVISIBLE);
            g2_8.setBackgroundColor(Color.GREEN);
            g2_8.setTextColor(Color.RED);
            g2_8.setVisibility(View.INVISIBLE);
            g2_9.setBackgroundColor(Color.GREEN);
            g2_9.setTextColor(Color.RED);
            g2_9.setVisibility(View.INVISIBLE);
            g2_10.setBackgroundColor(Color.GREEN);
            g2_10.setTextColor(Color.RED);
            g2_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pg3.equals("0")){
            g3_1.setBackgroundColor(Color.GREEN);
            g3_1.setTextColor(Color.RED);
            g3_1.setVisibility(View.INVISIBLE);
            g3_2.setBackgroundColor(Color.GREEN);
            g3_2.setTextColor(Color.RED);
            g3_2.setVisibility(View.INVISIBLE);
            g3_3.setBackgroundColor(Color.GREEN);
            g3_3.setTextColor(Color.RED);
            g3_3.setVisibility(View.INVISIBLE);
            g3_4.setBackgroundColor(Color.GREEN);
            g3_4.setTextColor(Color.RED);
            g3_4.setVisibility(View.INVISIBLE);
            g3_5.setBackgroundColor(Color.GREEN);
            g3_5.setTextColor(Color.RED);
            g3_5.setVisibility(View.INVISIBLE);
            g3_6.setBackgroundColor(Color.GREEN);
            g3_6.setTextColor(Color.RED);
            g3_6.setVisibility(View.INVISIBLE);
            g3_7.setBackgroundColor(Color.GREEN);
            g3_7.setTextColor(Color.RED);
            g3_7.setVisibility(View.INVISIBLE);
            g3_8.setBackgroundColor(Color.GREEN);
            g3_8.setTextColor(Color.RED);
            g3_8.setVisibility(View.INVISIBLE);
            g3_9.setBackgroundColor(Color.GREEN);
            g3_9.setTextColor(Color.RED);
            g3_9.setVisibility(View.INVISIBLE);
            g3_10.setBackgroundColor(Color.GREEN);
            g3_10.setTextColor(Color.RED);
            g3_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pg4.equals("0")){
            g4_1.setBackgroundColor(Color.GREEN);
            g4_1.setTextColor(Color.RED);
            g4_1.setVisibility(View.INVISIBLE);
            g4_2.setBackgroundColor(Color.GREEN);
            g4_2.setTextColor(Color.RED);
            g4_2.setVisibility(View.INVISIBLE);
            g4_3.setBackgroundColor(Color.GREEN);
            g4_3.setTextColor(Color.RED);
            g4_3.setVisibility(View.INVISIBLE);
            g4_4.setBackgroundColor(Color.GREEN);
            g4_4.setTextColor(Color.RED);
            g4_4.setVisibility(View.INVISIBLE);
            g4_5.setBackgroundColor(Color.GREEN);
            g4_5.setTextColor(Color.RED);
            g4_5.setVisibility(View.INVISIBLE);
            g4_6.setBackgroundColor(Color.GREEN);
            g4_6.setTextColor(Color.RED);
            g4_6.setVisibility(View.INVISIBLE);
            g4_7.setBackgroundColor(Color.GREEN);
            g4_7.setTextColor(Color.RED);
            g4_7.setVisibility(View.INVISIBLE);
            g4_8.setBackgroundColor(Color.GREEN);
            g4_8.setTextColor(Color.RED);
            g4_8.setVisibility(View.INVISIBLE);
            g4_9.setBackgroundColor(Color.GREEN);
            g4_9.setTextColor(Color.RED);
            g4_9.setVisibility(View.INVISIBLE);
            g4_10.setBackgroundColor(Color.GREEN);
            g4_10.setTextColor(Color.RED);
            g4_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.pg5.equals("0")){
            g5_1.setBackgroundColor(Color.GREEN);
            g5_1.setTextColor(Color.RED);
            g5_1.setVisibility(View.INVISIBLE);
            g5_2.setBackgroundColor(Color.GREEN);
            g5_2.setTextColor(Color.RED);
            g5_2.setVisibility(View.INVISIBLE);
            g5_3.setBackgroundColor(Color.GREEN);
            g5_3.setTextColor(Color.RED);
            g5_3.setVisibility(View.INVISIBLE);
            g5_4.setBackgroundColor(Color.GREEN);
            g5_4.setTextColor(Color.RED);
            g5_4.setVisibility(View.INVISIBLE);
            g5_5.setBackgroundColor(Color.GREEN);
            g5_5.setTextColor(Color.RED);
            g5_5.setVisibility(View.INVISIBLE);
            g5_6.setBackgroundColor(Color.GREEN);
            g5_6.setTextColor(Color.RED);
            g5_6.setVisibility(View.INVISIBLE);
            g5_7.setBackgroundColor(Color.GREEN);
            g5_7.setTextColor(Color.RED);
            g5_7.setVisibility(View.INVISIBLE);
            g5_8.setBackgroundColor(Color.GREEN);
            g5_8.setTextColor(Color.RED);
            g5_8.setVisibility(View.INVISIBLE);
            g5_9.setBackgroundColor(Color.GREEN);
            g5_9.setTextColor(Color.RED);
            g5_9.setVisibility(View.INVISIBLE);
            g5_10.setBackgroundColor(Color.GREEN);
            g5_10.setTextColor(Color.RED);
            g5_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.po1.equals("0")){
            o1_1.setBackgroundColor(Color.GREEN);
            o1_1.setTextColor(Color.RED);
            o1_1.setVisibility(View.INVISIBLE);
            o1_2.setBackgroundColor(Color.GREEN);
            o1_2.setTextColor(Color.RED);
            o1_2.setVisibility(View.INVISIBLE);
            o1_3.setBackgroundColor(Color.GREEN);
            o1_3.setTextColor(Color.RED);
            o1_3.setVisibility(View.INVISIBLE);
            o1_4.setBackgroundColor(Color.GREEN);
            o1_4.setTextColor(Color.RED);
            o1_4.setVisibility(View.INVISIBLE);
            o1_5.setBackgroundColor(Color.GREEN);
            o1_5.setTextColor(Color.RED);
            o1_5.setVisibility(View.INVISIBLE);
            o1_6.setBackgroundColor(Color.GREEN);
            o1_6.setTextColor(Color.RED);
            o1_6.setVisibility(View.INVISIBLE);
            o1_7.setBackgroundColor(Color.GREEN);
            o1_7.setTextColor(Color.RED);
            o1_7.setVisibility(View.INVISIBLE);
            o1_8.setBackgroundColor(Color.GREEN);
            o1_8.setTextColor(Color.RED);
            o1_8.setVisibility(View.INVISIBLE);
            o1_9.setBackgroundColor(Color.GREEN);
            o1_9.setTextColor(Color.RED);
            o1_9.setVisibility(View.INVISIBLE);
            o1_10.setBackgroundColor(Color.GREEN);
            o1_10.setTextColor(Color.RED);
            o1_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.po2.equals("0")){
            o2_1.setBackgroundColor(Color.GREEN);
            o2_1.setTextColor(Color.RED);
            o2_1.setVisibility(View.INVISIBLE);
            o2_2.setBackgroundColor(Color.GREEN);
            o2_2.setTextColor(Color.RED);
            o2_2.setVisibility(View.INVISIBLE);
            o2_3.setBackgroundColor(Color.GREEN);
            o2_3.setTextColor(Color.RED);
            o2_3.setVisibility(View.INVISIBLE);
            o2_4.setBackgroundColor(Color.GREEN);
            o2_4.setTextColor(Color.RED);
            o2_4.setVisibility(View.INVISIBLE);
            o2_5.setBackgroundColor(Color.GREEN);
            o2_5.setTextColor(Color.RED);
            o2_5.setVisibility(View.INVISIBLE);
            o2_6.setBackgroundColor(Color.GREEN);
            o2_6.setTextColor(Color.RED);
            o2_6.setVisibility(View.INVISIBLE);
            o2_7.setBackgroundColor(Color.GREEN);
            o2_7.setTextColor(Color.RED);
            o2_7.setVisibility(View.INVISIBLE);
            o2_8.setBackgroundColor(Color.GREEN);
            o2_8.setTextColor(Color.RED);
            o2_8.setVisibility(View.INVISIBLE);
            o2_9.setBackgroundColor(Color.GREEN);
            o2_9.setTextColor(Color.RED);
            o2_9.setVisibility(View.INVISIBLE);
            o2_10.setBackgroundColor(Color.GREEN);
            o2_10.setTextColor(Color.RED);
            o2_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.po3.equals("0")){
            o3_1.setBackgroundColor(Color.GREEN);
            o3_1.setTextColor(Color.RED);
            o3_1.setVisibility(View.INVISIBLE);
            o3_2.setBackgroundColor(Color.GREEN);
            o3_2.setTextColor(Color.RED);
            o3_2.setVisibility(View.INVISIBLE);
            o3_3.setBackgroundColor(Color.GREEN);
            o3_3.setTextColor(Color.RED);
            o3_3.setVisibility(View.INVISIBLE);
            o3_4.setBackgroundColor(Color.GREEN);
            o3_4.setTextColor(Color.RED);
            o3_4.setVisibility(View.INVISIBLE);
            o3_5.setBackgroundColor(Color.GREEN);
            o3_5.setTextColor(Color.RED);
            o3_5.setVisibility(View.INVISIBLE);
            o3_6.setBackgroundColor(Color.GREEN);
            o3_6.setTextColor(Color.RED);
            o3_6.setVisibility(View.INVISIBLE);
            o3_7.setBackgroundColor(Color.GREEN);
            o3_7.setTextColor(Color.RED);
            o3_7.setVisibility(View.INVISIBLE);
            o3_8.setBackgroundColor(Color.GREEN);
            o3_8.setTextColor(Color.RED);
            o3_8.setVisibility(View.INVISIBLE);
            o3_9.setBackgroundColor(Color.GREEN);
            o3_9.setTextColor(Color.RED);
            o3_9.setVisibility(View.INVISIBLE);
            o3_10.setBackgroundColor(Color.GREEN);
            o3_10.setTextColor(Color.RED);
            o3_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.po4.equals("0")){
            o4_1.setBackgroundColor(Color.GREEN);
            o4_1.setTextColor(Color.RED);
            o4_1.setVisibility(View.INVISIBLE);
            o4_2.setBackgroundColor(Color.GREEN);
            o4_2.setTextColor(Color.RED);
            o4_2.setVisibility(View.INVISIBLE);
            o4_3.setBackgroundColor(Color.GREEN);
            o4_3.setTextColor(Color.RED);
            o4_3.setVisibility(View.INVISIBLE);
            o4_4.setBackgroundColor(Color.GREEN);
            o4_4.setTextColor(Color.RED);
            o4_4.setVisibility(View.INVISIBLE);
            o4_5.setBackgroundColor(Color.GREEN);
            o4_5.setTextColor(Color.RED);
            o4_5.setVisibility(View.INVISIBLE);
            o4_6.setBackgroundColor(Color.GREEN);
            o4_6.setTextColor(Color.RED);
            o4_6.setVisibility(View.INVISIBLE);
            o4_7.setBackgroundColor(Color.GREEN);
            o4_7.setTextColor(Color.RED);
            o4_7.setVisibility(View.INVISIBLE);
            o4_8.setBackgroundColor(Color.GREEN);
            o4_8.setTextColor(Color.RED);
            o4_8.setVisibility(View.INVISIBLE);
            o4_9.setBackgroundColor(Color.GREEN);
            o4_9.setTextColor(Color.RED);
            o4_9.setVisibility(View.INVISIBLE);
            o4_10.setBackgroundColor(Color.GREEN);
            o4_10.setTextColor(Color.RED);
            o4_10.setVisibility(View.INVISIBLE);
        }
        if (PatternClassOnly.po5.equals("0")){
            o5_1.setBackgroundColor(Color.GREEN);
            o5_1.setTextColor(Color.RED);
            o5_1.setVisibility(View.INVISIBLE);
            o5_2.setBackgroundColor(Color.GREEN);
            o5_2.setTextColor(Color.RED);
            o5_2.setVisibility(View.INVISIBLE);
            o5_3.setBackgroundColor(Color.GREEN);
            o5_3.setTextColor(Color.RED);
            o5_3.setVisibility(View.INVISIBLE);
            o5_4.setBackgroundColor(Color.GREEN);
            o5_4.setTextColor(Color.RED);
            o5_4.setVisibility(View.INVISIBLE);
            o5_5.setBackgroundColor(Color.GREEN);
            o5_5.setTextColor(Color.RED);
            o5_5.setVisibility(View.INVISIBLE);
            o5_6.setBackgroundColor(Color.GREEN);
            o5_6.setTextColor(Color.RED);
            o5_6.setVisibility(View.INVISIBLE);
            o5_7.setBackgroundColor(Color.GREEN);
            o5_7.setTextColor(Color.RED);
            o5_7.setVisibility(View.INVISIBLE);
            o5_8.setBackgroundColor(Color.GREEN);
            o5_8.setTextColor(Color.RED);
            o5_8.setVisibility(View.INVISIBLE);
            o5_9.setBackgroundColor(Color.GREEN);
            o5_9.setTextColor(Color.RED);
            o5_9.setVisibility(View.INVISIBLE);
            o5_10.setBackgroundColor(Color.GREEN);
            o5_10.setTextColor(Color.RED);
            o5_10.setVisibility(View.INVISIBLE);
        }
    }
    void PatternUpdateRemove(){
        if (PatternClassOnly.pb1.equals("1")){
            b1_1.setBackgroundColor(Color.TRANSPARENT);
            b1_1.setTextColor(Color.GRAY);
            b1_1.setVisibility(View.VISIBLE);
            b1_2.setBackgroundColor(Color.TRANSPARENT);
            b1_2.setTextColor(Color.GRAY);
            b1_2.setVisibility(View.VISIBLE);
            b1_3.setBackgroundColor(Color.TRANSPARENT);
            b1_3.setTextColor(Color.GRAY);
            b1_3.setVisibility(View.VISIBLE);
            b1_4.setBackgroundColor(Color.TRANSPARENT);
            b1_4.setTextColor(Color.GRAY);
            b1_4.setVisibility(View.VISIBLE);
            b1_5.setBackgroundColor(Color.TRANSPARENT);
            b1_5.setTextColor(Color.GRAY);
            b1_5.setVisibility(View.VISIBLE);
            b1_6.setBackgroundColor(Color.TRANSPARENT);
            b1_6.setTextColor(Color.GRAY);
            b1_6.setVisibility(View.VISIBLE);
            b1_7.setBackgroundColor(Color.TRANSPARENT);
            b1_7.setTextColor(Color.GRAY);
            b1_7.setVisibility(View.VISIBLE);
            b1_8.setBackgroundColor(Color.TRANSPARENT);
            b1_8.setTextColor(Color.GRAY);
            b1_8.setVisibility(View.VISIBLE);
            b1_9.setBackgroundColor(Color.TRANSPARENT);
            b1_9.setTextColor(Color.GRAY);
            b1_9.setVisibility(View.VISIBLE);
            b1_10.setBackgroundColor(Color.TRANSPARENT);
            b1_10.setTextColor(Color.GRAY);
            b1_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pb2.equals("1")){
            b2_1.setBackgroundColor(Color.TRANSPARENT);
            b2_1.setTextColor(Color.GRAY);
            b2_1.setVisibility(View.VISIBLE);
            b2_2.setBackgroundColor(Color.TRANSPARENT);
            b2_2.setTextColor(Color.GRAY);
            b2_2.setVisibility(View.VISIBLE);
            b2_3.setBackgroundColor(Color.TRANSPARENT);
            b2_3.setTextColor(Color.GRAY);
            b2_3.setVisibility(View.VISIBLE);
            b2_4.setBackgroundColor(Color.TRANSPARENT);
            b2_4.setTextColor(Color.GRAY);
            b2_4.setVisibility(View.VISIBLE);
            b2_5.setBackgroundColor(Color.TRANSPARENT);
            b2_5.setTextColor(Color.GRAY);
            b2_5.setVisibility(View.VISIBLE);
            b2_6.setBackgroundColor(Color.TRANSPARENT);
            b2_6.setTextColor(Color.GRAY);
            b2_6.setVisibility(View.VISIBLE);
            b2_7.setBackgroundColor(Color.TRANSPARENT);
            b2_7.setTextColor(Color.GRAY);
            b2_7.setVisibility(View.VISIBLE);
            b2_8.setBackgroundColor(Color.TRANSPARENT);
            b2_8.setTextColor(Color.GRAY);
            b2_8.setVisibility(View.VISIBLE);
            b2_9.setBackgroundColor(Color.TRANSPARENT);
            b2_9.setTextColor(Color.GRAY);
            b2_9.setVisibility(View.VISIBLE);
            b2_10.setBackgroundColor(Color.TRANSPARENT);
            b2_10.setTextColor(Color.GRAY);
            b2_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pb3.equals("1")){
            b3_1.setBackgroundColor(Color.TRANSPARENT);
            b3_1.setTextColor(Color.GRAY);
            b3_1.setVisibility(View.VISIBLE);
            b3_2.setBackgroundColor(Color.TRANSPARENT);
            b3_2.setTextColor(Color.GRAY);
            b3_2.setVisibility(View.VISIBLE);
            b3_3.setBackgroundColor(Color.TRANSPARENT);
            b3_3.setTextColor(Color.GRAY);
            b3_3.setVisibility(View.VISIBLE);
            b3_4.setBackgroundColor(Color.TRANSPARENT);
            b3_4.setTextColor(Color.GRAY);
            b3_4.setVisibility(View.VISIBLE);
            b3_5.setBackgroundColor(Color.TRANSPARENT);
            b3_5.setTextColor(Color.GRAY);
            b3_5.setVisibility(View.VISIBLE);
            b3_6.setBackgroundColor(Color.TRANSPARENT);
            b3_6.setTextColor(Color.GRAY);
            b3_6.setVisibility(View.VISIBLE);
            b3_7.setBackgroundColor(Color.TRANSPARENT);
            b3_7.setTextColor(Color.GRAY);
            b3_7.setVisibility(View.VISIBLE);
            b3_8.setBackgroundColor(Color.TRANSPARENT);
            b3_8.setTextColor(Color.GRAY);
            b3_8.setVisibility(View.VISIBLE);
            b3_9.setBackgroundColor(Color.TRANSPARENT);
            b3_9.setTextColor(Color.GRAY);
            b3_9.setVisibility(View.VISIBLE);
            b3_10.setBackgroundColor(Color.TRANSPARENT);
            b3_10.setTextColor(Color.GRAY);
            b3_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pb4.equals("1")){
            b4_1.setBackgroundColor(Color.TRANSPARENT);
            b4_1.setTextColor(Color.GRAY);
            b4_1.setVisibility(View.VISIBLE);
            b4_2.setBackgroundColor(Color.TRANSPARENT);
            b4_2.setTextColor(Color.GRAY);
            b4_2.setVisibility(View.VISIBLE);
            b4_3.setBackgroundColor(Color.TRANSPARENT);
            b4_3.setTextColor(Color.GRAY);
            b4_3.setVisibility(View.VISIBLE);
            b4_4.setBackgroundColor(Color.TRANSPARENT);
            b4_4.setTextColor(Color.GRAY);
            b4_4.setVisibility(View.VISIBLE);
            b4_5.setBackgroundColor(Color.TRANSPARENT);
            b4_5.setTextColor(Color.GRAY);
            b4_5.setVisibility(View.VISIBLE);
            b4_6.setBackgroundColor(Color.TRANSPARENT);
            b4_6.setTextColor(Color.GRAY);
            b4_6.setVisibility(View.VISIBLE);
            b4_7.setBackgroundColor(Color.TRANSPARENT);
            b4_7.setTextColor(Color.GRAY);
            b4_7.setVisibility(View.VISIBLE);
            b4_8.setBackgroundColor(Color.TRANSPARENT);
            b4_8.setTextColor(Color.GRAY);
            b4_8.setVisibility(View.VISIBLE);
            b4_9.setBackgroundColor(Color.TRANSPARENT);
            b4_9.setTextColor(Color.GRAY);
            b4_9.setVisibility(View.VISIBLE);
            b4_10.setBackgroundColor(Color.TRANSPARENT);
            b4_10.setTextColor(Color.GRAY);
            b4_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pb5.equals("1")){
            b5_1.setBackgroundColor(Color.TRANSPARENT);
            b5_1.setTextColor(Color.GRAY);
            b5_1.setVisibility(View.VISIBLE);
            b5_2.setBackgroundColor(Color.TRANSPARENT);
            b5_2.setTextColor(Color.GRAY);
            b5_2.setVisibility(View.VISIBLE);
            b5_3.setBackgroundColor(Color.TRANSPARENT);
            b5_3.setTextColor(Color.GRAY);
            b5_3.setVisibility(View.VISIBLE);
            b5_4.setBackgroundColor(Color.TRANSPARENT);
            b5_4.setTextColor(Color.GRAY);
            b5_4.setVisibility(View.VISIBLE);
            b5_5.setBackgroundColor(Color.TRANSPARENT);
            b5_5.setTextColor(Color.GRAY);
            b5_5.setVisibility(View.VISIBLE);
            b5_6.setBackgroundColor(Color.TRANSPARENT);
            b5_6.setTextColor(Color.GRAY);
            b5_6.setVisibility(View.VISIBLE);
            b5_7.setBackgroundColor(Color.TRANSPARENT);
            b5_7.setTextColor(Color.GRAY);
            b5_7.setVisibility(View.VISIBLE);
            b5_8.setBackgroundColor(Color.TRANSPARENT);
            b5_8.setTextColor(Color.GRAY);
            b5_8.setVisibility(View.VISIBLE);
            b5_9.setBackgroundColor(Color.TRANSPARENT);
            b5_9.setTextColor(Color.GRAY);
            b5_9.setVisibility(View.VISIBLE);
            b5_10.setBackgroundColor(Color.TRANSPARENT);
            b5_10.setTextColor(Color.GRAY);
            b5_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pi1.equals("1")){
            i1_1.setBackgroundColor(Color.TRANSPARENT);
            i1_1.setTextColor(Color.GRAY);
            i1_1.setVisibility(View.VISIBLE);
            i1_2.setBackgroundColor(Color.TRANSPARENT);
            i1_2.setTextColor(Color.GRAY);
            i1_2.setVisibility(View.VISIBLE);
            i1_3.setBackgroundColor(Color.TRANSPARENT);
            i1_3.setTextColor(Color.GRAY);
            i1_3.setVisibility(View.VISIBLE);
            i1_4.setBackgroundColor(Color.TRANSPARENT);
            i1_4.setTextColor(Color.GRAY);
            i1_4.setVisibility(View.VISIBLE);
            i1_5.setBackgroundColor(Color.TRANSPARENT);
            i1_5.setTextColor(Color.GRAY);
            i1_5.setVisibility(View.VISIBLE);
            i1_6.setBackgroundColor(Color.TRANSPARENT);
            i1_6.setTextColor(Color.GRAY);
            i1_6.setVisibility(View.VISIBLE);
            i1_7.setBackgroundColor(Color.TRANSPARENT);
            i1_7.setTextColor(Color.GRAY);
            i1_7.setVisibility(View.VISIBLE);
            i1_8.setBackgroundColor(Color.TRANSPARENT);
            i1_8.setTextColor(Color.GRAY);
            i1_8.setVisibility(View.VISIBLE);
            i1_9.setBackgroundColor(Color.TRANSPARENT);
            i1_9.setTextColor(Color.GRAY);
            i1_9.setVisibility(View.VISIBLE);
            i1_10.setBackgroundColor(Color.TRANSPARENT);
            i1_10.setTextColor(Color.GRAY);
            i1_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pi2.equals("1")){
            i2_1.setBackgroundColor(Color.TRANSPARENT);
            i2_1.setTextColor(Color.GRAY);
            i2_1.setVisibility(View.VISIBLE);
            i2_2.setBackgroundColor(Color.TRANSPARENT);
            i2_2.setTextColor(Color.GRAY);
            i2_2.setVisibility(View.VISIBLE);
            i2_3.setBackgroundColor(Color.TRANSPARENT);
            i2_3.setTextColor(Color.GRAY);
            i2_3.setVisibility(View.VISIBLE);
            i2_4.setBackgroundColor(Color.TRANSPARENT);
            i2_4.setTextColor(Color.GRAY);
            i2_4.setVisibility(View.VISIBLE);
            i2_5.setBackgroundColor(Color.TRANSPARENT);
            i2_5.setTextColor(Color.GRAY);
            i2_5.setVisibility(View.VISIBLE);
            i2_6.setBackgroundColor(Color.TRANSPARENT);
            i2_6.setTextColor(Color.GRAY);
            i2_6.setVisibility(View.VISIBLE);
            i2_7.setBackgroundColor(Color.TRANSPARENT);
            i2_7.setTextColor(Color.GRAY);
            i2_7.setVisibility(View.VISIBLE);
            i2_8.setBackgroundColor(Color.TRANSPARENT);
            i2_8.setTextColor(Color.GRAY);
            i2_8.setVisibility(View.VISIBLE);
            i2_9.setBackgroundColor(Color.TRANSPARENT);
            i2_9.setTextColor(Color.GRAY);
            i2_9.setVisibility(View.VISIBLE);
            i2_10.setBackgroundColor(Color.TRANSPARENT);
            i2_10.setTextColor(Color.GRAY);
            i2_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pi3.equals("1")){
            i3_1.setBackgroundColor(Color.TRANSPARENT);
            i3_1.setTextColor(Color.GRAY);
            i3_1.setVisibility(View.VISIBLE);
            i3_2.setBackgroundColor(Color.TRANSPARENT);
            i3_2.setTextColor(Color.GRAY);
            i3_2.setVisibility(View.VISIBLE);
            i3_3.setBackgroundColor(Color.TRANSPARENT);
            i3_3.setTextColor(Color.GRAY);
            i3_3.setVisibility(View.VISIBLE);
            i3_4.setBackgroundColor(Color.TRANSPARENT);
            i3_4.setTextColor(Color.GRAY);
            i3_4.setVisibility(View.VISIBLE);
            i3_5.setBackgroundColor(Color.TRANSPARENT);
            i3_5.setTextColor(Color.GRAY);
            i3_5.setVisibility(View.VISIBLE);
            i3_6.setBackgroundColor(Color.TRANSPARENT);
            i3_6.setTextColor(Color.GRAY);
            i3_6.setVisibility(View.VISIBLE);
            i3_7.setBackgroundColor(Color.TRANSPARENT);
            i3_7.setTextColor(Color.GRAY);
            i3_7.setVisibility(View.VISIBLE);
            i3_8.setBackgroundColor(Color.TRANSPARENT);
            i3_8.setTextColor(Color.GRAY);
            i3_8.setVisibility(View.VISIBLE);
            i3_9.setBackgroundColor(Color.TRANSPARENT);
            i3_9.setTextColor(Color.GRAY);
            i3_9.setVisibility(View.VISIBLE);
            i3_10.setBackgroundColor(Color.TRANSPARENT);
            i3_10.setTextColor(Color.GRAY);
            i3_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pi4.equals("1")){
            i4_1.setBackgroundColor(Color.TRANSPARENT);
            i4_1.setTextColor(Color.GRAY);
            i4_1.setVisibility(View.VISIBLE);
            i4_2.setBackgroundColor(Color.TRANSPARENT);
            i4_2.setTextColor(Color.GRAY);
            i4_2.setVisibility(View.VISIBLE);
            i4_3.setBackgroundColor(Color.TRANSPARENT);
            i4_3.setTextColor(Color.GRAY);
            i4_3.setVisibility(View.VISIBLE);
            i4_4.setBackgroundColor(Color.TRANSPARENT);
            i4_4.setTextColor(Color.GRAY);
            i4_4.setVisibility(View.VISIBLE);
            i4_5.setBackgroundColor(Color.TRANSPARENT);
            i4_5.setTextColor(Color.GRAY);
            i4_5.setVisibility(View.VISIBLE);
            i4_6.setBackgroundColor(Color.TRANSPARENT);
            i4_6.setTextColor(Color.GRAY);
            i4_6.setVisibility(View.VISIBLE);
            i4_7.setBackgroundColor(Color.TRANSPARENT);
            i4_7.setTextColor(Color.GRAY);
            i4_7.setVisibility(View.VISIBLE);
            i4_8.setBackgroundColor(Color.TRANSPARENT);
            i4_8.setTextColor(Color.GRAY);
            i4_8.setVisibility(View.VISIBLE);
            i4_9.setBackgroundColor(Color.TRANSPARENT);
            i4_9.setTextColor(Color.GRAY);
            i4_9.setVisibility(View.VISIBLE);
            i4_10.setBackgroundColor(Color.TRANSPARENT);
            i4_10.setTextColor(Color.GRAY);
            i4_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pi5.equals("1")){
            i5_1.setBackgroundColor(Color.TRANSPARENT);
            i5_1.setTextColor(Color.GRAY);
            i5_1.setVisibility(View.VISIBLE);
            i5_2.setBackgroundColor(Color.TRANSPARENT);
            i5_2.setTextColor(Color.GRAY);
            i5_2.setVisibility(View.VISIBLE);
            i5_3.setBackgroundColor(Color.TRANSPARENT);
            i5_3.setTextColor(Color.GRAY);
            i5_3.setVisibility(View.VISIBLE);
            i5_4.setBackgroundColor(Color.TRANSPARENT);
            i5_4.setTextColor(Color.GRAY);
            i5_4.setVisibility(View.VISIBLE);
            i5_5.setBackgroundColor(Color.TRANSPARENT);
            i5_5.setTextColor(Color.GRAY);
            i5_5.setVisibility(View.VISIBLE);
            i5_6.setBackgroundColor(Color.TRANSPARENT);
            i5_6.setTextColor(Color.GRAY);
            i5_6.setVisibility(View.VISIBLE);
            i5_7.setBackgroundColor(Color.TRANSPARENT);
            i5_7.setTextColor(Color.GRAY);
            i5_7.setVisibility(View.VISIBLE);
            i5_8.setBackgroundColor(Color.TRANSPARENT);
            i5_8.setTextColor(Color.GRAY);
            i5_8.setVisibility(View.VISIBLE);
            i5_9.setBackgroundColor(Color.TRANSPARENT);
            i5_9.setTextColor(Color.GRAY);
            i5_9.setVisibility(View.VISIBLE);
            i5_10.setBackgroundColor(Color.TRANSPARENT);
            i5_10.setTextColor(Color.GRAY);
            i5_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pn1.equals("1")){
            n1_1.setBackgroundColor(Color.TRANSPARENT);
            n1_1.setTextColor(Color.GRAY);
            n1_1.setVisibility(View.VISIBLE);
            n1_2.setBackgroundColor(Color.TRANSPARENT);
            n1_2.setTextColor(Color.GRAY);
            n1_2.setVisibility(View.VISIBLE);
            n1_3.setBackgroundColor(Color.TRANSPARENT);
            n1_3.setTextColor(Color.GRAY);
            n1_3.setVisibility(View.VISIBLE);
            n1_4.setBackgroundColor(Color.TRANSPARENT);
            n1_4.setTextColor(Color.GRAY);
            n1_4.setVisibility(View.VISIBLE);
            n1_5.setBackgroundColor(Color.TRANSPARENT);
            n1_5.setTextColor(Color.GRAY);
            n1_5.setVisibility(View.VISIBLE);
            n1_6.setBackgroundColor(Color.TRANSPARENT);
            n1_6.setTextColor(Color.GRAY);
            n1_6.setVisibility(View.VISIBLE);
            n1_7.setBackgroundColor(Color.TRANSPARENT);
            n1_7.setTextColor(Color.GRAY);
            n1_7.setVisibility(View.VISIBLE);
            n1_8.setBackgroundColor(Color.TRANSPARENT);
            n1_8.setTextColor(Color.GRAY);
            n1_8.setVisibility(View.VISIBLE);
            n1_9.setBackgroundColor(Color.TRANSPARENT);
            n1_9.setTextColor(Color.GRAY);
            n1_9.setVisibility(View.VISIBLE);
            n1_10.setBackgroundColor(Color.TRANSPARENT);
            n1_10.setTextColor(Color.GRAY);
            n1_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pn2.equals("1")){
            n2_1.setBackgroundColor(Color.TRANSPARENT);
            n2_1.setTextColor(Color.GRAY);
            n2_1.setVisibility(View.VISIBLE);
            n2_2.setBackgroundColor(Color.TRANSPARENT);
            n2_2.setTextColor(Color.GRAY);
            n2_2.setVisibility(View.VISIBLE);
            n2_3.setBackgroundColor(Color.TRANSPARENT);
            n2_3.setTextColor(Color.GRAY);
            n2_3.setVisibility(View.VISIBLE);
            n2_4.setBackgroundColor(Color.TRANSPARENT);
            n2_4.setTextColor(Color.GRAY);
            n2_4.setVisibility(View.VISIBLE);
            n2_5.setBackgroundColor(Color.TRANSPARENT);
            n2_5.setTextColor(Color.GRAY);
            n2_5.setVisibility(View.VISIBLE);
            n2_6.setBackgroundColor(Color.TRANSPARENT);
            n2_6.setTextColor(Color.GRAY);
            n2_6.setVisibility(View.VISIBLE);
            n2_7.setBackgroundColor(Color.TRANSPARENT);
            n2_7.setTextColor(Color.GRAY);
            n2_7.setVisibility(View.VISIBLE);
            n2_8.setBackgroundColor(Color.TRANSPARENT);
            n2_8.setTextColor(Color.GRAY);
            n2_8.setVisibility(View.VISIBLE);
            n2_9.setBackgroundColor(Color.TRANSPARENT);
            n2_9.setTextColor(Color.GRAY);
            n2_9.setVisibility(View.VISIBLE);
            n2_10.setBackgroundColor(Color.TRANSPARENT);
            n2_10.setTextColor(Color.GRAY);
            n2_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pn4.equals("1")){
            n4_1.setBackgroundColor(Color.TRANSPARENT);
            n4_1.setTextColor(Color.GRAY);
            n4_1.setVisibility(View.VISIBLE);
            n4_2.setBackgroundColor(Color.TRANSPARENT);
            n4_2.setTextColor(Color.GRAY);
            n4_2.setVisibility(View.VISIBLE);
            n4_3.setBackgroundColor(Color.TRANSPARENT);
            n4_3.setTextColor(Color.GRAY);
            n4_3.setVisibility(View.VISIBLE);
            n4_4.setBackgroundColor(Color.TRANSPARENT);
            n4_4.setTextColor(Color.GRAY);
            n4_4.setVisibility(View.VISIBLE);
            n4_5.setBackgroundColor(Color.TRANSPARENT);
            n4_5.setTextColor(Color.GRAY);
            n4_5.setVisibility(View.VISIBLE);
            n4_6.setBackgroundColor(Color.TRANSPARENT);
            n4_6.setTextColor(Color.GRAY);
            n4_6.setVisibility(View.VISIBLE);
            n4_7.setBackgroundColor(Color.TRANSPARENT);
            n4_7.setTextColor(Color.GRAY);
            n4_7.setVisibility(View.VISIBLE);
            n4_8.setBackgroundColor(Color.TRANSPARENT);
            n4_8.setTextColor(Color.GRAY);
            n4_8.setVisibility(View.VISIBLE);
            n4_9.setBackgroundColor(Color.TRANSPARENT);
            n4_9.setTextColor(Color.GRAY);
            n4_9.setVisibility(View.VISIBLE);
            n4_10.setBackgroundColor(Color.TRANSPARENT);
            n4_10.setTextColor(Color.GRAY);
            n4_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pn5.equals("1")){
            n5_1.setBackgroundColor(Color.TRANSPARENT);
            n5_1.setTextColor(Color.GRAY);
            n5_1.setVisibility(View.VISIBLE);
            n5_2.setBackgroundColor(Color.TRANSPARENT);
            n5_2.setTextColor(Color.GRAY);
            n5_2.setVisibility(View.VISIBLE);
            n5_3.setBackgroundColor(Color.TRANSPARENT);
            n5_3.setTextColor(Color.GRAY);
            n5_3.setVisibility(View.VISIBLE);
            n5_4.setBackgroundColor(Color.TRANSPARENT);
            n5_4.setTextColor(Color.GRAY);
            n5_4.setVisibility(View.VISIBLE);
            n5_5.setBackgroundColor(Color.TRANSPARENT);
            n5_5.setTextColor(Color.GRAY);
            n5_5.setVisibility(View.VISIBLE);
            n5_6.setBackgroundColor(Color.TRANSPARENT);
            n5_6.setTextColor(Color.GRAY);
            n5_6.setVisibility(View.VISIBLE);
            n5_7.setBackgroundColor(Color.TRANSPARENT);
            n5_7.setTextColor(Color.GRAY);
            n5_7.setVisibility(View.VISIBLE);
            n5_8.setBackgroundColor(Color.TRANSPARENT);
            n5_8.setTextColor(Color.GRAY);
            n5_8.setVisibility(View.VISIBLE);
            n5_9.setBackgroundColor(Color.TRANSPARENT);
            n5_9.setTextColor(Color.GRAY);
            n5_9.setVisibility(View.VISIBLE);
            n5_10.setBackgroundColor(Color.TRANSPARENT);
            n5_10.setTextColor(Color.GRAY);
            n5_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pg1.equals("1")){
            g1_1.setBackgroundColor(Color.TRANSPARENT);
            g1_1.setTextColor(Color.GRAY);
            g1_1.setVisibility(View.VISIBLE);
            g1_2.setBackgroundColor(Color.TRANSPARENT);
            g1_2.setTextColor(Color.GRAY);
            g1_2.setVisibility(View.VISIBLE);
            g1_3.setBackgroundColor(Color.TRANSPARENT);
            g1_3.setTextColor(Color.GRAY);
            g1_3.setVisibility(View.VISIBLE);
            g1_4.setBackgroundColor(Color.TRANSPARENT);
            g1_4.setTextColor(Color.GRAY);
            g1_4.setVisibility(View.VISIBLE);
            g1_5.setBackgroundColor(Color.TRANSPARENT);
            g1_5.setTextColor(Color.GRAY);
            g1_5.setVisibility(View.VISIBLE);
            g1_6.setBackgroundColor(Color.TRANSPARENT);
            g1_6.setTextColor(Color.GRAY);
            g1_6.setVisibility(View.VISIBLE);
            g1_7.setBackgroundColor(Color.TRANSPARENT);
            g1_7.setTextColor(Color.GRAY);
            g1_7.setVisibility(View.VISIBLE);
            g1_8.setBackgroundColor(Color.TRANSPARENT);
            g1_8.setTextColor(Color.GRAY);
            g1_8.setVisibility(View.VISIBLE);
            g1_9.setBackgroundColor(Color.TRANSPARENT);
            g1_9.setTextColor(Color.GRAY);
            g1_9.setVisibility(View.VISIBLE);
            g1_10.setBackgroundColor(Color.TRANSPARENT);
            g1_10.setTextColor(Color.GRAY);
            g1_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pg2.equals("1")){
            g2_1.setBackgroundColor(Color.TRANSPARENT);
            g2_1.setTextColor(Color.GRAY);
            g2_1.setVisibility(View.VISIBLE);
            g2_2.setBackgroundColor(Color.TRANSPARENT);
            g2_2.setTextColor(Color.GRAY);
            g2_2.setVisibility(View.VISIBLE);
            g2_3.setBackgroundColor(Color.TRANSPARENT);
            g2_3.setTextColor(Color.GRAY);
            g2_3.setVisibility(View.VISIBLE);
            g2_4.setBackgroundColor(Color.TRANSPARENT);
            g2_4.setTextColor(Color.GRAY);
            g2_4.setVisibility(View.VISIBLE);
            g2_5.setBackgroundColor(Color.TRANSPARENT);
            g2_5.setTextColor(Color.GRAY);
            g2_5.setVisibility(View.VISIBLE);
            g2_6.setBackgroundColor(Color.TRANSPARENT);
            g2_6.setTextColor(Color.GRAY);
            g2_6.setVisibility(View.VISIBLE);
            g2_7.setBackgroundColor(Color.TRANSPARENT);
            g2_7.setTextColor(Color.GRAY);
            g2_7.setVisibility(View.VISIBLE);
            g2_8.setBackgroundColor(Color.TRANSPARENT);
            g2_8.setTextColor(Color.GRAY);
            g2_8.setVisibility(View.VISIBLE);
            g2_9.setBackgroundColor(Color.TRANSPARENT);
            g2_9.setTextColor(Color.GRAY);
            g2_9.setVisibility(View.VISIBLE);
            g2_10.setBackgroundColor(Color.TRANSPARENT);
            g2_10.setTextColor(Color.GRAY);
            g2_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pg3.equals("1")){
            g3_1.setBackgroundColor(Color.TRANSPARENT);
            g3_1.setTextColor(Color.GRAY);
            g3_1.setVisibility(View.VISIBLE);
            g3_2.setBackgroundColor(Color.TRANSPARENT);
            g3_2.setTextColor(Color.GRAY);
            g3_2.setVisibility(View.VISIBLE);
            g3_3.setBackgroundColor(Color.TRANSPARENT);
            g3_3.setTextColor(Color.GRAY);
            g3_3.setVisibility(View.VISIBLE);
            g3_4.setBackgroundColor(Color.TRANSPARENT);
            g3_4.setTextColor(Color.GRAY);
            g3_4.setVisibility(View.VISIBLE);
            g3_5.setBackgroundColor(Color.TRANSPARENT);
            g3_5.setTextColor(Color.GRAY);
            g3_5.setVisibility(View.VISIBLE);
            g3_6.setBackgroundColor(Color.TRANSPARENT);
            g3_6.setTextColor(Color.GRAY);
            g3_6.setVisibility(View.VISIBLE);
            g3_7.setBackgroundColor(Color.TRANSPARENT);
            g3_7.setTextColor(Color.GRAY);
            g3_7.setVisibility(View.VISIBLE);
            g3_8.setBackgroundColor(Color.TRANSPARENT);
            g3_8.setTextColor(Color.GRAY);
            g3_8.setVisibility(View.VISIBLE);
            g3_9.setBackgroundColor(Color.TRANSPARENT);
            g3_9.setTextColor(Color.GRAY);
            g3_9.setVisibility(View.VISIBLE);
            g3_10.setBackgroundColor(Color.TRANSPARENT);
            g3_10.setTextColor(Color.GRAY);
            g3_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pg4.equals("1")){
            g4_1.setBackgroundColor(Color.TRANSPARENT);
            g4_1.setTextColor(Color.GRAY);
            g4_1.setVisibility(View.VISIBLE);
            g4_2.setBackgroundColor(Color.TRANSPARENT);
            g4_2.setTextColor(Color.GRAY);
            g4_2.setVisibility(View.VISIBLE);
            g4_3.setBackgroundColor(Color.TRANSPARENT);
            g4_3.setTextColor(Color.GRAY);
            g4_3.setVisibility(View.VISIBLE);
            g4_4.setBackgroundColor(Color.TRANSPARENT);
            g4_4.setTextColor(Color.GRAY);
            g4_4.setVisibility(View.VISIBLE);
            g4_5.setBackgroundColor(Color.TRANSPARENT);
            g4_5.setTextColor(Color.GRAY);
            g4_5.setVisibility(View.VISIBLE);
            g4_6.setBackgroundColor(Color.TRANSPARENT);
            g4_6.setTextColor(Color.GRAY);
            g4_6.setVisibility(View.VISIBLE);
            g4_7.setBackgroundColor(Color.TRANSPARENT);
            g4_7.setTextColor(Color.GRAY);
            g4_7.setVisibility(View.VISIBLE);
            g4_8.setBackgroundColor(Color.TRANSPARENT);
            g4_8.setTextColor(Color.GRAY);
            g4_8.setVisibility(View.VISIBLE);
            g4_9.setBackgroundColor(Color.TRANSPARENT);
            g4_9.setTextColor(Color.GRAY);
            g4_9.setVisibility(View.VISIBLE);
            g4_10.setBackgroundColor(Color.TRANSPARENT);
            g4_10.setTextColor(Color.GRAY);
            g4_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.pg5.equals("1")){
            g5_1.setBackgroundColor(Color.TRANSPARENT);
            g5_1.setTextColor(Color.GRAY);
            g5_1.setVisibility(View.VISIBLE);
            g5_2.setBackgroundColor(Color.TRANSPARENT);
            g5_2.setTextColor(Color.GRAY);
            g5_2.setVisibility(View.VISIBLE);
            g5_3.setBackgroundColor(Color.TRANSPARENT);
            g5_3.setTextColor(Color.GRAY);
            g5_3.setVisibility(View.VISIBLE);
            g5_4.setBackgroundColor(Color.TRANSPARENT);
            g5_4.setTextColor(Color.GRAY);
            g5_4.setVisibility(View.VISIBLE);
            g5_5.setBackgroundColor(Color.TRANSPARENT);
            g5_5.setTextColor(Color.GRAY);
            g5_5.setVisibility(View.VISIBLE);
            g5_6.setBackgroundColor(Color.TRANSPARENT);
            g5_6.setTextColor(Color.GRAY);
            g5_6.setVisibility(View.VISIBLE);
            g5_7.setBackgroundColor(Color.TRANSPARENT);
            g5_7.setTextColor(Color.GRAY);
            g5_7.setVisibility(View.VISIBLE);
            g5_8.setBackgroundColor(Color.TRANSPARENT);
            g5_8.setTextColor(Color.GRAY);
            g5_8.setVisibility(View.VISIBLE);
            g5_9.setBackgroundColor(Color.TRANSPARENT);
            g5_9.setTextColor(Color.GRAY);
            g5_9.setVisibility(View.VISIBLE);
            g5_10.setBackgroundColor(Color.TRANSPARENT);
            g5_10.setTextColor(Color.GRAY);
            g5_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.po1.equals("1")){
            o1_1.setBackgroundColor(Color.TRANSPARENT);
            o1_1.setTextColor(Color.GRAY);
            o1_1.setVisibility(View.VISIBLE);
            o1_2.setBackgroundColor(Color.TRANSPARENT);
            o1_2.setTextColor(Color.GRAY);
            o1_2.setVisibility(View.VISIBLE);
            o1_3.setBackgroundColor(Color.TRANSPARENT);
            o1_3.setTextColor(Color.GRAY);
            o1_3.setVisibility(View.VISIBLE);
            o1_4.setBackgroundColor(Color.TRANSPARENT);
            o1_4.setTextColor(Color.GRAY);
            o1_4.setVisibility(View.VISIBLE);
            o1_5.setBackgroundColor(Color.TRANSPARENT);
            o1_5.setTextColor(Color.GRAY);
            o1_5.setVisibility(View.VISIBLE);
            o1_6.setBackgroundColor(Color.TRANSPARENT);
            o1_6.setTextColor(Color.GRAY);
            o1_6.setVisibility(View.VISIBLE);
            o1_7.setBackgroundColor(Color.TRANSPARENT);
            o1_7.setTextColor(Color.GRAY);
            o1_7.setVisibility(View.VISIBLE);
            o1_8.setBackgroundColor(Color.TRANSPARENT);
            o1_8.setTextColor(Color.GRAY);
            o1_8.setVisibility(View.VISIBLE);
            o1_9.setBackgroundColor(Color.TRANSPARENT);
            o1_9.setTextColor(Color.GRAY);
            o1_9.setVisibility(View.VISIBLE);
            o1_10.setBackgroundColor(Color.TRANSPARENT);
            o1_10.setTextColor(Color.GRAY);
            o1_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.po2.equals("1")){
            o2_1.setBackgroundColor(Color.TRANSPARENT);
            o2_1.setTextColor(Color.GRAY);
            o2_1.setVisibility(View.VISIBLE);
            o2_2.setBackgroundColor(Color.TRANSPARENT);
            o2_2.setTextColor(Color.GRAY);
            o2_2.setVisibility(View.VISIBLE);
            o2_3.setBackgroundColor(Color.TRANSPARENT);
            o2_3.setTextColor(Color.GRAY);
            o2_3.setVisibility(View.VISIBLE);
            o2_4.setBackgroundColor(Color.TRANSPARENT);
            o2_4.setTextColor(Color.GRAY);
            o2_4.setVisibility(View.VISIBLE);
            o2_5.setBackgroundColor(Color.TRANSPARENT);
            o2_5.setTextColor(Color.GRAY);
            o2_5.setVisibility(View.VISIBLE);
            o2_6.setBackgroundColor(Color.TRANSPARENT);
            o2_6.setTextColor(Color.GRAY);
            o2_6.setVisibility(View.VISIBLE);
            o2_7.setBackgroundColor(Color.TRANSPARENT);
            o2_7.setTextColor(Color.GRAY);
            o2_7.setVisibility(View.VISIBLE);
            o2_8.setBackgroundColor(Color.TRANSPARENT);
            o2_8.setTextColor(Color.GRAY);
            o2_8.setVisibility(View.VISIBLE);
            o2_9.setBackgroundColor(Color.TRANSPARENT);
            o2_9.setTextColor(Color.GRAY);
            o2_9.setVisibility(View.VISIBLE);
            o2_10.setBackgroundColor(Color.TRANSPARENT);
            o2_10.setTextColor(Color.GRAY);
            o2_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.po3.equals("1")){
            o3_1.setBackgroundColor(Color.TRANSPARENT);
            o3_1.setTextColor(Color.GRAY);
            o3_1.setVisibility(View.VISIBLE);
            o3_2.setBackgroundColor(Color.TRANSPARENT);
            o3_2.setTextColor(Color.GRAY);
            o3_2.setVisibility(View.VISIBLE);
            o3_3.setBackgroundColor(Color.TRANSPARENT);
            o3_3.setTextColor(Color.GRAY);
            o3_3.setVisibility(View.VISIBLE);
            o3_4.setBackgroundColor(Color.TRANSPARENT);
            o3_4.setTextColor(Color.GRAY);
            o3_4.setVisibility(View.VISIBLE);
            o3_5.setBackgroundColor(Color.TRANSPARENT);
            o3_5.setTextColor(Color.GRAY);
            o3_5.setVisibility(View.VISIBLE);
            o3_6.setBackgroundColor(Color.TRANSPARENT);
            o3_6.setTextColor(Color.GRAY);
            o3_6.setVisibility(View.VISIBLE);
            o3_7.setBackgroundColor(Color.TRANSPARENT);
            o3_7.setTextColor(Color.GRAY);
            o3_7.setVisibility(View.VISIBLE);
            o3_8.setBackgroundColor(Color.TRANSPARENT);
            o3_8.setTextColor(Color.GRAY);
            o3_8.setVisibility(View.VISIBLE);
            o3_9.setBackgroundColor(Color.TRANSPARENT);
            o3_9.setTextColor(Color.GRAY);
            o3_9.setVisibility(View.VISIBLE);
            o3_10.setBackgroundColor(Color.TRANSPARENT);
            o3_10.setTextColor(Color.GRAY);
            o3_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.po4.equals("1")){
            o4_1.setBackgroundColor(Color.TRANSPARENT);
            o4_1.setTextColor(Color.GRAY);
            o4_1.setVisibility(View.VISIBLE);
            o4_2.setBackgroundColor(Color.TRANSPARENT);
            o4_2.setTextColor(Color.GRAY);
            o4_2.setVisibility(View.VISIBLE);
            o4_3.setBackgroundColor(Color.TRANSPARENT);
            o4_3.setTextColor(Color.GRAY);
            o4_3.setVisibility(View.VISIBLE);
            o4_4.setBackgroundColor(Color.TRANSPARENT);
            o4_4.setTextColor(Color.GRAY);
            o4_4.setVisibility(View.VISIBLE);
            o4_5.setBackgroundColor(Color.TRANSPARENT);
            o4_5.setTextColor(Color.GRAY);
            o4_5.setVisibility(View.VISIBLE);
            o4_6.setBackgroundColor(Color.TRANSPARENT);
            o4_6.setTextColor(Color.GRAY);
            o4_6.setVisibility(View.VISIBLE);
            o4_7.setBackgroundColor(Color.TRANSPARENT);
            o4_7.setTextColor(Color.GRAY);
            o4_7.setVisibility(View.VISIBLE);
            o4_8.setBackgroundColor(Color.TRANSPARENT);
            o4_8.setTextColor(Color.GRAY);
            o4_8.setVisibility(View.VISIBLE);
            o4_9.setBackgroundColor(Color.TRANSPARENT);
            o4_9.setTextColor(Color.GRAY);
            o4_9.setVisibility(View.VISIBLE);
            o4_10.setBackgroundColor(Color.TRANSPARENT);
            o4_10.setTextColor(Color.GRAY);
            o4_10.setVisibility(View.VISIBLE);
        }
        if (PatternClassOnly.po5.equals("1")){
            o5_1.setBackgroundColor(Color.TRANSPARENT);
            o5_1.setTextColor(Color.GRAY);
            o5_1.setVisibility(View.VISIBLE);
            o5_2.setBackgroundColor(Color.TRANSPARENT);
            o5_2.setTextColor(Color.GRAY);
            o5_2.setVisibility(View.VISIBLE);
            o5_3.setBackgroundColor(Color.TRANSPARENT);
            o5_3.setTextColor(Color.GRAY);
            o5_3.setVisibility(View.VISIBLE);
            o5_4.setBackgroundColor(Color.TRANSPARENT);
            o5_4.setTextColor(Color.GRAY);
            o5_4.setVisibility(View.VISIBLE);
            o5_5.setBackgroundColor(Color.TRANSPARENT);
            o5_5.setTextColor(Color.GRAY);
            o5_5.setVisibility(View.VISIBLE);
            o5_6.setBackgroundColor(Color.TRANSPARENT);
            o5_6.setTextColor(Color.GRAY);
            o5_6.setVisibility(View.VISIBLE);
            o5_7.setBackgroundColor(Color.TRANSPARENT);
            o5_7.setTextColor(Color.GRAY);
            o5_7.setVisibility(View.VISIBLE);
            o5_8.setBackgroundColor(Color.TRANSPARENT);
            o5_8.setTextColor(Color.GRAY);
            o5_8.setVisibility(View.VISIBLE);
            o5_9.setBackgroundColor(Color.TRANSPARENT);
            o5_9.setTextColor(Color.GRAY);
            o5_9.setVisibility(View.VISIBLE);
            o5_10.setBackgroundColor(Color.TRANSPARENT);
            o5_10.setTextColor(Color.GRAY);
            o5_10.setVisibility(View.VISIBLE);
        }
    }

    void NumbersUpdate(){


        tv_CurrentNumber.setText("Current Number : " + PatternClassOnly.BingoCurrentNumber);
        tv_Bingo.setText(PatternClassOnly.bingoNameWinner);
        if (PatternClassOnly.patternStyle.equals("0")){
            tv_patternStyle.setText("PATTERN : BLACKOUT");
        } else if (PatternClassOnly.patternStyle.equals("1")) {
            tv_patternStyle.setText("PATTERN : First " + PatternClassOnly.patternFirstXNumbers + " numbers");
        } else if (PatternClassOnly.patternStyle.equals("2")) {
            tv_patternStyle.setText("PATTERN : Custom");
        }

        if (PatternClassOnly.row_b1_1.equals("1")){
            b1_1.setBackgroundColor(Color.GREEN);
            b1_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_1.equals("1")){
            b2_1.setBackgroundColor(Color.GREEN);
            b2_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_1.equals("1")){
            b3_1.setBackgroundColor(Color.GREEN);
            b3_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_1.equals("1")){
            b4_1.setBackgroundColor(Color.GREEN);
            b4_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_1.equals("1")){
            b5_1.setBackgroundColor(Color.GREEN);
            b5_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_1.equals("1")){
            i1_1.setBackgroundColor(Color.GREEN);
            i1_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_1.equals("1")){
            i2_1.setBackgroundColor(Color.GREEN);
            i2_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_1.equals("1")){
            i3_1.setBackgroundColor(Color.GREEN);
            i3_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_1.equals("1")){
            i4_1.setBackgroundColor(Color.GREEN);
            i4_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_1.equals("1")){
            i5_1.setBackgroundColor(Color.GREEN);
            i5_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_1.equals("1")){
            n1_1.setBackgroundColor(Color.GREEN);
            n1_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_1.equals("1")){
            n2_1.setBackgroundColor(Color.GREEN);
            n2_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_1.equals("1")){
            n4_1.setBackgroundColor(Color.GREEN);
            n4_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_1.equals("1")){
            n5_1.setBackgroundColor(Color.GREEN);
            n5_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_1.equals("1")){
            g1_1.setBackgroundColor(Color.GREEN);
            g1_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_1.equals("1")){
            g2_1.setBackgroundColor(Color.GREEN);
            g2_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_1.equals("1")){
            g3_1.setBackgroundColor(Color.GREEN);
            g3_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_1.equals("1")){
            g4_1.setBackgroundColor(Color.GREEN);
            g4_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_1.equals("1")){
            g5_1.setBackgroundColor(Color.GREEN);
            g5_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_1.equals("1")){
            o1_1.setBackgroundColor(Color.GREEN);
            o1_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_1.equals("1")){
            o2_1.setBackgroundColor(Color.GREEN);
            o2_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_1.equals("1")){
            o3_1.setBackgroundColor(Color.GREEN);
            o3_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_1.equals("1")){
            o4_1.setBackgroundColor(Color.GREEN);
            o4_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_1.equals("1")){
            o5_1.setBackgroundColor(Color.GREEN);
            o5_1.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_2.equals("1")){
            b1_2.setBackgroundColor(Color.GREEN);
            b1_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_2.equals("1")){
            b2_2.setBackgroundColor(Color.GREEN);
            b2_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_2.equals("1")){
            b3_2.setBackgroundColor(Color.GREEN);
            b3_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_2.equals("1")){
            b4_2.setBackgroundColor(Color.GREEN);
            b4_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_2.equals("1")){
            b5_2.setBackgroundColor(Color.GREEN);
            b5_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_2.equals("1")){
            i1_2.setBackgroundColor(Color.GREEN);
            i1_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_2.equals("1")){
            i2_2.setBackgroundColor(Color.GREEN);
            i2_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_2.equals("1")){
            i3_2.setBackgroundColor(Color.GREEN);
            i3_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_2.equals("1")){
            i4_2.setBackgroundColor(Color.GREEN);
            i4_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_2.equals("1")){
            i5_2.setBackgroundColor(Color.GREEN);
            i5_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_2.equals("1")){
            n1_2.setBackgroundColor(Color.GREEN);
            n1_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_2.equals("1")){
            n2_2.setBackgroundColor(Color.GREEN);
            n2_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_2.equals("1")){
            n4_2.setBackgroundColor(Color.GREEN);
            n4_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_2.equals("1")){
            n5_2.setBackgroundColor(Color.GREEN);
            n5_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_2.equals("1")){
            g1_2.setBackgroundColor(Color.GREEN);
            g1_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_2.equals("1")){
            g2_2.setBackgroundColor(Color.GREEN);
            g2_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_2.equals("1")){
            g3_2.setBackgroundColor(Color.GREEN);
            g3_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_2.equals("1")){
            g4_2.setBackgroundColor(Color.GREEN);
            g4_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_2.equals("1")){
            g5_2.setBackgroundColor(Color.GREEN);
            g5_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_2.equals("1")){
            o1_2.setBackgroundColor(Color.GREEN);
            o1_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_2.equals("1")){
            o2_2.setBackgroundColor(Color.GREEN);
            o2_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_2.equals("1")){
            o3_2.setBackgroundColor(Color.GREEN);
            o3_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_2.equals("1")){
            o4_2.setBackgroundColor(Color.GREEN);
            o4_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_2.equals("1")){
            o5_2.setBackgroundColor(Color.GREEN);
            o5_2.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_3.equals("1")){
            b1_3.setBackgroundColor(Color.GREEN);
            b1_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_3.equals("1")){
            b2_3.setBackgroundColor(Color.GREEN);
            b2_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_3.equals("1")){
            b3_3.setBackgroundColor(Color.GREEN);
            b3_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_3.equals("1")){
            b4_3.setBackgroundColor(Color.GREEN);
            b4_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_3.equals("1")){
            b5_3.setBackgroundColor(Color.GREEN);
            b5_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_3.equals("1")){
            i1_3.setBackgroundColor(Color.GREEN);
            i1_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_3.equals("1")){
            i2_3.setBackgroundColor(Color.GREEN);
            i2_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_3.equals("1")){
            i3_3.setBackgroundColor(Color.GREEN);
            i3_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_3.equals("1")){
            i4_3.setBackgroundColor(Color.GREEN);
            i4_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_3.equals("1")){
            i5_3.setBackgroundColor(Color.GREEN);
            i5_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_3.equals("1")){
            n1_3.setBackgroundColor(Color.GREEN);
            n1_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_3.equals("1")){
            n2_3.setBackgroundColor(Color.GREEN);
            n2_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_3.equals("1")){
            n4_3.setBackgroundColor(Color.GREEN);
            n4_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_3.equals("1")){
            n5_3.setBackgroundColor(Color.GREEN);
            n5_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_3.equals("1")){
            g1_3.setBackgroundColor(Color.GREEN);
            g1_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_3.equals("1")){
            g2_3.setBackgroundColor(Color.GREEN);
            g2_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_3.equals("1")){
            g3_3.setBackgroundColor(Color.GREEN);
            g3_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_3.equals("1")){
            g4_3.setBackgroundColor(Color.GREEN);
            g4_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_3.equals("1")){
            g5_3.setBackgroundColor(Color.GREEN);
            g5_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_3.equals("1")){
            o1_3.setBackgroundColor(Color.GREEN);
            o1_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_3.equals("1")){
            o2_3.setBackgroundColor(Color.GREEN);
            o2_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_3.equals("1")){
            o3_3.setBackgroundColor(Color.GREEN);
            o3_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_3.equals("1")){
            o4_3.setBackgroundColor(Color.GREEN);
            o4_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_3.equals("1")){
            o5_3.setBackgroundColor(Color.GREEN);
            o5_3.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_4.equals("1")){
            b1_4.setBackgroundColor(Color.GREEN);
            b1_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_4.equals("1")){
            b2_4.setBackgroundColor(Color.GREEN);
            b2_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_4.equals("1")){
            b3_4.setBackgroundColor(Color.GREEN);
            b3_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_4.equals("1")){
            b4_4.setBackgroundColor(Color.GREEN);
            b4_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_4.equals("1")){
            b5_4.setBackgroundColor(Color.GREEN);
            b5_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_4.equals("1")){
            i1_4.setBackgroundColor(Color.GREEN);
            i1_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_4.equals("1")){
            i2_4.setBackgroundColor(Color.GREEN);
            i2_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_4.equals("1")){
            i3_4.setBackgroundColor(Color.GREEN);
            i3_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_4.equals("1")){
            i4_4.setBackgroundColor(Color.GREEN);
            i4_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_4.equals("1")){
            i5_4.setBackgroundColor(Color.GREEN);
            i5_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_4.equals("1")){
            n1_4.setBackgroundColor(Color.GREEN);
            n1_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_4.equals("1")){
            n2_4.setBackgroundColor(Color.GREEN);
            n2_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_4.equals("1")){
            n4_4.setBackgroundColor(Color.GREEN);
            n4_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_4.equals("1")){
            n5_4.setBackgroundColor(Color.GREEN);
            n5_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_4.equals("1")){
            g1_4.setBackgroundColor(Color.GREEN);
            g1_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_4.equals("1")){
            g2_4.setBackgroundColor(Color.GREEN);
            g2_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_4.equals("1")){
            g3_4.setBackgroundColor(Color.GREEN);
            g3_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_4.equals("1")){
            g4_4.setBackgroundColor(Color.GREEN);
            g4_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_4.equals("1")){
            g5_4.setBackgroundColor(Color.GREEN);
            g5_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_4.equals("1")){
            o1_4.setBackgroundColor(Color.GREEN);
            o1_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_4.equals("1")){
            o2_4.setBackgroundColor(Color.GREEN);
            o2_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_4.equals("1")){
            o3_4.setBackgroundColor(Color.GREEN);
            o3_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_4.equals("1")){
            o4_4.setBackgroundColor(Color.GREEN);
            o4_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_4.equals("1")){
            o5_4.setBackgroundColor(Color.GREEN);
            o5_4.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_5.equals("1")){
            b1_5.setBackgroundColor(Color.GREEN);
            b1_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_5.equals("1")){
            b2_5.setBackgroundColor(Color.GREEN);
            b2_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_5.equals("1")){
            b3_5.setBackgroundColor(Color.GREEN);
            b3_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_5.equals("1")){
            b4_5.setBackgroundColor(Color.GREEN);
            b4_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_5.equals("1")){
            b5_5.setBackgroundColor(Color.GREEN);
            b5_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_5.equals("1")){
            i1_5.setBackgroundColor(Color.GREEN);
            i1_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_5.equals("1")){
            i2_5.setBackgroundColor(Color.GREEN);
            i2_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_5.equals("1")){
            i3_5.setBackgroundColor(Color.GREEN);
            i3_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_5.equals("1")){
            i4_5.setBackgroundColor(Color.GREEN);
            i4_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_5.equals("1")){
            i5_5.setBackgroundColor(Color.GREEN);
            i5_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_5.equals("1")){
            n1_5.setBackgroundColor(Color.GREEN);
            n1_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_5.equals("1")){
            n2_5.setBackgroundColor(Color.GREEN);
            n2_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_5.equals("1")){
            n4_5.setBackgroundColor(Color.GREEN);
            n4_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_5.equals("1")){
            n5_5.setBackgroundColor(Color.GREEN);
            n5_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_5.equals("1")){
            g1_5.setBackgroundColor(Color.GREEN);
            g1_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_5.equals("1")){
            g2_5.setBackgroundColor(Color.GREEN);
            g2_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_5.equals("1")){
            g3_5.setBackgroundColor(Color.GREEN);
            g3_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_5.equals("1")){
            g4_5.setBackgroundColor(Color.GREEN);
            g4_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_5.equals("1")){
            g5_5.setBackgroundColor(Color.GREEN);
            g5_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_5.equals("1")){
            o1_5.setBackgroundColor(Color.GREEN);
            o1_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_5.equals("1")){
            o2_5.setBackgroundColor(Color.GREEN);
            o2_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_5.equals("1")){
            o3_5.setBackgroundColor(Color.GREEN);
            o3_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_5.equals("1")){
            o4_5.setBackgroundColor(Color.GREEN);
            o4_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_5.equals("1")){
            o5_5.setBackgroundColor(Color.GREEN);
            o5_5.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_6.equals("1")){
            b1_6.setBackgroundColor(Color.GREEN);
            b1_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_6.equals("1")){
            b2_6.setBackgroundColor(Color.GREEN);
            b2_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_6.equals("1")){
            b3_6.setBackgroundColor(Color.GREEN);
            b3_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_6.equals("1")){
            b4_6.setBackgroundColor(Color.GREEN);
            b4_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_6.equals("1")){
            b5_6.setBackgroundColor(Color.GREEN);
            b5_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_6.equals("1")){
            i1_6.setBackgroundColor(Color.GREEN);
            i1_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_6.equals("1")){
            i2_6.setBackgroundColor(Color.GREEN);
            i2_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_6.equals("1")){
            i3_6.setBackgroundColor(Color.GREEN);
            i3_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_6.equals("1")){
            i4_6.setBackgroundColor(Color.GREEN);
            i4_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_6.equals("1")){
            i5_6.setBackgroundColor(Color.GREEN);
            i5_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_6.equals("1")){
            n1_6.setBackgroundColor(Color.GREEN);
            n1_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_6.equals("1")){
            n2_6.setBackgroundColor(Color.GREEN);
            n2_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_6.equals("1")){
            n4_6.setBackgroundColor(Color.GREEN);
            n4_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_6.equals("1")){
            n5_6.setBackgroundColor(Color.GREEN);
            n5_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_6.equals("1")){
            g1_6.setBackgroundColor(Color.GREEN);
            g1_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_6.equals("1")){
            g2_6.setBackgroundColor(Color.GREEN);
            g2_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_6.equals("1")){
            g3_6.setBackgroundColor(Color.GREEN);
            g3_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_6.equals("1")){
            g4_6.setBackgroundColor(Color.GREEN);
            g4_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_6.equals("1")){
            g5_6.setBackgroundColor(Color.GREEN);
            g5_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_6.equals("1")){
            o1_6.setBackgroundColor(Color.GREEN);
            o1_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_6.equals("1")){
            o2_6.setBackgroundColor(Color.GREEN);
            o2_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_6.equals("1")){
            o3_6.setBackgroundColor(Color.GREEN);
            o3_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_6.equals("1")){
            o4_6.setBackgroundColor(Color.GREEN);
            o4_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_6.equals("1")){
            o5_6.setBackgroundColor(Color.GREEN);
            o5_6.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_7.equals("1")){
            b1_7.setBackgroundColor(Color.GREEN);
            b1_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_7.equals("1")){
            b2_7.setBackgroundColor(Color.GREEN);
            b2_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_7.equals("1")){
            b3_7.setBackgroundColor(Color.GREEN);
            b3_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_7.equals("1")){
            b4_7.setBackgroundColor(Color.GREEN);
            b4_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_7.equals("1")){
            b5_7.setBackgroundColor(Color.GREEN);
            b5_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_7.equals("1")){
            i1_7.setBackgroundColor(Color.GREEN);
            i1_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_7.equals("1")){
            i2_7.setBackgroundColor(Color.GREEN);
            i2_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_7.equals("1")){
            i3_7.setBackgroundColor(Color.GREEN);
            i3_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_7.equals("1")){
            i4_7.setBackgroundColor(Color.GREEN);
            i4_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_7.equals("1")){
            i5_7.setBackgroundColor(Color.GREEN);
            i5_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_7.equals("1")){
            n1_7.setBackgroundColor(Color.GREEN);
            n1_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_7.equals("1")){
            n2_7.setBackgroundColor(Color.GREEN);
            n2_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_7.equals("1")){
            n4_7.setBackgroundColor(Color.GREEN);
            n4_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_7.equals("1")){
            n5_7.setBackgroundColor(Color.GREEN);
            n5_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_7.equals("1")){
            g1_7.setBackgroundColor(Color.GREEN);
            g1_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_7.equals("1")){
            g2_7.setBackgroundColor(Color.GREEN);
            g2_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_7.equals("1")){
            g3_7.setBackgroundColor(Color.GREEN);
            g3_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_7.equals("1")){
            g4_7.setBackgroundColor(Color.GREEN);
            g4_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_7.equals("1")){
            g5_7.setBackgroundColor(Color.GREEN);
            g5_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_7.equals("1")){
            o1_7.setBackgroundColor(Color.GREEN);
            o1_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_7.equals("1")){
            o2_7.setBackgroundColor(Color.GREEN);
            o2_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_7.equals("1")){
            o3_7.setBackgroundColor(Color.GREEN);
            o3_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_7.equals("1")){
            o4_7.setBackgroundColor(Color.GREEN);
            o4_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_7.equals("1")){
            o5_7.setBackgroundColor(Color.GREEN);
            o5_7.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_8.equals("1")){
            b1_8.setBackgroundColor(Color.GREEN);
            b1_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_8.equals("1")){
            b2_8.setBackgroundColor(Color.GREEN);
            b2_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_8.equals("1")){
            b3_8.setBackgroundColor(Color.GREEN);
            b3_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_8.equals("1")){
            b4_8.setBackgroundColor(Color.GREEN);
            b4_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_8.equals("1")){
            b5_8.setBackgroundColor(Color.GREEN);
            b5_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_8.equals("1")){
            i1_8.setBackgroundColor(Color.GREEN);
            i1_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_8.equals("1")){
            i2_8.setBackgroundColor(Color.GREEN);
            i2_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_8.equals("1")){
            i3_8.setBackgroundColor(Color.GREEN);
            i3_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_8.equals("1")){
            i4_8.setBackgroundColor(Color.GREEN);
            i4_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_8.equals("1")){
            i5_8.setBackgroundColor(Color.GREEN);
            i5_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_8.equals("1")){
            n1_8.setBackgroundColor(Color.GREEN);
            n1_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_8.equals("1")){
            n2_8.setBackgroundColor(Color.GREEN);
            n2_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_8.equals("1")){
            n4_8.setBackgroundColor(Color.GREEN);
            n4_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_8.equals("1")){
            n5_8.setBackgroundColor(Color.GREEN);
            n5_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_8.equals("1")){
            g1_8.setBackgroundColor(Color.GREEN);
            g1_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_8.equals("1")){
            g2_8.setBackgroundColor(Color.GREEN);
            g2_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_8.equals("1")){
            g3_8.setBackgroundColor(Color.GREEN);
            g3_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_8.equals("1")){
            g4_8.setBackgroundColor(Color.GREEN);
            g4_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_8.equals("1")){
            g5_8.setBackgroundColor(Color.GREEN);
            g5_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_8.equals("1")){
            o1_8.setBackgroundColor(Color.GREEN);
            o1_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_8.equals("1")){
            o2_8.setBackgroundColor(Color.GREEN);
            o2_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_8.equals("1")){
            o3_8.setBackgroundColor(Color.GREEN);
            o3_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_8.equals("1")){
            o4_8.setBackgroundColor(Color.GREEN);
            o4_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_8.equals("1")){
            o5_8.setBackgroundColor(Color.GREEN);
            o5_8.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_9.equals("1")){
            b1_9.setBackgroundColor(Color.GREEN);
            b1_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_9.equals("1")){
            b2_9.setBackgroundColor(Color.GREEN);
            b2_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_9.equals("1")){
            b3_9.setBackgroundColor(Color.GREEN);
            b3_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_9.equals("1")){
            b4_9.setBackgroundColor(Color.GREEN);
            b4_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_9.equals("1")){
            b5_9.setBackgroundColor(Color.GREEN);
            b5_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_9.equals("1")){
            i1_9.setBackgroundColor(Color.GREEN);
            i1_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_9.equals("1")){
            i2_9.setBackgroundColor(Color.GREEN);
            i2_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_9.equals("1")){
            i3_9.setBackgroundColor(Color.GREEN);
            i3_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_9.equals("1")){
            i4_9.setBackgroundColor(Color.GREEN);
            i4_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_9.equals("1")){
            i5_9.setBackgroundColor(Color.GREEN);
            i5_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_9.equals("1")){
            n1_9.setBackgroundColor(Color.GREEN);
            n1_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_9.equals("1")){
            n2_9.setBackgroundColor(Color.GREEN);
            n2_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_9.equals("1")){
            n4_9.setBackgroundColor(Color.GREEN);
            n4_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_9.equals("1")){
            n5_9.setBackgroundColor(Color.GREEN);
            n5_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_9.equals("1")){
            g1_9.setBackgroundColor(Color.GREEN);
            g1_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_9.equals("1")){
            g2_9.setBackgroundColor(Color.GREEN);
            g2_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_9.equals("1")){
            g3_9.setBackgroundColor(Color.GREEN);
            g3_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_9.equals("1")){
            g4_9.setBackgroundColor(Color.GREEN);
            g4_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_9.equals("1")){
            g5_9.setBackgroundColor(Color.GREEN);
            g5_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_9.equals("1")){
            o1_9.setBackgroundColor(Color.GREEN);
            o1_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_9.equals("1")){
            o2_9.setBackgroundColor(Color.GREEN);
            o2_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_9.equals("1")){
            o3_9.setBackgroundColor(Color.GREEN);
            o3_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_9.equals("1")){
            o4_9.setBackgroundColor(Color.GREEN);
            o4_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_9.equals("1")){
            o5_9.setBackgroundColor(Color.GREEN);
            o5_9.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b1_10.equals("1")){
            b1_10.setBackgroundColor(Color.GREEN);
            b1_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b2_10.equals("1")){
            b2_10.setBackgroundColor(Color.GREEN);
            b2_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b3_10.equals("1")){
            b3_10.setBackgroundColor(Color.GREEN);
            b3_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b4_10.equals("1")){
            b4_10.setBackgroundColor(Color.GREEN);
            b4_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_b5_10.equals("1")){
            b5_10.setBackgroundColor(Color.GREEN);
            b5_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i1_10.equals("1")){
            i1_10.setBackgroundColor(Color.GREEN);
            i1_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i2_10.equals("1")){
            i2_10.setBackgroundColor(Color.GREEN);
            i2_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i3_10.equals("1")){
            i3_10.setBackgroundColor(Color.GREEN);
            i3_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i4_10.equals("1")){
            i4_10.setBackgroundColor(Color.GREEN);
            i4_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_i5_10.equals("1")){
            i5_10.setBackgroundColor(Color.GREEN);
            i5_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n1_10.equals("1")){
            n1_10.setBackgroundColor(Color.GREEN);
            n1_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n2_10.equals("1")){
            n2_10.setBackgroundColor(Color.GREEN);
            n2_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n4_10.equals("1")){
            n4_10.setBackgroundColor(Color.GREEN);
            n4_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_n5_10.equals("1")){
            n5_10.setBackgroundColor(Color.GREEN);
            n5_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g1_10.equals("1")){
            g1_10.setBackgroundColor(Color.GREEN);
            g1_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g2_10.equals("1")){
            g2_10.setBackgroundColor(Color.GREEN);
            g2_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g3_10.equals("1")){
            g3_10.setBackgroundColor(Color.GREEN);
            g3_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g4_10.equals("1")){
            g4_10.setBackgroundColor(Color.GREEN);
            g4_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_g5_10.equals("1")){
            g5_10.setBackgroundColor(Color.GREEN);
            g5_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o1_10.equals("1")){
            o1_10.setBackgroundColor(Color.GREEN);
            o1_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o2_10.equals("1")){
            o2_10.setBackgroundColor(Color.GREEN);
            o2_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o3_10.equals("1")){
            o3_10.setBackgroundColor(Color.GREEN);
            o3_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o4_10.equals("1")){
            o4_10.setBackgroundColor(Color.GREEN);
            o4_10.setTextColor(Color.RED);
        }
        if (PatternClassOnly.row_o5_10.equals("1")){
            o5_10.setBackgroundColor(Color.GREEN);
            o5_10.setTextColor(Color.RED);
        }


    }
    void NumberUpdateRemove(){
        tv_CurrentNumber.setText("Current Number : " + PatternClassOnly.BingoCurrentNumber);
        tv_Bingo.setText(PatternClassOnly.bingoNameWinner);
        if (PatternClassOnly.row_b1_1.equals("0")){
            b1_1.setBackgroundColor(Color.TRANSPARENT);
            b1_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_1.equals("0")){
            b2_1.setBackgroundColor(Color.TRANSPARENT);
            b2_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_1.equals("0")){
            b3_1.setBackgroundColor(Color.TRANSPARENT);
            b3_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_1.equals("0")){
            b4_1.setBackgroundColor(Color.TRANSPARENT);
            b4_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_1.equals("0")){
            b5_1.setBackgroundColor(Color.TRANSPARENT);
            b5_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_1.equals("0")){
            i1_1.setBackgroundColor(Color.TRANSPARENT);
            i1_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_1.equals("0")){
            i2_1.setBackgroundColor(Color.TRANSPARENT);
            i2_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_1.equals("0")){
            i3_1.setBackgroundColor(Color.TRANSPARENT);
            i3_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_1.equals("0")){
            i4_1.setBackgroundColor(Color.TRANSPARENT);
            i4_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_1.equals("0")){
            i5_1.setBackgroundColor(Color.TRANSPARENT);
            i5_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_1.equals("0")){
            n1_1.setBackgroundColor(Color.TRANSPARENT);
            n1_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_1.equals("0")){
            n2_1.setBackgroundColor(Color.TRANSPARENT);
            n2_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_1.equals("0")){
            n4_1.setBackgroundColor(Color.TRANSPARENT);
            n4_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_1.equals("0")){
            n5_1.setBackgroundColor(Color.TRANSPARENT);
            n5_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_1.equals("0")){
            g1_1.setBackgroundColor(Color.TRANSPARENT);
            g1_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_1.equals("0")){
            g2_1.setBackgroundColor(Color.TRANSPARENT);
            g2_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_1.equals("0")){
            g3_1.setBackgroundColor(Color.TRANSPARENT);
            g3_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_1.equals("0")){
            g4_1.setBackgroundColor(Color.TRANSPARENT);
            g4_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_1.equals("0")){
            g5_1.setBackgroundColor(Color.TRANSPARENT);
            g5_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_1.equals("0")){
            o1_1.setBackgroundColor(Color.TRANSPARENT);
            o1_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_1.equals("0")){
            o2_1.setBackgroundColor(Color.TRANSPARENT);
            o2_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_1.equals("0")){
            o3_1.setBackgroundColor(Color.TRANSPARENT);
            o3_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_1.equals("0")){
            o4_1.setBackgroundColor(Color.TRANSPARENT);
            o4_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_1.equals("0")){
            o5_1.setBackgroundColor(Color.TRANSPARENT);
            o5_1.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_2.equals("0")){
            b1_2.setBackgroundColor(Color.TRANSPARENT);
            b1_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_2.equals("0")){
            b2_2.setBackgroundColor(Color.TRANSPARENT);
            b2_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_2.equals("0")){
            b3_2.setBackgroundColor(Color.TRANSPARENT);
            b3_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_2.equals("0")){
            b4_2.setBackgroundColor(Color.TRANSPARENT);
            b4_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_2.equals("0")){
            b5_2.setBackgroundColor(Color.TRANSPARENT);
            b5_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_2.equals("0")){
            i1_2.setBackgroundColor(Color.TRANSPARENT);
            i1_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_2.equals("0")){
            i2_2.setBackgroundColor(Color.TRANSPARENT);
            i2_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_2.equals("0")){
            i3_2.setBackgroundColor(Color.TRANSPARENT);
            i3_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_2.equals("0")){
            i4_2.setBackgroundColor(Color.TRANSPARENT);
            i4_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_2.equals("0")){
            i5_2.setBackgroundColor(Color.TRANSPARENT);
            i5_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_2.equals("0")){
            n1_2.setBackgroundColor(Color.TRANSPARENT);
            n1_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_2.equals("0")){
            n2_2.setBackgroundColor(Color.TRANSPARENT);
            n2_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_2.equals("0")){
            n4_2.setBackgroundColor(Color.TRANSPARENT);
            n4_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_2.equals("0")){
            n5_2.setBackgroundColor(Color.TRANSPARENT);
            n5_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_2.equals("0")){
            g1_2.setBackgroundColor(Color.TRANSPARENT);
            g1_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_2.equals("0")){
            g2_2.setBackgroundColor(Color.TRANSPARENT);
            g2_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_2.equals("0")){
            g3_2.setBackgroundColor(Color.TRANSPARENT);
            g3_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_2.equals("0")){
            g4_2.setBackgroundColor(Color.TRANSPARENT);
            g4_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_2.equals("0")){
            g5_2.setBackgroundColor(Color.TRANSPARENT);
            g5_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_2.equals("0")){
            o1_2.setBackgroundColor(Color.TRANSPARENT);
            o1_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_2.equals("0")){
            o2_2.setBackgroundColor(Color.TRANSPARENT);
            o2_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_2.equals("0")){
            o3_2.setBackgroundColor(Color.TRANSPARENT);
            o3_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_2.equals("0")){
            o4_2.setBackgroundColor(Color.TRANSPARENT);
            o4_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_2.equals("0")){
            o5_2.setBackgroundColor(Color.TRANSPARENT);
            o5_2.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_3.equals("0")){
            b1_3.setBackgroundColor(Color.TRANSPARENT);
            b1_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_3.equals("0")){
            b2_3.setBackgroundColor(Color.TRANSPARENT);
            b2_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_3.equals("0")){
            b3_3.setBackgroundColor(Color.TRANSPARENT);
            b3_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_3.equals("0")){
            b4_3.setBackgroundColor(Color.TRANSPARENT);
            b4_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_3.equals("0")){
            b5_3.setBackgroundColor(Color.TRANSPARENT);
            b5_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_3.equals("0")){
            i1_3.setBackgroundColor(Color.TRANSPARENT);
            i1_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_3.equals("0")){
            i2_3.setBackgroundColor(Color.TRANSPARENT);
            i2_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_3.equals("0")){
            i3_3.setBackgroundColor(Color.TRANSPARENT);
            i3_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_3.equals("0")){
            i4_3.setBackgroundColor(Color.TRANSPARENT);
            i4_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_3.equals("0")){
            i5_3.setBackgroundColor(Color.TRANSPARENT);
            i5_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_3.equals("0")){
            n1_3.setBackgroundColor(Color.TRANSPARENT);
            n1_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_3.equals("0")){
            n2_3.setBackgroundColor(Color.TRANSPARENT);
            n2_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_3.equals("0")){
            n4_3.setBackgroundColor(Color.TRANSPARENT);
            n4_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_3.equals("0")){
            n5_3.setBackgroundColor(Color.TRANSPARENT);
            n5_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_3.equals("0")){
            g1_3.setBackgroundColor(Color.TRANSPARENT);
            g1_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_3.equals("0")){
            g2_3.setBackgroundColor(Color.TRANSPARENT);
            g2_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_3.equals("0")){
            g3_3.setBackgroundColor(Color.TRANSPARENT);
            g3_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_3.equals("0")){
            g4_3.setBackgroundColor(Color.TRANSPARENT);
            g4_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_3.equals("0")){
            g5_3.setBackgroundColor(Color.TRANSPARENT);
            g5_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_3.equals("0")){
            o1_3.setBackgroundColor(Color.TRANSPARENT);
            o1_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_3.equals("0")){
            o2_3.setBackgroundColor(Color.TRANSPARENT);
            o2_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_3.equals("0")){
            o3_3.setBackgroundColor(Color.TRANSPARENT);
            o3_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_3.equals("0")){
            o4_3.setBackgroundColor(Color.TRANSPARENT);
            o4_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_3.equals("0")){
            o5_3.setBackgroundColor(Color.TRANSPARENT);
            o5_3.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_4.equals("0")){
            b1_4.setBackgroundColor(Color.TRANSPARENT);
            b1_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_4.equals("0")){
            b2_4.setBackgroundColor(Color.TRANSPARENT);
            b2_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_4.equals("0")){
            b3_4.setBackgroundColor(Color.TRANSPARENT);
            b3_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_4.equals("0")){
            b4_4.setBackgroundColor(Color.TRANSPARENT);
            b4_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_4.equals("0")){
            b5_4.setBackgroundColor(Color.TRANSPARENT);
            b5_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_4.equals("0")){
            i1_4.setBackgroundColor(Color.TRANSPARENT);
            i1_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_4.equals("0")){
            i2_4.setBackgroundColor(Color.TRANSPARENT);
            i2_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_4.equals("0")){
            i3_4.setBackgroundColor(Color.TRANSPARENT);
            i3_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_4.equals("0")){
            i4_4.setBackgroundColor(Color.TRANSPARENT);
            i4_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_4.equals("0")){
            i5_4.setBackgroundColor(Color.TRANSPARENT);
            i5_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_4.equals("0")){
            n1_4.setBackgroundColor(Color.TRANSPARENT);
            n1_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_4.equals("0")){
            n2_4.setBackgroundColor(Color.TRANSPARENT);
            n2_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_4.equals("0")){
            n4_4.setBackgroundColor(Color.TRANSPARENT);
            n4_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_4.equals("0")){
            n5_4.setBackgroundColor(Color.TRANSPARENT);
            n5_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_4.equals("0")){
            g1_4.setBackgroundColor(Color.TRANSPARENT);
            g1_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_4.equals("0")){
            g2_4.setBackgroundColor(Color.TRANSPARENT);
            g2_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_4.equals("0")){
            g3_4.setBackgroundColor(Color.TRANSPARENT);
            g3_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_4.equals("0")){
            g4_4.setBackgroundColor(Color.TRANSPARENT);
            g4_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_4.equals("0")){
            g5_4.setBackgroundColor(Color.TRANSPARENT);
            g5_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_4.equals("0")){
            o1_4.setBackgroundColor(Color.TRANSPARENT);
            o1_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_4.equals("0")){
            o2_4.setBackgroundColor(Color.TRANSPARENT);
            o2_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_4.equals("0")){
            o3_4.setBackgroundColor(Color.TRANSPARENT);
            o3_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_4.equals("0")){
            o4_4.setBackgroundColor(Color.TRANSPARENT);
            o4_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_4.equals("0")){
            o5_4.setBackgroundColor(Color.TRANSPARENT);
            o5_4.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_5.equals("0")){
            b1_5.setBackgroundColor(Color.TRANSPARENT);
            b1_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_5.equals("0")){
            b2_5.setBackgroundColor(Color.TRANSPARENT);
            b2_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_5.equals("0")){
            b3_5.setBackgroundColor(Color.TRANSPARENT);
            b3_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_5.equals("0")){
            b4_5.setBackgroundColor(Color.TRANSPARENT);
            b4_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_5.equals("0")){
            b5_5.setBackgroundColor(Color.TRANSPARENT);
            b5_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_5.equals("0")){
            i1_5.setBackgroundColor(Color.TRANSPARENT);
            i1_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_5.equals("0")){
            i2_5.setBackgroundColor(Color.TRANSPARENT);
            i2_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_5.equals("0")){
            i3_5.setBackgroundColor(Color.TRANSPARENT);
            i3_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_5.equals("0")){
            i4_5.setBackgroundColor(Color.TRANSPARENT);
            i4_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_5.equals("0")){
            i5_5.setBackgroundColor(Color.TRANSPARENT);
            i5_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_5.equals("0")){
            n1_5.setBackgroundColor(Color.TRANSPARENT);
            n1_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_5.equals("0")){
            n2_5.setBackgroundColor(Color.TRANSPARENT);
            n2_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_5.equals("0")){
            n4_5.setBackgroundColor(Color.TRANSPARENT);
            n4_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_5.equals("0")){
            n5_5.setBackgroundColor(Color.TRANSPARENT);
            n5_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_5.equals("0")){
            g1_5.setBackgroundColor(Color.TRANSPARENT);
            g1_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_5.equals("0")){
            g2_5.setBackgroundColor(Color.TRANSPARENT);
            g2_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_5.equals("0")){
            g3_5.setBackgroundColor(Color.TRANSPARENT);
            g3_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_5.equals("0")){
            g4_5.setBackgroundColor(Color.TRANSPARENT);
            g4_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_5.equals("0")){
            g5_5.setBackgroundColor(Color.TRANSPARENT);
            g5_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_5.equals("0")){
            o1_5.setBackgroundColor(Color.TRANSPARENT);
            o1_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_5.equals("0")){
            o2_5.setBackgroundColor(Color.TRANSPARENT);
            o2_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_5.equals("0")){
            o3_5.setBackgroundColor(Color.TRANSPARENT);
            o3_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_5.equals("0")){
            o4_5.setBackgroundColor(Color.TRANSPARENT);
            o4_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_5.equals("0")){
            o5_5.setBackgroundColor(Color.TRANSPARENT);
            o5_5.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_6.equals("0")){
            b1_6.setBackgroundColor(Color.TRANSPARENT);
            b1_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_6.equals("0")){
            b2_6.setBackgroundColor(Color.TRANSPARENT);
            b2_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_6.equals("0")){
            b3_6.setBackgroundColor(Color.TRANSPARENT);
            b3_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_6.equals("0")){
            b4_6.setBackgroundColor(Color.TRANSPARENT);
            b4_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_6.equals("0")){
            b5_6.setBackgroundColor(Color.TRANSPARENT);
            b5_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_6.equals("0")){
            i1_6.setBackgroundColor(Color.TRANSPARENT);
            i1_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_6.equals("0")){
            i2_6.setBackgroundColor(Color.TRANSPARENT);
            i2_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_6.equals("0")){
            i3_6.setBackgroundColor(Color.TRANSPARENT);
            i3_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_6.equals("0")){
            i4_6.setBackgroundColor(Color.TRANSPARENT);
            i4_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_6.equals("0")){
            i5_6.setBackgroundColor(Color.TRANSPARENT);
            i5_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_6.equals("0")){
            n1_6.setBackgroundColor(Color.TRANSPARENT);
            n1_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_6.equals("0")){
            n2_6.setBackgroundColor(Color.TRANSPARENT);
            n2_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_6.equals("0")){
            n4_6.setBackgroundColor(Color.TRANSPARENT);
            n4_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_6.equals("0")){
            n5_6.setBackgroundColor(Color.TRANSPARENT);
            n5_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_6.equals("0")){
            g1_6.setBackgroundColor(Color.TRANSPARENT);
            g1_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_6.equals("0")){
            g2_6.setBackgroundColor(Color.TRANSPARENT);
            g2_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_6.equals("0")){
            g3_6.setBackgroundColor(Color.TRANSPARENT);
            g3_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_6.equals("0")){
            g4_6.setBackgroundColor(Color.TRANSPARENT);
            g4_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_6.equals("0")){
            g5_6.setBackgroundColor(Color.TRANSPARENT);
            g5_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_6.equals("0")){
            o1_6.setBackgroundColor(Color.TRANSPARENT);
            o1_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_6.equals("0")){
            o2_6.setBackgroundColor(Color.TRANSPARENT);
            o2_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_6.equals("0")){
            o3_6.setBackgroundColor(Color.TRANSPARENT);
            o3_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_6.equals("0")){
            o4_6.setBackgroundColor(Color.TRANSPARENT);
            o4_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_6.equals("0")){
            o5_6.setBackgroundColor(Color.TRANSPARENT);
            o5_6.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_7.equals("0")){
            b1_7.setBackgroundColor(Color.TRANSPARENT);
            b1_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_7.equals("0")){
            b2_7.setBackgroundColor(Color.TRANSPARENT);
            b2_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_7.equals("0")){
            b3_7.setBackgroundColor(Color.TRANSPARENT);
            b3_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_7.equals("0")){
            b4_7.setBackgroundColor(Color.TRANSPARENT);
            b4_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_7.equals("0")){
            b5_7.setBackgroundColor(Color.TRANSPARENT);
            b5_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_7.equals("0")){
            i1_7.setBackgroundColor(Color.TRANSPARENT);
            i1_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_7.equals("0")){
            i2_7.setBackgroundColor(Color.TRANSPARENT);
            i2_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_7.equals("0")){
            i3_7.setBackgroundColor(Color.TRANSPARENT);
            i3_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_7.equals("0")){
            i4_7.setBackgroundColor(Color.TRANSPARENT);
            i4_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_7.equals("0")){
            i5_7.setBackgroundColor(Color.TRANSPARENT);
            i5_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_7.equals("0")){
            n1_7.setBackgroundColor(Color.TRANSPARENT);
            n1_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_7.equals("0")){
            n2_7.setBackgroundColor(Color.TRANSPARENT);
            n2_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_7.equals("0")){
            n4_7.setBackgroundColor(Color.TRANSPARENT);
            n4_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_7.equals("0")){
            n5_7.setBackgroundColor(Color.TRANSPARENT);
            n5_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_7.equals("0")){
            g1_7.setBackgroundColor(Color.TRANSPARENT);
            g1_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_7.equals("0")){
            g2_7.setBackgroundColor(Color.TRANSPARENT);
            g2_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_7.equals("0")){
            g3_7.setBackgroundColor(Color.TRANSPARENT);
            g3_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_7.equals("0")){
            g4_7.setBackgroundColor(Color.TRANSPARENT);
            g4_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_7.equals("0")){
            g5_7.setBackgroundColor(Color.TRANSPARENT);
            g5_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_7.equals("0")){
            o1_7.setBackgroundColor(Color.TRANSPARENT);
            o1_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_7.equals("0")){
            o2_7.setBackgroundColor(Color.TRANSPARENT);
            o2_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_7.equals("0")){
            o3_7.setBackgroundColor(Color.TRANSPARENT);
            o3_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_7.equals("0")){
            o4_7.setBackgroundColor(Color.TRANSPARENT);
            o4_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_7.equals("0")){
            o5_7.setBackgroundColor(Color.TRANSPARENT);
            o5_7.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_8.equals("0")){
            b1_8.setBackgroundColor(Color.TRANSPARENT);
            b1_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_8.equals("0")){
            b2_8.setBackgroundColor(Color.TRANSPARENT);
            b2_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_8.equals("0")){
            b3_8.setBackgroundColor(Color.TRANSPARENT);
            b3_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_8.equals("0")){
            b4_8.setBackgroundColor(Color.TRANSPARENT);
            b4_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_8.equals("0")){
            b5_8.setBackgroundColor(Color.TRANSPARENT);
            b5_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_8.equals("0")){
            i1_8.setBackgroundColor(Color.TRANSPARENT);
            i1_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_8.equals("0")){
            i2_8.setBackgroundColor(Color.TRANSPARENT);
            i2_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_8.equals("0")){
            i3_8.setBackgroundColor(Color.TRANSPARENT);
            i3_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_8.equals("0")){
            i4_8.setBackgroundColor(Color.TRANSPARENT);
            i4_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_8.equals("0")){
            i5_8.setBackgroundColor(Color.TRANSPARENT);
            i5_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_8.equals("0")){
            n1_8.setBackgroundColor(Color.TRANSPARENT);
            n1_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_8.equals("0")){
            n2_8.setBackgroundColor(Color.TRANSPARENT);
            n2_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_8.equals("0")){
            n4_8.setBackgroundColor(Color.TRANSPARENT);
            n4_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_8.equals("0")){
            n5_8.setBackgroundColor(Color.TRANSPARENT);
            n5_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_8.equals("0")){
            g1_8.setBackgroundColor(Color.TRANSPARENT);
            g1_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_8.equals("0")){
            g2_8.setBackgroundColor(Color.TRANSPARENT);
            g2_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_8.equals("0")){
            g3_8.setBackgroundColor(Color.TRANSPARENT);
            g3_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_8.equals("0")){
            g4_8.setBackgroundColor(Color.TRANSPARENT);
            g4_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_8.equals("0")){
            g5_8.setBackgroundColor(Color.TRANSPARENT);
            g5_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_8.equals("0")){
            o1_8.setBackgroundColor(Color.TRANSPARENT);
            o1_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_8.equals("0")){
            o2_8.setBackgroundColor(Color.TRANSPARENT);
            o2_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_8.equals("0")){
            o3_8.setBackgroundColor(Color.TRANSPARENT);
            o3_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_8.equals("0")){
            o4_8.setBackgroundColor(Color.TRANSPARENT);
            o4_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_8.equals("0")){
            o5_8.setBackgroundColor(Color.TRANSPARENT);
            o5_8.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_9.equals("0")){
            b1_9.setBackgroundColor(Color.TRANSPARENT);
            b1_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_9.equals("0")){
            b2_9.setBackgroundColor(Color.TRANSPARENT);
            b2_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_9.equals("0")){
            b3_9.setBackgroundColor(Color.TRANSPARENT);
            b3_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_9.equals("0")){
            b4_9.setBackgroundColor(Color.TRANSPARENT);
            b4_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_9.equals("0")){
            b5_9.setBackgroundColor(Color.TRANSPARENT);
            b5_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_9.equals("0")){
            i1_9.setBackgroundColor(Color.TRANSPARENT);
            i1_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_9.equals("0")){
            i2_9.setBackgroundColor(Color.TRANSPARENT);
            i2_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_9.equals("0")){
            i3_9.setBackgroundColor(Color.TRANSPARENT);
            i3_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_9.equals("0")){
            i4_9.setBackgroundColor(Color.TRANSPARENT);
            i4_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_9.equals("0")){
            i5_9.setBackgroundColor(Color.TRANSPARENT);
            i5_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_9.equals("0")){
            n1_9.setBackgroundColor(Color.TRANSPARENT);
            n1_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_9.equals("0")){
            n2_9.setBackgroundColor(Color.TRANSPARENT);
            n2_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_9.equals("0")){
            n4_9.setBackgroundColor(Color.TRANSPARENT);
            n4_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_9.equals("0")){
            n5_9.setBackgroundColor(Color.TRANSPARENT);
            n5_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_9.equals("0")){
            g1_9.setBackgroundColor(Color.TRANSPARENT);
            g1_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_9.equals("0")){
            g2_9.setBackgroundColor(Color.TRANSPARENT);
            g2_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_9.equals("0")){
            g3_9.setBackgroundColor(Color.TRANSPARENT);
            g3_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_9.equals("0")){
            g4_9.setBackgroundColor(Color.TRANSPARENT);
            g4_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_9.equals("0")){
            g5_9.setBackgroundColor(Color.TRANSPARENT);
            g5_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_9.equals("0")){
            o1_9.setBackgroundColor(Color.TRANSPARENT);
            o1_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_9.equals("0")){
            o2_9.setBackgroundColor(Color.TRANSPARENT);
            o2_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_9.equals("0")){
            o3_9.setBackgroundColor(Color.TRANSPARENT);
            o3_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_9.equals("0")){
            o4_9.setBackgroundColor(Color.TRANSPARENT);
            o4_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_9.equals("0")){
            o5_9.setBackgroundColor(Color.TRANSPARENT);
            o5_9.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b1_10.equals("0")){
            b1_10.setBackgroundColor(Color.TRANSPARENT);
            b1_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b2_10.equals("0")){
            b2_10.setBackgroundColor(Color.TRANSPARENT);
            b2_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b3_10.equals("0")){
            b3_10.setBackgroundColor(Color.TRANSPARENT);
            b3_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b4_10.equals("0")){
            b4_10.setBackgroundColor(Color.TRANSPARENT);
            b4_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_b5_10.equals("0")){
            b5_10.setBackgroundColor(Color.TRANSPARENT);
            b5_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i1_10.equals("0")){
            i1_10.setBackgroundColor(Color.TRANSPARENT);
            i1_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i2_10.equals("0")){
            i2_10.setBackgroundColor(Color.TRANSPARENT);
            i2_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i3_10.equals("0")){
            i3_10.setBackgroundColor(Color.TRANSPARENT);
            i3_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i4_10.equals("0")){
            i4_10.setBackgroundColor(Color.TRANSPARENT);
            i4_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_i5_10.equals("0")){
            i5_10.setBackgroundColor(Color.TRANSPARENT);
            i5_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n1_10.equals("0")){
            n1_10.setBackgroundColor(Color.TRANSPARENT);
            n1_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n2_10.equals("0")){
            n2_10.setBackgroundColor(Color.TRANSPARENT);
            n2_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n4_10.equals("0")){
            n4_10.setBackgroundColor(Color.TRANSPARENT);
            n4_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_n5_10.equals("0")){
            n5_10.setBackgroundColor(Color.TRANSPARENT);
            n5_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g1_10.equals("0")){
            g1_10.setBackgroundColor(Color.TRANSPARENT);
            g1_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g2_10.equals("0")){
            g2_10.setBackgroundColor(Color.TRANSPARENT);
            g2_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g3_10.equals("0")){
            g3_10.setBackgroundColor(Color.TRANSPARENT);
            g3_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g4_10.equals("0")){
            g4_10.setBackgroundColor(Color.TRANSPARENT);
            g4_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_g5_10.equals("0")){
            g5_10.setBackgroundColor(Color.TRANSPARENT);
            g5_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o1_10.equals("0")){
            o1_10.setBackgroundColor(Color.TRANSPARENT);
            o1_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o2_10.equals("0")){
            o2_10.setBackgroundColor(Color.TRANSPARENT);
            o2_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o3_10.equals("0")){
            o3_10.setBackgroundColor(Color.TRANSPARENT);
            o3_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o4_10.equals("0")){
            o4_10.setBackgroundColor(Color.TRANSPARENT);
            o4_10.setTextColor(Color.GRAY);
        }
        if (PatternClassOnly.row_o5_10.equals("0")){
            o5_10.setBackgroundColor(Color.TRANSPARENT);
            o5_10.setTextColor(Color.GRAY);
        }


    }

    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Reset?");
        builder.setMessage("Are you sure you want to reset?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                PatternClassOnly.myNumbersList.clear();
                PatternClassOnly.BingoCurrentNumber = "";
                PatternClassOnly.row_b1_1 = "0";
                PatternClassOnly.row_b2_1 = "0";
                PatternClassOnly.row_b3_1 = "0";
                PatternClassOnly.row_b4_1 = "0";
                PatternClassOnly.row_b5_1 = "0";
                PatternClassOnly.row_i1_1 = "0";
                PatternClassOnly.row_i2_1 = "0";
                PatternClassOnly.row_i3_1 = "0";
                PatternClassOnly.row_i4_1 = "0";
                PatternClassOnly.row_i5_1 = "0";
                PatternClassOnly.row_n1_1 = "0";
                PatternClassOnly.row_n2_1 = "0";
                PatternClassOnly.row_n4_1 = "0";
                PatternClassOnly.row_n5_1 = "0";
                PatternClassOnly.row_g1_1 = "0";
                PatternClassOnly.row_g2_1 = "0";
                PatternClassOnly.row_g3_1 = "0";
                PatternClassOnly.row_g4_1 = "0";
                PatternClassOnly.row_g5_1 = "0";
                PatternClassOnly.row_o1_1 = "0";
                PatternClassOnly.row_o2_1 = "0";
                PatternClassOnly.row_o3_1 = "0";
                PatternClassOnly.row_o4_1 = "0";
                PatternClassOnly.row_o5_1 = "0";
                PatternClassOnly.row_b1_2 = "0";
                PatternClassOnly.row_b2_2 = "0";
                PatternClassOnly.row_b3_2 = "0";
                PatternClassOnly.row_b4_2 = "0";
                PatternClassOnly.row_b5_2 = "0";
                PatternClassOnly.row_i1_2 = "0";
                PatternClassOnly.row_i2_2 = "0";
                PatternClassOnly.row_i3_2 = "0";
                PatternClassOnly.row_i4_2 = "0";
                PatternClassOnly.row_i5_2 = "0";
                PatternClassOnly.row_n1_2 = "0";
                PatternClassOnly.row_n2_2 = "0";
                PatternClassOnly.row_n4_2 = "0";
                PatternClassOnly.row_n5_2 = "0";
                PatternClassOnly.row_g1_2 = "0";
                PatternClassOnly.row_g2_2 = "0";
                PatternClassOnly.row_g3_2 = "0";
                PatternClassOnly.row_g4_2 = "0";
                PatternClassOnly.row_g5_2 = "0";
                PatternClassOnly.row_o1_2 = "0";
                PatternClassOnly.row_o2_2 = "0";
                PatternClassOnly.row_o3_2 = "0";
                PatternClassOnly.row_o4_2 = "0";
                PatternClassOnly.row_o5_2 = "0";
                PatternClassOnly.row_b1_3 = "0";
                PatternClassOnly.row_b2_3 = "0";
                PatternClassOnly.row_b3_3 = "0";
                PatternClassOnly.row_b4_3 = "0";
                PatternClassOnly.row_b5_3 = "0";
                PatternClassOnly.row_i1_3 = "0";
                PatternClassOnly.row_i2_3 = "0";
                PatternClassOnly.row_i3_3 = "0";
                PatternClassOnly.row_i4_3 = "0";
                PatternClassOnly.row_i5_3 = "0";
                PatternClassOnly.row_n1_3 = "0";
                PatternClassOnly.row_n2_3 = "0";
                PatternClassOnly.row_n4_3 = "0";
                PatternClassOnly.row_n5_3 = "0";
                PatternClassOnly.row_g1_3 = "0";
                PatternClassOnly.row_g2_3 = "0";
                PatternClassOnly.row_g3_3 = "0";
                PatternClassOnly.row_g4_3 = "0";
                PatternClassOnly.row_g5_3 = "0";
                PatternClassOnly.row_o1_3 = "0";
                PatternClassOnly.row_o2_3 = "0";
                PatternClassOnly.row_o3_3 = "0";
                PatternClassOnly.row_o4_3 = "0";
                PatternClassOnly.row_o5_3 = "0";
                PatternClassOnly.row_b1_4 = "0";
                PatternClassOnly.row_b2_4 = "0";
                PatternClassOnly.row_b3_4 = "0";
                PatternClassOnly.row_b4_4 = "0";
                PatternClassOnly.row_b5_4 = "0";
                PatternClassOnly.row_i1_4 = "0";
                PatternClassOnly.row_i2_4 = "0";
                PatternClassOnly.row_i3_4 = "0";
                PatternClassOnly.row_i4_4 = "0";
                PatternClassOnly.row_i5_4 = "0";
                PatternClassOnly.row_n1_4 = "0";
                PatternClassOnly.row_n2_4 = "0";
                PatternClassOnly.row_n4_4 = "0";
                PatternClassOnly.row_n5_4 = "0";
                PatternClassOnly.row_g1_4 = "0";
                PatternClassOnly.row_g2_4 = "0";
                PatternClassOnly.row_g3_4 = "0";
                PatternClassOnly.row_g4_4 = "0";
                PatternClassOnly.row_g5_4 = "0";
                PatternClassOnly.row_o1_4 = "0";
                PatternClassOnly.row_o2_4 = "0";
                PatternClassOnly.row_o3_4 = "0";
                PatternClassOnly.row_o4_4 = "0";
                PatternClassOnly.row_o5_4 = "0";
                PatternClassOnly.row_b1_5 = "0";
                PatternClassOnly.row_b2_5 = "0";
                PatternClassOnly.row_b3_5 = "0";
                PatternClassOnly.row_b4_5 = "0";
                PatternClassOnly.row_b5_5 = "0";
                PatternClassOnly.row_i1_5 = "0";
                PatternClassOnly.row_i2_5 = "0";
                PatternClassOnly.row_i3_5 = "0";
                PatternClassOnly.row_i4_5 = "0";
                PatternClassOnly.row_i5_5 = "0";
                PatternClassOnly.row_n1_5 = "0";
                PatternClassOnly.row_n2_5 = "0";
                PatternClassOnly.row_n4_5 = "0";
                PatternClassOnly.row_n5_5 = "0";
                PatternClassOnly.row_g1_5 = "0";
                PatternClassOnly.row_g2_5 = "0";
                PatternClassOnly.row_g3_5 = "0";
                PatternClassOnly.row_g4_5 = "0";
                PatternClassOnly.row_g5_5 = "0";
                PatternClassOnly.row_o1_5 = "0";
                PatternClassOnly.row_o2_5 = "0";
                PatternClassOnly.row_o3_5 = "0";
                PatternClassOnly.row_o4_5 = "0";
                PatternClassOnly.row_o5_5 = "0";
                PatternClassOnly.row_b1_6 = "0";
                PatternClassOnly.row_b2_6 = "0";
                PatternClassOnly.row_b3_6 = "0";
                PatternClassOnly.row_b4_6 = "0";
                PatternClassOnly.row_b5_6 = "0";
                PatternClassOnly.row_i1_6 = "0";
                PatternClassOnly.row_i2_6 = "0";
                PatternClassOnly.row_i3_6 = "0";
                PatternClassOnly.row_i4_6 = "0";
                PatternClassOnly.row_i5_6 = "0";
                PatternClassOnly.row_n1_6 = "0";
                PatternClassOnly.row_n2_6 = "0";
                PatternClassOnly.row_n4_6 = "0";
                PatternClassOnly.row_n5_6 = "0";
                PatternClassOnly.row_g1_6 = "0";
                PatternClassOnly.row_g2_6 = "0";
                PatternClassOnly.row_g3_6 = "0";
                PatternClassOnly.row_g4_6 = "0";
                PatternClassOnly.row_g5_6 = "0";
                PatternClassOnly.row_o1_6 = "0";
                PatternClassOnly.row_o2_6 = "0";
                PatternClassOnly.row_o3_6 = "0";
                PatternClassOnly.row_o4_6 = "0";
                PatternClassOnly.row_o5_6 = "0";
                PatternClassOnly.row_b1_7 = "0";
                PatternClassOnly.row_b2_7 = "0";
                PatternClassOnly.row_b3_7 = "0";
                PatternClassOnly.row_b4_7 = "0";
                PatternClassOnly.row_b5_7 = "0";
                PatternClassOnly.row_i1_7 = "0";
                PatternClassOnly.row_i2_7 = "0";
                PatternClassOnly.row_i3_7 = "0";
                PatternClassOnly.row_i4_7 = "0";
                PatternClassOnly.row_i5_7 = "0";
                PatternClassOnly.row_n1_7 = "0";
                PatternClassOnly.row_n2_7 = "0";
                PatternClassOnly.row_n4_7 = "0";
                PatternClassOnly.row_n5_7 = "0";
                PatternClassOnly.row_g1_7 = "0";
                PatternClassOnly.row_g2_7 = "0";
                PatternClassOnly.row_g3_7 = "0";
                PatternClassOnly.row_g4_7 = "0";
                PatternClassOnly.row_g5_7 = "0";
                PatternClassOnly.row_o1_7 = "0";
                PatternClassOnly.row_o2_7 = "0";
                PatternClassOnly.row_o3_7 = "0";
                PatternClassOnly.row_o4_7 = "0";
                PatternClassOnly.row_o5_7 = "0";
                PatternClassOnly.row_b1_8 = "0";
                PatternClassOnly.row_b2_8 = "0";
                PatternClassOnly.row_b3_8 = "0";
                PatternClassOnly.row_b4_8 = "0";
                PatternClassOnly.row_b5_8 = "0";
                PatternClassOnly.row_i1_8 = "0";
                PatternClassOnly.row_i2_8 = "0";
                PatternClassOnly.row_i3_8 = "0";
                PatternClassOnly.row_i4_8 = "0";
                PatternClassOnly.row_i5_8 = "0";
                PatternClassOnly.row_n1_8 = "0";
                PatternClassOnly.row_n2_8 = "0";
                PatternClassOnly.row_n4_8 = "0";
                PatternClassOnly.row_n5_8 = "0";
                PatternClassOnly.row_g1_8 = "0";
                PatternClassOnly.row_g2_8 = "0";
                PatternClassOnly.row_g3_8 = "0";
                PatternClassOnly.row_g4_8 = "0";
                PatternClassOnly.row_g5_8 = "0";
                PatternClassOnly.row_o1_8 = "0";
                PatternClassOnly.row_o2_8 = "0";
                PatternClassOnly.row_o3_8 = "0";
                PatternClassOnly.row_o4_8 = "0";
                PatternClassOnly.row_o5_8 = "0";
                PatternClassOnly.row_b1_9 = "0";
                PatternClassOnly.row_b2_9 = "0";
                PatternClassOnly.row_b3_9 = "0";
                PatternClassOnly.row_b4_9 = "0";
                PatternClassOnly.row_b5_9 = "0";
                PatternClassOnly.row_i1_9 = "0";
                PatternClassOnly.row_i2_9 = "0";
                PatternClassOnly.row_i3_9 = "0";
                PatternClassOnly.row_i4_9 = "0";
                PatternClassOnly.row_i5_9 = "0";
                PatternClassOnly.row_n1_9 = "0";
                PatternClassOnly.row_n2_9 = "0";
                PatternClassOnly.row_n4_9 = "0";
                PatternClassOnly.row_n5_9 = "0";
                PatternClassOnly.row_g1_9 = "0";
                PatternClassOnly.row_g2_9 = "0";
                PatternClassOnly.row_g3_9 = "0";
                PatternClassOnly.row_g4_9 = "0";
                PatternClassOnly.row_g5_9 = "0";
                PatternClassOnly.row_o1_9 = "0";
                PatternClassOnly.row_o2_9 = "0";
                PatternClassOnly.row_o3_9 = "0";
                PatternClassOnly.row_o4_9 = "0";
                PatternClassOnly.row_o5_9 = "0";
                PatternClassOnly.row_b1_10 = "0";
                PatternClassOnly.row_b2_10 = "0";
                PatternClassOnly.row_b3_10 = "0";
                PatternClassOnly.row_b4_10 = "0";
                PatternClassOnly.row_b5_10 = "0";
                PatternClassOnly.row_i1_10 = "0";
                PatternClassOnly.row_i2_10 = "0";
                PatternClassOnly.row_i3_10 = "0";
                PatternClassOnly.row_i4_10 = "0";
                PatternClassOnly.row_i5_10 = "0";
                PatternClassOnly.row_n1_10 = "0";
                PatternClassOnly.row_n2_10 = "0";
                PatternClassOnly.row_n4_10 = "0";
                PatternClassOnly.row_n5_10 = "0";
                PatternClassOnly.row_g1_10 = "0";
                PatternClassOnly.row_g2_10 = "0";
                PatternClassOnly.row_g3_10 = "0";
                PatternClassOnly.row_g4_10 = "0";
                PatternClassOnly.row_g5_10 = "0";
                PatternClassOnly.row_o1_10 = "0";
                PatternClassOnly.row_o2_10 = "0";
                PatternClassOnly.row_o3_10 = "0";
                PatternClassOnly.row_o4_10 = "0";
                PatternClassOnly.row_o5_10 = "0";
                PatternClassOnly.pb1="1";
                PatternClassOnly.pb2="1";
                PatternClassOnly.pb3="1";
                PatternClassOnly.pb4="1";
                PatternClassOnly.pb5="1";
                PatternClassOnly.pi1="1";
                PatternClassOnly.pi2="1";
                PatternClassOnly.pi3="1";
                PatternClassOnly.pi4="1";
                PatternClassOnly.pi5="1";
                PatternClassOnly.pn1="1";
                PatternClassOnly.pn2="1";
                PatternClassOnly.pn4="1";
                PatternClassOnly.pn5="1";
                PatternClassOnly.pg1="1";
                PatternClassOnly.pg2="1";
                PatternClassOnly.pg3="1";
                PatternClassOnly.pg4="1";
                PatternClassOnly.pg5="1";
                PatternClassOnly.po1="1";
                PatternClassOnly.po2="1";
                PatternClassOnly.po3="1";
                PatternClassOnly.po4="1";
                PatternClassOnly.po5="1";
                PatternClassOnly.px="1";
                PatternClassOnly.bingoNameWinner = "BINGO : ";
                bingoRow1 = "";
                bingoRow2 = "";
                bingoRow3 = "";
                bingoRow4 = "";
                bingoRow5 = "";
                bingoRow6 = "";
                bingoRow7 = "";
                bingoRow8 = "";
                bingoRow9 = "";
                bingoRow10 = "";
                NumberUpdateRemove();
                //PatternUpdateRemove();
                PatternUpdate();
                LoadNumberFromDB();

            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();


    }
    void confirmDialog2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Remove Number");
        builder.setMessage("Are you sure you want to remove number " + textInputEditText.getText().toString() +"?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                PatternClassOnly.myNumbersList.remove(textInputEditText.getText().toString());
                AllCardsNotEquals();
                Toast.makeText(LaroActivity.this, "Number " + textInputEditText.getText().toString() + " has been removed", Toast.LENGTH_SHORT).show();
                textInputEditText.selectAll();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            refreshActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void refreshActivity() {
        Intent i = new Intent(LaroActivity.this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}