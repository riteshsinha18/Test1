package com.example.ritesh.test1;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SdcardActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdcard);
        et1= (EditText) findViewById(R.id.editText1);
        et2= (EditText) findViewById(R.id.editText2);
    }
    public void save(View v)
    {
        String n=et1.getText().toString();
        String ph=et2.getText().toString();

                try
                {
                    File rootpath= Environment.getExternalStorageDirectory();
                    File f= new File(rootpath,"ContactsData.txt");

                    if(f.exists()==false)
                    {
                        f.createNewFile();
                        Toast.makeText(this, "New ContactsData.txt file created.", Toast.LENGTH_SHORT).show();

                    }
                    String details=n + ":" + ph + "\n";
                    FileOutputStream fos=new FileOutputStream((f) , true);
                    fos.write(details.getBytes());
                    Toast.makeText(this, "Data Saved Sucessfully", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(this, "Error in creation", Toast.LENGTH_SHORT).show();
                }

    }
    public void read(View v)
    {
        try
        {
            File rootpath=Environment.getExternalStorageDirectory();
            File f=new File(rootpath,"ContactsData.txt");
            if(f.exists())
            {
                FileInputStream fis=new FileInputStream(f);
                String data="";
                while(true)
                {
                   int a=fis.read();
                    if(a==-1)
                    {
                        break;
                    }
                    data=data+ (char)a;

                }
                Toast.makeText(this,data, Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "File Not Find", Toast.LENGTH_SHORT).show();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
