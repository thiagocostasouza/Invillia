package com.example.challengetwo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout


class PostAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val postTexto: TextView = itemView.findViewById(R.id.tv_text)
        private val postAutor: TextView = itemView.findViewById(R.id.tv_autor)
        private val postImage: ImageView = itemView.findViewById(R.id.iv_photograph)


        fun bind(item: Layout) {
            postTexto.text = item.texto
            postAutor.text = item.autor
            postImage.setImageResource(R.drawable.ic_image)
        }
    }
