package com.maksonic.composenavigatioinsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maksonic.composenavigatioinsample.first_screen.FirstScreen
import com.maksonic.composenavigatioinsample.first_screen.FirstViewModel
import com.maksonic.composenavigatioinsample.navigation.Directions
import com.maksonic.composenavigatioinsample.navigation.NavigationManager
import com.maksonic.composenavigatioinsample.second_screen.SecondScreen
import com.maksonic.composenavigatioinsample.ui.theme.ComposeNavigatioinSampleTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationManager: NavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigatioinSampleTheme {

                val navController = rememberNavController()
                navigationManager.commands.collectAsState().value.also { command ->
                    if (command.destination.isNotEmpty()) {
                        navController.navigate(command.destination)
                    }
                }

                NavHost(
                    navController = navController,
                    startDestination = Directions.firstScreen.destination) {

                    composable(Directions.firstScreen.destination) {
                        val entry = remember {
                            navController.getBackStackEntry(
                                Directions.firstScreen.destination)
                        }
                        val viewModel = hiltViewModel<FirstViewModel>(entry)
                        FirstScreen(viewModel)
                    }

                    composable(Directions.secondScreen.destination) {
                        SecondScreen()
                    }
                }
            }
        }
    }
}
