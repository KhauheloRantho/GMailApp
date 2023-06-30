package com.example.a2

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector


//THIS SEALED CLASS CAN BE A DATA CLASS.
//WE CREATE OBJECTS THAT'LL BE CALLED  AS LIST IN GMailDrawerMenu()
sealed class
DrawerMenuData(var icon: ImageVector? = null, var title: String? = null,
               var isHeader: Boolean = false, var isDivider: Boolean = false
                ){
    object AllBoxes: DrawerMenuData(icon = Icons.Default.Person, title = "All Boxes")
    object Primary: DrawerMenuData(icon = Icons.Default.MailOutline, title = "Primary")
    object Social: DrawerMenuData(icon = Icons.Default.Person, title = "Person")
    object Promotions: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object Starred: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object Snooze: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object Important: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object Scheduled: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object Outbox: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object Draft: DrawerMenuData(icon = Icons.Default.Email, title = "All Boxes")
    object AllMail: DrawerMenuData(icon = Icons.Default.Email, title = "All Mail")
    object Calendar: DrawerMenuData(icon = Icons.Default.ShoppingCart, title = "Calendar")
    object Contacts: DrawerMenuData(icon = Icons.Default.AccountBox, title = "Contacts")
    object Help: DrawerMenuData(icon = Icons.Default.Face, title = "Help")
    object Settings: DrawerMenuData(icon = Icons.Default.Settings, title = "Settings")
    object Divider: DrawerMenuData(isDivider = true)
    object HeaderOne: DrawerMenuData(isHeader = true, title = "ALL LABELS")
    object HeaderTwo: DrawerMenuData(isHeader = true, title = "GOOGLE APPS")

}
