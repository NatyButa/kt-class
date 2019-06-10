package com.example.agenda_final.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.agenda_final.data.Agenda
import com.example.agenda_final.data.AgendaDatabase
import com.example.agenda_final.repository.AgendaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class AgendaViewModel(application: Application): AndroidViewModel(application){

    private val agendaRepository: AgendaRepository
    val allAgenda: LiveData<List<Agenda>>



    init{
        val agendaDao = AgendaDatabase.getDatabase(application).agendaDao()
        agendaRepository = AgendaRepository(agendaDao);
        allAgenda = agendaRepository.allAgenda()

    }



    fun insertAgenda(agenda: Agenda) = viewModelScope.launch (Dispatchers.IO ){
        agendaRepository.insertAgenda(agenda)

    }

    fun updateAgenda(agenda: Agenda) = viewModelScope.launch(Dispatchers.IO){
        agendaRepository.updateAgenda(agenda)

    }

    fun deleteAgenda(agenda: Agenda) = viewModelScope.launch(Dispatchers.IO){
        agendaRepository.deleteAgenda(agenda)

    }


}