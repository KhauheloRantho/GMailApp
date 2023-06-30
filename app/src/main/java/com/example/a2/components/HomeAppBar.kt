package com.example.a2.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a2.R
import com.example.a2.ui.theme.A2Theme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState: ScaffoldState, Scope: CoroutineScope){
    Box(modifier = Modifier.padding(10.dp)){
        Card(shape = RoundedCornerShape(10.dp), elevation = 6.dp,
        modifier = Modifier.requiredHeight(50.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
                ) {
                IconButton(onClick = { /*TODO*/
                    Scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }) {
                    Icon(imageVector = Icons.Default.Menu ,contentDescription = "Menu")
                }

                Text(text = "Search in Mails", modifier = Modifier
                    .weight(weight = 2.0f)
                    .padding(start = 5.dp), fontWeight = FontWeight.SemiBold)
                Image(
                    painter = painterResource(id = R.drawable.profile) ,
                    contentDescription = "Profile", modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)
                        .border(width = 1.dp , color = Color.Red , shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

//@Preview
//@Composable
//fun PreviewHomeAppBar(){
//    A2Theme {
//        HomeAppBar(scaffoldState =  )
//    }
//}