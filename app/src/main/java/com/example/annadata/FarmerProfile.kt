package com.example.annadata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FarmerProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmer_profile) // Update with your layout file

        val getprod = findViewById<Button>(R.id.getprod);

        getprod.setOnClickListener{
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

//        val name = intent.getStringExtra("FARMER_NAME")
//        val imageResId = intent.getIntExtra("FARMER_IMAGE_RES_ID", R.drawable.default_image) // Provide a default image

//        val nameTextView: TextView = findViewById(R.id.textViewName)
//        val imageView: ImageView = findViewById(R.id.imageViewProfile)

//        nameTextView.text = name
//        imageView.setImageResource(imageResId)
    }
}
