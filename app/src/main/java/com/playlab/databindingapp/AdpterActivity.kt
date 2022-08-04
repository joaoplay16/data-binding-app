package com.playlab.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.playlab.databindingapp.databinding.ActivityAdpterBinding

class AdpterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdpterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAdpterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = DataModel(
            "Joao-san",
            "Android Dev",
            "https://i.postimg.cc/nr0fMmS3/Logo.png",
            points = 10
        )

        binding.dataModel = data
    }
}