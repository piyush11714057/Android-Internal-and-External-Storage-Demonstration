package com.godisone.androidinternalandexternalstorage;

import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ShowAllExternalStoragefiles extends AppCompatActivity {

    List<String> fileslist = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_external_storagefiles);

        File root = new File(Environment.getDataDirectory().getName());

        ListDirectories(root);


    }
    void  ListDirectories (File file)
    {
        File[] files = file.listFiles();
        fileslist.clear();
        for(File f : files)
        {
            fileslist.add(f.getName());
        }
        ArrayAdapter<String> dir = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

    }
}
