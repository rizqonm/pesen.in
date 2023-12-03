package com.example.pesenin.ui.screens.aturStatusPesanan

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat
import com.example.pesenin.R
import com.example.pesenin.ui.screens.pilihKantin.LihatDaftarMenu

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun DropdownStatus(
    onStatusSelected: (String) -> Unit
){
    val statusList = listOf(
        "Menunggu konfirmasi",
        "Sedang diproses",
        "Selesai"
    )
    var expanded by remember { mutableStateOf(false) }
    var selectedStatus by remember { mutableStateOf(statusList[0]) }

    // menu box
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = {
            expanded = !expanded
        },
    ) {
        // textfield
        TextField(
            modifier = Modifier
                .menuAnchor()
                .height(45.dp)
                .padding(bottom = 0.dp),// menuAnchor modifier must be passed to the text field for correctness.
            readOnly = true,
            value = selectedStatus,
            onValueChange = {},
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            textStyle = LocalTextStyle.current.copy(fontSize = 10.5.sp),
        )

        // menu
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            },
        ) {
            // menu items
            statusList.forEach { selectionOption ->
                DropdownMenuItem(
                    text = { Text(selectionOption) },
                    onClick = {
                        selectedStatus = selectionOption
                        expanded = false
                        onStatusSelected(selectedStatus)
                    },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                )
            }
        }
    }
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float,
    fontSize: TextUnit = 12.sp
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color(0xFFF4F5F9))
            .weight(weight)
            .padding(8.dp),
        color = Color.Black
    )
}

@Composable
fun TableScreen() {
    val tableData = (1..3).mapIndexed { index, item ->
        index to "Item $index"
    }

    val column1Weight = .1f
    val column2Weight = .3f
    val column3Weight = .2f
    val column4Weight = .2f
    val column5Weight = .2f

    LazyColumn(
        Modifier
            .padding(top = 16.dp)) {
        // Here is the header
        item {
            Row(Modifier.background(Color(0xFFF4F5F9))) {
                TableCell(text = "No", weight = column1Weight)
                TableCell(text = "Menu", weight = column2Weight)
                TableCell(text = "Jumlah", weight = column3Weight)
                TableCell(text = "Harga", weight = column4Weight)
                TableCell(text = "Subtotal", weight = column5Weight)
            }
        }
        // Here are all the lines of your table.
        items(tableData) {
            val (id, text) = it
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF4F5F9))) {
                TableCell(text = id.toString(), weight = column1Weight)
                TableCell(text = text, weight = column2Weight)
                TableCell(text = text, weight = column3Weight)
                TableCell(text = text, weight = column4Weight)
                TableCell(text = text, weight = column5Weight)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AturStatusPesanan(){
    val context = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }
    var notificationId by remember { mutableStateOf(1) }
    var selectedStatus by remember { mutableStateOf("Menunggu konfirmasi") }
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
    ){
        Text(
            text = "Detail Pesanan",
            fontSize = 20.sp,
            lineHeight = 24.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Color(0xFF303030),
            modifier = Modifier
                .align(Alignment.Start)
        )
        //Detail Order
        Text(
            text = "Nama            : Putri Kecil Ayah",
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = Color(0xFF303030),
            modifier = Modifier
                .padding(top = 14.dp)
        )
        Text(
            text = "No Telp         : 0817566920100",
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = Color(0xFF303030),
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = "Keterangan  : Makan di tempat",
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = Color(0xFF303030),
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = "Jam Pesan   : 13.00",
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(400),
            color = Color(0xFF303030),
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Row (
            verticalAlignment = Alignment.CenterVertically

        ){
            Text(
                text = "Bukti Pembayaran   :",
                fontSize = 12.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(400),
                color = Color(0xFF303030),
                modifier = Modifier
                    .padding(top = 10.dp, end = 7.dp)
            )
            Button(
                onClick = {/*TODO*/},
                colors = ButtonDefaults.buttonColors(Color(0xFF3A62A0)),
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xFF3A62A0),
                        shape = RoundedCornerShape(size = 5.dp)
                    )
                    .width(100.dp)
                    .height(27.dp)
                    .background(color = Color(0xFF3A62A0), shape = RoundedCornerShape(size = 5.dp))
                    .padding(bottom = 1.5.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Lihat file",
                        fontSize = 8.sp,
                        lineHeight = 10.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(top = 32.dp))
        Text(
            text = "Pesanan",
            fontSize = 16.sp,
            lineHeight = 18.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Color(0xFF000000),
            modifier = Modifier
                .align(Alignment.Start)
        )
        Row (
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Status               :",
                fontSize = 12.sp,
                lineHeight = 14.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                modifier = Modifier
                    .padding(end = 6.dp)
            )
            DropdownStatus(onStatusSelected = {newStatus -> selectedStatus = newStatus})
        }
        TableScreen()
        Spacer(modifier = Modifier.padding(top = 13.dp))
        Button(
            onClick = {
                showDialog = true
                showNotification(context, selectedStatus, notificationId)
                notificationId++
                      },
            colors = ButtonDefaults.buttonColors(Color(0xFF3A62A0)),
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF3A62A0),
                    shape = RoundedCornerShape(size = 5.dp)
                )
                .width(100.dp)
                .height(27.dp)
                .background(color = Color(0xFF3A62A0), shape = RoundedCornerShape(size = 5.dp))
                .padding(bottom = 1.dp)
                .align(Alignment.End)
        ) {
            Text(
                text = "Simpan",
                fontSize = 8.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF)
            )
        }

        if(showDialog){
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text(
                    text = "Status",
                    fontSize = 14.sp,
                    color = Color(0xFF595E61)
                )},
                text = { Text(text = "Perubahan berhasil disimpan")},
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text(text = "Oke")
                    }
                },
            )
        }
    }
}

private fun showNotification(context: Context, selectedStatus: String, notificationId: Int){
    val channelId = "PesenInID"

    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        val channel = NotificationChannel(
            channelId,
            "PesenIn",
            NotificationManager.IMPORTANCE_DEFAULT
        )
        notificationManager.createNotificationChannel(channel)
    }

    val builder = NotificationCompat.Builder(context, channelId)
        .setContentTitle("Status Pesananmu")
        .setContentText("$selectedStatus")
        .setSmallIcon(R.drawable.baseline_notifications_active_24)
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        .setVisibility(NotificationCompat.VISIBILITY_PRIVATE)
        .setPublicVersion(
            NotificationCompat.Builder(context, channelId)
                .setContentTitle("Hidden")
                .setContentText("Unlock to see Message")
                .build()
        )

    notificationManager.notify(notificationId, builder.build())
}

@Preview(showBackground = true)
@Composable
private fun AturStatusPesananPreview() {
    AturStatusPesanan()
}