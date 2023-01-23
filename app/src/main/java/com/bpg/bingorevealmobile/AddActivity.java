package com.bpg.bingorevealmobile;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



public class AddActivity extends AppCompatActivity {

    EditText cname_input, b1_input, b2_input, b3_input, b4_input, b5_input, i1_input, i2_input, i3_input, i4_input, i5_input, n1_input, n2_input, n4_input, n5_input, g1_input, g2_input, g3_input, g4_input, g5_input, o1_input, o2_input, o3_input, o4_input, o5_input;
    Button add_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);




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


        // Take instance of Action Bar
        // using getSupportActionBar and
        // if it is not Null
        // then call hide function




        cname_input = findViewById(R.id.tbcardname);
        b1_input = findViewById(R.id.b1);
        b2_input = findViewById(R.id.b2);
        b3_input = findViewById(R.id.b3);
        b4_input = findViewById(R.id.b4);
        b5_input = findViewById(R.id.b5);
        i1_input = findViewById(R.id.i1);
        i2_input = findViewById(R.id.i2);
        i3_input = findViewById(R.id.i3);
        i4_input = findViewById(R.id.i4);
        i5_input = findViewById(R.id.i5);
        n1_input = findViewById(R.id.n1);
        n2_input = findViewById(R.id.n2);
        n4_input = findViewById(R.id.n4);
        n5_input = findViewById(R.id.n5);
        g1_input = findViewById(R.id.g1);
        g2_input = findViewById(R.id.g2);
        g3_input = findViewById(R.id.g3);
        g4_input = findViewById(R.id.g4);
        g5_input = findViewById(R.id.g5);
        o1_input = findViewById(R.id.o1);
        o2_input = findViewById(R.id.o2);
        o3_input = findViewById(R.id.o3);
        o4_input = findViewById(R.id.o4);
        o5_input = findViewById(R.id.o5);
        add_button = findViewById(R.id.btn_add);


        String numberOfLinesInDB = String.valueOf(CustomAdapter.numberOfLinesCount);


        if (numberOfLinesInDB.equals("10")){
            add_button.setEnabled(false);
            Toast.makeText(this, "Number of cards has exceeded the limit", Toast.LENGTH_SHORT).show();
        }else {
            add_button.setEnabled(true);
        }

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (cname_input.getText().toString().equals("")){
                    cname_input.setError("Please add card name");
                }else {

                    if (b1_input.getText().toString().isEmpty()
                            || b2_input.getText().toString().isEmpty()
                            || b3_input.getText().toString().isEmpty()
                            || b4_input.getText().toString().isEmpty()
                            || b5_input.getText().toString().isEmpty()
                            || i1_input.getText().toString().isEmpty()
                            || i2_input.getText().toString().isEmpty()
                            || i3_input.getText().toString().isEmpty()
                            || i4_input.getText().toString().isEmpty()
                            || i5_input.getText().toString().isEmpty()
                            || n1_input.getText().toString().isEmpty()
                            || n2_input.getText().toString().isEmpty()
                            || n4_input.getText().toString().isEmpty()
                            || n5_input.getText().toString().isEmpty()
                            || g1_input.getText().toString().isEmpty()
                            || g2_input.getText().toString().isEmpty()
                            || g3_input.getText().toString().isEmpty()
                            || g4_input.getText().toString().isEmpty()
                            || g5_input.getText().toString().isEmpty()
                            || o1_input.getText().toString().isEmpty()
                            || o2_input.getText().toString().isEmpty()
                            || o3_input.getText().toString().isEmpty()
                            || o4_input.getText().toString().isEmpty()
                            || o5_input.getText().toString().isEmpty()){

                        if (b1_input.getText().toString().isEmpty()){
                            b1_input.setError("Please add number");
                        }
                        if (b2_input.getText().toString().isEmpty()){
                            b2_input.setError("Please add number");
                        }
                        if (b3_input.getText().toString().isEmpty()){
                            b3_input.setError("Please add number");
                        }
                        if (b4_input.getText().toString().isEmpty()){
                            b4_input.setError("Please add number");
                        }
                        if (b5_input.getText().toString().isEmpty()){
                            b5_input.setError("Please add number");
                        }
                        if (i1_input.getText().toString().isEmpty()){
                            i1_input.setError("Please add number");
                        }
                        if (i2_input.getText().toString().isEmpty()){
                            i2_input.setError("Please add number");
                        }
                        if (i3_input.getText().toString().isEmpty()){
                            i3_input.setError("Please add number");
                        }
                        if (i4_input.getText().toString().isEmpty()){
                            i4_input.setError("Please add number");
                        }
                        if (i5_input.getText().toString().isEmpty()){
                            i5_input.setError("Please add numbber");
                        }
                        if (n1_input.getText().toString().isEmpty()){
                            n1_input.setError("Please add number");
                        }
                        if (n2_input.getText().toString().isEmpty()){
                            n2_input.setError("Please add number");
                        }
                        if (n4_input.getText().toString().isEmpty()){
                            n4_input.setError("Please add number");
                        }
                        if (n5_input.getText().toString().isEmpty()){
                            n5_input.setError("Please add number");
                        }
                        if (g1_input.getText().toString().isEmpty()){
                            g1_input.setError("Please add number");
                        }
                        if (g2_input.getText().toString().isEmpty()){
                            g2_input.setError("Please add number");
                        }
                        if (g3_input.getText().toString().isEmpty()){
                            g3_input.setError("Please add number");
                        }
                        if (g4_input.getText().toString().isEmpty()){
                            g4_input.setError("Please add number");
                        }
                        if (g5_input.getText().toString().isEmpty()){
                            g5_input.setError("Please add number");
                        }
                        if (o1_input.getText().toString().isEmpty()){
                            o1_input.setError("Please add number");
                        }
                        if (o2_input.getText().toString().isEmpty()){
                            o2_input.setError("Please add number");
                        }
                        if (o3_input.getText().toString().isEmpty()){
                            o3_input.setError("Please add number");
                        }
                        if (o4_input.getText().toString().isEmpty()){
                            o4_input.setError("Please add number");
                        }
                        if (o5_input.getText().toString().isEmpty()){
                            o5_input.setError("Please add number");
                        }
                    }else {
                        MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                        myDB.addbook(cname_input.getText().toString().trim(),
                                b1_input.getText().toString().trim(),
                                b2_input.getText().toString().trim(),
                                b3_input.getText().toString().trim(),
                                b4_input.getText().toString().trim(),
                                b5_input.getText().toString().trim(),
                                i1_input.getText().toString().trim(),
                                i2_input.getText().toString().trim(),
                                i3_input.getText().toString().trim(),
                                i4_input.getText().toString().trim(),
                                i5_input.getText().toString().trim(),
                                n1_input.getText().toString().trim(),
                                n2_input.getText().toString().trim(),
                                n4_input.getText().toString().trim(),
                                n5_input.getText().toString().trim(),
                                g1_input.getText().toString().trim(),
                                g2_input.getText().toString().trim(),
                                g3_input.getText().toString().trim(),
                                g4_input.getText().toString().trim(),
                                g5_input.getText().toString().trim(),
                                o1_input.getText().toString().trim(),
                                o2_input.getText().toString().trim(),
                                o3_input.getText().toString().trim(),
                                o4_input.getText().toString().trim(),
                                o5_input.getText().toString().trim());
                        refreshActivity();
                        finish();
                    }

                }

            }
        });



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
        Intent i = new Intent(AddActivity.this, CardViewActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();

    }


}