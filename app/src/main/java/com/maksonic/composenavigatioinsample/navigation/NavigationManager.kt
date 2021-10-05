package com.maksonic.composenavigatioinsample.navigation

import com.maksonic.composenavigatioinsample.navigation.Directions.default
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * @Author: maksonic on 05.10.2021
 */
class NavigationManager {

    var commands = MutableStateFlow(default)

    fun navigate(directions: NavigationCommand) {
        commands.value = directions
    }
}