package com.maksonic.composenavigatioinsample.first_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author: maksonic on 05.10.2021
 */
@Composable
fun FirstScreen(
    viewModel: FirstViewModel
) {
   FirstScreenUi(
       onNavigate = viewModel::onNavigate
   )
}

@Composable
fun FirstScreenUi(
    onNavigate: () -> Unit
) {
    Scaffold {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Button(onClick = { onNavigate() }) {
                Text("Navigate To second screen")
            }
        }
    }
}