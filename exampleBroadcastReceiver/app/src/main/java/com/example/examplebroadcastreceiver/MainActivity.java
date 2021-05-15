package com.example.examplebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    exampleBroadcastReceiver broadcastReceiver;
    TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        status = (TextView) findViewById(R.id.status);

        broadcastReceiver = new exampleBroadcastReceiver(status);
        registerReceiver(broadcastReceiver, new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }


}