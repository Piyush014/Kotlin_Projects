package com.piyush.receivebroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class CustomBroadcast1 : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if ("com.piyush.receivebroadcast.EXAMPLE_ACTION" == intent?.action) {
            var receivedData = intent.getStringExtra("com.piyush.EXTRA_DATA")
            Toast.makeText(context, "Broadcast Receiver $receivedData", Toast.LENGTH_SHORT).show()
        }
    }
}