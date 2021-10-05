package com.maksonic.composenavigatioinsample.navigation

import androidx.navigation.compose.NamedNavArgument

/**
 * @Author: maksonic on 05.10.2021
 */
interface NavigationCommand {

    val arguments: List<NamedNavArgument>

    val destination: String
}