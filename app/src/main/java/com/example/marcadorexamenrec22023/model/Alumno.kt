package com.example.marcadorexamenrec22023.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "alumnos")
data class Alumno(

    @ColumnInfo(name = "surname")
    val apellido: String,
    @ColumnInfo(name = "dni")
    val dni: String,
    @ColumnInfo(name = "year")
    val nacimiento: String,
    @ColumnInfo(name = "repeat")
    val repetidor: Boolean,
    @ColumnInfo(name = "name")
    val nombre: String){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
