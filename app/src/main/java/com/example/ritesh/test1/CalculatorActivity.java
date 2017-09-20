package com.example.ritesh.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1,et2;
    TextView tv1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et1= (EditText) findViewById(R.id.editText1);
        et2= (EditText) findViewById(R.id.editText2);
        tv1= (TextView) findViewById(R.id.textView4);
        b1= (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
    }






    @Override
    public void onClick(View view) {
        int c= (Integer.parseInt(et1.getText().toString()))+(Integer.parseInt(et2.getText().toString()));
        tv1.setText("Result="+c);
    }
}

