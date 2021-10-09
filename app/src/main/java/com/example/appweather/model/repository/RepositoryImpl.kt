package com.example.appweather.model.repository

import com.example.appweather.model.entities.Weather

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorage() = Weather()
}