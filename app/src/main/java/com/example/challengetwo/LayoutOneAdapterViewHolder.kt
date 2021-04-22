package com.example.challengetwo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class LayoutOneAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textIcon: TextView = itemView.findViewById(R.id.text_icon)
    private val imgIcon: ImageView = itemView.findViewById(R.id.img_icon)
    private val colorBack: View = itemView.findViewById(R.id.img_icon)


    fun bind(item: Layout) {
        textIcon.text = item.texto
        item.images?.let { imgIcon.setImageResource(it) }
        item.color?.let { colorBack.setBackgroundResource(it) }
    }

}


