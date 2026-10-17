package com.visualprogramming.week4.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class HeroGalleryItem (
    @DrawableRes val heroImgRes: Int,
    val name: String,
    val rarity: String,
    val heroType: String,
    val classHero: String,
    val cp: Int,
    val hp: Int,
    val mp: Int,
    val level: Int,
    val color: Color
    )