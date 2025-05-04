package com.example.fruit

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.contentValuesOf
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
        val item = arrayListOf("香蕉","蘋果","葡萄","鳳梨","火龍果",)
        val listView = findViewById<ListView>(R.id.listView)
        val arrrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)
        listView.adapter=arrrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "就吃它了---${item[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}