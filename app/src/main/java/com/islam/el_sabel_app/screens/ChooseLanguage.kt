package com.islam.el_sabel_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.islam.el_sabel_app.R
import com.islam.el_sabel_app.route.Screen
import com.islam.el_sabel_app.ui.theme.DarkCrayola
import com.islam.el_sabel_app.ui.theme.YellowCrayola

@Composable
fun ChooseLanguage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(36.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(width = 126.dp, height = 110.5.dp),
            painter = painterResource(id = R.drawable.el_sabeel_logo),
            contentDescription = stringResource(
                id = R.string.el_sabeel_logo
            )
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = stringResource(R.string.choose_language), fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(R.string.you_can_change_it_later))
        Spacer(modifier = Modifier.height(24.dp))
        OutlinedButton(onClick = { /*TODO*/ }) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                verticalAlignment = CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.united_kingdom),
                    contentDescription = stringResource(R.string.united_kingdom)
                )

                Spacer(modifier = Modifier.width(16.dp))
                Text(text = stringResource(R.string.english), color = Color.Black)

                Icon(
                    imageVector = Icons.Default.Check,
                    tint = DarkCrayola,
                    contentDescription = stringResource(R.string.check_icon)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.outlinedButtonColors(YellowCrayola)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                verticalAlignment = CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_egypt),
                    contentDescription = stringResource(R.string.united_kingdom)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = stringResource(R.string.arabic), color = Color.Black)
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(DarkCrayola),
            enabled = true,
            onClick = {
                navController.navigate(route = Screen.ViewPager.route)
            },

            ) {
            Text(text = stringResource(id = R.string.next))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChooseLanguagePreview() {
    ChooseLanguage(navController = rememberNavController())
}