package com.piyush.a16_listview

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    var listView: ListView? = null
    var arrNo: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    var arrNames: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar = findViewById<Toolbar>(R.id.myToolBar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("List View")

        listView = findViewById<ListView>(R.id.listView)

        arrNames.add("Java")
        arrNames.add("Python")
        arrNames.add("React")
        arrNames.add(".Net")
        arrNames.add("Node.js")
        arrNames.add("HTML")
        arrNames.add("CSS")
        arrNames.add("JavaScript")
        arrNames.add("BootStrap")
        arrNames.add("Rust")
        arrNames.add("Next.js")
        arrNames.add("Flutter")
        arrNames.add("MySQL")
        arrNames.add("PHP")
        arrNames.add("Spring Boot")
        arrNames.add("Angular")
        arrNames.add("Firebase")
        arrNames.add("Azure")
        arrNames.add("Java")
        arrNames.add("Python")
        arrNames.add("React")
        arrNames.add(".Net")
        arrNames.add("Node.js")
        arrNames.add("HTML")
        arrNames.add("CSS")
        arrNames.add("JavaScript")
        arrNames.add("BootStrap")
        arrNames.add("Rust")
        arrNames.add("Next.js")
        arrNames.add("Flutter")
        arrNames.add("MySQL")
        arrNames.add("PHP")
        arrNames.add("Spring Boot")
        arrNames.add("Angular")
        arrNames.add("Firebase")
        arrNames.add("Azure")
        arrNames.add("Java")
        arrNames.add("Python")
        arrNames.add("React")
        arrNames.add(".Net")
        arrNames.add("Node.js")
        arrNames.add("HTML")
        arrNames.add("CSS")
        arrNames.add("JavaScript")
        arrNames.add("BootStrap")
        arrNames.add("Rust")
        arrNames.add("Next.js")
        arrNames.add("Flutter")
        arrNames.add("MySQL")
        arrNames.add("PHP")
        arrNames.add("Spring Boot")
        arrNames.add("Angular")
        arrNames.add("Firebase")
        arrNames.add("Azure")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrNames)
        //listView.setAdapter(adapter)

        listView!!.adapter = adapter

        listView!!.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, position, l ->
            if (position == 5) {
                Toast.makeText(this@MainActivity, "Clicked  Item", Toast.LENGTH_SHORT).show()
            }
        })
    }


}