package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Product
import com.example.recyclerview.ProductAdapter
import com.example.recyclerview.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter
    private lateinit var productList: List<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewProducts)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        productList = listOf(
            Product("Süt", R.drawable.sut),
            Product("Ekmek", R.drawable.ekmek),
            Product("Domates", R.drawable.domates),
            Product("Makarna", R.drawable.makarna),
            Product("Yoğurt", R.drawable.yogurt),
            Product("Meyve Suyu", R.drawable.meyve_suyu)
        )

        adapter = ProductAdapter(productList)
        recyclerView.adapter = adapter
    }
}
