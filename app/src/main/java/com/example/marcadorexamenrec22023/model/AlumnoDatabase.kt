package com.example.marcadorexamenrec22023.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Alumno::class], version = 1)
abstract class AlumnoDatabase: RoomDatabase() {
    abstract fun alumnoDao(): AlumnoDao

    companion object{

        @Volatile
        private var INSTANCE: AlumnoDatabase? = null

        fun getInstance(context: Context): AlumnoDatabase{
            return INSTANCE ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    AlumnoDatabase::class.java,
                    "alumno_database")
                    .allowMainThreadQueries()
                    .build()

            }
        }
    }
}