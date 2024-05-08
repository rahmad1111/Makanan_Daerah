package com.r.makanandaerah

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.makanandaerah.ui.theme.MakananDaerahTheme

@Composable
fun HalamanAbout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, start = 10.dp, bottom = 10.dp, end = 10.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp)
            )
        }
    }
    Column(
        modifier = Modifier.padding(start = 30.dp, top = 320.dp)
    ) {

        Text(text = "Nama :", fontWeight = FontWeight.Bold)
        Text(text = "Rahmad Anwar Rhomadhoni",modifier = Modifier
            .border(1.dp, Color.Blue, shape = RoundedCornerShape(6.dp))
            .padding(4.dp))
        Spacer(modifier = Modifier.size(3.dp))
        Text(text = "Email :",fontWeight = FontWeight.Bold)
        Text(text = "rhomadhoni.ra@gmail.com",modifier = Modifier
            .border(1.dp, Color.Blue, shape = RoundedCornerShape(6.dp))
            .padding(4.dp))
        Spacer(modifier = Modifier.size(3.dp))
        Text(text = "Asal Perguruan Tinggi :", fontWeight = FontWeight.Bold)
        Text(text = "Universitas Dinamika Bangsa",modifier = Modifier
            .border(1.dp, Color.Blue, shape = RoundedCornerShape(6.dp))
            .padding(4.dp))
        Spacer(modifier = Modifier.size(3.dp))
        Text(text = "Jurusan :", fontWeight = FontWeight.Bold)
        Text(text = "Sistem Informasi",modifier = Modifier
            .border(1.dp, Color.Blue, shape = RoundedCornerShape(6.dp))
            .padding(4.dp))
        Spacer(modifier = Modifier.size(3.dp))
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

        Text(text = "Halaman Profile", fontSize = 20.sp,color = Color.Black)
    }
}


@Composable
fun Isinya(nama: String) {

}

@Preview(showBackground = true)
@Composable
private fun PreviewHalamanAbout() {
    MakananDaerahTheme {
        HalamanAbout()
    }
}