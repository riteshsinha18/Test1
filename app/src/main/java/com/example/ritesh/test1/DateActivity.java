package com.example.ritesh.test1;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class DateActivity extends AppCompatActivity {
EditText et1;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        et1 = (EditText) findViewById(R.id.editText1);
    }


    public void opencalendar(View v)
    {
        DateChoose ref=new DateChoose();
        Date d=new Date();
        DatePickerDialog dialog=new DatePickerDialog(this,ref,d.getYear(),d.getMonth(),d.getDay());
        dialog.show();
    }
    class DateChoose implements DatePickerDialog.OnDateSetListener
    {

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2)
        {
            str= i+"/"+(i1+1) +"/"+i2;
            Toast.makeText(DateActivity.this, "str", Toast.LENGTH_SHORT).show();
            et1.setText(str);
        }

    }
}
