package com.example.agenda_final.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.io.Serializable



@Entity(foreignKeys = [ForeignKey(
    entity = Agenda::class,
    parentColumns = ["memo_number"],
    childColumns = ["id"]
)]
)

data class Participant(
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "Id")val partId:Int,
    @ColumnInfo(name = "firstName") val firstName:String,
    @ColumnInfo(name = "middleName")val middleName:String,
    @ColumnInfo(name = "lastName")val lastName:String): Serializable {

}