package com.maksonic.composenavigatioinsample.core

import kotlinx.coroutines.flow.StateFlow

/**
 * @Author: maksonic on 05.10.2021
 */
interface Store<S : State, A : Action> {

    val state: StateFlow<S>

    suspend fun dispatch(action: A)
}