package com.visualprogramming.week4.viewmodel

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.visualprogramming.week4.R
import com.visualprogramming.week4.model.HeroGalleryItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.collections.listOf

class PartyRosterViewModel : ViewModel() {
    private val _heroList = MutableStateFlow(
        listOf(
            HeroGalleryItem(heroImgRes = R.drawable.paladin, name = "Alistair", rarity = "MYTHIC", heroType = "Paladin", classHero = "High Templar", hp = 1850, mp = 450, cp = 4600, level = 50, color = Color(0xffffb300)),
            HeroGalleryItem(heroImgRes = R.drawable.cleric, name = "Theresa", rarity = "MYTHIC", heroType = "Cleric", classHero = "High Priest", hp = 1200, mp = 950, cp = 4300, level = 47, color = Color(0xff00e074)),
            HeroGalleryItem(heroImgRes = R.drawable.archmage, name = "Zephyr", rarity = "MYTHIC", heroType = "Archmage", classHero = "Grand Wizard", hp = 900, mp = 1400, cp = 4600, level = 49, color = Color(0xff00e4fe)),
            HeroGalleryItem(heroImgRes = R.drawable.berserker, name = "Kaelen", rarity = "MYTHIC", heroType = "Berserker", classHero = "Warlord", hp = 2100, mp = 250, cp = 4700, level = 45, color = Color(0xffce2d5a)),
            HeroGalleryItem(heroImgRes = R.drawable.rogue, name = "Valerie", rarity = "MYTHIC", heroType = "Rogue", classHero = "Shadow Blade", hp = 1100, mp = 600, cp = 3400, level = 53, color = Color(0xffcc00f0)),
        )
    )
    val heroList : StateFlow<List<HeroGalleryItem>> =_heroList.asStateFlow()
}