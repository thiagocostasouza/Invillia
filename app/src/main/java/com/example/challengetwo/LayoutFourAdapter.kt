package com.example.challengetwo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class LayoutFourAdapter() : RecyclerView.Adapter<LayoutFourAdapterViewHolder>() {

    private var itemsFour = listOf<Layout>()

    fun updateItems(newItemFour:List<Layout>) {
        itemsFour = newItemFour
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LayoutFourAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layoutfour_item, parent, false)
        return LayoutFourAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: LayoutFourAdapterViewHolder, position: Int) {
        holder.bindFour(itemsFour[position])
    }

    override fun getItemCount(): Int = itemsFour.size

}