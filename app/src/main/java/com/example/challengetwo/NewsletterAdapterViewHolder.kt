package com.example.challengetwo

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class NewsletterAdapterViewHolder(itemView: View, var items: List<Layout>, var listener: ClickItemListener) : RecyclerView.ViewHolder(itemView) {

    private val postImage: ImageView =  itemView.findViewById(R.id.imageView)
    private val postBackground: View =  itemView.findViewById(R.id.backgroundItem)

    init{
        itemView.setOnClickListener {
            listener.clickItem(items[adapterPosition])
        }
    }

    fun bind(item: Layout){
        item.images?.let { postImage.setImageResource(it) }
        item.color?.let { postBackground.setBackgroundResource(it) }
    }
}