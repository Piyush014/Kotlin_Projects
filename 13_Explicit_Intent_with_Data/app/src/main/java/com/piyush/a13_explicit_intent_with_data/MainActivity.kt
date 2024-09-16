package com.piyush.a13_explicit_intent_with_data
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tv1 = findViewById<EditText>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(View.OnClickListener {

            // First Create a new Intent.
            val intent = Intent(this@MainActivity, ExplicitIntent::class.java)

            // Add Data to the Intent
            intent.putExtra("name", tv1.text.toString())

            // Start the new Activity
            startActivity(intent)

            // Display the toast message
            Toast.makeText(this, "Congratulations! Intent run Successfully.", Toast.LENGTH_SHORT).show()
            finish()
        })
    }
}