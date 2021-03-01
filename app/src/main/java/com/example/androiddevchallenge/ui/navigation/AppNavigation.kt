package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.HomeScreen
import com.example.androiddevchallenge.ui.DetailsScreen
import com.example.androiddevchallenge.ui.data.PetRepository

/**
 * Created by Yugansh on 28/02/21.
 */
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home_screen"
    ) {
        composable("home_screen") {
            HomeScreen(navController = navController)
        }
        composable(
            route = "details_screen/{petName}",
            arguments = listOf(
                navArgument(name = "petName") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("petName")?.let { name ->
                val pet = PetRepository.getPetByName(name)
                pet?.let {
                    DetailsScreen(
                        navController = navController,
                        pet = it
                    )
                }
            }
        }
    }
}