package com.example.appweather.model.repository

import com.example.appweather.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(lat: Double, lon: Double): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}