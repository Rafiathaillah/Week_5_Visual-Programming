package com.visualprogramming.week4.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.visualprogramming.week4.R
import com.visualprogramming.week4.viewmodel.CarSaleViewModel
import java.util.Locale

@Composable
fun view(viewModel: CarSaleViewModel = viewModel()){
    val carGallery by viewModel.carGalleryList.collectAsState()

    Column(Modifier.fillMaxSize().background(Color(0xfff6f4f0))) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp).weight(1f)
        ) {
            Column(Modifier.fillMaxSize().weight(3f), verticalArrangement = Arrangement.Bottom) {
                HorizontalDivider(thickness = 4.dp, color = Color(0xffff5c35), modifier = Modifier.padding(top = 5.dp, bottom = 5.dp).clip(RoundedCornerShape(5.dp)).width(50.dp))
                Text("On Sale", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                Text("Find your perfect ride", fontSize = 12.sp, color = Color.Gray)
            }

            Column(Modifier.fillMaxSize().weight(1f), verticalArrangement = Arrangement.Bottom) {
                Card(
                    modifier = Modifier.fillMaxWidth().height(30.dp).border(1.dp, Color(0xfffaded6), shape = RoundedCornerShape(15.dp)),
                    colors = CardDefaults.cardColors(containerColor = Color(0xfffff0ec)),
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.heart),
                            contentDescription = "favorite",
                            modifier = Modifier.size(15.dp),
                            tint = Color(0xffff5c35)
                        )
                        Text("5 Saved", textAlign = TextAlign.Center, color = Color(0xffff5c35), fontWeight = FontWeight.Bold, fontSize = 12.sp)
                    }
                }
            }
        }

        HorizontalDivider(thickness = 1.dp, color = Color.LightGray, modifier = Modifier.padding(top = 10.dp, bottom = 5.dp))

        LazyColumn(Modifier.fillMaxSize().weight(7f).padding(10.dp)) {
            items(carGallery) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth().height(140.dp).padding(5.dp).border(1.dp, Color.LightGray, shape = RoundedCornerShape(10.dp)),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
                ) {
                    Row(Modifier.padding(15.dp).fillMaxSize(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        Column(modifier = Modifier.weight(2f)){
                            Image(painter = painterResource(item.carImgRes), contentDescription = "img ${item.name}", modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(10.dp)), contentScale = ContentScale.Crop)
                        }

                        Spacer(Modifier.padding(end = 10.dp))

                        Column(modifier = Modifier.weight(2f).fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
                            Text(item.name, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                            Column(modifier = Modifier.clip(RoundedCornerShape(4.dp)).background(Color(0xfff6f4f0)).border(1.dp, Color.LightGray,
                                RoundedCornerShape(4.dp)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(item.transmission, fontWeight = FontWeight.Bold, fontSize = 12.sp, color = Color.Gray, modifier = Modifier.padding(8.dp))
                            }
                            Text(item.year, fontWeight = FontWeight.Bold)
                        }
                        Column(modifier = Modifier.weight(1f).fillMaxSize(), horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.SpaceBetween) {
                            Icon(
                                painter = painterResource(R.drawable.heart),
                                contentDescription = "favorite",
                                modifier = Modifier.size(25.dp),
                                tint = Color(0xffff5c35)
                            )
                            Text("${String.format(Locale.US, "%,d", item.mileage)} km", fontWeight = FontWeight.Bold, color = Color.Gray, fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun preview(){
    view()
}