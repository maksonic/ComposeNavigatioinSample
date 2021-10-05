package com.maksonic.composenavigatioinsample.core

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * @Author: maksonic on 05.10.2021
 */
open class BaseStore<S : State, A : Action>(
    initialState: S,
    private val reducer: Reducer<S, A>?,
    private val middlewares: List<Middleware<S, A>> = emptyList(),
) : Store<S, A> {

    private val _state = MutableStateFlow(initialState)
    override val state: StateFlow<S>
        get() = _state
    private val currentState: S
        get() = _state.value

    override suspend fun dispatch(action: A) {
        middlewares.forEach { middleware ->
            middleware.process(action, currentState, this)
        }

        val newState = reducer?.reduce(currentState, action)
        if (newState != null) {
            _state.value = newState
        }
    }
}