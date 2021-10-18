package com.example.appweather.model.repository

import com.example.appweather.model.entities.City
import com.example.appweather.model.entities.Weather

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = City.getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = City.getWorldCities()
}