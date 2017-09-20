package com.example.ritesh.test1;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DatabaseAddActivity extends AppCompatActivity
{
    EditText et3,et2;

    String table_name="Customer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_add);
        et2 = (EditText) findViewById(R.id.editTextdb1);
        et3 = (EditText) findViewById(R.id.editTextdb2);
        Log.d("RCPLMESSAGE","********1");
        SQLiteDatabase db = openOrCreateDatabase("RCPL_Db", MODE_APPEND, null);
        Log.d("RCPLMESSAGE","********2");
        db.execSQL("create table if not exists " +table_name+" (_id  integer primary key autoincrement,  name  VARCHAR,phone Varchar)");
        Log.d("RCPLMESSAGE","********3");

        Log.d("RCPLMESSAGE","********4");
        Toast.makeText(this, "Table is available", Toast.LENGTH_SHORT).show();
        db.close();
    }
    public void insertrec (View v)
    {
        String name=et2.getText().toString();
        String phone=et3.getText().toString();
        Log.d("RCPLMESSAGE","********5");
        SQLiteDatabase db = openOrCreateDatabase("RCPL_Db", MODE_APPEND, null);
        Log.d("RCPLMESSAGE","********6");
        String query="insert into Customer(name,phone) values ('"+name+"','"+phone+"')";
        Log.d("RCPLMESSAGE","********7");
        db.execSQL(query);
        Log.d("RCPLMESSAGE","*******8");
        Toast.makeText(this, "Record Inserted", Toast.LENGTH_SHORT).show();
    }
}
