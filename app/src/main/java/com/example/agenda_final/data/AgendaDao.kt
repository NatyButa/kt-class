package com.example.agenda_final.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.agenda_final.data.Agenda as Agenda


@Dao
interface AgendaDao{

    @Query("SELECT * FROM agendas ORDER BY memo_number")
    fun getAllAgenda(): LiveData<List<Agenda>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAgenda(agenda: Agenda):Long

    @Update
    fun updateAgenda(agenda:Agenda):Int

    @Delete
    fun deleteAgenda(ageda:Agenda):Int

}