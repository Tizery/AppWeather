package com.example.appweather.model.repository

import com.example.appweather.model.entities.Weather
import com.example.appweather.model.entities.getRussianCities
import com.example.appweather.model.entities.getWorldCities

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}