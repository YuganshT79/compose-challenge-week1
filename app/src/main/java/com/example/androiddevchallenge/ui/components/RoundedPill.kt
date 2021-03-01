package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by Yugansh on 28/02/21.
 */
@Composable
fun RoundedPill(
    title: String,
    text: String
) {
    Card(
        modifier = Modifier
            .height(80.dp)
            .width(80.dp),
        backgroundColor = Color.Cyan,
        shape = RoundedCornerShape(20),
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 6.dp)
        ) {
            Text(
                text = text,
                fontSize = 14.sp,
                modifier = Modifier.padding(2.dp),
                color = Color(87, 87, 87),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                text = title,
                fontSize = 12.sp,
                modifier = Modifier.padding(2.dp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = Color(148, 148, 148)
            )
        }
    }
}

@Composable
@Preview
fun PillPreview() {
    RoundedPill("Age", "1 years")
}