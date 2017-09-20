package com.example.ritesh.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DealActivity extends AppCompatActivity {
TextView tv3;
    int REQUEST_CODE=6;
    EditText et1,et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal);
        tv3= (TextView) findViewById(R.id.textView3);
        et1= (EditText) findViewById(R.id.editText);
        et2= (EditText) findViewById(R.id.editText3);
        b1= (Button) findViewById(R.id.button4);
    }
    public void buttonclick(View view)
    {
        String up=et1.getText().toString();
        String qty=et2.getText().toString();
        Intent box=new Intent(DealActivity.this,DealConfirmActivity.class);
        box.putExtra("PRICE",up);
        box.putExtra("QUANTITY",qty);
        startActivityForResult(box,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String str = data.getStringExtra("MSG");
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
    }
