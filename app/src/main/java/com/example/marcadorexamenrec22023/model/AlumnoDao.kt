package com.example.marcadorexamenrec22023.model

import androidx.room.*

@Dao
interface AlumnoDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAlumno(vararg alumno: Alumno)

    @Delete
    fun deleteAlumno(alumno: Alumno)

    @Update
    fun updateAlumno(alumno: Alumno)

    @Query("SELECT * FROM alumnos")
    fun getAllAlumnos(): List<Alumno>

    @Query("DELETE FROM alumnos")
    fun deleteAllAlumnos()

    @Query("SELECT * FROM alumnos WHERE year = :nacimiento")
    fun getAlumnoByNacimiento(nacimiento: Int): List<Alumno>


}