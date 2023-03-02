package com.islam.el_sabel_app.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.islam.el_sabel_app.ui.theme.DarkCrayola


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    tint = DarkCrayola,
                    contentDescription = "notification_icon"
                )
            }
        },
        title = { Text(text = "SABEEL ACADEMY", fontWeight = FontWeight.Bold) }
    )
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar()
}