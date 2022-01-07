package com.jshvarts.composebottomnavgraphs.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.jshvarts.composebottomnavgraphs.screens.AboutScreen
import com.jshvarts.composebottomnavgraphs.screens.Screen
import com.jshvarts.composebottomnavgraphs.screens.SettingsScreen

fun NavGraphBuilder.settingsNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Settings.route,
        route = SETTINGS_GRAPH_ROUTE
    ) {
        composable(Screen.Settings.route) {
            SettingsScreen(navController)
        }
        composable(Screen.About.route) {
            AboutScreen(navController)
        }
    }
}