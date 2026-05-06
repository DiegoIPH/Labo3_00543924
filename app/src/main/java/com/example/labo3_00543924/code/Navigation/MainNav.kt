package com.example.labo3_00543924.code.Navigation

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.labo3_00543924.code.Screens.MainMenu
import com.example.labo3_00543924.code.Screens.NamesList
import com.example.labo3_00543924.code.Screens.Sensor

@Composable
fun App() {
    val backStack = rememberNavBackStack(Routes.MainMenu)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {

            entry<Routes.MainMenu> {
                MainMenu(
                    navigateToNameList = { ->
                        backStack.add(Routes.NamesList)
                    },
                    navigateToSensor = { ->
                        backStack.add(Routes.Sensor)
                    }
                )
            }
            entry<Routes.NamesList>{
                NamesList(
                    navigateBack = {
                        backStack.removeLastOrNull()
                    }
                )
            }
            entry<Routes.Sensor>{
                Sensor(
                    navigateBack = {
                        backStack.removeLastOrNull()
                    }
                )
            }
        }
    )
}

