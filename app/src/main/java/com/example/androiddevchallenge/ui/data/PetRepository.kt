package com.example.androiddevchallenge.ui.data

import androidx.compose.ui.graphics.Color
import com.example.androiddevchallenge.R

/**
 * Created by Yugansh on 28/02/21.
 */
object PetRepository {

    private val dogs = mutableListOf<Pet>()
    private val colorMap = mutableMapOf<String, Color>()

    init {
        dogs.add(
            Pet(
                name = "Snow",
                image = R.drawable.dog_1,
                breed = "Mixed",
                gender = "Female",
                weight = "10Kg",
                age = "2 Years"
            )
        )
        colorMap["Snow"] = Color(242, 149, 38)

        dogs.add(
            Pet(
                name = "Bruno",
                image = R.drawable.dog_2,
                breed = "Labrador",
                gender = "Male",
                weight = "14Kg",
                age = "3 Years"
            )
        )
        colorMap["Bruno"] = Color(255, 188, 176)

        dogs.add(
            Pet(
                name = "Cheddar",
                image = R.drawable.dog_3,
                breed = "Poodle",
                gender = "Female",
                weight = "9Kg",
                age = "2 Years"
            )
        )
        colorMap["Cheddar"] = Color(252, 164, 223)

        dogs.add(
            Pet(
                name = "Hunter",
                image = R.drawable.dog_4,
                breed = "German Shepherd",
                gender = "Male",
                weight = "18Kg",
                age = "4 Years"
            )
        )
        colorMap["Hunter"] = Color(88, 46, 241)

        dogs.add(
            Pet(
                name = "Shiro",
                image = R.drawable.dog_5,
                breed = "Shiba Inu",
                gender = "Male",
                weight = "12Kg",
                age = "2 Years"
            )
        )
        colorMap["Shiro"] = Color(243, 170, 172)
    }

    fun getPetDogs(): List<Pet> {
        return dogs
    }

    fun getPetByName(name: String): Pet? {
        return dogs.find { it.name == name }
    }

    fun getBgColorByName(name: String): Color {
        return colorMap[name] ?: Color(242, 149, 38)
    }
}