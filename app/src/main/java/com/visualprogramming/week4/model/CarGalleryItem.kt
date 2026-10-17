package com.visualprogramming.week4.model

import androidx.annotation.DrawableRes
import org.w3c.dom.Text

data class CarGalleryItem (
    @DrawableRes val carImgRes: Int,
    val name: String,
    val transmission: String,
    val year: String,
//    val fuelType: String,
//    val isLike: Boolean,
    val mileage: Int,
//    val price: Int,
//    val description: Text,
//    val city: String
)