package com.bpg.bingorevealmobile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.regex.Pattern;

public class PatternActivity extends AppCompatActivity {
    String[] item = {"Blackout","First 'X' numbers", "Custom"};
    TableLayout tableLayout3;
    ArrayAdapter<String> adapterItems;
    AutoCompleteTextView autoCompleteTextView;
    Button btn_px;
    Button btn_pb1,	btn_pb2,	btn_pb3,	btn_pb4,	btn_pb5,	btn_pi1,	btn_pi2,	btn_pi3,	btn_pi4,	btn_pi5,	btn_pn1,	btn_pn2,	btn_pn4,	btn_pn5,	btn_pg1,	btn_pg2,	btn_pg3,	btn_pg4,	btn_pg5,	btn_po1,	btn_po2,	btn_po3,	btn_po4,	btn_po5;
    EditText et_FirstXNumbers;
    Button btn_ClearPattern, btn_Blackout, btn_FirstXNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern);

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


        tableLayout3 = findViewById(R.id.tableLayout3);
        et_FirstXNumbers = findViewById(R.id.et_FirstXNumbers);
        btn_FirstXNumbers = findViewById(R.id.btn_FirstXNumbers);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        btn_px = findViewById(R.id.btn_px);
        btn_pb1 = findViewById(R.id.btn_pb1);
        btn_pb2 = findViewById(R.id.btn_pb2);
        btn_pb3 = findViewById(R.id.btn_pb3);
        btn_pb4 = findViewById(R.id.btn_pb4);
        btn_pb5 = findViewById(R.id.btn_pb5);
        btn_pi1 = findViewById(R.id.btn_pi1);
        btn_pi2 = findViewById(R.id.btn_pi2);
        btn_pi3 = findViewById(R.id.btn_pi3);
        btn_pi4 = findViewById(R.id.btn_pi4);
        btn_pi5 = findViewById(R.id.btn_pi5);
        btn_pn1 = findViewById(R.id.btn_pn1);
        btn_pn2 = findViewById(R.id.btn_pn2);
        btn_pn4 = findViewById(R.id.btn_pn4);
        btn_pn5 = findViewById(R.id.btn_pn5);
        btn_pg1 = findViewById(R.id.btn_pg1);
        btn_pg2 = findViewById(R.id.btn_pg2);
        btn_pg3 = findViewById(R.id.btn_pg3);
        btn_pg4 = findViewById(R.id.btn_pg4);
        btn_pg5 = findViewById(R.id.btn_pg5);
        btn_po1 = findViewById(R.id.btn_po1);
        btn_po2 = findViewById(R.id.btn_po2);
        btn_po3 = findViewById(R.id.btn_po3);
        btn_po4 = findViewById(R.id.btn_po4);
        btn_po5 = findViewById(R.id.btn_po5);
        btn_ClearPattern = findViewById(R.id.btn__ClearPattern);
        btn_Blackout = findViewById(R.id.btn__Blackout);


        if (PatternClassOnly.patternStyle.equals("0")){
            autoCompleteTextView.setText("Blackout");
        } else if (PatternClassOnly.patternStyle.equals("1")) {
            autoCompleteTextView.setText("First " + PatternClassOnly.patternFirstXNumbers.toString() + " numbers");
        } else if (PatternClassOnly.patternStyle.equals("2")) {
            autoCompleteTextView.setText("Custom");
            tableLayout3.setVisibility(View.VISIBLE);
            btn_ClearPattern.setVisibility(View.VISIBLE);
        }else {
            //Do Nothing
        }


        adapterString();
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String item = adapterView.getItemAtPosition(position).toString();

                if (item.equals("First 'X' numbers")){
                    if (PatternClassOnly.patternFirstXNumbers.equals("'X'")){
                        et_FirstXNumbers.setVisibility(View.VISIBLE);
                        btn_FirstXNumbers.setVisibility(View.VISIBLE);
                        //Toast.makeText(PatternActivity.this, item, Toast.LENGTH_SHORT).show();
                    }else {
                        et_FirstXNumbers.setVisibility(View.VISIBLE);
                        btn_FirstXNumbers.setVisibility(View.VISIBLE);
                        et_FirstXNumbers.setText(PatternClassOnly.patternFirstXNumbers);


                    }
                    disableButtons();
                    tableLayout3.setVisibility(View.INVISIBLE);
                    btn_ClearPattern.setVisibility(View.INVISIBLE);
                    et_FirstXNumbers.selectAll();

                } else if (item.equals("Blackout")) {
                    PatternClassOnly.px="1";
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

                    FirstCall();
                    et_FirstXNumbers.setVisibility(View.GONE);
                    btn_FirstXNumbers.setVisibility(View.GONE);
                    tableLayout3.setVisibility(View.INVISIBLE);
                    btn_ClearPattern.setVisibility(View.INVISIBLE);
                    enableButtons();
                    PatternClassOnly.patternStyle = "0";
                    //Toast.makeText(PatternActivity.this,  item, Toast.LENGTH_SHORT).show();
                } else if (item.equals("Custom")) {
                    //Toast.makeText(PatternActivity.this, item, Toast.LENGTH_SHORT).show();
                    et_FirstXNumbers.setVisibility(View.GONE);
                    btn_FirstXNumbers.setVisibility(View.GONE);

                    tableLayout3.setVisibility(View.VISIBLE);
                    btn_ClearPattern.setVisibility(View.VISIBLE);
                    enableButtons();
                    PatternClassOnly.patternStyle = "2";
                }else {

                }

            }
        });

        FirstCall();



        btn_FirstXNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_FirstXNumbers.getText().toString().equals("")){
                    et_FirstXNumbers.setError("Please enter Number");
                }else {
                    autoCompleteTextView.setText("First " +  et_FirstXNumbers.getText().toString() + " numbers" );
                    PatternClassOnly.patternFirstXNumbers = et_FirstXNumbers.getText().toString();
                    adapterString();

                    et_FirstXNumbers.setVisibility(View.GONE);
                    btn_FirstXNumbers.setVisibility(View.GONE);

                    PatternClassOnly.px="1";
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

                    FirstCall();
                    disableButtons();

                    PatternClassOnly.patternStyle = "1";
                }


            }
        });
        btn_ClearPattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.patternStyle.equals("0")){

                } else if (PatternClassOnly.patternStyle.equals("1")) {

                } else if (PatternClassOnly.patternStyle.equals("2")) {
                    PatternClassOnly.px="0";
                    PatternClassOnly.pb1="0";
                    PatternClassOnly.pb2="0";
                    PatternClassOnly.pb3="0";
                    PatternClassOnly.pb4="0";
                    PatternClassOnly.pb5="0";
                    PatternClassOnly.pi1="0";
                    PatternClassOnly.pi2="0";
                    PatternClassOnly.pi3="0";
                    PatternClassOnly.pi4="0";
                    PatternClassOnly.pi5="0";
                    PatternClassOnly.pn1="0";
                    PatternClassOnly.pn2="0";
                    PatternClassOnly.pn4="0";
                    PatternClassOnly.pn5="0";
                    PatternClassOnly.pg1="0";
                    PatternClassOnly.pg2="0";
                    PatternClassOnly.pg3="0";
                    PatternClassOnly.pg4="0";
                    PatternClassOnly.pg5="0";
                    PatternClassOnly.po1="0";
                    PatternClassOnly.po2="0";
                    PatternClassOnly.po3="0";
                    PatternClassOnly.po4="0";
                    PatternClassOnly.po5="0";

                    FirstCall();
                    enableButtons();

                    PatternClassOnly.patternStyle = "2";
                }

            }
        });
        btn_Blackout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_px.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.px.toString().equals("0")){
                    btn_px.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_px.setTextColor(Color.WHITE);
                    PatternClassOnly.px= "1";
                } else if (PatternClassOnly.px.toString().equals("1")) {
                    btn_px.setBackgroundColor(Color.LTGRAY);//x
                    btn_px.setTextColor(Color.WHITE);
                    PatternClassOnly.px= "0";
                }
            }
        });
        btn_pb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pb1.toString().equals("0")){
                    btn_pb1.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pb1.setText("X");
                    btn_pb1.setTextColor(Color.WHITE);
                    PatternClassOnly.pb1 = "1";
                } else if (PatternClassOnly.pb1.toString().equals("1")) {
                    btn_pb1.setBackgroundColor(Color.LTGRAY);//x
                    btn_pb1.setText("");
                    PatternClassOnly.pb1 = "0";


                }
            }
        });

        btn_pb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pb2.toString().equals("0")){
                    btn_pb2.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pb2.setText("X");
                    btn_pb2.setTextColor(Color.WHITE);
                    PatternClassOnly.pb2 = "1";
                } else if (PatternClassOnly.pb2.toString().equals("1")) {
                    btn_pb2.setBackgroundColor(Color.LTGRAY);//x
                    btn_pb2.setText("");
                    PatternClassOnly.pb2 = "0";
                }
            }
        });
        btn_pb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pb3.toString().equals("0")){
                    btn_pb3.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pb3.setText("X");
                    btn_pb3.setTextColor(Color.WHITE);
                    PatternClassOnly.pb3 = "1";
                } else if (PatternClassOnly.pb3.toString().equals("1")) {
                    btn_pb3.setBackgroundColor(Color.LTGRAY);//x
                    btn_pb3.setText("");
                    PatternClassOnly.pb3 = "0";
                }
            }
        });
        btn_pb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pb4.toString().equals("0")){
                    btn_pb4.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pb4.setText("X");
                    btn_pb4.setTextColor(Color.WHITE);
                    PatternClassOnly.pb4 = "1";
                } else if (PatternClassOnly.pb4.toString().equals("1")) {
                    btn_pb4.setBackgroundColor(Color.LTGRAY);//x
                    btn_pb4.setText("");
                    PatternClassOnly.pb4 = "0";
                }
            }
        });
        btn_pb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pb5.toString().equals("0")){
                    btn_pb5.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pb5.setText("X");
                    btn_pb5.setTextColor(Color.WHITE);
                    PatternClassOnly.pb5 = "1";
                } else if (PatternClassOnly.pb5.toString().equals("1")) {
                    btn_pb5.setBackgroundColor(Color.LTGRAY);//x
                    btn_pb5.setText("");
                    PatternClassOnly.pb5 = "0";
                }
            }
        });
        btn_pi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pi1.toString().equals("0")){
                    btn_pi1.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pi1.setText("X");
                    btn_pi1.setTextColor(Color.WHITE);
                    PatternClassOnly.pi1 = "1";
                } else if (PatternClassOnly.pi1.toString().equals("1")) {
                    btn_pi1.setBackgroundColor(Color.LTGRAY);//x
                    btn_pi1.setText("");
                    PatternClassOnly.pi1 = "0";
                }
            }
        });
        btn_pi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pi2.toString().equals("0")){
                    btn_pi2.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pi2.setText("X");
                    btn_pi2.setTextColor(Color.WHITE);
                    PatternClassOnly.pi2 = "1";
                } else if (PatternClassOnly.pi2.toString().equals("1")) {
                    btn_pi2.setBackgroundColor(Color.LTGRAY);//x
                    btn_pi2.setText("");
                    PatternClassOnly.pi2 = "0";
                }
            }
        });
        btn_pi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pi3.toString().equals("0")){
                    btn_pi3.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pi3.setText("X");
                    btn_pi3.setTextColor(Color.WHITE);
                    PatternClassOnly.pi3 = "1";
                } else if (PatternClassOnly.pi3.toString().equals("1")) {
                    btn_pi3.setBackgroundColor(Color.LTGRAY);//x
                    btn_pi3.setText("");
                    PatternClassOnly.pi3 = "0";
                }
            }
        });
        btn_pi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pi4.toString().equals("0")){
                    btn_pi4.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pi4.setText("X");
                    btn_pi4.setTextColor(Color.WHITE);
                    PatternClassOnly.pi4 = "1";
                } else if (PatternClassOnly.pi4.toString().equals("1")) {
                    btn_pi4.setBackgroundColor(Color.LTGRAY);//x
                    btn_pi4.setText("");
                    PatternClassOnly.pi4 = "0";
                }
            }
        });
        btn_pi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pi5.toString().equals("0")){
                    btn_pi5.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pi5.setText("X");
                    btn_pi5.setTextColor(Color.WHITE);
                    PatternClassOnly.pi5 = "1";
                } else if (PatternClassOnly.pi5.toString().equals("1")) {
                    btn_pi5.setBackgroundColor(Color.LTGRAY);//x
                    btn_pi5.setText("");
                    PatternClassOnly.pi5 = "0";
                }
            }
        });
        btn_pn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pn1.toString().equals("0")){
                    btn_pn1.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pn1.setText("X");
                    btn_pn1.setTextColor(Color.WHITE);
                    PatternClassOnly.pn1 = "1";
                } else if (PatternClassOnly.pn1.toString().equals("1")) {
                    btn_pn1.setBackgroundColor(Color.LTGRAY);//x
                    btn_pn1.setText("");
                    PatternClassOnly.pn1 = "0";
                }
            }
        });
        btn_pn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pn2.toString().equals("0")){
                    btn_pn2.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pn2.setText("X");
                    btn_pn2.setTextColor(Color.WHITE);
                    PatternClassOnly.pn2 = "1";
                } else if (PatternClassOnly.pn2.toString().equals("1")) {
                    btn_pn2.setBackgroundColor(Color.LTGRAY);//x
                    btn_pn2.setText("");
                    PatternClassOnly.pn2 = "0";
                }
            }
        });
        btn_pn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pn4.toString().equals("0")){
                    btn_pn4.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pn4.setText("X");
                    btn_pn4.setTextColor(Color.WHITE);
                    PatternClassOnly.pn4 = "1";
                } else if (PatternClassOnly.pn4.toString().equals("1")) {
                    btn_pn4.setBackgroundColor(Color.LTGRAY);//x
                    btn_pn4.setText("");
                    PatternClassOnly.pn4 = "0";
                }
            }
        });
        btn_pn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pn5.toString().equals("0")){
                    btn_pn5.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pn5.setText("X");
                    btn_pn5.setTextColor(Color.WHITE);
                    PatternClassOnly.pn5 = "1";
                } else if (PatternClassOnly.pn5.toString().equals("1")) {
                    btn_pn5.setBackgroundColor(Color.LTGRAY);//x
                    btn_pn5.setText("");
                    PatternClassOnly.pn5 = "0";
                }
            }
        });
        btn_pg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pg1.toString().equals("0")){
                    btn_pg1.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pg1.setText("X");
                    btn_pg1.setTextColor(Color.WHITE);
                    PatternClassOnly.pg1 = "1";
                } else if (PatternClassOnly.pg1.toString().equals("1")) {
                    btn_pg1.setBackgroundColor(Color.LTGRAY);//x
                    btn_pg1.setText("");
                    PatternClassOnly.pg1 = "0";
                }
            }
        });
        btn_pg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pg2.toString().equals("0")){
                    btn_pg2.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pg2.setText("X");
                    btn_pg2.setTextColor(Color.WHITE);
                    PatternClassOnly.pg2 = "1";
                } else if (PatternClassOnly.pg2.toString().equals("1")) {
                    btn_pg2.setBackgroundColor(Color.LTGRAY);//x
                    btn_pg2.setText("");
                    PatternClassOnly.pg2 = "0";
                }
            }
        });
        btn_pg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pg3.toString().equals("0")){
                    btn_pg3.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pg3.setText("X");
                    btn_pg3.setTextColor(Color.WHITE);
                    PatternClassOnly.pg3 = "1";
                } else if (PatternClassOnly.pg3.toString().equals("1")) {
                    btn_pg3.setBackgroundColor(Color.LTGRAY);//x
                    btn_pg3.setText("");
                    PatternClassOnly.pg3 = "0";
                }
            }
        });
        btn_pg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pg4.toString().equals("0")){
                    btn_pg4.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pg4.setText("X");
                    btn_pg4.setTextColor(Color.WHITE);
                    PatternClassOnly.pg4 = "1";
                } else if (PatternClassOnly.pg4.toString().equals("1")) {
                    btn_pg4.setBackgroundColor(Color.LTGRAY);//x
                    btn_pg4.setText("");
                    PatternClassOnly.pg4 = "0";
                }
            }
        });
        btn_pg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.pg5.toString().equals("0")){
                    btn_pg5.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_pg5.setText("X");
                    btn_pg5.setTextColor(Color.WHITE);
                    PatternClassOnly.pg5 = "1";
                } else if (PatternClassOnly.pg5.toString().equals("1")) {
                    btn_pg5.setBackgroundColor(Color.LTGRAY);//x
                    btn_pg5.setText("");
                    PatternClassOnly.pg5 = "0";
                }
            }
        });
        btn_po1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.po1.toString().equals("0")){
                    btn_po1.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_po1.setText("X");
                    btn_po1.setTextColor(Color.WHITE);
                    PatternClassOnly.po1 = "1";
                } else if (PatternClassOnly.po1.toString().equals("1")) {
                    btn_po1.setBackgroundColor(Color.LTGRAY);//x
                    btn_po1.setText("");
                    PatternClassOnly.po1 = "0";
                }
            }
        });
        btn_po2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.po2.toString().equals("0")){
                    btn_po2.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_po2.setText("X");
                    btn_po2.setTextColor(Color.WHITE);
                    PatternClassOnly.po2 = "1";
                } else if (PatternClassOnly.po2.toString().equals("1")) {
                    btn_po2.setBackgroundColor(Color.LTGRAY);//x
                    btn_po2.setText("");
                    PatternClassOnly.po2 = "0";
                }
            }
        });
        btn_po3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.po3.toString().equals("0")){
                    btn_po3.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_po3.setText("X");
                    btn_po3.setTextColor(Color.WHITE);
                    PatternClassOnly.po3 = "1";
                } else if (PatternClassOnly.po3.toString().equals("1")) {
                    btn_po3.setBackgroundColor(Color.LTGRAY);//x
                    btn_po3.setText("");
                    PatternClassOnly.po3 = "0";
                }
            }
        });
        btn_po4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.po4.toString().equals("0")){
                    btn_po4.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_po4.setText("X");
                    btn_po4.setTextColor(Color.WHITE);
                    PatternClassOnly.po4 = "1";
                } else if (PatternClassOnly.po4.toString().equals("1")) {
                    btn_po4.setBackgroundColor(Color.LTGRAY);//x
                    btn_po4.setText("");
                    PatternClassOnly.po4 = "0";
                }
            }
        });
        btn_po5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PatternClassOnly.po5.toString().equals("0")){
                    btn_po5.setBackgroundColor(Color.parseColor("#293241"));//
                    btn_po5.setText("X");
                    btn_po5.setTextColor(Color.WHITE);
                    PatternClassOnly.po5 = "1";
                } else if (PatternClassOnly.po5.toString().equals("1")) {
                    btn_po5.setBackgroundColor(Color.LTGRAY);//x
                    btn_po5.setText("");
                    PatternClassOnly.po5 = "0";
                }
            }
        });
    }
    void FirstCall(){
        if (PatternClassOnly.px.toString().equals("0")){
            btn_px.setBackgroundColor(Color.LTGRAY);//z
        } else if (PatternClassOnly.px.toString().equals("1")) {
            btn_px.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pb1.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pb1.toString().equals("0")){
            btn_pb1.setBackgroundColor(Color.LTGRAY);//z
            btn_pb1.setText("");
        } else if (PatternClassOnly.pb1.toString().equals("1")) {
            btn_pb1.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pb1.setText("X");
            btn_pb1.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pb2.toString().equals("0")){
            btn_pb2.setBackgroundColor(Color.LTGRAY);//z
            btn_pb2.setText("");
        } else if (PatternClassOnly.pb2.toString().equals("1")) {
            btn_pb2.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pb2.setText("X");
            btn_pb2.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pb3.toString().equals("0")){
            btn_pb3.setBackgroundColor(Color.LTGRAY);//z
            btn_pb3.setText("");
        } else if (PatternClassOnly.pb3.toString().equals("1")) {
            btn_pb3.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pb3.setText("X");
            btn_pb3.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pb4.toString().equals("0")){
            btn_pb4.setBackgroundColor(Color.LTGRAY);//z
            btn_pb4.setText("");
        } else if (PatternClassOnly.pb4.toString().equals("1")) {
            btn_pb4.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pb4.setText("X");
            btn_pb4.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pb5.toString().equals("0")){
            btn_pb5.setBackgroundColor(Color.LTGRAY);//z
            btn_pb5.setText("");
        } else if (PatternClassOnly.pb5.toString().equals("1")) {
            btn_pb5.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pb5.setText("X");
            btn_pb5.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pi1.toString().equals("0")){
            btn_pi1.setBackgroundColor(Color.LTGRAY);//z
            btn_pi1.setText("");
        } else if (PatternClassOnly.pi1.toString().equals("1")) {
            btn_pi1.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pi1.setText("X");
            btn_pi1.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pi2.toString().equals("0")){
            btn_pi2.setBackgroundColor(Color.LTGRAY);//z
            btn_pi2.setText("");
        } else if (PatternClassOnly.pi2.toString().equals("1")) {
            btn_pi2.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pi2.setText("X");
            btn_pi2.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pi3.toString().equals("0")){
            btn_pi3.setBackgroundColor(Color.LTGRAY);//z
            btn_pi3.setText("");
        } else if (PatternClassOnly.pi3.toString().equals("1")) {
            btn_pi3.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pi3.setText("X");
            btn_pi3.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pi4.toString().equals("0")){
            btn_pi4.setBackgroundColor(Color.LTGRAY);//z
            btn_pi4.setText("");
        } else if (PatternClassOnly.pi4.toString().equals("1")) {
            btn_pi4.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pi4.setText("X");
            btn_pi4.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pi5.toString().equals("0")){
            btn_pi5.setBackgroundColor(Color.LTGRAY);//z
            btn_pi5.setText("");
        } else if (PatternClassOnly.pi5.toString().equals("1")) {
            btn_pi5.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pi5.setText("X");
            btn_pi5.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pn1.toString().equals("0")){
            btn_pn1.setBackgroundColor(Color.LTGRAY);//z
            btn_pn1.setText("");
        } else if (PatternClassOnly.pn1.toString().equals("1")) {
            btn_pn1.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pn1.setText("X");
            btn_pn1.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pn2.toString().equals("0")){
            btn_pn2.setBackgroundColor(Color.LTGRAY);//z
            btn_pn2.setText("");
        } else if (PatternClassOnly.pn2.toString().equals("1")) {
            btn_pn2.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pn2.setText("X");
            btn_pn2.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pn4.toString().equals("0")){
            btn_pn4.setBackgroundColor(Color.LTGRAY);//z
            btn_pn4.setText("");
        } else if (PatternClassOnly.pn4.toString().equals("1")) {
            btn_pn4.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pn4.setText("X");
            btn_pn4.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pn5.toString().equals("0")){
            btn_pn5.setBackgroundColor(Color.LTGRAY);//z
            btn_pn5.setText("");
        } else if (PatternClassOnly.pn5.toString().equals("1")) {
            btn_pn5.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pn5.setText("X");
            btn_pn5.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pg1.toString().equals("0")){
            btn_pg1.setBackgroundColor(Color.LTGRAY);//z
            btn_pg1.setText("");
        } else if (PatternClassOnly.pg1.toString().equals("1")) {
            btn_pg1.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pg1.setText("X");
            btn_pg1.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pg2.toString().equals("0")){
            btn_pg2.setBackgroundColor(Color.LTGRAY);//z
            btn_pg2.setText("");
        } else if (PatternClassOnly.pg2.toString().equals("1")) {
            btn_pg2.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pg2.setText("X");
            btn_pg2.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pg3.toString().equals("0")){
            btn_pg3.setBackgroundColor(Color.LTGRAY);//z
            btn_pg3.setText("");
        } else if (PatternClassOnly.pg3.toString().equals("1")) {
            btn_pg3.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pg3.setText("X");
            btn_pg3.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pg4.toString().equals("0")){
            btn_pg4.setBackgroundColor(Color.LTGRAY);//z
            btn_pg4.setText("");
        } else if (PatternClassOnly.pg4.toString().equals("1")) {
            btn_pg4.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pg4.setText("X");
            btn_pg4.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.pg5.toString().equals("0")){
            btn_pg5.setBackgroundColor(Color.LTGRAY);//z
            btn_pg5.setText("");
        } else if (PatternClassOnly.pg5.toString().equals("1")) {
            btn_pg5.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_pg5.setText("X");
            btn_pg5.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.po1.toString().equals("0")){
            btn_po1.setBackgroundColor(Color.LTGRAY);//z
            btn_po1.setText("");
        } else if (PatternClassOnly.po1.toString().equals("1")) {
            btn_po1.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_po1.setText("X");
            btn_po1.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.po2.toString().equals("0")){
            btn_po2.setBackgroundColor(Color.LTGRAY);//z
            btn_po2.setText("");
        } else if (PatternClassOnly.po2.toString().equals("1")) {
            btn_po2.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_po2.setText("X");
            btn_po2.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.po3.toString().equals("0")){
            btn_po3.setBackgroundColor(Color.LTGRAY);//z
            btn_po3.setText("");
        } else if (PatternClassOnly.po3.toString().equals("1")) {
            btn_po3.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_po3.setText("X");
            btn_po3.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.po4.toString().equals("0")){
            btn_po4.setBackgroundColor(Color.LTGRAY);//z
            btn_po4.setText("");
        } else if (PatternClassOnly.po4.toString().equals("1")) {
            btn_po4.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_po4.setText("X");
            btn_po4.setTextColor(Color.WHITE);
        }
        if (PatternClassOnly.po5.toString().equals("0")){
            btn_po5.setBackgroundColor(Color.LTGRAY);//z
            btn_po5.setText("");
        } else if (PatternClassOnly.po5.toString().equals("1")) {
            btn_po5.setBackgroundColor(Color.parseColor("#293241"));//x
            btn_po5.setText("X");
            btn_po5.setTextColor(Color.WHITE);
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            refreshActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        refreshActivity();
        super.onBackPressed();
    }

    public void refreshActivity() {
        Intent i = new Intent(PatternActivity.this, LaroActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    void adapterString(){
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_item, item);
        autoCompleteTextView.setAdapter(adapterItems);
    }

    void disableButtons(){
        btn_px.setEnabled(false);
        btn_pb1.setEnabled(false);
        btn_pb2.setEnabled(false);
        btn_pb3.setEnabled(false);
        btn_pb4.setEnabled(false);
        btn_pb5.setEnabled(false);
        btn_pi1.setEnabled(false);
        btn_pi2.setEnabled(false);
        btn_pi3.setEnabled(false);
        btn_pi4.setEnabled(false);
        btn_pi5.setEnabled(false);
        btn_pn1.setEnabled(false);
        btn_pn2.setEnabled(false);
        btn_pn4.setEnabled(false);
        btn_pn5.setEnabled(false);
        btn_pg1.setEnabled(false);
        btn_pg2.setEnabled(false);
        btn_pg3.setEnabled(false);
        btn_pg4.setEnabled(false);
        btn_pg5.setEnabled(false);
        btn_po1.setEnabled(false);
        btn_po2.setEnabled(false);
        btn_po3.setEnabled(false);
        btn_po4.setEnabled(false);
        btn_po5.setEnabled(false);
    }
    void enableButtons(){
        btn_px.setEnabled(true);
        btn_pb1.setEnabled(true);
        btn_pb2.setEnabled(true);
        btn_pb3.setEnabled(true);
        btn_pb4.setEnabled(true);
        btn_pb5.setEnabled(true);
        btn_pi1.setEnabled(true);
        btn_pi2.setEnabled(true);
        btn_pi3.setEnabled(true);
        btn_pi4.setEnabled(true);
        btn_pi5.setEnabled(true);
        btn_pn1.setEnabled(true);
        btn_pn2.setEnabled(true);
        btn_pn4.setEnabled(true);
        btn_pn5.setEnabled(true);
        btn_pg1.setEnabled(true);
        btn_pg2.setEnabled(true);
        btn_pg3.setEnabled(true);
        btn_pg4.setEnabled(true);
        btn_pg5.setEnabled(true);
        btn_po1.setEnabled(true);
        btn_po2.setEnabled(true);
        btn_po3.setEnabled(true);
        btn_po4.setEnabled(true);
        btn_po5.setEnabled(true);
    }
    void clearPattern(){

    }
}