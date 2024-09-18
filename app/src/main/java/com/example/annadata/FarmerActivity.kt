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
            Farmer("Kunal Sarpal", "⭐⭐⭐⭐", "view", R.drawable.farmer4),
            Farmer("Saksham Sharma", "⭐⭐⭐", "view", R.drawable.farmer5),
            Farmer("Krrish Gaur", "⭐⭐⭐", "view", R.drawable.farmer6),
            Farmer("Vipin", "⭐⭐⭐⭐⭐", "view", R.drawable.farmer1),
            Farmer("Shailesh", "⭐⭐⭐⭐", "view", R.drawable.farmer3),
            Farmer("Vikalp", "⭐⭐⭐⭐", "view", R.drawable.farmer7),
            Farmer("Suraj Kumar", "⭐⭐⭐⭐", "view", R.drawable.farmer8)
        )

        // Initialize RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PopularAdaptor(this, farmersList) // Pass the context here
    }
}
