package com.example.utsalin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnAddTask = findViewById<Button>(R.id.Submit)
        btnAddTask.setOnClickListener {

            Toast.makeText(this, "Enter your name first", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}