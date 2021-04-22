package com.example.challengetwo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengetwo.model.Layout

class LayoutFourAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textViewFour: TextView = itemView.findViewById(R.id.text_icon_four)
    private val imageIconFour: ImageView = itemView.findViewById(R.id.img_icon_four)
    private val barIconFour: View = itemView.findViewById(R.id.bar)

    fun bindFour(itemFour: Layout) {

        textViewFour.text = itemFour.texto

        itemFour.images?.let { imageIconFour.setImageResource(it) }
        itemFour.textColor?.let { textViewFour.setTextColor(it) }
        itemFour.color?.let { barIconFour.setBackgroundResource(it)}
    }
}