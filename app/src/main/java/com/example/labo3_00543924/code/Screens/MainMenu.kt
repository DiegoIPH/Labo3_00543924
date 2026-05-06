package com.example.labo3_00543924.code.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainMenu(
    navigateToNameList : () -> Unit,
    navigateToSensor : () -> Unit
){
    Column(modifier = Modifier
        .windowInsetsPadding(WindowInsets.safeDrawing)) {
        Button(
            onClick = {navigateToNameList()}
        ) { Text(text = "Ir a la lista de nombre") }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = {navigateToSensor()}
        ) { Text(text = "Ir a la pantalla de sensor") }
    }
}