package com.example.appweather.ui.history

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appweather.AppState
import com.example.appweather.model.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HistoryViewModel(
    private val repository: Repository
) : ViewModel() {
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData()

    fun getAllHistory() {
        historyLiveData.value = AppState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            historyLiveData.postValue(AppState.Success(repository.getAllHistory()))
        }
    }
}