package com.example.labo3_00543924.code.Navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
    @Serializable
    data object MainMenu : Routes()

    @Serializable
    data object NamesList : Routes()

    @Serializable
    data object Sensor : Routes()
}