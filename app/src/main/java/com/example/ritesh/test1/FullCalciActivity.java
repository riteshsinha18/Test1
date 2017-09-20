package com.example.ritesh.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FullCalciActivity extends AppCompatActivity implements View.OnClickListener {
Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btsub,btdiv,btmul,btadd,btequal;
    TextView tv1;
    int numadd=0,numsub=0,numdiv=0,nummul=0,num2=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_calci);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btsub = (Button) findViewById(R.id.btsub);
        btdiv = (Button) findViewById(R.id.btdiv);
        btmul = (Button) findViewById(R.id.btmul);
        btadd = (Button) findViewById(R.id.btadd);
        btequal = (Button) findViewById(R.id.btequal);
        tv1 = (TextView) findViewById(R.id.textView);


        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btequal.setOnClickListener(this);
        btadd.setOnClickListener(this);
        btmul.setOnClickListener(this);
        btdiv.setOnClickListener(this);
        btsub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bt0)
        {
           tv1.append("0");
        }
        else if(view.getId()==R.id.bt1)
        {
            tv1.append("1");
        }
        else if(view.getId()==R.id.bt2)
        {
            tv1.append("2");
        }
        else if(view.getId()==R.id.bt3)
        {
            tv1.append("3");
        }
        else if(view.getId()==R.id.bt4)
        {
            tv1.append("4");

        }
        else if(view.getId()==R.id.bt5)
        {
            tv1.append("5");
        }
        else if(view.getId()==R.id.bt6)
        {
            tv1.append("6");
        }
        else if(view.getId()==R.id.bt7)
        {
            tv1.append("7");

        }
        else if(view.getId()==R.id.bt8)
        {
            tv1.append("8");
        }
        else if(view.getId()==R.id.bt9)
        {
            tv1.append("9");
        }
        else if(view.getId()==R.id.btadd)
        {
            numadd=Integer.parseInt(tv1.getText().toString());
            tv1.setText("");


        }
        else if(view.getId()==R.id.btmul)
        {
            nummul=Integer.parseInt(tv1.getText().toString());
            tv1.setText("");
        }
        else if(view.getId()==R.id.btsub)
        {
            numsub=Integer.parseInt(tv1.getText().toString());
            tv1.setText("");
        }
        else if(view.getId()==R.id.btdiv)
        {
            numdiv=Integer.parseInt(tv1.getText().toString());
            tv1.setText("");

        }
        else if(view.getId()==R.id.btequal)
        {
            num2=Integer.parseInt(tv1.getText().toString());
            if(numadd!=0)
            {
                result=numadd+num2;
                tv1.setText("Result="+result);
            }
            else if(numsub!=0)
            {
                result=numsub-num2;
                tv1.setText("Result="+result);

            }
            else if(nummul!=0)
            {
                result=nummul*num2;
                tv1.setText("Result="+result);
            }
            else if(numdiv!=0)
            {
                result=numdiv/num2;
                tv1.setText("Result="+result);

            }

        }
    }
}
