package com.maksonic.composenavigatioinsample.second_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * @Author: maksonic on 05.10.2021
 */
@Composable
fun SecondScreen() {
    Scaffold {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()) {

            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                Text("NAVIGATE BACK")
            }
        }
    }
}