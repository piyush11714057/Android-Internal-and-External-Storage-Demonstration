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
        String s=" Android offers a few structured ways to store data. These include\n" +
                "\n" +
                "1. Shared Preferences\n" +
                "2. Internal Storage\n" +
                "3. External Storage\n" +
                "4. SQLite Storage\n" +
                "5. Storage via Network Connection(on cloud) \n"+
                "But this app is limited to Android Internal Storage and External Storage \n \n \n"+
                "Android Internal Storage\n" +
                "Android Internal storage is the storage of the private data on the device memory. By default, saving and loading files to the internal storage are private to the application and other applications will not have access to these files." +
                " When the user uninstalls the applications the internal stored files associated with the application are also removed. However, note that some users root their Android phones, gaining superuser access. These users will be able to read and write whatever files they wish \n" +
                "Android External Storage\n" +
                "External storage such as SD card can also store application data, there’s no security enforced upon files you save to the external storage.\n" +
                "In general there are two types of External Storage:\n" +

                " \n" +
                "Primary External Storage: In built shared storage which is “accessible by the user by plugging in a USB cable and mounting it as a drive on a host computer”. Example: When we say Nexus 5 32 GB.\n" +
                "Secondary External Storage: Removable storage. Example: SD Card"
                ;
        tv.setText(s);
    }
}
