package com.example.pesenin.ui.screens.pesan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pesenin.HomeRoutes
import com.example.pesenin.R
import com.example.pesenin.ui.theme.TopBar
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarConfig
import com.maxkeppeler.sheets.calendar.models.CalendarSelection
import com.maxkeppeler.sheets.calendar.models.CalendarStyle
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockConfig
import com.maxkeppeler.sheets.clock.models.ClockSelection
import java.time.LocalDate
import java.time.LocalTime

//@OptIn(ExperimentalMaterial3Api::class)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanPesanNanti(navController: NavHostController) {
    val selectedDate = remember { mutableStateOf<LocalDate?>(null) }
    val selectedTime = remember { mutableStateOf<LocalTime?>(null) }
    val calenderState = rememberSheetState()
    val clockState = rememberSheetState()
    val disabledDatess = (1..10000).map {
        LocalDate.now().minusDays(it.toLong())
    }

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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset(
                    y = 84.dp
                )
                .background(color = Color.White)
                .fillMaxWidth()
        ) {
            Text(
                text = "Pesan Untuk Nanti",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )
        }
        Column(
            modifier = Modifier
                .offset(
                    x = 0.dp,
                    y = 128.dp
                )
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xfff4f5f9))
        ) {
            Row(
                modifier = Modifier
                    .offset(
                        x = 10.dp,
                        y = 20.dp
                    )
                    .requiredWidth(width = 372.dp)
                    .requiredHeight(height = 152.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color.White)
                    .padding(8.dp)
            ) {
                Column (
                    verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically),
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Text(
                        text = "Lalapan Mbak Eli",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        )
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 111.dp)
                            .requiredHeight(height = 75.dp)
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xfff4f5f9))
                    )
                    Text(
                        text = "(4 Menu)",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF8B9094),

                            )
                    )
                }
                Spacer(modifier = Modifier.weight(1.0f))
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxHeight()
                ) {
                    Text(
                        text = "Total Harga",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFC7B33),
                        )
                    )
                    Text(
                        text = "Rp33.000",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF6286BD),
                        )
                    )
                }
            }
            CalendarDialog(
                state = calenderState,
                config = CalendarConfig(
                    monthSelection = true,
                    yearSelection = true,
                    style = CalendarStyle.MONTH,
                    disabledDates = disabledDatess
                ),
                selection = CalendarSelection.Date { date ->
                    selectedDate.value = date
                }
            )

            ClockDialog(
                state = clockState,
                config = ClockConfig(
                    is24HourFormat = true
                ),
                selection = ClockSelection.HoursMinutes { hours, minutes ->
                    selectedTime.value = LocalTime.of(hours, minutes)
                }
            )

            Column (
                modifier = Modifier
                    .padding(50.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ){
                Button(onClick = {
                    calenderState.show()
                }) {
                    Text(text = "Pilih Tanggal")
                }
                selectedDate.value?.let { date ->
                    Text(
                        text = "Tanggal yang dipilih: $date",
                        modifier = Modifier.padding(8.dp)
                    )
                }
                Button(onClick = {
                    clockState.show()
                }) {
                    Text(text = "Pilih Waktu")
                }
                selectedTime.value?.let { time ->
                    Text(
                        text = "Waktu yang dipilih : $time",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .padding(18.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom
            ){
                Button(
                    onClick = {
                        navController.navigate(HomeRoutes.Bayar1.name) {
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
                        text = "Pesan",
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