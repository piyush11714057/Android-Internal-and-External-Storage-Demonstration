package com.godisone.androidinternalandexternalstorage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InternalStorageDemo extends AppCompatActivity {

    static final int TXT_SIZE=100;

    EditText txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage_demo);
        txt=findViewById(R.id.et1);
    }

    public void Read(View view) {

    }

    public void Write(View view) {
    }
}
