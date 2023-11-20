package com.example.pesenin.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pesenin.R

@Composable
fun HalamanPilihPesanan(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
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
                    x = (-6).dp,
                    y = 84.dp
                )
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 143.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .background(color = Color(0xfff4f5f9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-16).dp,
                    y = 284.dp
                )
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 454.dp)
                .background(color = Color(0xfff4f5f9)))
        Image(
            painter = painterResource(id = R.drawable.logofilkom),
            contentDescription = "image 6",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 123.dp,
                    y = 47.dp
                )
                .requiredWidth(width = 115.dp)
                .requiredHeight(height = 26.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(31.dp, Alignment.CenterHorizontally),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 12.dp,
                    y = 426.dp
                )
                .requiredWidth(width = 342.dp)
                .requiredHeight(height = 115.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
                .padding(
                    start = 3.dp,
                    end = 15.dp,
                    top = 8.dp,
                    bottom = 8.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 148.dp)
                    .requiredHeight(height = 100.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xfff4f5f9)))
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .requiredWidth(width = 141.dp)
                    .requiredHeight(height = 63.dp)
                    .padding(vertical = 6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 162.dp)
                        .requiredHeight(height = 32.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 32.5.dp,
                                y = 6.dp
                            )
                            .requiredWidth(width = 28.dp)
                            .requiredHeight(height = 25.dp)
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xff2b5699))
                            .padding(
                                start = 10.dp,
                                end = 39.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                            verticalAlignment = Alignment.Bottom,
                            modifier = Modifier
                                .requiredWidth(width = 9.dp)
                                .requiredHeight(height = 18.dp)
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
                        text = "0",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 77.5.dp,
                                y = 6.dp
                            )
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 99.5.dp,
                                y = 6.dp
                            )
                            .requiredWidth(width = 28.dp)
                            .requiredHeight(height = 25.dp)
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xff2b5699))
                            .padding(
                                start = 10.dp,
                                end = 39.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                            verticalAlignment = Alignment.Bottom,
                            modifier = Modifier
                                .requiredWidth(width = 9.dp)
                                .requiredHeight(height = 18.dp)
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
                Text(
                    text = "Lalapan Ayam Goreng ",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp13.000",
                    color = Color(0xff2b5699),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium))
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(31.dp, Alignment.CenterHorizontally),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 685.dp
                )
                .requiredWidth(width = 342.dp)
                .requiredHeight(height = 115.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
                .padding(
                    horizontal = 3.dp,
                    vertical = 8.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 148.dp)
                    .requiredHeight(height = 100.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xfff4f5f9)))
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredWidth(width = 140.dp)
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
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                    modifier = Modifier
                        .requiredWidth(width = 95.dp)
                        .requiredHeight(height = 25.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                        .background(color = Color(0xff2b5699))
                        .padding(
                            start = 10.dp,
                            end = 39.dp,
                            top = 4.dp,
                            bottom = 4.dp
                        )
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                        verticalAlignment = Alignment.Bottom,
                        modifier = Modifier
                            .requiredWidth(width = 117.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.materialsymbolsshoppingbagoutlinesharp),
                            contentDescription = "material-symbols:shopping-bag-outline-sharp",
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = Modifier
                                .requiredSize(size = 21.dp))
                        Text(
                            text = "Tambah",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium))
                    }
                }
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(100.dp, Alignment.Top),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-31).dp,
                    y = 731.dp
                )
                .requiredWidth(width = 429.dp)
                .background(color = Color.White)
                .padding(
                    horizontal = 54.dp,
                    vertical = 22.dp
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(120.dp),
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .padding(start = 40.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.materialsymbolshomeoutline),
                    contentDescription = "material-symbols:home-outline",
                    colorFilter = ColorFilter.tint(Color(0xff868889)),
                    modifier = Modifier
                        .requiredSize(size = 25.dp))
                Image(
                    painter = painterResource(id = R.drawable.mdicardsheartoutline),
                    contentDescription = "mdi:cards-heart-outline",
                    modifier = Modifier
                        .requiredSize(size = 25.dp))
                Image(
                    painter = painterResource(id = R.drawable.icoutlineaccountcircle),
                    contentDescription = "ic:outline-account-circle",
                    modifier = Modifier
                        .requiredSize(size = 25.dp))
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(100.dp, Alignment.Top),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-31).dp,
                    y = 731.dp
                )
                .requiredWidth(width = 429.dp)
                .background(color = Color.White)
                .padding(
                    horizontal = 54.dp,
                    vertical = 22.dp
                )
        ){
            
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(31.dp, Alignment.Start),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 297.dp
                )
                .requiredWidth(width = 342.dp)
                .requiredHeight(height = 115.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
                .padding(
                    start = 5.dp,
                    end = 15.dp,
                    top = 8.dp,
                    bottom = 8.dp
                )
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
        Row(
            horizontalArrangement = Arrangement.spacedBy(31.dp, Alignment.CenterHorizontally),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 555.dp
                )
                .requiredWidth(width = 342.dp)
                .requiredHeight(height = 115.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
                .padding(
                    start = 3.dp,
                    end = 15.dp,
                    top = 8.dp,
                    bottom = 8.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 148.dp)
                    .requiredHeight(height = 100.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(color = Color(0xfff4f5f9)))
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .requiredWidth(width = 141.dp)
                    .requiredHeight(height = 63.dp)
                    .padding(vertical = 6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 162.dp)
                        .requiredHeight(height = 32.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 32.5.dp,
                                y = 6.dp
                            )
                            .requiredWidth(width = 28.dp)
                            .requiredHeight(height = 25.dp)
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xff2b5699))
                            .padding(
                                start = 10.dp,
                                end = 39.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                            verticalAlignment = Alignment.Bottom,
                            modifier = Modifier
                                .requiredWidth(width = 9.dp)
                                .requiredHeight(height = 18.dp)
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
                        text = "2",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 77.5.dp,
                                y = 6.dp
                            )
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 99.5.dp,
                                y = 6.dp
                            )
                            .requiredWidth(width = 28.dp)
                            .requiredHeight(height = 25.dp)
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xff2b5699))
                            .padding(
                                start = 10.dp,
                                end = 39.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .requiredWidth(width = 9.dp)
                                .requiredHeight(height = 18.dp)
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
                Text(
                    text = "Lalapan Ayam Krispi ",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp13.000",
                    color = Color(0xff2b5699),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 302.dp,
                    y = 676.dp
                )
                .requiredSize(size = 45.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = CircleShape)
                    .background(color = Color(0xfffc7b33)))
        }
        Image(
            painter = painterResource(id = R.drawable.epback),
            contentDescription = "ep:back",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 14.dp,
                    y = 47.dp
                )
                .requiredWidth(width = 36.dp)
                .requiredHeight(height = 24.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TypeNoneDarkModeFalse(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredSize(size = 6.dp)
    ) {
        Badge()
    }
}


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HalamanPilihPesananPreview() {
    HalamanPilihPesanan(Modifier)
}