/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.data.Pet

/**
 * Created by Yugansh on 28/02/21.
 */
@Composable
fun PetCardItem(
    pet: Pet,
    cardColor: Color,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(210.dp)
                .padding(8.dp)
                .clip(RoundedCornerShape(10))
                .clickable(enabled = true) {
                    onClick.invoke()
                },
            shape = RoundedCornerShape(10),
            backgroundColor = cardColor
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                ) {
                    Text(
                        text = pet.name,
                        fontSize = 36.sp,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = pet.breed,
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = pet.gender,
                        fontSize = 12.sp,
                        color = Color(0, 0, 0, 80),
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Normal
                    )
                }
                Image(
                    modifier = Modifier.weight(1f),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Fit,
                    painter = painterResource(id = pet.image),
                    contentDescription = "Dog"
                )
            }
        }
    }
}
