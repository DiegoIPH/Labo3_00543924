package com.example.labo3_00543924.code.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun NamesList(navigateBack: () -> Unit){
    val lista = remember {mutableStateListOf<String>()}
    val usuario: MutableState<String> = remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        TextField(
            value = usuario.value,
            onValueChange = { usuario.value = it },
            label = { Text("Ingresa tu Nombre aquí") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray,
                unfocusedContainerColor = Color.LightGray,
                unfocusedLabelColor = Color.Black,
                focusedLabelColor = Color.Black
            ),
        )
        Button(
            onClick = {
                if (usuario.value.isNotBlank()){
                    lista.add(usuario.value)
                }
            }
        ) {
            Text(text = "Guardar Nombre")
        }
        Row(modifier = Modifier
            .padding(all = 16.dp)
        )
        {
            Text("Lista de Nombres y posición en la lista",
                modifier = Modifier
                    .weight(1f))
            Button(
                onClick = {
                    lista.clear()
                }
            ) {
                Text(text = "Limpiar lista")
            }
        }
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .border(
                    width = 2.dp,
                    color = Color.Blue,
                    shape = RoundedCornerShape(8.dp)
                )
                .clip(RoundedCornerShape(8.dp))
                .padding(8.dp)
        ) {
            itemsIndexed(lista.toList()) { index, item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = item
                    )
                    Text(
                        text = (index + 1).toString()
                    )
                }
            }
        }
    }
}
