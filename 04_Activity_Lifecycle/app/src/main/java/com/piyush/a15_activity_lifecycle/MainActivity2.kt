package com.piyush.a15_activity_lifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val toast = Toast.makeText(applicationContext, "OnCreate() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "OnStart() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(applicationContext, "OnRestart() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(applicationContext, "OnResume() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "OnPause() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "OnStop() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "OnDestroy() Called From 2nd Activity", Toast.LENGTH_LONG).show()
    }
}