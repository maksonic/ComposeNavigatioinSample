package com.maksonic.composenavigatioinsample.first_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maksonic.composenavigatioinsample.core.Store
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * @Author: maksonic on 05.10.2021
 */
@HiltViewModel
class FirstViewModel @Inject constructor(
    private val store: Store<FirstViewState, FirstActions>
) : ViewModel() {

    fun onNavigate() {
        viewModelScope.launch {
            store.dispatch(FirstActions.NavigateToSecondScreen)
        }
    }
}