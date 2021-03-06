package com.example.challengetwo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.LayoutFourAdapter
import com.example.challengetwo.R
import com.example.challengetwo.model.Layout

class LayoutFourActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = LayoutFourAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutfour_rv)

        recyclerView = findViewById(R.id.recyclerVNFour)
        recyclerView.adapter = adapter

        initToolbar()

        val layouts = arrayListOf(
            Layout(
                texto = "Lorem",
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Ipsilum",
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_orange,
                textColor = R.color.orange

            ),
            Layout(
                texto = "Teste",
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_orange,
                textColor = R.color.orange
        )

        )

        adapter.updateItems(layouts)
    }

    private fun initToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}