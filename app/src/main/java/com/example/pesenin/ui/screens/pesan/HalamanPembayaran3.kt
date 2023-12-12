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
fun HalamanPembayaran3(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .padding(horizontal = 0.dp, vertical = 16.dp)
                .background(color = Color.White)
        ){
            TopBar(true)
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 84.dp
                )
        ) {
            Text(
                text = "Pesan Sekarang",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 155.dp
                )
        ) {
            Text(
                text = "Yeay! \n" +
                        "Pesanan anda telah diterima",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = "Kami akan memberikan informasi \nkapan makanan anda siap!",
                color = Color.Black,
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x= 5.dp,y= 80.dp)
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 350.dp)
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(112.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.pesananditerima),
                contentDescription = "Pesanan Diterima",
                modifier = Modifier
                    .size(218.dp, 291.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
//                .offset(y= (-65).dp)
                .padding(18.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ){
            Button(
                onClick = {
                    navController.navigate(HomeRoutes.Status.name) {
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
                    .requiredWidth(width = 350.dp),
//                verticalArrangement = Arrangement.Bottom
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
        Box(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color.White)
        ){
        }
    }
}

