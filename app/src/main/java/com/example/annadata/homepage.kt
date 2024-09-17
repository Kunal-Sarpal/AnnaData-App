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
        val isFarmer = intent.getStringExtra("farmer") == "yes"
        val farmerProducts = listOf(
            Product(
                R.drawable.onion,
                "Onion (प्याज)",
                "Freshly harvested onions, perfect for cooking. Available for sale at ₹150/kg. Ensure to maintain freshness and quality. Farmers: Sell these onions to consumers at this price, and ensure proper storage to keep them fresh.",
                "₹150/kg"
            ),
            Product(
                R.drawable.tomata,
                "Tomato (टमाटर)",
                "Juicy red tomatoes, ideal for salads and cooking. Priced at ₹30/kg. Keep them in a cool place to retain freshness. Farmers: Offer these tomatoes to consumers at ₹30/kg, and handle them carefully to avoid bruising.",
                "₹30/kg"
            ),
            Product(
                R.drawable.rice,
                "Rice (चावल)",
                "High-quality Basmati rice, perfect for all your cooking needs. Priced at ₹100/kg. Store in an airtight container. Farmers: Ensure the rice is clean and free from moisture before selling at ₹100/kg.",
                "₹100/kg"
            ),
            Product(
                R.drawable.corn,
                "Corn (मक्का)",
                "Sweet and fresh corn for snacks or cooking. Available at ₹40/kg. Best enjoyed fresh or boiled. Farmers: Market these corn cobs to consumers at ₹40/kg, ensuring they are sweet and tender.",
                "₹40/kg"
            ),
            Product(
                R.drawable.wheat,
                "Wheat (गेहूँ)",
                "Premium wheat grains for flour, ideal for baking and cooking. Priced at ₹30/kg. Store in a dry place to avoid spoilage. Farmers: Sell this wheat at ₹30/kg, and ensure it is well-cleaned and stored properly.",
                "₹30/kg"
            ),
            Product(
                R.drawable.sugarcane,
                "Sugarcane (गन्ना)",
                "Fresh sugarcane sticks for juice or eating. Priced at ₹20/stick. Perfect for a refreshing and natural sweetener. Farmers: Offer these sugarcane sticks at ₹20 each, and make sure they are sweet and juicy.",
                "₹20/stick"
            ),
            Product(
                R.drawable.brinjal,
                "Brinjal (बैंगन)",
                "Tender brinjals, great for grilling or cooking. Available at ₹40/kg. Ensure to pick firm and shiny ones. Farmers: Sell these brinjals at ₹40/kg, and select the best quality for consumers.",
                "₹40/kg"
            ),
            Product(
                R.drawable.dhanyia,
                "Coriander (धनिया)",
                "Fresh coriander leaves for garnishing and flavor. Priced at ₹10/bunch. Use fresh for best flavor. Farmers: Provide fresh coriander bunches at ₹10 each, and keep them well-hydrated.",
                "₹10/bunch"
            ),
            Product(
                R.drawable.spinach,
                "Spinach (पालक)",
                "Fresh spinach leaves, perfect for cooking or salads. Available at ₹20/bunch. Best used fresh for maximum nutrients. Farmers: Sell spinach bunches at ₹20, ensuring they are fresh and free from wilt.",
                "₹20/bunch"
            ),
            Product(
                R.drawable.carrot,
                "Carrot (गाजर)",
                "Crunchy carrots for salads and snacks. Priced at ₹50/kg. Ensure they are clean and crisp. Farmers: Market these carrots at ₹50/kg, and choose the most vibrant and firm ones.",
                "₹50/kg"
            ),
            Product(
                R.drawable.potato,
                "Potato (आलू)",
                "Freshly dug potatoes, perfect for curries. Available at ₹25/kg. Store in a cool, dry place. Farmers: Offer these potatoes at ₹25/kg, and make sure they are well-cured and free from sprouts.",
                "₹25/kg"
            )
        )

        val consumerProducts = listOf(

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
        val products = if (isFarmer) farmerProducts else consumerProducts

        val adapter = DataAdapter(this, products)

        gridView?.adapter = adapter // Safe call to avoid NullPointerException

    }
}