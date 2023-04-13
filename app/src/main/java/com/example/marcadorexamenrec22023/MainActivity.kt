package com.example.marcadorexamenrec22023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.marcadorexamenrec22023.databinding.ActivityMainBinding
import com.example.marcadorexamenrec22023.ui.MarcadorViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MarcadorViewModel by viewModels()
    // Binding object instance with access to the views in the game_fragment.xml layout
    private lateinit var binding: ActivityMainBinding
    var puntos = binding.puntos
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.marcadorViewModel = viewModel
        binding.lifecycleOwner = this



        binding.triple.setOnClickListener { viewModel.increasePoints(3) }
        binding.doble.setOnClickListener { viewModel.increasePoints(2) }
        binding.libre.setOnClickListener { viewModel.increasePoints(1) }


    }


    private fun updateScore() {
        //findViewById<TextView>(R.id.puntos).text = score.toString()
        viewModel.score.observe(this
        ) { score ->
            puntos.text = score.toString()
        }
    }
}