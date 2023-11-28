package com.example.pesenin.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pesenin.R

@Composable
fun TopBar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(112.dp),
    )
    {
        Image(
            painter = painterResource(id = R.drawable.epback),
            contentDescription = "Back",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = R.drawable.logofilkom),
            contentDescription = "Logo",
            modifier = Modifier
                .size(100.dp,50.dp)
        )
    }
}

@Composable
fun BottomBar(active : Int) {
    var home =0
    var food =1
    var profile=2
    when (active) {
        1 -> {
            home = R.drawable.homeactive
            food = R.drawable.foodinactive
            profile = R.drawable.profileinactive
        }
        2 -> {
            home = R.drawable.homeinactive
            food = R.drawable.foodactive
            profile = R.drawable.profileinactive
        }
        3 -> {
            home = R.drawable.homeinactive
            food = R.drawable.foodinactive
            profile = R.drawable.profileactive
        }
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 48.dp, vertical = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Image(
            painter = painterResource(id = home),
            contentDescription = "Home",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = food),
            contentDescription = "Menu",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = profile),
            contentDescription = "Profile",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
    }
}

@Composable
fun BottomBarKantin(active: Int) {
    var home =0
    var list =1
    var food =2
    when (active) {
        1 -> {
            home = R.drawable.homeactiveblue
            list = R.drawable.listinactive
            food = R.drawable.foodinactiveblue
        }
        2 -> {
            home = R.drawable.homeinactive
            list = R.drawable.listactive
            food = R.drawable.foodinactiveblue
        }
        3 -> {
            home = R.drawable.homeinactive
            list = R.drawable.listinactive
            food = R.drawable.foodactiveblue
        }
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 48.dp, vertical = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Image(
            painter = painterResource(id = home),
            contentDescription = "Home",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = list),
            contentDescription = "Order",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = food),
            contentDescription = "Menu",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar(3)
}

@Preview(showBackground = true)
@Composable
fun BottomBarKantinPreview() {
    BottomBarKantin(3)
}