package com.akmal.git_api.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akmal.git_api.R
import com.akmal.git_api.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}