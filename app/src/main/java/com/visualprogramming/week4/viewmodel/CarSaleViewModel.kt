package com.visualprogramming.week4.viewmodel

import androidx.lifecycle.ViewModel
import com.visualprogramming.week4.R
import com.visualprogramming.week4.model.CarGalleryItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.collections.listOf

class CarSaleViewModel : ViewModel() {
    private val _carGalleryList = MutableStateFlow(
        listOf(
            CarGalleryItem(R.drawable.j5, "Jaecoo J5", "Auto", "2025", 10000),
            CarGalleryItem(R.drawable.crv, "Honda CRV", "Auto", "2024", 15400),
            CarGalleryItem(R.drawable.hrv, "Honda HRV", "Auto", "2023", 32300),
            CarGalleryItem(R.drawable.mg4, "MG4", "Auto", "2022", 8400),
            CarGalleryItem(R.drawable.ayla, "Daihatsu Ayla", "Auto", "2021", 10760),
            CarGalleryItem(R.drawable.reborn, "Toyota Innova Reborn", "Auto", "2020", 12101),
            CarGalleryItem(R.drawable.tiggo, "Cherry Tiggo", "Auto", "2025", 9763),
            CarGalleryItem(R.drawable.xenia, "Daihatsu Xenia", "Manual", "2021", 7659),
            CarGalleryItem(R.drawable.yaris, "Toyota Yaris", "Auto", "2023", 20354),
            CarGalleryItem(R.drawable.yariscross, "Toyota Yaris Cross", "Auto", "2022", 34527)
        )
    )

    val carGalleryList : StateFlow<List<CarGalleryItem>> =_carGalleryList.asStateFlow()
}