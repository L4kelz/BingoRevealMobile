package com.bpg.bingorevealmobile;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class MyDatabaseHelper extends SQLiteOpenHelper{

    private Context context;
    private static final String DATABASE_NAME = "bingodb.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "my_bingo";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "cname";
    private static final String COLUMN_B1 = "b1";
    private static final String COLUMN_B2 = "b2";
    private static final String COLUMN_B3 = "b3";
    private static final String COLUMN_B4 = "b4";
    private static final String COLUMN_B5 = "b5";
    private static final String COLUMN_I1 = "i1";
    private static final String COLUMN_I2 = "i2";
    private static final String COLUMN_I3 = "i3";
    private static final String COLUMN_I4 = "i4";
    private static final String COLUMN_I5 = "i5";
    private static final String COLUMN_N1 = "n1";
    private static final String COLUMN_N2 = "n2";
    private static final String COLUMN_N4 = "n4";
    private static final String COLUMN_N5 = "n5";
    private static final String COLUMN_G1 = "g1";
    private static final String COLUMN_G2 = "g2";
    private static final String COLUMN_G3 = "g3";
    private static final String COLUMN_G4 = "g4";
    private static final String COLUMN_G5 = "g5";
    private static final String COLUMN_O1 = "o1";
    private static final String COLUMN_O2 = "o2";
    private static final String COLUMN_O3 = "o3";
    private static final String COLUMN_O4 = "o4";
    private static final String COLUMN_O5 = "o5";

    MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME +
                        " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_NAME + " TEXT, " +
                        COLUMN_B1 + " TEXT, " +
                        COLUMN_B2 + " TEXT, " +
                        COLUMN_B3 + " TEXT, " +
                        COLUMN_B4 + " TEXT, " +
                        COLUMN_B5 + " TEXT, " +
                        COLUMN_I1 + " TEXT, " +
                        COLUMN_I2 + " TEXT, " +
                        COLUMN_I3 + " TEXT, " +
                        COLUMN_I4 + " TEXT, " +
                        COLUMN_I5 + " TEXT, " +
                        COLUMN_N1 + " TEXT, " +
                        COLUMN_N2 + " TEXT, " +
                        COLUMN_N4 + " TEXT, " +
                        COLUMN_N5 + " TEXT, " +
                        COLUMN_G1 + " TEXT, " +
                        COLUMN_G2 + " TEXT, " +
                        COLUMN_G3 + " TEXT, " +
                        COLUMN_G4 + " TEXT, " +
                        COLUMN_G5 + " TEXT, " +
                        COLUMN_O1 + " TEXT, " +
                        COLUMN_O2 + " TEXT, " +
                        COLUMN_O3 + " TEXT, " +
                        COLUMN_O4 + " TEXT, " +
                        COLUMN_O5 + " TEXT) ";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addbook(String data_cname, String data_b1, String data_b2, String data_b3, String data_b4, String data_b5, String data_i1, String data_i2, String data_i3, String data_i4, String data_i5, String data_n1, String data_n2, String data_n4, String data_n5, String data_g1, String data_g2, String data_g3, String data_g4, String data_g5, String data_o1, String data_o2, String data_o3, String data_o4, String data_o5){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, data_cname);
        cv.put(COLUMN_B1, data_b1);
        cv.put(COLUMN_B2, data_b2);
        cv.put(COLUMN_B3, data_b3);
        cv.put(COLUMN_B4, data_b4);
        cv.put(COLUMN_B5, data_b5);
        cv.put(COLUMN_I1, data_i1);
        cv.put(COLUMN_I2, data_i2);
        cv.put(COLUMN_I3, data_i3);
        cv.put(COLUMN_I4, data_i4);
        cv.put(COLUMN_I5, data_i5);
        cv.put(COLUMN_N1, data_n1);
        cv.put(COLUMN_N2, data_n2);
        cv.put(COLUMN_N4, data_n4);
        cv.put(COLUMN_N5, data_n5);
        cv.put(COLUMN_G1, data_g1);
        cv.put(COLUMN_G2, data_g2);
        cv.put(COLUMN_G3, data_g3);
        cv.put(COLUMN_G4, data_g4);
        cv.put(COLUMN_G5, data_g5);
        cv.put(COLUMN_O1, data_o1);
        cv.put(COLUMN_O2, data_o2);
        cv.put(COLUMN_O3, data_o3);
        cv.put(COLUMN_O4, data_o4);
        cv.put(COLUMN_O5, data_o5);
        long result = db.insert(TABLE_NAME,null,cv);
        if (result == -1){
            Toast.makeText(context, "Failed to add", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Added Successfully", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }


    void updateData(String row_id, String data_cname, String data_b1, String data_b2, String data_b3, String data_b4, String data_b5, String data_i1, String data_i2, String data_i3, String data_i4, String data_i5, String data_n1, String data_n2, String data_n4, String data_n5, String data_g1, String data_g2, String data_g3, String data_g4, String data_g5, String data_o1, String data_o2, String data_o3, String data_o4, String data_o5){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, data_cname);
        cv.put(COLUMN_B1, data_b1);
        cv.put(COLUMN_B2, data_b2);
        cv.put(COLUMN_B3, data_b3);
        cv.put(COLUMN_B4, data_b4);
        cv.put(COLUMN_B5, data_b5);
        cv.put(COLUMN_I1, data_i1);
        cv.put(COLUMN_I2, data_i2);
        cv.put(COLUMN_I3, data_i3);
        cv.put(COLUMN_I4, data_i4);
        cv.put(COLUMN_I5, data_i5);
        cv.put(COLUMN_N1, data_n1);
        cv.put(COLUMN_N2, data_n2);
        cv.put(COLUMN_N4, data_n4);
        cv.put(COLUMN_N5, data_n5);
        cv.put(COLUMN_G1, data_g1);
        cv.put(COLUMN_G2, data_g2);
        cv.put(COLUMN_G3, data_g3);
        cv.put(COLUMN_G4, data_g4);
        cv.put(COLUMN_G5, data_g5);
        cv.put(COLUMN_O1, data_o1);
        cv.put(COLUMN_O2, data_o2);
        cv.put(COLUMN_O3, data_o3);
        cv.put(COLUMN_O4, data_o4);
        cv.put(COLUMN_O5, data_o5);
        long result = db.update(TABLE_NAME, cv, "_id=?", new String[]{row_id});
        if (result == -1){
            Toast.makeText(context, "Failed to Update", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Updated Successfully", Toast.LENGTH_SHORT).show();
        }
    }

    void deleteOneRow(String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "_id=?", new String[]{row_id});
        if (result == -1){
            Toast.makeText(context, "Failed to Delete", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Successfully Deleted", Toast.LENGTH_SHORT).show();
        }

    }

    Cursor ViewData(){
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor1 = sqLiteDatabase.rawQuery("select * from " + TABLE_NAME, null);
        return cursor1;
    }



}
