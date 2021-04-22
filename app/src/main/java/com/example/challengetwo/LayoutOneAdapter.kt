package com.example.challengetwo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class LayoutOneAdapter() : RecyclerView.Adapter<LayoutOneAdapterViewHolder>() {

    private var items = listOf<Layout>()

    fun updateItem(newItem: List<Layout>){
        items = newItem
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LayoutOneAdapterViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.layoutone_item, parent,false)
        return LayoutOneAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: LayoutOneAdapterViewHolder, position: Int) {
       holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}