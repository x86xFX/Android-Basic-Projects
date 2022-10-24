package com.basic.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneBroadCastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return

        if(isAirplaneModeEnabled){
            Toast.makeText(context, "AirPlane Mode Enabled", Toast.LENGTH_SHORT).show()

        }else {
            Toast.makeText(context, "AirPlane Mode Disabled", Toast.LENGTH_SHORT).show()
        }
    }
}