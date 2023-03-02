package com.islam.el_sabel_app.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.islam.el_sabel_app.R


@Composable
fun TrackNameCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(1.dp),
        border = BorderStroke(1.dp, color = Color.LightGray),
    ) {
        Box(
            modifier = Modifier
                .height(138.dp)
                .fillMaxWidth()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_place_holder),
                contentDescription = stringResource(R.string.icon_place_holder)
            )
        }
        Text(
            modifier = Modifier.padding(
                top = 11.dp,
                start = 16.dp
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            text = "Track Name"
        )
        Text(
            modifier = Modifier.padding(top = 6.dp, start = 16.dp, bottom = 16.dp),
            maxLines = 2,
            lineHeight = 24.sp,
            overflow = TextOverflow.Ellipsis,
            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
        )
    }
}

@Preview
@Composable
fun TrackNameCardPreview() {
    TrackNameCard()
}