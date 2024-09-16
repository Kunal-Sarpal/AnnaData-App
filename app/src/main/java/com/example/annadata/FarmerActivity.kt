package com.example.annadata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.annadata.adaptor.Farmer
import com.example.annadata.adaptor.PopularAdaptor

class FarmerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_farmer)

        val farmersList = listOf(
            Farmer("Kunal Sarpal", "⭐⭐⭐⭐", "view", R.drawable.imgg),
            Farmer("Aditya Raj", "⭐⭐⭐", "view", R.drawable.imgg),
            Farmer("Krrish Gaur", "⭐⭐⭐", "view", R.drawable.imgg),
            Farmer("Vipin", "⭐⭐⭐⭐⭐", "view", R.drawable.imgg),
            Farmer("Shailesh", "⭐⭐⭐⭐⭐", "view", R.drawable.imgg),
            Farmer("Mohit", "⭐⭐⭐⭐", "view", R.drawable.imgg),
            Farmer("Suraj Kumar", "⭐⭐⭐⭐", "view", R.drawable.imgg)
        )

        // Initialize RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PopularAdaptor(this, farmersList) // Pass the context here
    }
}
