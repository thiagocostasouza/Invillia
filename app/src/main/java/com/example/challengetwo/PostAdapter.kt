package com.example.challengetwo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class PostAdapter() : RecyclerView.Adapter<PostAdapterViewHolder>() {

    private var items = listOf<Layout>()

    fun updateItem(newItems: List<Layout>) {
        items = newItems
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapterViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.post_item_list, parent, false)
        return PostAdapterViewHolder(view)

    }


    override fun onBindViewHolder(holder: PostAdapterViewHolder, position: Int) {
        holder.bind(items[position])

    }


    override fun getItemCount(): Int = items.size

}




