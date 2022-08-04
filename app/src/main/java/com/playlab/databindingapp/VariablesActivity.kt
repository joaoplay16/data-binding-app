package com.playlab.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.playlab.databindingapp.databinding.ActivityVariablesBinding

class VariablesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVariablesBinding
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVariablesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.viewModel = myViewModel
        binding.lifecycleOwner = this


//        myViewModel.message.observe(this){
//            binding.textView.text = it
//        }

        binding.editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                myViewModel.setMessage(char.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }
}