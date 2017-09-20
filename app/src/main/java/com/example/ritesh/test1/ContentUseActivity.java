package com.example.ritesh.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ContentUseActivity extends AppCompatActivity {
EditText et3,et2;
    String path="content://com.example.ritesh.test1.custprovider/Customer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_use);
        et2= (EditText) findViewById(R.id.editText1);
        et3= (EditText) findViewById(R.id.editText2);

    }
}
