package com.piyush.a02_xml_layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.piyush.a02_xml_layouts.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editText)
        val editTextSurname = findViewById<EditText>(R.id.editText2)
        val button = findViewById<Button>(R.id.createButton)
        val textViewFullName = findViewById<TextView>(R.id.textView2)

        button.setOnClickListener {
            val name = editTextName.text.toString()
            val surname = editTextSurname.text.toString()
            val fullName = "$name $surname"
            textViewFullName.text = fullName
        }
    }
}
