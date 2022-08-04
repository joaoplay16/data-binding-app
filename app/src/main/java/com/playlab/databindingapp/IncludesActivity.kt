package com.playlab.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.playlab.databindingapp.databinding.ActivityIncludesBinding

class IncludesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIncludesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIncludesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User("Jong", "Fong", 32, true)

        binding.user = user
    }
}