package com.example.a2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a2.components.HomeAppBar
import com.example.a2.ui.theme.A2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize() ,
                    color = MaterialTheme.colors.background
                ) {
                    GMail()
                }
            }
        }
    }
}

@Composable
fun GMail() {
    var scaffoldState = rememberScaffoldState()
    var Scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
        HomeAppBar(scaffoldState, Scope) // A composable function imported from HomeAppBar.kt
    },
    drawerContent = {
        GMailDrawerMenu()


    }) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    A2Theme {
        GMail()
    }
}