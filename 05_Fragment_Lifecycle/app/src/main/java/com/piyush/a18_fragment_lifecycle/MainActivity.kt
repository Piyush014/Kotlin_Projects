package com.piyush.a18_fragment_lifecycle

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toast = Toast.makeText(applicationContext, "OnCreate() Called From MainActivity", Toast.LENGTH_LONG).show()
    }

    // Function to handle button clicks and fragment transactions
    fun selectFragment(view: View) {
        val fragment1 = Fragment1()
        val fragment2 = Fragment2()

        // Choose fragment based on the button clicked
        val selectedFragment = when (view.id) {
            R.id.button1 -> fragment1
            R.id.button2 -> fragment2
            else -> fragment1
        }

        // Begin fragment transaction to replace fragments dynamically
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_section, selectedFragment)
        fragmentTransaction.commit()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "OnStop() Called From MainActivity", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(applicationContext, "OnStop() Called From MainActivity", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(applicationContext, "onRestart() Called From MainActivity", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "onDestroy() Called From MainActivity", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "onStart() Called From MainActivity", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(applicationContext, "onResume() Called From MainActivity", Toast.LENGTH_LONG).show()
    }
}
