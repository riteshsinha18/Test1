package com.example.ritesh.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DealConfirmActivity extends AppCompatActivity {
TextView tv1,tv2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_confirm);
        tv1= (TextView) findViewById(R.id.textView6);
        tv2= (TextView) findViewById(R.id.textView7);
        b1= (Button) findViewById(R.id.button5);
        b2=(Button) findViewById(R.id.button6);
        Intent box=getIntent();
        Bundle bundle=box.getExtras();
        tv1.append(bundle.getString("PRICE"));
        tv2.append(bundle.getString("QUANTITY"));

    }
    public void buttonclick(View v)
    {
        String answer="Unanswered";
        if(v.getId()==R.id.button5)
        {
            answer="Deal Confirmation Success";
        }
        else
        {
            answer="Deal Rejected";
        }
        Intent intent=new Intent();
        intent.putExtra("MSG",answer);
        setResult(0,intent);
        finish();
    }

}
