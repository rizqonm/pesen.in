package com.example.pesenin.ui.screens.pesan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pesenin.ui.theme.BottomBar
import com.example.pesenin.ui.theme.TopBar

@Composable
fun HalamanStatusPesanan(modifier: Modifier = Modifier, value:Int) {

    Box(
        modifier = modifier
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
                text = "Detail Pesanan",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset (
                    y = 150.dp
                )
        ){
            when (value) {
                1 -> {
                    StatusPesanan1()
                }
                2 -> {
                    StatusPesanan2()
                }
                3 -> {
                    StatusPesanan3()
                }
                else -> {
                    StatusPesanan4()
                }
            }
        }

        Box(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color.White)
        ){
            BottomBar(1)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HalamanStatusPesananPreview() {
    HalamanStatusPesanan(Modifier, 1)
}