package com.jshvarts.composebottomnavgraphs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

const val HOME_GRAPH_ROUTE = "home"
const val SETTINGS_GRAPH_ROUTE = "settings"

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE
    ) {
        homeNavGraph()
        settingsNavGraph(navController = navController)
    }
}