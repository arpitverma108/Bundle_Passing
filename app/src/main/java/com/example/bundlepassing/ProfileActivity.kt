package com.example.bundlepassing

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        val name : TextView = findViewById<TextView>(R.id.getName)
        val father : TextView = findViewById<TextView>(R.id.getFather)
        val RollNo : TextView = findViewById<TextView>(R.id.getRollNo)
        val Phone : TextView = findViewById<TextView>(R.id.getPhone)
        val intent = intent
        val name1 = intent.getStringExtra("name")
        val father1 = intent.getStringExtra("father")
        val RollNo1 = intent.getStringExtra("RollNo")
        val Phone1 = intent.getStringExtra("Phone")
        name.text = "Name : $name1"
        father.text = "Father : $father1"
        RollNo.text = "Roll No : $RollNo1"
        Phone.text = "Phone : $Phone1"



    }
}