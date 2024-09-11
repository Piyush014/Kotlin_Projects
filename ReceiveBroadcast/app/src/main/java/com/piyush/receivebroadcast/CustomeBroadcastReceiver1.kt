package com.piyush.receivebroadcast

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CustomeBroadcastReceiver1 :AppCompatActivity() {
    val customBroadcast = CustomBroadcast1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentFilter = IntentFilter("com.piyush.receivebroadcast.EXAMPLE_ACTION")
        registerReceiver(customBroadcast, intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(customBroadcast)
    }
}