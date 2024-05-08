package com.r.makanandaerah

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.r.makanandaerah.datapusat.Datanya
import com.r.makanandaerah.tatanan.MakananGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.r.makanandaerah.template.MakananGrid
import com.r.makanandaerah.ui.theme.MakananDaerahTheme

@Composable
fun HalamanGrid(
    modifier: Modifier = Modifier,
    makananGrids: List<MakananGrid> = Datanya.makananLazyGrid
) {

    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize().padding(top = 50.dp)
    ) {

        items(makananGrids,key = { it.id}){

            MakananGrid(makananGrid = it)

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

        Text(text = "Halaman Grid", fontSize = 20.sp,color = Color.Black)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    MakananDaerahTheme {
        HalamanGrid(makananGrids = Datanya.makananLazyGrid)
    }
}