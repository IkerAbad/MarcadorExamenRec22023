package com.example.marcadorexamenrec22023.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MarcadorViewModel : ViewModel() {

    private val _score = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _score

    fun increasePoints(points:Int){
        _score.value = _score.value!! + points
    }


}