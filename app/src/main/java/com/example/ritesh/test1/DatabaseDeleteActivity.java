package com.example.ritesh.test1;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DatabaseDeleteActivity extends AppCompatActivity {
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_delete);
        Log.d("RCPLMESSAGE","********1");
        et1= (EditText) findViewById(R.id.editText1);
        Log.d("RCPLMESSAGE","********2");

    }
    public void delete(View view)
    {
        int cid=Integer.parseInt(et1.getText().toString());
        Log.d("RCPLMESSAGE","********3");
        SQLiteDatabase db =openOrCreateDatabase("RCPL_Db",MODE_APPEND,null);
        Log.d("RCPLMESSAGE","********4");
        String query="delete from Customer where _id=" +cid;
        Log.d("RCPLMESSAGE","********5");
        db.execSQL(query);
        Toast.makeText(this, "Record deleted", Toast.LENGTH_SHORT).show();

    }
}
