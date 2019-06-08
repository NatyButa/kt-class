package com.example.agenda_final.repository

import androidx.lifecycle.LiveData
import com.example.agenda_final.data.Agenda
import com.example.agenda_final.data.AgendaDao


class AgendaRepository(private val agendaDao: AgendaDao){

    fun allAgenda() : LiveData<List<Agenda>> = agendaDao.getAllAgenda()

    fun insertAgenda(agenda: Agenda){
        agendaDao.insertAgenda(agenda)

    }

//    fun updateAgena(agenda:Agenda){
//        //to be done here
//    }
//    fun deleteAgenda()


}