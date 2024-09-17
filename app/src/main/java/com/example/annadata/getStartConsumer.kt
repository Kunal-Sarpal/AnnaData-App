package com.example.annadata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class getStartConsumer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get_start_consumer)
        val buttonstart = findViewById<Button>(R.id.buttonConsumerLogin11)

        buttonstart.setOnClickListener{
            val intent = Intent(this, FarmerActivity::class.java)
            startActivity(intent);

        }
    }
}