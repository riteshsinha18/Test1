package com.example.ritesh.test1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class SharedPrefrenceActivity extends AppCompatActivity {
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefrence);
        et1= (EditText) findViewById(R.id.editText5);
    }

    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences sp =getSharedPreferences("Demofile", 0);
        String msg=sp.getString("STATUS","Enter some Text");
        et1.setText(msg);
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sp=getSharedPreferences("Demofile",0);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("STATUS",et1.getText().toString());
        editor.commit();
    }

}
