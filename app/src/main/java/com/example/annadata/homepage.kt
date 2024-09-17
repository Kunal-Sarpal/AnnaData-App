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

            // Add more products here
            Product(R.drawable.onion, "Onion (प्याज)", "Freshly harvested onions, perfect for cooking", "₹150/kg"),
            Product(R.drawable.tomata, "Tomato (टमाटर)", "Juicy red tomatoes, ideal for salads", "₹30/kg"),
            Product(R.drawable.rice, "Rice (चावल)", "High-quality Basmati rice", "₹100/kg"),
            Product(R.drawable.corn, "Corn (मक्का)", "Sweet and fresh corn for snacks", "₹40/kg"),
            Product(R.drawable.wheat, "Wheat (गेहूँ)", "Premium wheat grains for flour", "₹30/kg"),
            Product(R.drawable.sugarcane, "Sugarcane (गन्ना)", "Fresh sugarcane for juice", "₹20/stick"),
            Product(R.drawable.brinjal, "Brinjal (बैंगन)", "Tender brinjals, great for grilling", "₹40/kg"),
            Product(R.drawable.dhanyia, "Coriander (धनिया)", "Fresh coriander leaves for garnishing", "₹10/bunch"),
            Product(R.drawable.onion, "Onion (प्याज)", "Freshly harvested onions", "₹150/kg"),
            Product(R.drawable.spinach, "Spinach (पालक)", "Fresh spinach leaves, perfect for cooking", "₹20/bunch"),
            Product(R.drawable.carrot, "Carrot (गाजर)", "Crunchy carrots for salads and snacks", "₹50/kg"),
            Product(R.drawable.potato, "Potato (आलू)", "Freshly dug potatoes, perfect for curries", "₹25/kg")

        )

        val adapter = DataAdapter(this, products)

        gridView?.adapter = adapter // Safe call to avoid NullPointerException

    }
}