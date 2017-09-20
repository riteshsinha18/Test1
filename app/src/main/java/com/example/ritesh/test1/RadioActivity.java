package com.example.ritesh.test1;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
RadioGroup rg1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        rg1= (RadioGroup) findViewById(R.id.Radiogroup1);
        tv1= (TextView) findViewById(R.id.textView9);
        rg1.setOnCheckedChangeListener(this);
    }
    
    public void buttonclick(View v)
    {

        rg1.clearCheck();
        tv1.setText("You have selected:NONE");
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i)
    {
        if(i==R.id.radioButton1)
        {
            tv1.setText("You have selected: BREAKFAST");
        }
        else if(i==R.id.radioButton2)
        {
            tv1.setText("You have selected: LUNCH");
        }
        else if(i==R.id.radioButton3)
        {
            tv1.setText("You have selected: DINNER");
        }
        else if(i==R.id.radioButton4)
        {
            tv1.setText("You have selected: ALL");
        }
    }
}
