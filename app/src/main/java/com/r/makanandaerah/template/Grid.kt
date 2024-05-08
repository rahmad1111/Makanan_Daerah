package com.r.makanandaerah.template

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.makanandaerah.R
import com.r.makanandaerah.tatanan.MakananGrid
import com.r.makanandaerah.ui.theme.MakananDaerahTheme

@Composable
fun MakananGrid(
    makananGrid: MakananGrid,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = makananGrid.gambar),
            contentDescription = null
        )
        Text(
            text = "Nama : ${makananGrid.nama_menu}"
        )
        Text(
            text = "Asal : ${makananGrid.asal}",
            fontSize = 10.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHalamanGrid() {
    MakananDaerahTheme {
        MakananGrid(
            makananGrid = MakananGrid(1, R.drawable.__juhu_singkah_grid,"Juhu Singkah","Kalimantan Tengah", "apa" )
        )
    }
}
