package com.example.questlayout_0247

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questlayout_0247.ui.theme.AktifitasPertama
import com.example.questlayout_0247.ui.theme.QuestLayout_0247Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestLayout_0247Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AktifitasPertama(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

