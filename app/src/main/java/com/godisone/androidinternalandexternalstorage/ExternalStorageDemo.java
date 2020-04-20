package com.godisone.androidinternalandexternalstorage;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExternalStorageDemo extends AppCompatActivity {
    TextView tv;
    EditText inputtxt;
    Button store,read;
    String txtdata=" ";
    private static boolean isExternalStorageReadOnly() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    private static boolean isExternalStorageAvailable() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            return true;
        }
        return false;
    }
    private String file="filestorage.txt";
    private String path="folderinEXTStorage";
    File myFile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_storage_demo);
        inputtxt=findViewById(R.id.et1e);
        tv=findViewById(R.id.tv_reade);
        read =findViewById(R.id.btn_reade);
        store =findViewById(R.id.btn_writee);

        if (!isExternalStorageAvailable() || isExternalStorageReadOnly()) {
            {
                store.setEnabled(false);
            }}
        else{
            myFile =  new File(getExternalFilesDir(path), file);

        }
       read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileInputStream fileInputStream = new FileInputStream(myFile);
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
                    String s;
                    while((s= bufferedReader.readLine())!=null)
                    {
                        txtdata =txtdata+s;

                    }
                    dataInputStream.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tv.setText("Data retrived from External Storage is : \n  "+txtdata);
            }
        });
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream fileOutputStream= new FileOutputStream(myFile);
                    fileOutputStream.write(inputtxt.getText().toString().getBytes());
                    fileOutputStream.close();

                }
                catch (IOException e)
                {
                    e.printStackTrace();

                }inputtxt.setText(" ");
                tv.setText(" ");
                Toast.makeText(ExternalStorageDemo.this,"Current data is stored in filestorage.txt in folder folderinEXTStorage in the External Storage",Toast.LENGTH_SHORT).show();


            }
        });




    }

}
