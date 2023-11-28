package com.example.pesenin.ui.screens.pesan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pesenin.R

@Composable
fun StatusPesanan1() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.pesanandikonfirmasi),
                contentDescription = "BuktiPembayaran",
                modifier = Modifier
                    .size(105.dp, 133.dp)
            )
        }
        Box(
            modifier = Modifier
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 117.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFFFF9433))
                .padding(14.dp)

        ) {
            Text(
                text = "Pesanan Dikonfirmasi",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 17.sp),
                modifier = Modifier
                    .offset(x = 80.dp)
            )
            Row(
                modifier = Modifier
                    .offset(y = 5.dp)
                    .align(Alignment.Center) // Align ke bawah dan di tengah
                    .padding(bottom = 10.dp) // Menambah jarak dari bawah
            ) {
                Image(
                    painter = painterResource(id = R.drawable.timer),
                    contentDescription = "Timer",
                    modifier = Modifier
                        .size(22.dp, 22.dp)
                        .align(Alignment.CenterVertically) // Align gambar di tengah vertikal
                )
                Text(
                    text = " 25 mins",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterVertically) // Align teks di tengah vertikal
                )
            }
            Text(
                text = "Pesanan anda sedang disiapkan oleh penjual",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 12.sp),
                modifier = Modifier
//                    .fillMaxSize()
                    .offset(x = 40.dp, y = 65.dp)
            )
        }
    }
}

@Composable
fun StatusPesanan2() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.pesanandisiapkan),
                contentDescription = "BuktiPembayaran",
                modifier = Modifier
                    .size(164.dp, 148.dp)
            )
        }
        Box(
            modifier = Modifier
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 117.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFFFF9433))
                .padding(14.dp)

        ) {
            Text(
                text = "Pesanan lagi disiapkan",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 17.sp),
                modifier = Modifier
                    .offset(x = 80.dp)
            )
            Row(
                modifier = Modifier
                    .offset(y = 5.dp)
                    .align(Alignment.Center) // Align ke bawah dan di tengah
                    .padding(bottom = 10.dp) // Menambah jarak dari bawah
            ) {
                Image(
                    painter = painterResource(id = R.drawable.timer),
                    contentDescription = "Timer",
                    modifier = Modifier
                        .size(22.dp, 22.dp)
                        .align(Alignment.CenterVertically) // Align gambar di tengah vertikal
                )
                Text(
                    text = " 19 mins",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterVertically) // Align teks di tengah vertikal
                )
            }
            Text(
                text = "Pesanan anda sedang disiapkan oleh penjual",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 12.sp),
                modifier = Modifier
                    .offset(x = 40.dp, y = 65.dp)
            )
        }
    }
}

@Composable
fun StatusPesanan3() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.pesanandiambil),
                contentDescription = "BuktiPembayaran",
                modifier = Modifier
                    .size(184.dp, 186.dp)
            )
        }
        Box(
            modifier = Modifier
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 117.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFFFF9433))
                .padding(14.dp)
        ) {
            Text(
                text = "Pesanan lagi disiapkan",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 17.sp),
                modifier = Modifier
                    .offset(x = 80.dp)
            )
            Row(
                modifier = Modifier
                    .offset(y = 5.dp)
                    .align(Alignment.Center) // Align ke bawah dan di tengah
                    .padding(bottom = 10.dp) // Menambah jarak dari bawah
            ) {
                Image(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = "Timer",
                    modifier = Modifier
                        .size(22.dp, 22.dp)
                        .align(Alignment.CenterVertically) // Align gambar di tengah vertikal
                )
                Text(
                    text = " Lalapan Mbak Eli",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterVertically) // Align teks di tengah vertikal
                )
            }
            Text(
                text = "Segera ambil pesanan anda",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 12.sp),
                modifier = Modifier
                    .offset(x = 90.dp, y = 65.dp)
            )
        }
    }
}

@Composable
fun StatusPesanan4(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.pesananterkirim),
                contentDescription = "BuktiPembayaran",
                modifier = Modifier
                    .size(188.dp, 131.dp)
            )
        }
        Box(
            modifier = Modifier
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 117.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFFFF9433))
                .padding(14.dp)
        ) {
            Text(
                text = "Terkirim",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 17.sp),
                modifier = Modifier
                    .offset(x = 130.dp)
            )
            Row(
                modifier = Modifier
//                    .fillMaxWidth()
                    .offset(x= 2.dp,y = 5.dp)
                    .align(Alignment.Center) // Align ke bawah dan di tengah
                    .padding(bottom = 10.dp) // Menambah jarak dari bawah
            ) {
                Image(
                    painter = painterResource(id = R.drawable.timer),
                    contentDescription = "Timer",
                    modifier = Modifier
                        .size(22.dp, 22.dp)
                        .align(Alignment.CenterVertically) // Align gambar di tengah vertikal
                )
                Text(
                    text = " - - -",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterVertically) // Align teks di tengah vertikal
                )
            }
            Text(
                text = "Pesanan telah diambil",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(fontSize = 12.sp),
                modifier = Modifier
                    .offset(x = 100.dp, y = 65.dp)
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewStatusPesanan() {
    StatusPesanan1()
}

@Preview (showBackground = true)
@Composable
fun PreviewStatusPesanan2(){
    StatusPesanan2()
}

@Preview (showBackground = true)
@Composable
fun PreviewStatusPesanan3(){
    StatusPesanan3()
}

@Preview (showBackground = true)
@Composable
fun PreviewStatusPesanan4(){
    StatusPesanan4()
}
