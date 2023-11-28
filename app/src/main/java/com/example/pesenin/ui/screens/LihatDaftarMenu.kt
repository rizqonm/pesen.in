package com.example.pesenin.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pesenin.R
import com.example.pesenin.ui.theme.BottomBar
import com.example.pesenin.ui.theme.TopBar

@Composable
fun LihatDaftarMenu(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color.White)
        ){
            Image(
                painter = painterResource(id = R.drawable.logofilkom),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp,50.dp)
            )
        }

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 84.dp
                )
                .fillMaxWidth()
                .requiredHeight(height = 143.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .background(color = Color(0xfff4f5f9))
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 241.dp
                )
        ) {
            Text(
                text = "Kantin GKM FILKOM",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold)
            )
        }

        

        Box(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color(0xfff4f5f9))
        ){
            BottomBar(1)

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LihatDaftarMenuPreview() {
    LihatDaftarMenu(Modifier)
}