package com.example.annadata

import DataAdapter
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        val gridView: GridView? = findViewById(R.id.gridView) // Check the ID here

        // Sample data
        val products = listOf(
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),   Product(R.drawable.flag3, "Product 1", "Description 1", "$10"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            Product(R.drawable.flag2, "Product 2", "Description 2", "$20"),
            // Add more products here
        )

        val adapter = DataAdapter(this, products)

        gridView?.adapter = adapter // Safe call to avoid NullPointerException

    }
}