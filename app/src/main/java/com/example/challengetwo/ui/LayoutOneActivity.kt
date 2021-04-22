package com.example.challengetwo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.LayoutOneAdapter
import com.example.challengetwo.R
import com.example.challengetwo.model.Layout

class LayoutOneActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = LayoutOneAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_one)

        recyclerView = findViewById(R.id.recyclerVN)
        recyclerView.adapter = adapter

        initToolbar()

        val layouts = arrayListOf(
            Layout(
                texto = "Loierl",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Asrod",
                images = R.drawable.ic_person,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                texto = "Alhaion",
                images = R.drawable.ic_settings,
                color = R.color.darkGrey
            ),
            Layout(
                texto = "Pinxi",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_red
            ),
            Layout(
                texto = "Loierl",
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Feuosdir",
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                texto = "Algiorion",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_blue


            ),
            Layout(
                texto = "Loierl",
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Feuosdir",
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                texto = "Algiorion",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Asrod",
                images = R.drawable.ic_person,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                texto = "Alhaion",
                images = R.drawable.ic_settings,
                color = R.color.darkGrey
            ),
            Layout(
                texto = "Pinxi",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_red
            ),
            Layout(
                texto = "Loierl",
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Feuosdir",
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                texto = "Algiorion",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_blue


            ),
            Layout(
                texto = "Loierl",
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                texto = "Feuosdir",
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                texto = "Algiorion",
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_blue
            )

        )



        adapter.updateItem(layouts)
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
