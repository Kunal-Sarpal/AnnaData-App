## Annadata App Prototype
#### Overview
The Annadata app is designed to cater to two distinct user roles: Consumer and Farmer. The app allows consumers to browse and purchase agricultural products, while farmers can manage and view their inventory and sales. This prototype is built using Kotlin and XML in Android.

Features
User Role Differentiation: Displays different product details based on whether the user is a Consumer or a Farmer.
Product Grid: Shows a grid of products with detailed descriptions and prices.
Dynamic Content: Adapts the product information shown based on the user’s role.
User Roles
Consumer
Product View: Consumers see product details focused on the benefits and uses of the products.
Product Example: "Freshly harvested onions, perfect for cooking."
Farmer
Product View: Farmers see additional instructions related to selling, such as pricing and handling.
Product Example: "Sell these onions at ₹150/kg. Ensure freshness and quality."
Screenshots
Here are some screenshots of the app (include images here if available).

Installation
Clone the Repository

bash
Copy code
```bash
 git clone https://github.com/your-repo/annadata-app.git
```

Open the Project

Open the project in Android Studio.

Build and Run

Click on the "Run" button in Android Studio to build and run the app on an emulator or a physical device.

Code Structure
MainActivity (Homepage.kt): Manages the main screen and determines user roles. Displays the appropriate products based on the role.
Product Class: Defines the data model for products.
XML Layouts: Define the UI structure and appearance for the app screens.
Sample Code
Kotlin Code for Homepage.kt
kotlin
Copy code
package com.example.annadata

```bash 
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity


class Homepage : AppCompatActivity() {
    lateinit var gridView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        
        gridView = findViewById(R.id.gridView)
        
        // Check user role
        val isFarmer = intent.getStringExtra("role") == "farmer"
        
        // Define products for each role
        val farmerProducts = listOf(
            Product(R.drawable.onion, "Onion (प्याज)", "Sell these onions at ₹150/kg. Ensure freshness and quality.", "₹150/kg"),
            Product(R.drawable.tomato, "Tomato (टमाटर)", "Sell these tomatoes at ₹30/kg. Handle carefully to avoid bruising.", "₹30/kg")
        )
        
        val consumerProducts = listOf(
            Product(R.drawable.onion, "Onion (प्याज)", "Freshly harvested onions, perfect for cooking.", "₹150/kg"),
            Product(R.drawable.tomato, "Tomato (टमाटर)", "Juicy red tomatoes, ideal for salads.", "₹30/kg")
        )
        
        val products = if (isFarmer) farmerProducts else consumerProducts

        val adapter = DataAdapter(this, products)
        gridView.adapter = adapter
    }
}
```

###Contribution
Feel free to fork the repository and submit pull requests. For any issues or feature requests, please open an issue on the repository.

###License
This project is licensed under the MIT License. See the LICENSE file for details.
