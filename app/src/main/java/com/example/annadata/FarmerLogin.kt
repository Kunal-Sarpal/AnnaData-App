package com.example.annadata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FarmerLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_farmer_login)

        val loginButton = findViewById<Button>(R.id.buttonSubmit2);
        loginButton.setOnClickListener{
            val intent = Intent(this, getStartedPage::class.java)
            startActivity(intent);
        }
    }
}