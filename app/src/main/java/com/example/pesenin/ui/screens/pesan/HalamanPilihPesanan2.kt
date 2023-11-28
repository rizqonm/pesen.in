package com.example.pesenin.ui.screens.pesan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pesenin.HomeRoutes
import com.example.pesenin.R
import com.example.pesenin.ui.theme.TopBar

@Composable
fun HalamanPilihPesanan2(navController: NavHostController) {

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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset(
                    y = 84.dp
                )
                .background(color = Color.White)
                .fillMaxWidth()
        ) {
            Text(
                text = "Pesan Sekarang",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    )
            )
        }
        Column(
            modifier = Modifier
                .offset(
                    x = 0.dp,
                    y = 128.dp
                )
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xfff4f5f9))
        ) {
            Row(
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 20.dp
                    )
//                    .requiredWidth(width = 372.dp)
                    .requiredWidth(width = 338.dp)
                    .requiredHeight(height = 152.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Column (
                    verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically),
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Text(
                        text = "Lalapan Mbak Eli",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                            )
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 111.dp)
                            .requiredHeight(height = 75.dp)
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xfff4f5f9))
                    )
                    Text(
                        text = "(4 Menu)",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF8B9094),

                            )
                    )
                }
                Spacer(modifier = Modifier.weight(1.0f))
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxHeight()
                ) {
                    Text(
                        text = "Total Harga",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFC7B33),
                            )
                    )
                    Text(
                        text = "Rp33.000",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF6286BD),
                            )
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 20.dp
                    )
                    .padding(8.dp)
            ){
                Column(
                    verticalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterVertically),
                )
                {
                    Text(
                        text = "Tanggal Pemesanan",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),

                            )
                    )
                    Text(
                        text = "5 November 2023, 9:41",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),

                            )
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterVertically),
                )
                {
                    Text(
                        text = "Pembayaran",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),

                            )
                    )
                    Text(
                        text = "QRIS",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),

                            )
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(14.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 20.dp)

            ) {
                Button(
                    onClick = {
                        navController.navigate(HomeRoutes.Bayar1.name) {
                            navController.graph.startDestinationRoute?.let { route ->
                                popUpTo(route) { saveState = true }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFC7B33)),
                    shape = RoundedCornerShape(size = 8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Pesan",
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 22.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),

                            )
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .background(color = Color.White)
                .fillMaxWidth()
        ){
//            BottomBar(1)
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//private fun HalamanPilihPesanan2Preview() {
//    HalamanPilihPesanan2(Modifier)
//}