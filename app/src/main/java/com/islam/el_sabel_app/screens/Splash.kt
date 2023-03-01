package com.islam.el_sabel_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islam.el_sabel_app.R

@Composable
fun Splash() {
    Box(modifier = Modifier.fillMaxSize()) {
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
    Splash()
}