package com.islam.el_sabel_app.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islam.el_sabel_app.R
import com.islam.el_sabel_app.ui.theme.DarkCrayola
import com.islam.el_sabel_app.ui.theme.YellowCrayola


@Composable
fun ViewPager() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 34.dp),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier
                .size(width = 126.dp, height = 110.5.dp),
            painter = painterResource(id = R.drawable.el_sabeel_logo),
            contentDescription = stringResource(
                id = R.string.el_sabeel_logo
            )
        )
        Column(horizontalAlignment = CenterHorizontally) {
            Icon(
                modifier = Modifier.size(width = 94.dp, height = 94.dp),
                painter = painterResource(id = R.drawable.local_library),
                tint = YellowCrayola,
                contentDescription = stringResource(R.string.local_library)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "LOREM IPSUM")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Lorem Ipsum is simply dummy text", color = Color.Gray)
        }
        Text(text = "TEST")
        Row(modifier = Modifier.padding(bottom = 16.dp)) {
            OutlinedButton(border = BorderStroke(1.dp, color = DarkCrayola),
                modifier = Modifier.size(width = 138.dp, height = 50.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "SKIP", color = DarkCrayola)
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                modifier = Modifier.size(width = 138.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(DarkCrayola),
                onClick = { /*TODO*/ }) {
                Text(text = "NEXT")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewPagerPreview() {
    ViewPager()
}