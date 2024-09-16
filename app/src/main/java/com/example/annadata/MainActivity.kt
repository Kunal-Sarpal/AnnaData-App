package com.example.annadata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val farmerLogin = findViewById<Button>(R.id.buttonFarmerLogin);
        val consumerlog = findViewById<Button>(R.id.buttonConsumerLogin1);


        consumerlog.setOnClickListener{
            val intent1 = Intent(this, consumerLogin::class.java)
            startActivity(intent1);
        }
        farmerLogin.setOnClickListener{
            val intent = Intent(this, FarmerLogin::class.java)
            startActivity(intent);
        }



    }
}