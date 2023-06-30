package com.example.a2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GMailDrawerMenu(){
    var DrawerMenuList = listOf(
    DrawerMenuData.Divider,
    DrawerMenuData.AllBoxes,
    DrawerMenuData.Divider,
    DrawerMenuData.Primary,
    DrawerMenuData.Social,
    DrawerMenuData.Promotions,
    DrawerMenuData.HeaderOne,
    DrawerMenuData.Starred,
    DrawerMenuData.Snooze,
    DrawerMenuData.Important,
    DrawerMenuData.Scheduled,
    DrawerMenuData.Outbox,
    DrawerMenuData.Draft,
    DrawerMenuData.AllMail,
    DrawerMenuData.HeaderTwo,
    DrawerMenuData.Calendar,
    DrawerMenuData.Contacts,
    DrawerMenuData.Divider,
    DrawerMenuData.Settings,
    DrawerMenuData.Help

    )
    Column {
        Text(text = "GMail" , color = Color.Red ,modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Divider(color = Color.LightGray)
    }
}

