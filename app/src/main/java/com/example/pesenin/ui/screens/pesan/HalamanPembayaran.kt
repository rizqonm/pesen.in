package com.example.pesenin.ui.screens.pesan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pesenin.HomeRoutes
import com.example.pesenin.R
import com.example.pesenin.ui.theme.TopBar

@Composable
fun HalamanPembayaran(navController: NavHostController) {
//    var pesan1 by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color.White)
        ){
            TopBar(true)
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 84.dp
                )
        ) {
            Text(
                text = "Pembayaran",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Column(
            modifier = Modifier
                .offset(
                    x = 0.dp,
                    y = 140.dp
                )
                .fillMaxWidth()
                .requiredHeight(height = 160.dp)
                .background(color = Color.White)
        ) {
            Row( //Fragment Menu
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.Start),
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 10.dp
                    )
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 115.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lalapan),
                    contentDescription = "LalapanAyam",
                    modifier = Modifier
                        .size(117.dp, 77.dp)
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .padding(vertical = 6.dp)
                ) {
                    Text(
                        text = "GKM FILKOM UB",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold))
                    Text(
                        text = "Lalapan Mbak Eli",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Text(
                        text = "4 Menu",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
            }

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 280.dp
                )
        ) {
            Text(
                text = "Metode Pembayaran",
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                style = TextStyle(
                    fontSize = 18.sp))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.Start),
            modifier = Modifier
                .offset(
                    x = 10.dp,
                    y = 330.dp
                )
                .requiredWidth(width = 338.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFFD6DCE4))
                .padding(12.dp)
        ) {
            Text(
                text = "QRIS",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 17.sp))
        }
        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 130.dp)
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.qrpembayaran),
                contentDescription = "QRPembayaran",
                modifier = Modifier
                    .size(150.dp, 290.dp)
            )
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            horizontalAlignment = Alignment.Start,
//            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 2.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Total to Pay",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontSize = 18.sp
                    )
                )

                Text(
                    text = "Rp33.000",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontSize = 16.sp
                    )
                )
            }
        }
        Button(
            onClick = {
                navController.navigate(HomeRoutes.Bayar2.name) {
                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) { saveState = true }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffc7b33)),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 8.dp),
            modifier = Modifier
                .requiredWidth(width = 350.dp)
        ) {
            Text(
                text = "Unggah Bukti Pembayaran",
                color = Color.White,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                ),
            )
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//private fun HalamanPembayaranPreview() {
//    HalamanPembayaran(Modifier)
//}