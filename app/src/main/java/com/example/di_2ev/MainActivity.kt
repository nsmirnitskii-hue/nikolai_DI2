package com.example.di_2ev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import com.example.com.example.di_2ev.ui.theme.DI_2EVTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DI_2EVTheme {// Tema de Material 3
                var showSplash by remember { mutableStateOf(true) }

                if (showSplash) {
                    SplashScreen(onTimeout = { showSplash = false })
                } else {
                    HomeScreen()
                    //ShopScreen()
                }
            }
        }
    }
}
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Bienvenido al Mercado",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
