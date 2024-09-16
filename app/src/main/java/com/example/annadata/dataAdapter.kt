import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.annadata.Product // Import the Product class
import com.example.annadata.R


class DataAdapter(private val context: Context, private val products: List<Product>) : BaseAdapter() {

    override fun getCount(): Int {
        return products.size
    }

    override fun getItem(position: Int): Any {
        return products[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.custom_data, parent, false)

        val product = products[position]

        val imageView = view.findViewById<ImageView>(R.id.product_image)
        val nameTextView = view.findViewById<TextView>(R.id.product_name)
        val descriptionTextView = view.findViewById<TextView>(R.id.product_description)
        val priceTextView = view.findViewById<TextView>(R.id.product_price)

        imageView.setImageResource(product.imageResId)
        nameTextView.text = product.name
        descriptionTextView.text = product.description
        priceTextView.text = product.price

        return view
    }
}
