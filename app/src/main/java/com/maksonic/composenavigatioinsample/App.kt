package com.maksonic.composenavigatioinsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @Author: maksonic on 05.10.2021
 */
@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}