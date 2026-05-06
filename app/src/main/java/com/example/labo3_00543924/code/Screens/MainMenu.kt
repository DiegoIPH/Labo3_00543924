package com.example.labo3_00543924.code.Screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainMenu(
    navigateToNameList : () -> Unit,
    navigateToSensor : () -> Unit
){
    LazyColumn(modifier = Modifier
        .windowInsetsPadding(WindowInsets.safeDrawing)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item{
            Column(modifier = Modifier
                .border(2.dp, Color.Black)
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Button(
                    onClick = {navigateToNameList()}
                ) { Text(text = "Ir a la lista de nombre") }
                Spacer(modifier = Modifier.padding(16.dp))
                Button(
                    onClick = {navigateToSensor()}
                ) { Text(text = "Ir a la pantalla de sensor") }
            }

        }
    }
}