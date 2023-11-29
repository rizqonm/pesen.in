package com.example.pesenin.ui.screens.daftarPesanan

import android.widget.Button
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pesenin.R

@Composable
fun RowScope.TableDaftarPesanan(
    text: String,
    weight: Float,
    fontSize: TextUnit = 12.sp,
    button: @Composable RowScope.() -> Unit = {}
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color(0xFFF4F5F9))
            .weight(weight)
            .padding(8.dp),
        color = Color.Black
    )
    this.button()
}

@Composable
fun TableDaftarPesanan() {
    val tableData = (1..3).mapIndexed { index, item ->
        index to "Item $index"
    }

    val column1Weight = .1f
    val column2Weight = .2f
    val column3Weight = .2f
    val column4Weight = .25f
    val column5Weight = .15f

    LazyColumn(
        Modifier
            .padding(top = 16.dp)
    ) {
        // Here is the header
        item {
            Row(Modifier.background(Color(0xFFF4F5F9))) {
                TableDaftarPesanan(text = "No", weight = column1Weight)
                TableDaftarPesanan(text = "Nama", weight = column2Weight)
                TableDaftarPesanan(text = "Jam", weight = column3Weight)
                TableDaftarPesanan(text = "Keterangan", weight = column4Weight)
                TableDaftarPesanan(text = "Aksi", weight = column5Weight)
            }
        }
        // Here are all the lines of your table.
        items(tableData) {
            val (id, text) = it
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF4F5F9))
            ) {
                TableDaftarPesanan(text = id.toString(), weight = column1Weight)
                TableDaftarPesanan(text = text, weight = column2Weight)
                TableDaftarPesanan(text = text, weight = column3Weight)
                TableDaftarPesanan(text = text, weight = column4Weight)
                TableDaftarPesanan(
                    text = "",
                    weight = column5Weight
                ) {
                    // Add buttons for "Lihat Detail" and "Hapus"
                    IconButton(
                        onClick = { /* Handle Lihat Detail click */ },
                        modifier = Modifier
                            .width(21.dp)
                            .height(21.dp)
                    ) {
                        Icon(
                            Icons.Default.List, // Replace with your icon
                            contentDescription = null,
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(
                        onClick = { /* Handle Hapus click */ },
                        modifier = Modifier
                            .width(21.dp)
                            .height(21.dp)
                    ) {
                        Icon(
                            Icons.Default.Delete, // Replace with your icon
                            contentDescription = null,
                            tint = Color.Red
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DaftarPesanan(){
    var showDialog by remember { mutableStateOf(false) }

    val openDialog = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        showDialog = false
    }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        Row (
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .shadow(
                    elevation = 8.dp,
                    spotColor = Color(0x296481DC),
                    ambientColor = Color(0x296481DC)
                )
                .width(390.dp)
                .height(100.dp)
                .padding(top = 16.dp, bottom = 16.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.filkomlogo),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(115.dp)
                    .height(25.60925.dp)
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.Start,
//        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(start = 12.dp, top = 100.dp, end = 12.dp)
    ) {
        Text(
            text = "Daftar Pesanan",
            fontSize = 20.sp,
            lineHeight = 24.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Color(0xFF303030),
            modifier = Modifier
                .align(Alignment.Start)
        )
        TableDaftarPesanan()
    }
}
