package com.example.pesenin.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import com.example.pesenin.ui.theme.BottomBar
import com.example.pesenin.ui.theme.TopBar

@Composable
fun HalamanPilihPesanan(modifier: Modifier = Modifier) {
    var pesan1 by remember { mutableIntStateOf(0) }

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
            TopBar()
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 241.dp
                )
        ) {
            Text(
                text = "Lalapan Mbak Eli",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp))
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
                .background(color = Color(0xfff4f5f9)))
        Column( 
            modifier = Modifier
                .offset(
                    x = 0.dp,
                    y = 284.dp
                )
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xfff4f5f9))
        ) {
            Row( //Fragment Menu
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.Start),
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 20.dp
                    )
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 115.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 148.dp)
                        .requiredHeight(height = 100.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xfff4f5f9)))
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(vertical = 6.dp)
                ) {
                    Text(
                        text = "Rp10.000",
                        color = Color(0xff2b5699),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium))
                    Text(
                        text = "Lalapan Jamur ",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 120.dp)
                            .requiredHeight(height = 32.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(
                                    text = "-",
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium))
                            }
                        }
                        Text(
                            text = "1",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically)
                                .padding(vertical = 3.dp))
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(
                                    text = "+",
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium))
                            }
                        }
                    }
                }
            }
            Row( //Fragment Menu
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.Start),
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 40.dp
                    )
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 115.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 148.dp)
                        .requiredHeight(height = 100.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xfff4f5f9)))
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(vertical = 6.dp)
                ) {
                    Text(
                        text = "Rp10.000",
                        color = Color(0xff2b5699),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium))
                    Text(
                        text = "Lalapan Jamur ",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 120.dp)
                            .requiredHeight(height = 32.dp)
                    ) {
                        Button(
                            onClick = { pesan1 -= 1 },
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Text("-")
                        }
                        Text(
                            text = pesan1.toString(),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically)
                                .padding(vertical = 3.dp))
                        Button(
                            onClick = { pesan1 += 1 },
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Text("+")
                        }
                    }
                }
            }
            Row( //Fragment Menu
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.Start),
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 60.dp
                    )
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 115.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 148.dp)
                        .requiredHeight(height = 100.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xfff4f5f9)))
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(vertical = 6.dp)
                ) {
                    Text(
                        text = "Rp10.000",
                        color = Color(0xff2b5699),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium))
                    Text(
                        text = "Lalapan Jamur ",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 120.dp)
                            .requiredHeight(height = 32.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(
                                    text = "-",
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium))
                            }
                        }
                        Text(
                            text = "1",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically)
                                .padding(vertical = 3.dp))
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(
                                    text = "+",
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium))
                            }
                        }
                    }
                }
            }
            Row( //Fragment Menu
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.Start),
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 80.dp
                    )
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 115.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 148.dp)
                        .requiredHeight(height = 100.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xfff4f5f9)))
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(vertical = 6.dp)
                ) {
                    Text(
                        text = "Rp10.000",
                        color = Color(0xff2b5699),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium))
                    Text(
                        text = "Lalapan Jamur ",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 120.dp)
                            .requiredHeight(height = 32.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(
                                    text = "-",
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium))
                            }
                        }
                        Text(
                            text = "1",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically)
                                .padding(vertical = 3.dp))
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .requiredWidth(width = 28.dp)
                                .requiredHeight(height = 25.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                                .background(color = Color(0xff2b5699))
                                .padding(4.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(
                                    text = "+",
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium))
                            }
                        }
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 320.dp,
                    y = 740.dp
                )
                .requiredSize(size = 45.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = CircleShape)
                    .background(color = Color(0xfffc7b33))
            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color.White)
        ){
            BottomBar()
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun HalamanPilihPesananPreview() {
    HalamanPilihPesanan(Modifier)
}