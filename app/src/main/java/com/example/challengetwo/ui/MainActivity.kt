package com.example.challengetwo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.*
import com.example.challengetwo.model.Layout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), ClickItemListener,
    NavigationView.OnNavigationItemSelectedListener {

    private lateinit var recyclerView: RecyclerView
    private val adapter = NewsletterAdapter(this, this)
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_menu)

        navigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
        bindViews()
        initDrawer()

        val layouts = arrayListOf(
            Layout(
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_blue

            ),
            Layout(
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_red
            ),
            Layout(
                images = R.drawable.ic_settings,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                images = R.drawable.ic_home,
                color = R.drawable.shape_color_orange
            ),
            Layout(
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_red
            ),
            Layout(
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                images = R.drawable.ic_settings,
                color = R.drawable.shape_color_red

            ),

            Layout(
                images = R.drawable.ic_coffee,
                color = R.drawable.shape_color_red
            ),
            Layout(
                images = R.drawable.ic_search,
                color = R.drawable.shape_color_blue
            ),
            Layout(
                images = R.drawable.ic_settings,
                color = R.drawable.shape_color_red

            )
        )
        adapter.updateItem(layouts)
    }

    private fun initDrawer() {
        val drawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    private fun bindViews() {
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun clickItem(layout: Layout) {
        showToast("item clicado")
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu_1 -> {
                showToast("Abrindo primeiro Layout")
                val intent = Intent(this, PostActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.item_menu_2 -> {
                val intent = Intent(this, LayoutActivity::class.java)
                showToast("Abrindo segundo Layout")
                startActivity(intent)
                true
            }
            R.id.item_menu_3 -> {
                val intent = Intent(this, LoginActivity::class.java)
                showToast("Abrindo terceiro layout")
                startActivity(intent)
                true
            }
            R.id.item_menu_4 -> {
                val intent = Intent(this, GridActivity::class.java)
                showToast("Abrindo quarto Layout")
                startActivity(intent)
                true
            }

            R.id.item_menu_5 -> {
                val intent = Intent(this, LayoutOneActivity::class.java)
                showToast("Abrindo quinto Layout")
                startActivity(intent)
                true
            }
            R.id.item_menu_6 -> {
                val intent = Intent(this, LayoutTwoActivity::class.java)
                showToast("Abrindo sexto Layout")
                startActivity(intent)
                true
            }

            R.id.item_menu_7 -> {
                val intent = Intent(this, LayoutThreeActivity::class.java)
                showToast("Abrindo setimo Layout")
                startActivity(intent)
                true
            }


            R.id.item_menu_8 -> {
                val intent = Intent(this, LayoutFourActivity::class.java)
                showToast("Abrindo 8 Layout")
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}