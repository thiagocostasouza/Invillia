package com.example.challengetwo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class LayoutFourAdapter(private var itemsFour: List<Layout>) : RecyclerView.Adapter<LayoutFourAdapterViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LayoutFourAdapterViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.layoutfour_item, parent, false)
        return LayoutFourAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: LayoutFourAdapterViewHolder, position: Int) {
        holder.bindFour(itemsFour[position], context)
    }

    override fun getItemCount() = itemsFour.size

}