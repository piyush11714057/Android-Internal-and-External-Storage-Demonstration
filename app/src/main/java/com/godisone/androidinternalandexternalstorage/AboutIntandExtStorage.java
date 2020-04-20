package com.godisone.androidinternalandexternalstorage;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutIntandExtStorage extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_intand_ext_storage);
        tv= findViewById(R.id.tvdemo);
        String s=" The Android offers some  ways to store the user's data. They include\n" +
                "\n" +
                "1. Shared Preferences\n" +
                "2. Internal Storage\n" +
                "3. External Storage\n" +
                "4. SQLite Storage\n" +
                "5. Storage via Network Connection(on cloud) \n"+
                "But this app is limited to Android Internal Storage and External Storage. \n \n \n"+
                "Android Internal Storage\n" +
                "This storage is of the private data on the phone memory. Saving and loading of the files in the internal storage are private to the app, and other apps can't access  these files." +
                " When our user uninstalls the app. The internal storage files associated with the app are removed along with the app.But, when users root their Android phones, they gain extra access, with the reducued security so, These users could access, read, write any files they wosh in their phones. \n" +
                "Android External Storage\n" +
                "Storages such as a SD card is also useful to stor app's info and data of the user \n" +
                "There are 2 kinds of External Storages:\n" +

                " \n" +
                "Primary Ext Storage: In built shared storage which is “accessible by the user by plugging in a USB cable and mounting it as a drive on a host computer”." +
                " Example: When we say something like Xiaomi redmi note 4  64 GB.\n" +
                "Secondary Ext Storage: These are Removable storage. Example: SD Cards of 4,8,16,... GB"
                ;
        tv.setText(s);
    }
}
