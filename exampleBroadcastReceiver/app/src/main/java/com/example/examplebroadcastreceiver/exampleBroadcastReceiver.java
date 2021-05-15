package com.example.examplebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class exampleBroadcastReceiver extends BroadcastReceiver {
    TextView status;
    exampleBroadcastReceiver(TextView status){
        this.status = status;
    }
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i("msg----:",String.valueOf(intent.toUri(intent.URI_INTENT_SCHEME)));

        if(Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())){


            Boolean isAirplaneModeOn =  intent.getBooleanExtra("state",false);
            if(isAirplaneModeOn){
                Toast.makeText(context, "Airplane Mode Is Turned On", Toast.LENGTH_SHORT).show();
                status.setText("Airplane Mode Enabled");
            }else{
                Toast.makeText(context, "Airplane Mode Is Turned Off", Toast.LENGTH_SHORT).show();
                status.setText("Airplane Mode Disabled");
            }

        }
    }
}
