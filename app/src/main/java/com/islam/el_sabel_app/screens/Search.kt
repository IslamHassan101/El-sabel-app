package com.islam.el_sabel_app.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.islam.el_sabel_app.R
import com.islam.el_sabel_app.ui.theme.DarkCrayola
import com.islam.el_sabel_app.ui.theme.YellowCrayola


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search() {
    Scaffold(topBar = {}) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 26.dp, end = 16.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        tint = DarkCrayola,
                        contentDescription = ""
                    )
                },
                value = "",
                onValueChange = {},
                label = { Text(text = stringResource(R.string.search_track_here)) })
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    modifier = Modifier.size(width = 64.dp, height = 64.dp),
                    tint = YellowCrayola,
                    painter = painterResource(id = R.drawable.menu_book),
                    contentDescription = ""
                )
                Text(
                    text = "SEARCH TRACKS NOW",
                    fontSize = 20.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview
@Composable
fun SearchPreview() {
    Search()
}