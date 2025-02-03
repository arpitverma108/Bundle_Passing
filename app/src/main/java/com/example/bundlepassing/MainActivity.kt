package com.example.bundlepassing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val name: EditText =findViewById(R.id.name)
        val father: EditText =findViewById(R.id.father)
        val RollNo: EditText =findViewById(R.id.RollNo)
        val Phone: EditText =findViewById(R.id.Phone)
        val button: Button =findViewById(R.id.button)
        button.setOnClickListener {
            val name = name.text.toString()
            val father = father.text.toString()
            val RollNo = RollNo.text.toString()
            val Phone = Phone.text.toString()
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("father", father)
            intent.putExtra("RollNo", RollNo)
            intent.putExtra("Phone", Phone)
            startActivity(intent)
        }




    }
}