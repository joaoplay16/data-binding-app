package com.playlab.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.playlab.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User("Jong", "Doe", 32, true)
        binding.user = user
    }
}