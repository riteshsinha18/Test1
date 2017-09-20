package com.example.ritesh.test1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DatabaseUpdateActivity extends AppCompatActivity {
EditText et1,et2;
    TextView tv1;
    String cid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_update);
        et1= (EditText) findViewById(R.id.editText1);
        et2= (EditText) findViewById(R.id.editText2);
        tv1= (TextView) findViewById(R.id.textView1);
    }
    public void search(View view)
    {
        SQLiteDatabase db =openOrCreateDatabase("RCPL_Db",MODE_APPEND,null);
        cid=(et1.getText().toString());
        String query="select * from Customer Where _id="+ cid;
                Cursor cursor=db.rawQuery(query,null);
        if(cursor.moveToNext())
        {
            String name=cursor.getString(1);
            String phone=cursor.getString(2);
            tv1.setText(name);
            et2.setText(phone);
            db.close();
        }
    }
    public void update(View view)
    {
        SQLiteDatabase db =openOrCreateDatabase("RCPL_Db",MODE_APPEND,null);
        String phone=et2.getText().toString();
        phone="'"+ phone+"'";
        String query="update Customer set phone="+phone+"where id="+cid;
        db.execSQL(query);
        Toast.makeText(this, "Record updated successfully", Toast.LENGTH_SHORT).show();

    }//end of update

}
