package com.example.ritesh.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleSwitchActivity extends AppCompatActivity {
ToggleButton tb1;
    Switch sw1;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_switch);
        tb1= (ToggleButton) findViewById(R.id.toggleButton1);
        sw1= (Switch) findViewById(R.id.switch1);
        tv1= (TextView) findViewById(R.id.textView1);
        tv2= (TextView) findViewById(R.id.textView2);
    }
    public void show(View v)
    {
        String str1= tb1.getText().toString();
        tv1.setText(str1);
        boolean status=sw1.isChecked();
        tv2.setText(String.valueOf(status));
    }
}
