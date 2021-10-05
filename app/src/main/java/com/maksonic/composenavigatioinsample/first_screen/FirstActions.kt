package com.maksonic.composenavigatioinsample.first_screen

import com.maksonic.composenavigatioinsample.core.Action

/**
 * @Author: maksonic on 05.10.2021
 */
sealed class FirstActions : Action {

    object NavigateToSecondScreen : FirstActions()
}