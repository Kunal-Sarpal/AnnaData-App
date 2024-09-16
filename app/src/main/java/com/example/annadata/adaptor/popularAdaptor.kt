package com.example.annadata.adaptor

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.annadata.FarmerProfile
import com.example.annadata.R

// Data model for farmer information
data class Farmer(val name: String, val rating: String, val followers: String, val imageResource: Int)

class PopularAdaptor(private val context: Context, private val farmersList: List<Farmer>) : RecyclerView.Adapter<PopularAdaptor.FarmerViewHolder>() {

    // ViewHolder class to hold views for each item
    class FarmerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView: CardView = itemView.findViewById(R.id.cardView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView3)
        val farmerName: TextView = itemView.findViewById(R.id.textView4)
        val rating: TextView = itemView.findViewById(R.id.textView3)
        val viewButton: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FarmerViewHolder {
        // Inflate the layout for each item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_farmer_card, parent, false)
        return FarmerViewHolder(view)
    }

    override fun onBindViewHolder(holder: FarmerViewHolder, position: Int) {
        // Bind data to views
        val farmer = farmersList[position]
        holder.imageView.setImageResource(farmer.imageResource)
        holder.farmerName.text = farmer.name
        holder.rating.text = farmer.rating

        // Set up click listener for the button
        holder.viewButton.setOnClickListener {
            val intent = Intent(context, FarmerProfile::class.java).apply {
                putExtra("FARMER_NAME", farmer.name)
                putExtra("FARMER_IMAGE_RES_ID", farmer.imageResource)
                // Add other data if needed
            }
            context.startActivity(intent)
        }

        // Optionally, set up click listener for the entire card view if needed
        holder.cardView.setOnClickListener {
            val intent = Intent(context, FarmerProfile::class.java).apply {
                putExtra("FARMER_NAME", farmer.name)
                putExtra("FARMER_IMAGE_RES_ID", farmer.imageResource)
                // Add other data if needed
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return farmersList.size
    }
}
