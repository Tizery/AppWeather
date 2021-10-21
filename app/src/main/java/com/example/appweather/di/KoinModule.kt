package com.example.appweather.di

import com.example.appweather.model.repository.Repository
import com.example.appweather.model.repository.RepositoryImpl
import com.example.appweather.ui.main.MainViewModel
import com.example.appweather.ui.main.details.DetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<Repository> { RepositoryImpl() }

    viewModel { MainViewModel(get()) }
    viewModel { DetailsViewModel(get()) }
}