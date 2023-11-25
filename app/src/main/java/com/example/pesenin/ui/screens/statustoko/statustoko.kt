package com.example.pesenin.ui.screens.statustoko

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.pesenin.R
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun StatusToko(modifier: Modifier = Modifier) {
    var status by remember { mutableStateOf("Buka") }
    var enableUbah by remember { mutableStateOf(true) }
    var enableSimpan by remember { mutableStateOf(false) }
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 14.dp,
                    y = 93.dp)
                .requiredWidth(width = 204.dp)
                .requiredHeight(height = 24.dp)
        ) {
            Text(
                text = "Kantin DWP Filkom",
                color = Color(0xff303030),
                lineHeight = 1.2.em,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .requiredWidth(width = 204.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.statustoko_filkom),
            contentDescription = "image 6",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 123.dp,
                    y = 47.dp)
                .requiredWidth(width = 115.dp)
                .requiredHeight(height = 26.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 13.dp,
                    y = 420.dp)
                .requiredWidth(width = 334.dp)
                .requiredHeight(height = 256.dp)
        ) {
            Text(
                text = "Menu",
                color = Color(0xff303030),
                lineHeight = 1.22.em,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 23.dp)
                    .requiredWidth(width = 204.dp))
            Surface(
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.dp, Color(0xff70787d)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 55.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
            ) {
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFF)),
                    modifier = Modifier
                        .width(160.dp)
                        .height(173.dp)
                        .background(MaterialTheme.colorScheme.background, shape = RoundedCornerShape(4.dp))
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.statustoko_daftarpesanan),
                            contentDescription = "17239155_5841498 1",
                            modifier = Modifier
                                .width(160.dp)
                                .height(126.dp)
                                .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                        )
                        Text(
                            text = " Daftar Pesanan",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )
                    }
                }
            }
            Surface(
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.dp, Color(0xff70787d)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 176.dp,
                        y = 55.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
            ) {
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFF)),
                    modifier = Modifier
                        .width(160.dp)
                        .height(173.dp)
                        .background(MaterialTheme.colorScheme.background, shape = RoundedCornerShape(4.dp))
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.statustoko_menukantin),
                            contentDescription = "17239155_5841498 1",
                            modifier = Modifier
                                .width(160.dp)
                                .height(126.dp)
                                .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                        )
                        Text(
                            text = "Menu Kantin",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )
                    }
                }
            }
        }
        Surface(
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color(0xff595e61)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 13.dp,
                    y = 283.dp)
                .clip(shape = RoundedCornerShape(5.dp))
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 334.dp)
                    .requiredHeight(height = 137.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 50.dp,
                            y = 16.dp)
                        .requiredWidth(width = 233.dp)
                        .requiredHeight(height = 18.dp)
                ) {
                    Text(
                        text = "Status operasional kantin : $status",
                        color = Color(0xff303030),
                        textAlign = TextAlign.Center,
                        lineHeight = 1.29.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 14.sp
                        ),
                        modifier = Modifier
                            .requiredWidth(width = 233.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 17.dp,
                            y = 52.dp)
                        .requiredWidth(width = 106.dp)
                        .requiredHeight(height = 25.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color(0xff3a62a0))
                ) {
                    Button(
                        onClick = {
                            if(status == "Buka"){status = "Tutup"}
                            else if(status == "Tutup"){status = "Buka"}
                            enableSimpan = true
                        },
                        enabled = enableUbah,
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                            y = 0.dp)
                            .background(color=Color(0x3A62A0)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0x3A62A0))

                    ){
                        Text("Ubah Status", color = Color.White, fontSize = 7.5.sp)
                    }
//                        text = "Ubah Status",
//                        color = Color.White,
//                        textAlign = TextAlign.Center,
//                        lineHeight = 1.17.em,
//                        style = androidx.compose.ui.text.TextStyle(
//                            fontSize = 12.sp,
//                            fontWeight = FontWeight.Bold
//                        ),
//                        modifier = Modifier
//                            .align(alignment = Alignment.TopStart)
//                            .offset(x = 15.dp,
//                                y = 5.dp)
//                    )
                }
                Surface(
                    shape = RoundedCornerShape(5.dp),
                    color = Color(0xfff4f5f9),
                    border = BorderStroke(0.5.dp, Color(0xff8b9094)),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 137.dp,
                            y = 52.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                )
                {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 180.dp)
                            .requiredHeight(height = 25.dp)
                    ) {
                        Text(
                            text = status,
                            color = Color(0xff8b9094),
                            textAlign = TextAlign.Center,
                            lineHeight = 1.2.em,
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 10.sp
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 4.dp,
                                    y = 6.dp)
                                .requiredWidth(width = 172.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp,
                            y = 94.dp)
                        .requiredWidth(width = 219.dp)
                        .requiredHeight(height = 25.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color(0xff6286bd))
                ) {
                    Button(
                        onClick = {
                            enableUbah = true
                            enableSimpan = false
                        },
                        enabled = enableSimpan,
                        modifier = Modifier
                            .align(alignment = Alignment.Center)
                            .background(color=Color(0x6286BD)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0x6286BD))

                    ){
                        Text("Simpan", color = Color.White, fontSize = 7.5.sp)
                    }
//                        text = "Simpan",
//                        color = Color.White,
//                        textAlign = TextAlign.Center,
//                        lineHeight = 1.17.em,
//                        style = androidx.compose.ui.text.TextStyle(
//                            fontSize = 12.sp,
//                            fontWeight = FontWeight.Bold
//                        ),
//                        modifier = Modifier
//                            .align(alignment = Alignment.TopStart)
//                            .offset(x = 0.dp,
//                                y = 5.dp)
//                            .requiredWidth(width = 219.dp))
                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 12.dp,
                    y = 131.dp)
                .requiredWidth(width = 334.dp)
                .requiredHeight(height = 139.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.statustoko_wallpaper),
                contentDescription = "image 5",
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-0).dp,
                        y = (-34.75).dp)
                    .requiredWidth(width = 395.dp)
                    .requiredHeight(height = 184.dp)
                    .clip(shape = RoundedCornerShape(12.dp)))
        }
        Surface(
            shape = RoundedCornerShape(5.dp),
            color = Color(0xffea5e5e),
            border = BorderStroke(0.5.dp, Color.White),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 13.dp,
                    y = 686.dp)
                .clip(shape = RoundedCornerShape(12.dp))
        ) {
            Button(
                onClick = {
                    val logout = Firebase.auth.signOut()
                    logout
                },
                modifier = Modifier
                    .requiredWidth(width = 328.dp)
                    .requiredHeight(height = 35.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0x3A62A0))

            ) {
                Text(
                    text = "Keluar",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = 1.29.em,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 8.dp)
                        .requiredWidth(width = 328.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
        }
//        VariantDefaultDarkModeFalse(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 1.dp,
//                    y = 0.dp))
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 0.dp,
//                    y = 731.dp)
//                .requiredWidth(width = 360.dp)
//                .requiredHeight(height = 69.dp)
//                .background(color = Color.White)
//        ) {
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 18.dp,
//                        y = 22.dp)
//                    .requiredWidth(width = 323.dp)
//                    .requiredHeight(height = 25.dp)
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.statustoko_home),
//                    contentDescription = "material-symbols:home-outline",
//                    colorFilter = ColorFilter.tint(Color(0xff3a62a0)),
//                    modifier = Modifier
//                        .requiredSize(size = 25.dp))
//                Image(
//                    painter = painterResource(id = R.drawable.statustoko_list),
//                    contentDescription = "gg:list",
//                    colorFilter = ColorFilter.tint(Color(0xff70787d)),
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 152.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 25.dp))
//                Image(
//                    painter = painterResource(id = R.drawable.statustoko_food),
//                    contentDescription = "mdi:food-outline",
//                    colorFilter = ColorFilter.tint(Color(0xff70787d)),
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 288.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 25.dp))
//            }
//        }
    }
}

//@Composable
//fun VariantDefaultDarkModeFalse(modifier: Modifier) {
//
//}
//
//@Composable
//fun VariantDefaultDarkModeFalse(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 373.dp)
//            .requiredHeight(height = 47.dp)
//    ) {
//        Row(
//            horizontalArrangement = Arrangement.spacedBy(7.dp, Alignment.Start),
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .align(alignment = Alignment.TopEnd)
//                .offset(x = (-32.70741271972656).dp,
//                    y = 18.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.signal),
//                contentDescription = "Elements / Signal",
//                colorFilter = ColorFilter.tint(Color.Black),
//                modifier = Modifier
//                    .requiredWidth(width = 23.dp)
//                    .requiredHeight(height = 14.dp))
//            Image(
//                painter = painterResource(id = R.drawable.connection),
//                contentDescription = "Elements / Connection",
//                colorFilter = ColorFilter.tint(Color.Black),
//                modifier = Modifier
//                    .requiredWidth(width = 20.dp)
//                    .requiredHeight(height = 14.dp))
//            TypeNormalDarkModeFalse()
//        }
//        TypeNoneDarkModeFalse(
//            modifier = Modifier
//                .align(alignment = Alignment.TopEnd)
//                .offset(x = (-121).dp,
//                    y = 6.dp))
//        IconFalseDarkModeFalse(
//            modifier = Modifier
//                .align(alignment = Alignment.Center)
//                .offset(x = (-139.5).dp,
//                    y = 2.dp))
//    }
//}

//@Composable
//fun TypeNormalDarkModeFalse(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 32.dp)
//            .requiredHeight(height = 15.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .clip(shape = RoundedCornerShape(4.615384578704834.dp))
//                .border(border = BorderStroke(1.1538461446762085.dp, Color.Black),
//                    shape = RoundedCornerShape(4.615384578704834.dp)))
//        Image(
//            painter = painterResource(id = R.drawable.cap),
//            contentDescription = "Cap",
//            alpha = 0.5f,
//            modifier = Modifier
//                .fillMaxSize())
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .clip(shape = RoundedCornerShape(2.307692289352417.dp))
//                .background(color = Color.Black))
//    }
//}

//@OptIn(ExperimentalMaterial3Api::class)
////@Composable
//fun TypeNoneDarkModeFalse(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredSize(size = 6.dp)
//    ) {
//        Badge()
//    }
//}

@Composable
fun IconFalseDarkModeFalse(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Text(
            text = "9:41",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.94.em,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 18.sp,
                letterSpacing = (-0.5).sp
            ),
            modifier = Modifier
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HalamanUbahStatusTokoPreview() {
    StatusToko(Modifier)
}
