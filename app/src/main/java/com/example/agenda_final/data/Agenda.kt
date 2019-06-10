package com.example.agenda_final.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "agendas")
data class Agenda(
    @PrimaryKey @ColumnInfo(name = "memo_number") val memo:Int,
    @ColumnInfo(name = "title")val title:String,
    @ColumnInfo(name = "body")val body:String,
    @ColumnInfo(name = "tag")val tag:String):Serializable{

}