package com.islam.el_sabel_app.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.islam.el_sabel_app.R
import com.islam.el_sabel_app.component.TopBar
import com.islam.el_sabel_app.component.TrackNameCard
import com.islam.el_sabel_app.ui.theme.DarkCrayola


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = {}
    ) { paddingValue ->
        Log.d("paddingValue", "$paddingValue")
        Column(modifier = Modifier.padding(paddingValue)) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                value = "",
                onValueChange = {},
                label = { Text(text = stringResource(R.string.search_here)) }
            )
            Column(modifier = Modifier.padding(top = 28.dp, start = 16.dp, end = 16.dp)) {
                Text(
                    text = stringResource(R.string.track),
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = stringResource(R.string.start_enrolling))
                Spacer(modifier = Modifier.height(20.dp))
                TrackNameCard()
                Spacer(modifier = Modifier.height(20.dp))
                TrackNameCard()
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = stringResource(R.string.explore_more), color = DarkCrayola)
                }
            }
        }
    }
}


@Preview
@Composable
fun HomePreview() {
    Home()
}