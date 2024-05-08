package com.r.makanandaerah

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.r.makanandaerah.datapusat.Datanya
import com.r.makanandaerah.tatanan.MakananRow
import com.r.makanandaerah.ui.theme.MakananDaerahTheme



@Composable
fun HalamanDetailRow(
    modifier: Modifier = Modifier,
    navController: NavController,
    makananrowid: Int?
) {
    val inibarumenumakananrow = Datanya.makananLazyRow.filter {makananRow ->
        makananRow.id == makananrowid
    }
    Column(
        modifier = modifier
    ) {
        HalamanIsi(inibarumenumakananrow = inibarumenumakananrow)

    }
    Row(
        modifier = Modifier.background(Color.LightGray).height(50.dp).fillMaxWidth().padding(start = 10.dp, end = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = {
            navController.navigate("rumah")
        }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, modifier = Modifier.background(Color.Black))
        }
        Text(text = inibarumenumakananrow[0].nama_menu, fontSize = 20.sp, color = Color.Black)
    }
}


/*@ExperimentalMaterial3Api
@Composable
fun Appbar() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Small Top App Bar")
                }
            )
        },
    ) {
        Column(modifier = Modifier.padding(it)) {

        }
    }
}*/

@Composable
private fun HalamanIsi(
    inibarumenumakananrow: List<MakananRow>,
    modifier: Modifier = Modifier.fillMaxSize(),
) {
    val routes =
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(start = 10.dp, end = 170.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {

            }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }
            Text(text = inibarumenumakananrow[0].nama_menu, fontSize = 20.sp, color = Color.Black)
        }
        /*Row(
            modifier = Modifier.height(150.dp).fillMaxWidth().background(Color.Gray)
        ) {

        }*/
        Image(
            painter = painterResource(id = inibarumenumakananrow[0].gambar),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Berasal Dari : ")
        Text(text = inibarumenumakananrow[0].asal)
        Spacer(modifier = Modifier.size(10.dp))
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = inibarumenumakananrow[0].deskripsi)
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewHalamanList() {
    MakananDaerahTheme {
        HalamanIsi(inibarumenumakananrow = Datanya.makananLazyRow)
        //Appbar()
    }
}