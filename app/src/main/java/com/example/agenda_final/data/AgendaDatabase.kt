//package com.example.agenda_final.data
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//
//@Database(entities = arrayOf(Agenda::class),version = 1)
//abstract class AgendaDatabase: RoomDatabase(){
//
//    abstract fun agendaDao():AgendaDao
//
//    companion object{
//
//        @Volatile
//        private var INSTANCE: AgendaDatabase? = null
//
//        fun getDatabase(context: Context):AgendaDatabase{
//
//            val tempInstance = INSTANCE
//            if(tempInstance != null){
//                return tempInstance
//
//            }
//            synchronized(this){
//                val instance =  Room.databaseBuilder(
//                    context.applicationContext,
//                    AgendaDatabase::class.java,
//                    "Agenda_database"
//                ).build()
//
//                INSTANCE = instance
//                return instance
//            }
//        }
//
//    }
//}