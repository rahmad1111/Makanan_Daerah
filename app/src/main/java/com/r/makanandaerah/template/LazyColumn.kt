package com.r.makanandaerah.template

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.makanandaerah.R
import com.r.makanandaerah.tatanan.MakananColumn
import com.r.makanandaerah.ui.theme.MakananDaerahTheme

@Composable
fun MakananLazColumn(
    makananColumn: MakananColumn,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth().padding(4.dp).background(Color.Gray).padding(start = 10.dp, end = 10.dp)
    ) {
        Image(
            painter = painterResource(id = makananColumn.gambar),
            contentDescription = null,
            Modifier.size(100.dp)
        )
        Spacer(modifier = modifier.size(5.dp))
        Column {
            Text(
                text = "Nama : ${makananColumn.nama_menu}",color = Color.White
            )
            Text(
                text = "Asal : ${makananColumn.asal}",
                fontSize = 10.sp,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHalamanGrid() {
    MakananDaerahTheme {
        MakananLazColumn(
            makananColumn = MakananColumn(1, R.drawable.__juhu_singkah_grid,"Juhu Singkah","Kalimantan Tengah", "apa" )
        )
    }
}
