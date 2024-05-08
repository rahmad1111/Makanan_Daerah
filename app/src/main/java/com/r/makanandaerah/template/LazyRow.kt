package com.r.makanandaerah.template

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.makanandaerah.R
import com.r.makanandaerah.tatanan.MakananRow
import com.r.makanandaerah.ui.theme.MakananDaerahTheme

@Composable
fun MakananLazyRow(
    makananRow: MakananRow,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .height(180.dp)
            .width(140.dp)
            .clickable { onItemClicked(makananRow.id) }
            .background(Color.Gray)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = makananRow.gambar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(100.dp)
        )
        Text(text = "${makananRow.nama_menu}", fontSize = 20.sp, color = Color.White)
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewMakananLazyRow() {
    MakananDaerahTheme {
        MakananLazyRow(
            makananRow = MakananRow(
                1,
                R.drawable.__mi_aceh_row,
                "Contoh",
                "sukabumi",
                "gak ada"
            ),
            onItemClicked = { lazyrowId ->
                println("LazyRow Id : $lazyrowId")
            }
        )
    }
}