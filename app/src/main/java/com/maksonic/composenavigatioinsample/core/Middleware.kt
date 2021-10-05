package com.maksonic.composenavigatioinsample.core

/**
 * @Author: maksonic on 05.10.2021
 */
interface Middleware<S : State, A : Action> {

    suspend fun process(action: A, currentState: S, store: Store<S, A>)
}