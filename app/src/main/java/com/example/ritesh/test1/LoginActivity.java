package com.example.ritesh.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
EditText et1,et2;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1= (EditText) findViewById(R.id.editText31);
        et2= (EditText) findViewById(R.id.editText32);
    }//end of OnCreate
    public void buttonclick(View v)
    {
        String str1=et1.getText().toString();
        String str2=et2.getText().toString();
        Intent box= new Intent(LoginActivity.this,LoginResultActivity.class);
        box.putExtra("U",str1);
        box.putExtra("P",str2);
        startActivity(box);
    }
}
