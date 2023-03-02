package com.islam.el_sabel_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.islam.el_sabel_app.route.Screen
import com.islam.el_sabel_app.screens.AnimatedSplash
import com.islam.el_sabel_app.screens.ChooseLanguage
import com.islam.el_sabel_app.screens.ViewPager


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            AnimatedSplash(navController = navController)
        }
        composable(route = Screen.ChooseLanguage.route) {
            ChooseLanguage(navController = navController)
        }
        composable(route = Screen.ViewPager.route) {
            ViewPager()
        }
    }
}