package com.piyush.a15_activity_lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, "OnCreate() Called From 1st Activity", Toast.LENGTH_LONG).show()

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            // val intent = Intent(this, MainActivity2::class.java)
            // startActivity(intent)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do You Want to Open Second Activity?")
            builder.setPositiveButton("Yes") { dialog, which ->
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Clicked Yes Button", Toast.LENGTH_LONG).show()
                }
            builder.setNegativeButton("No") { dialog, which ->
                Toast.makeText(applicationContext, "Clicked No Button", Toast.LENGTH_LONG).show()
            }
            val alertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "OnStart() Called From 1st Activity", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(applicationContext, "OnRestart() Called From 1st Activity", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(applicationContext, "OnResume() Called From 1st Activity", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "OnPause() Called From 1st Activity", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "OnStop() Called From 1st Activity", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "OnDestroy() Called From 1st Activity", Toast.LENGTH_LONG).show()
    }
}
