package com.example.pesenin.ui.screens.pesan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanKeranjang(modifier: Modifier = Modifier){
    var jumlah1 by remember { mutableIntStateOf(2) }
    var jumlah2 by remember { mutableIntStateOf(1) }
    var jumlah3 by remember { mutableIntStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Lalapan Mbak Eli",
            color = Color.Black,
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .background(Color.White)
                .height(50.dp)
                .wrapContentHeight()
                .align(Alignment.CenterHorizontally)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xfff4f5f9)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(16.dp)
                    .height(100.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 128.dp)
                        .fillMaxHeight()
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xFF70787D)))
                Column(
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxHeight()
                ){
                    Text(
                        text = "X",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(start = 200.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp)
                    ) {
                        Text(
                            text = "Lalapan Ayam Krispi",
                            color = Color(0xff101010),
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                        )
                        Row(

                        ) {
                            Text(
                                text = "Rp 13.000",
                                color = Color(0xff70787d),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium),
                            )
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
                                modifier = Modifier
                                    .padding(start = 40.dp)
                                    .padding(top = 10.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 25.dp)
                                        .requiredHeight(height = 25.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xff3a62a0))
                                ) {
                                    Button(
                                        onClick = {
                                            if(jumlah1 > 0) jumlah1--;
                                        },
                                        shape = CircleShape,
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .requiredWidth(width = 250.dp)
                                            .requiredHeight(height = 250.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xFF3A62A0
                                            )
                                        )
                                    ) {
                                        Text("-")
                                    }
                                }
                                Text(
                                    text = jumlah1.toString(),
                                    color = Color(0xff101010),
                                    style = TextStyle(
                                        fontSize = 15.sp))
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 25.dp)
                                        .requiredHeight(height = 25.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xff3a62a0))
                                ) {
                                    Button(
                                        onClick = {
                                            jumlah1++;
                                        },
                                        shape = CircleShape,
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .requiredWidth(width = 250.dp)
                                            .requiredHeight(height = 250.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xFF3A62A0
                                            )
                                        )
                                    ) {
                                        Text("+")
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Divider(
                color = Color(0xff101010),
                modifier = Modifier
                    .requiredWidth(width = 360.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(16.dp)
                    .height(100.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 128.dp)
                        .fillMaxHeight()
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xFF70787D)))
                Column(
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxHeight()
                ){
                    Text(
                        text = "X",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(start = 200.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp)
                    ) {
                        Text(
                            text = "Lalapan Ayam Goreng",
                            color = Color(0xff101010),
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                        )
                        Row(

                        ) {
                            Text(
                                text = "Rp 10.000",
                                color = Color(0xff70787d),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium),
                            )
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
                                modifier = Modifier
                                    .padding(start = 40.dp)
                                    .padding(top = 10.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 25.dp)
                                        .requiredHeight(height = 25.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xff3a62a0))
                                ) {
                                    Button(
                                        onClick = {
                                            if(jumlah2 > 0) jumlah2--;
                                        },
                                        shape = CircleShape,
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .requiredWidth(width = 250.dp)
                                            .requiredHeight(height = 250.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xFF3A62A0
                                            )
                                        )
                                    ) {
                                        Text("-")
                                    }
                                }
                                Text(
                                    text = jumlah2.toString(),
                                    color = Color(0xff101010),
                                    style = TextStyle(
                                        fontSize = 15.sp))
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 25.dp)
                                        .requiredHeight(height = 25.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xff3a62a0))
                                ) {
                                    Button(
                                        onClick = {
                                            jumlah2++;
                                        },
                                        shape = CircleShape,
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .requiredWidth(width = 250.dp)
                                            .requiredHeight(height = 250.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xFF3A62A0
                                            )
                                        )
                                    ) {
                                        Text("+")
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Divider(
                color = Color(0xff101010),
                modifier = Modifier
                    .requiredWidth(width = 350.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(16.dp)
                    .height(100.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 128.dp)
                        .fillMaxHeight()
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xFF70787D)))
                Column(
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxHeight()
                ){
                    Text(
                        text = "X",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(start = 200.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp)
                    ) {
                        Text(
                            text = "Lalapan Kulit Ayam",
                            color = Color(0xff101010),
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                        )
                        Row(

                        ) {
                            Text(
                                text = "Rp 10.000",
                                color = Color(0xff70787d),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium),
                            )
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
                                modifier = Modifier
                                    .padding(start = 40.dp)
                                    .padding(top = 10.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 25.dp)
                                        .requiredHeight(height = 25.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xff3a62a0))
                                ) {
                                    Button(
                                        onClick = {
                                            if(jumlah3 > 0) jumlah3--;
                                        },
                                        shape = CircleShape,
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .requiredWidth(width = 250.dp)
                                            .requiredHeight(height = 250.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xFF3A62A0
                                            )
                                        )
                                    ) {
                                        Text("-")
                                    }
                                }
                                Text(
                                    text = jumlah3.toString(),
                                    color = Color(0xff101010),
                                    style = TextStyle(
                                        fontSize = 15.sp))
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 25.dp)
                                        .requiredHeight(height = 25.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xff3a62a0))
                                ) {
                                    Button(
                                        onClick = {
                                            jumlah3++;
                                        },
                                        shape = CircleShape,
                                        modifier = Modifier
                                            .align(alignment = Alignment.Center)
                                            .requiredWidth(width = 250.dp)
                                            .requiredHeight(height = 250.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xFF3A62A0
                                            )
                                        )
                                    ) {
                                        Text("+")
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Divider(
                color = Color(0xff101010),
                modifier = Modifier
                    .requiredWidth(width = 350.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Top
                ){
                    Text(
                        text = "Total Harga",
                        color = Color(0xff303030),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium),
                    )
                    Text(
                        text = "Rp46.000",
                        color = Color(0xff70787d),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium),
                    )
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB0C7E9)),
                    contentPadding = PaddingValues(horizontal = 32.dp, vertical = 8.dp),
                    modifier = modifier
                        .requiredWidth(width = 350.dp)
                ) {
                    Text(
                        text = "Pesan Untuk Nanti",
                        color = Color(0xff2b5699),
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium),
                    )

                }
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffc7b33)),
                    contentPadding = PaddingValues(horizontal = 32.dp, vertical = 8.dp),
                    modifier = modifier
                        .requiredWidth(width = 350.dp)
                ) {
                    Text(
                        text = "Pesan Sekarang",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HalamanKeranjangPreview() {
    HalamanKeranjang(Modifier)
}