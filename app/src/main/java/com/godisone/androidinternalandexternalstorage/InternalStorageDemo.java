package com.godisone.androidinternalandexternalstorage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InternalStorageDemo extends AppCompatActivity {

    static final int TXT_SIZE=100;

    EditText txt;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage_demo);
        txt=findViewById(R.id.et1);
        tv=findViewById(R.id.tv_read);
    }

    public void Read(View view) {
        try {
            FileInputStream fileInputStream = openFileInput("iternalstoragefile.txt");
            int c;
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            char[] buffer = new char[TXT_SIZE];
            String s="The text saved in the file is :  \n " ;
            while((c= inputStreamReader.read(buffer))>0)
            {
                String s1=String.copyValueOf(buffer,0,c);
                s=s+s1;
            }
            inputStreamReader.close();
            tv.setText(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void Write(View view) {
        try{
            FileOutputStream fileOutputStream= openFileOutput("iternalstoragefile.txt",MODE_PRIVATE);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            String ss= txt.getText().toString();
            txt.setText("");
            outputStreamWriter.write(ss);
            outputStreamWriter.close();
            Toast.makeText(InternalStorageDemo.this,"Your text is Saved at iternalstoragefile.txt ",Toast.LENGTH_SHORT).show();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
