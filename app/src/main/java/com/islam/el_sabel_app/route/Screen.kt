package com.islam.el_sabel_app.route

sealed class Screen(val route: String) {
    object Splash : Screen(route = "splash_screen")
    object ChooseLanguage : Screen(route = "choose_language_screen")
    object ViewPager : Screen(route = "viewPager_screen")
}
