package com.example.ritesh.test1;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VibrationActivity extends AppCompatActivity implements View.OnClickListener {
EditText et1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);
        et1= (EditText) findViewById(R.id.editText4);
        b1= (Button) findViewById(R.id.button8);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int duration= Integer.parseInt(et1.getText().toString());
        Vibrator v= (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(duration);
    }
}