package net.chateauvieux.apps.turnwifion;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.wifi.WifiManager;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    private WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
//        if(!wifiManager.isWifiEnabled()){
            wifiManager.setWifiEnabled(true);
//        }
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int id= android.os.Process.myPid();
        android.os.Process.killProcess(id);
    }

}
