package com.piyush.a40_dynamic_broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Airmode:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val state:Boolean = p1?.getBooleanExtra("state", false) ?: return
        if (state) {
            t(p0, "Airmode Enabled")
        } else {
            t(p0, "Airmode Disabled")
        }
    }

    fun t(p0: Context?, msg:Any)
    {
        android.widget.Toast.makeText(p0, msg.toString(), android.widget.Toast.LENGTH_SHORT).show()
    }
}