package com.maksonic.composenavigatioinsample.first_screen

import com.maksonic.composenavigatioinsample.core.BaseStore
import com.maksonic.composenavigatioinsample.navigation.NavigationManager
import javax.inject.Inject

/**
 * @Author: maksonic on 05.10.2021
 */
class FirstStore @Inject constructor(private val navigationManager: NavigationManager
) : BaseStore<FirstViewState, FirstActions>(
    initialState = FirstViewState(),
    reducer = null,
    middlewares = listOf(FirstNavigationMiddleware(navigationManager)
    )
)