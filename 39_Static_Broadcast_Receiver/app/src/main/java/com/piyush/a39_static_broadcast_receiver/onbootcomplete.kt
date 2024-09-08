package com.piyush.a39_static_broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class onbootcomplete: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.d("BOOT_COMPLETED", "Boot Successfully Completed")
            Toast.makeText(context, "Boot Successfully Completed", Toast.LENGTH_LONG).show()
        }
    }
}
