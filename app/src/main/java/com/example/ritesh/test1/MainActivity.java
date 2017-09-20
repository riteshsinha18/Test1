package com.example.ritesh.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int num = 0;
    TextView tv1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView1);
        b1 = (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View view) {
                                      num++;
                                      tv1.setText("value=" + num);
                                      Toast.makeText(MainActivity.this,"Value="+num, Toast.LENGTH_SHORT).show();
                                  }

                              }
        );

        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        num--;
        tv1.setText("Value="+num);
        Toast.makeText(MainActivity.this,"Value="+num, Toast.LENGTH_SHORT).show();
    }
}


/* step 1-declarative event handling
    public void xyz(View v)
    {
        num=num+1;
       Toast.makeText(MainActivity.this,"Value="+num, Toast.LENGTH_SHORT).show();
        tv1.setText("Value=" +num);
    }
      class Mylistener implements View.OnClickListener
    {

    delegation event handling
step 1

 Mylistener obj=new Mylistener(); in oncreate class
        @Override
        public void onClick(View v)
        {
            num++;
            tv1.setText("value=" +num);        }
    }




    */
