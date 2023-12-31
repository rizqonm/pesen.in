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
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun HalamanPembayaran2(navController: NavHostController) {
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
                text = "Bukti Pembayaran",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 5.dp)
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.buktipembayaran),
                contentDescription = "BuktiPembayaran",
                modifier = Modifier
                    .size(207.dp, 450.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ){

            Button(
                onClick = { },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB0C7E9)),
                contentPadding = PaddingValues(horizontal = 32.dp, vertical = 8.dp),
                modifier = Modifier
                    .requiredWidth(width = 350.dp)
            ) {
                Text(
                    text = "Unggah Ulang",
                    color = Color(0xff2b5699),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium),
                )

            }
            Button(
                onClick = {
                    navController.navigate(HomeRoutes.Bayar3.name) {
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
                    text = "Konfirmasi Pembayaran",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium),
                )
            }
        }
    }
}