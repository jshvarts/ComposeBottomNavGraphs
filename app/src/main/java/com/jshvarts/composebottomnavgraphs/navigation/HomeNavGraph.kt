package com.jshvarts.composebottomnavgraphs.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.jshvarts.composebottomnavgraphs.screens.HomeScreen
import com.jshvarts.composebottomnavgraphs.screens.Screen

fun NavGraphBuilder.homeNavGraph() {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
    }
}