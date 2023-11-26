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
fun BottomBar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Image(
            painter = painterResource(id = R.drawable.materialsymbolshomeoutline),
            contentDescription = "Home",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = R.drawable.mdicardsheartoutline),
            contentDescription = "Menu",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = R.drawable.icoutlineaccountcircle),
            contentDescription = "Profile",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
    }
}

@Composable
fun BottomBarKantin() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Image(
            painter = painterResource(id = R.drawable.materialsymbolshomeoutline),
            contentDescription = "Home",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = R.drawable.list),
            contentDescription = "Order",
            modifier = Modifier
                .size(24.dp)
                .clickable {

                }
        )
        Image(
            painter = painterResource(id = R.drawable.mdifoodoutline),
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
    BottomBar()
}

@Preview(showBackground = true)
@Composable
fun BottomBarKantinPreview() {
    BottomBarKantin()
}