package com.maksonic.composenavigatioinsample.di

import com.maksonic.composenavigatioinsample.first_screen.FirstStore
import com.maksonic.composenavigatioinsample.first_screen.FirstViewModel
import com.maksonic.composenavigatioinsample.navigation.NavigationManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Author: maksonic on 05.10.2021
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideNavigationManager() = NavigationManager()

    @Provides
    fun provideFirstViewModel() = FirstViewModel(FirstStore(NavigationManager()))
}