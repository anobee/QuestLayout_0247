package com.example.questlayout_0247.ui.theme

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@OptIn(markerClass = ExperimentalMaterial3Api)
@Composable
fun MainappContent() {
    var presses by remember { mutableStateOf( value =0 ) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors =  = top
            )
        }

    ) { }

}