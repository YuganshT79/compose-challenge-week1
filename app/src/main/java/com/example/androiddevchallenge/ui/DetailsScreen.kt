package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.RoundedPill
import com.example.androiddevchallenge.ui.data.Pet
import com.example.androiddevchallenge.ui.data.PetRepository

/**
 * Created by Yugansh on 28/02/21.
 */
@Composable
fun DetailsScreen(
    navController: NavController,
    pet: Pet
) {
    DetailsScreenView(pet)
}

@Composable
fun DetailsScreenView(
    pet: Pet
) {
    Surface(
        color = PetRepository.getBgColorByName(pet.name),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = pet.image),
                contentDescription = pet.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(24.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                shape = RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp
                ),
                backgroundColor = MaterialTheme.colors.background
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    Text(
                        text = pet.name,
                        fontSize = 42.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = stringResource(id = R.string.lorem),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black,
                        maxLines = 6,
                        letterSpacing = 1.1.sp,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 22.dp),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        RoundedPill(
                            title = "Age",
                            text = pet.age
                        )
                        RoundedPill(
                            title = "Weight",
                            text = pet.weight
                        )
                        RoundedPill(
                            title = "Breed",
                            text = pet.breed
                        )
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 30.dp),
                    ) {
                        Text(
                            text = "Adopt",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun DetailsScreenPreView() {
    DetailsScreenView(
        Pet(
            name = "Snow",
            image = R.drawable.dog_1,
            breed = "Mixed",
            gender = "Female",
            weight = "10Kg",
            age = "1 year"
        )
    )
}