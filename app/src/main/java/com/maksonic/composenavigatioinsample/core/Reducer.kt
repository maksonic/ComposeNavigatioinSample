package com.maksonic.composenavigatioinsample.core

/**
 * @Author: maksonic on 05.10.2021
 */
interface Reducer<S : State, A : Action> {

    fun reduce(currentState: S, action: A): S
}