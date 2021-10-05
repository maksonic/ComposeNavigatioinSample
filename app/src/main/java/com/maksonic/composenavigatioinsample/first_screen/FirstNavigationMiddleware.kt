package com.maksonic.composenavigatioinsample.first_screen

import android.util.Log
import com.maksonic.composenavigatioinsample.core.Middleware
import com.maksonic.composenavigatioinsample.core.Store
import com.maksonic.composenavigatioinsample.navigation.Directions
import com.maksonic.composenavigatioinsample.navigation.NavigationManager
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

/**
 * @Author: maksonic on 05.10.2021
 */
class FirstNavigationMiddleware @Inject constructor(private val navigationManager: NavigationManager):
    Middleware<FirstViewState, FirstActions> {

    @DelicateCoroutinesApi
    override suspend fun process(
        action: FirstActions,
        currentState: FirstViewState,
        store: Store<FirstViewState, FirstActions>,
    ) {
        when(action) {

            is FirstActions.NavigateToSecondScreen -> {
                navigateToSecondScreen()
                Log.d("###", "Navigate to second Button clicked!")
            }
        }
    }

    private fun navigateToSecondScreen() {
        navigationManager.navigate(Directions.secondScreen)
    }
}