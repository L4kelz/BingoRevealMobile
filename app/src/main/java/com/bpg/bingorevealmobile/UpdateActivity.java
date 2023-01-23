package com.bpg.bingorevealmobile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText cname_input, b1_input, b2_input, b3_input, b4_input, b5_input, i1_input, i2_input, i3_input, i4_input, i5_input, n1_input, n2_input, n4_input, n5_input, g1_input, g2_input, g3_input, g4_input, g5_input, o1_input, o2_input, o3_input, o4_input, o5_input;
    Button update_button, delete_button;


    String ucname, ub1, ub2, ub3, ub4, ub5, ui1, ui2, ui3, ui4, ui5, un1, un2, un4, un5, ug1, ug2, ug3, ug4, ug5, uo1, uo2, uo3, uo4, uo5;
    String id, cname, b1, b2, b3, b4, b5, i1, i2, i3, i4, i5, n1, n2, n4, n5, g1, g2, g3, g4, g5, o1, o2,o3, o4, o5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
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


        cname_input = findViewById(R.id.tbcardname_update);
        b1_input = findViewById(R.id.b1_2);
        b2_input = findViewById(R.id.b2_2);
        b3_input = findViewById(R.id.b3_2);
        b4_input = findViewById(R.id.b4_2);
        b5_input = findViewById(R.id.b5_2);
        i1_input = findViewById(R.id.i1_2);
        i2_input = findViewById(R.id.i2_2);
        i3_input = findViewById(R.id.i3_2);
        i4_input = findViewById(R.id.i4_2);
        i5_input = findViewById(R.id.i5_2);
        n1_input = findViewById(R.id.n1_2);
        n2_input = findViewById(R.id.n2_2);
        n4_input = findViewById(R.id.n4_2);
        n5_input = findViewById(R.id.n5_2);
        g1_input = findViewById(R.id.g1_2);
        g2_input = findViewById(R.id.g2_2);
        g3_input = findViewById(R.id.g3_2);
        g4_input = findViewById(R.id.g4_2);
        g5_input = findViewById(R.id.g5_2);
        o1_input = findViewById(R.id.o1_2);
        o2_input = findViewById(R.id.o2_2);
        o3_input = findViewById(R.id.o3_2);
        o4_input = findViewById(R.id.o4_2);
        o5_input = findViewById(R.id.o5_2);
        update_button = findViewById(R.id.btn_updatecard);
        delete_button = findViewById(R.id.btn_delete);
        getAndSetIntentData();

        if (actionBar != null){
            actionBar.setTitle(cname);
        }


        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ucname = cname_input.getText().toString();
                ub1 = b1_input.getText().toString();
                ub2 = b2_input.getText().toString();
                ub3 = b3_input.getText().toString();
                ub4 = b4_input.getText().toString();
                ub5 = b5_input.getText().toString();
                ui1 = i1_input.getText().toString();
                ui2 = i2_input.getText().toString();
                ui3 = i3_input.getText().toString();
                ui4 = i4_input.getText().toString();
                ui5 = i5_input.getText().toString();
                un1 = n1_input.getText().toString();
                un2 = n2_input.getText().toString();
                un4 = n4_input.getText().toString();
                un5 = n5_input.getText().toString();
                ug1 = g1_input.getText().toString();
                ug2 = g2_input.getText().toString();
                ug3 = g3_input.getText().toString();
                ug4 = g4_input.getText().toString();
                ug5 = g5_input.getText().toString();
                uo1 = o1_input.getText().toString();
                uo2 = o2_input.getText().toString();
                uo3 = o3_input.getText().toString();
                uo4 = o4_input.getText().toString();
                uo5 = o5_input.getText().toString();

                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateActivity.this);
                myDB.updateData(id, ucname, ub1, ub2, ub3, ub4, ub5, ui1, ui2, ui3, ui4, ui5, un1, un2, un4, un5, ug1, ug2, ug3, ug4, ug5, uo1, uo2, uo3, uo4, uo5);
                finish();
            }


        });

        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            confirmDialog();
            }
        });

    }

    void getAndSetIntentData(){
        if (getIntent().hasExtra("id") && getIntent().hasExtra("cname") &&
                getIntent().hasExtra("b1") && getIntent().hasExtra("b2") && getIntent().hasExtra("b3") && getIntent().hasExtra("b4") && getIntent().hasExtra("b5") &&
                getIntent().hasExtra("i1") && getIntent().hasExtra("i2") && getIntent().hasExtra("i3") && getIntent().hasExtra("i4") && getIntent().hasExtra("i5") &&
                getIntent().hasExtra("n1") && getIntent().hasExtra("n2") && getIntent().hasExtra("n4") && getIntent().hasExtra("n5") &&
                getIntent().hasExtra("g1") && getIntent().hasExtra("g2") && getIntent().hasExtra("g3") && getIntent().hasExtra("g4") && getIntent().hasExtra("g5") &&
                getIntent().hasExtra("o1") && getIntent().hasExtra("o2") && getIntent().hasExtra("o3") && getIntent().hasExtra("o4") && getIntent().hasExtra("o5")) {


            //Get data from intent
            id = getIntent().getStringExtra("id");
            cname = getIntent().getStringExtra("cname");
            b1 = getIntent().getStringExtra("b1");
            b2 = getIntent().getStringExtra("b2");
            b3 = getIntent().getStringExtra("b3");
            b4 = getIntent().getStringExtra("b4");
            b5 = getIntent().getStringExtra("b5");
            i1 = getIntent().getStringExtra("i1");
            i2 = getIntent().getStringExtra("i2");
            i3 = getIntent().getStringExtra("i3");
            i4 = getIntent().getStringExtra("i4");
            i5 = getIntent().getStringExtra("i5");
            n1 = getIntent().getStringExtra("n1");
            n2 = getIntent().getStringExtra("n2");
            n4 = getIntent().getStringExtra("n4");
            n5 = getIntent().getStringExtra("n5");
            g1 = getIntent().getStringExtra("g1");
            g2 = getIntent().getStringExtra("g2");
            g3 = getIntent().getStringExtra("g3");
            g4 = getIntent().getStringExtra("g4");
            g5 = getIntent().getStringExtra("g5");
            o1 = getIntent().getStringExtra("o1");
            o2 = getIntent().getStringExtra("o2");
            o3 = getIntent().getStringExtra("o3");
            o4 = getIntent().getStringExtra("o4");
            o5 = getIntent().getStringExtra("o5");



            //set data from intent

            cname_input.setText(cname);
            b1_input.setText(b1);
            b2_input.setText(b2);
            b3_input.setText(b3);
            b4_input.setText(b4);
            b5_input.setText(b5);
            i1_input.setText(i1);
            i2_input.setText(i2);
            i3_input.setText(i3);
            i4_input.setText(i4);
            i5_input.setText(i5);
            n1_input.setText(n1);
            n2_input.setText(n2);
            n4_input.setText(n4);
            n5_input.setText(n5);
            g1_input.setText(g1);
            g2_input.setText(g2);
            g3_input.setText(g3);
            g4_input.setText(g4);
            g5_input.setText(g5);
            o1_input.setText(o1);
            o2_input.setText(o2);
            o3_input.setText(o3);
            o4_input.setText(o4);
            o5_input.setText(o5);

        }else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete " + cname + " ?");
        builder.setMessage("Are you sure you want to delete " + cname + " ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateActivity.this);
                myDB.deleteOneRow(id);
                finish();
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
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}