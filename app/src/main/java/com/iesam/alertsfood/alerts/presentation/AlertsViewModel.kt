package com.iesam.alertsfood.alerts.presentation

import androidx.lifecycle.ViewModel
import com.iesam.alertsfood.alerts.data.AlertDataRepository
import com.iesam.alertsfood.alerts.domain.Alert
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext

class AlertsViewModel: ViewModel() {
    private val _uiState = UiState()
    val uiState = _uiState
    val alertDataRepository = AlertDataRepository()

    fun getAlerts(){
        uiState.alerts =alertDataRepository.getAlerts()
    }
    fun getAlert(id:Int){
        uiState.alert = alertDataRepository.getAlert(id.toString())
    }


    data class UiState(
        var isLoading: Boolean = false,
        var alerts: List<Alert>? = null,
        var alert: Alert? = null,
        var error: Error? = null
    )
}