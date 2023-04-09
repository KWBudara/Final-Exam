package com.test.finalexamination

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        val viewModel:UserViewModel by viewModels()

        private fun viewModels(): Any {

        }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

            binding.vieModel = viewModel
            binding.lifecycleOwner = this

            binding.button.setOnClickListener {
                viewModel.getUsers()
            }
}

        class DataBindingUtil {

        }

        class ActivityMainBinding {

            lateinit var lifecycleOwner: MainActivity.MainActivity
        }

        class UserViewModel {
            fun getUsers() {
                TODO("Not yet implemented")
            }

        }
