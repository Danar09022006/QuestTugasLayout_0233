package com.example.praktikumindividu4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.praktikumindividu4.ui.theme.PraktikumIndividu4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PraktikumIndividu4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TugasLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

