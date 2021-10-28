package com.example.appweather.model.repository

import com.example.appweather.model.entities.City
import com.example.appweather.model.entities.Weather
import com.example.appweather.model.rest.WeatherRepo

class RepositoryImpl : Repository {

    override fun getWeatherFromServer(lat: Double, lon: Double): Weather {
        val dto = WeatherRepo.api.getWeather(lat, lon).execute().body()
        return Weather(
            temperature = dto?.fact?.temp ?: 0,
            feelsLike = dto?.fact?.feelsLike ?: 0,
            condition = dto?.fact?.condition
        )
    }

    override fun getWeatherFromLocalStorageRus() = City.getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = City.getWorldCities()
}