package com.maksonic.composenavigatioinsample.navigation

import androidx.navigation.compose.NamedNavArgument

/**
 * @Author: maksonic on 05.10.2021
 */
object Directions {

    val default = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = ""
    }

    val firstScreen = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "firstscreen"
    }

    val secondScreen = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "secondscreen"
    }
}