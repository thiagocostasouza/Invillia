package com.example.challengetwo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class NewsletterAdapter(context: Context, var listener: ClickItemListener) : RecyclerView.Adapter<NewsletterAdapterViewHolder>() {

    private var items = listOf<Layout>()

    fun updateItem(newItem: List<Layout>){
        items = newItem
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsletterAdapterViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.newsletter_item,parent, false)
        return NewsletterAdapterViewHolder(view, items, listener)
    }

    override fun onBindViewHolder(holder: NewsletterAdapterViewHolder, position: Int) {
                 holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size


}