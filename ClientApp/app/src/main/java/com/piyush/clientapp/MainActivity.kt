package com.piyush.clientapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var serviceConnection: MyServiceConnection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the service connection
        serviceConnection = MyServiceConnection()
        // Bind to the service
        serviceConnection.bindService(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Unbind the service when the activity is destroyed
        if (serviceConnection.isBound) {
            unbindService(serviceConnection)
            serviceConnection.isBound = false
            Log.d(TAG, "Service Unbound")
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
