package com.r.makanandaerah

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.r.makanandaerah.datapusat.Datanya
import com.r.makanandaerah.navigation.Screen
import com.r.makanandaerah.tatanan.MakananColumn
import com.r.makanandaerah.tatanan.MakananRow
import com.r.makanandaerah.template.MakananLazyRow
import com.r.makanandaerah.template.MakananLazColumn

@Composable
fun HalamanAwal(
    navController: NavController,
    modifier: Modifier = Modifier,
    makananRows: List<MakananRow> = Datanya.makananLazyRow,
    makananColumns: List<MakananColumn> = Datanya.makananLazyColumn
) {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(top = 50.dp)
    ) {
        item {

            LazyRow(
                contentPadding = PaddingValues(10.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                modifier = modifier
            ) {
                items(makananRows, key = { it.id}) {
                    MakananLazyRow(makananRow = it) {lazyrowid ->
                        navController.navigate(Screen.Detail.route + "/$lazyrowid")
                    }
                }
            }
            Text(text = "Lainnya",modifier.padding(start = 4.dp))
        }
        items(makananColumns, key = {it.id }) {
            MakananLazColumn(makananColumn = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
    Row(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .size(width = 0.dp, height = 50.dp)
            .padding(start = 5.dp, end = 5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text = "Halaman Awal", fontSize = 20.sp,color = Color.Black)
    }
}