package com.example.challengetwo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.PostAdapter
import com.example.challengetwo.R
import com.example.challengetwo.model.Layout

class PostActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = PostAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_activity)

        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        initToolbar()

        val layouts  = arrayListOf(
            Layout(
                texto = "Text 1 ",
                autor = "autor2"
            ),
            Layout(
                texto = "Text 2",
                autor = "autor1"
            ),
            Layout(
                texto = "Text 3",
                autor = "autor1"
            ),
            Layout(
                texto = "Text 4",
                autor = "autor2"

            ),
            Layout(
                texto = "Text 5",
                autor = "autor1"
            ),
            Layout(
                texto = "Text 1 ",
                autor = "autor2"
            ),
            Layout(
                texto = "Text 2",
                autor = "autor1"
            ),
            Layout(
                texto = "Text 3",
                autor = "autor1"
            ),
            Layout(
                texto = "Text 4",
                autor = "autor2"

            ),
            Layout(
                texto = "Text 5",
                autor = "autor1"
            )

        )

        adapter.updateItem(layouts)

    }
    private fun initToolbar(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
