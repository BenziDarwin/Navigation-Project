package com.example.navigation.components

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigation.data.Graph
import com.example.navigation.data.Routine
import com.example.navigation.data.RoutineDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

class RoutineViewModel(private val routineDataSource: RoutineDataSource = Graph.routineRepo): ViewModel() {
    private val _state = MutableStateFlow(RoutineViewState())
    val state: StateFlow<RoutineViewState>
    get() = _state

    val routineList = routineDataSource.selectAll
    val title = MutableStateFlow(_state.value.title)
    val event = MutableStateFlow(_state.value.event)
    val action = MutableStateFlow(_state.value.action)
    init {
        _state.value = RoutineViewState()
    }


    fun insertRoutine(title: String, event: String) = viewModelScope.launch {
        routineDataSource.insertRoutine(title, event)
    }
    fun updateRoutine(title: String, action: String) = viewModelScope.launch {
        routineDataSource.updateRoutine(title, action)
    }
}

data class RoutineViewState(
    val title: String = "",
    val event: String = "",
    val action: String? = null,
)