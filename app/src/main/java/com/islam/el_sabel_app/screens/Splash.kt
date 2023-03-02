package com.islam.el_sabel_app.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.islam.el_sabel_app.R
import com.islam.el_sabel_app.route.Screen
import kotlinx.coroutines.delay


@Composable
fun AnimatedSplash(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(3000)
    )
    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(4000)
        navController.popBackStack()
        navController.navigate(route = Screen.ChooseLanguage.route)
    }
    Splash(alpha = alphaAnim.value)
}

@Composable
fun Splash(alpha: Float) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .alpha(alpha)
    ) {
        Image(
            painter = painterResource(id = R.drawable.el_sabeel_logo),
            contentDescription = stringResource(
                R.string.el_sabeel_logo
            ),
            modifier = Modifier
                .size(width = 178.dp, height = 154.dp)
                .align(alignment = Alignment.Center)
        )

        Column(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {
            Text(
                text = "Sabeel Academy",
                modifier = Modifier.padding(start = 22.dp)
            )
            Text(text = "All Rights Reserved. 2020")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    Splash(alpha = 1f)
}