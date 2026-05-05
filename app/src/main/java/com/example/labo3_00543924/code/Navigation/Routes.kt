package com.example.labo3_00543924.code.Navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
    @Serializable
    data object Menu : Routes()

    @Serializable
    data class MyProfile(
        val id: String
    ) : Routes()

    @Serializable
    data class MovieDetail(val movieId: Int) : Routes()
}