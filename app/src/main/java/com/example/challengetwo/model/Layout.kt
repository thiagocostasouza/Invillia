package com.example.challengetwo.model

import android.os.Parcelable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Layout(
    val texto: String? = null,
    val autor: String? = null,
    @ColorRes val textColor: Int? = null,
    @DrawableRes val color : Int? = null,
    @DrawableRes val images: Int? = null
): Parcelable