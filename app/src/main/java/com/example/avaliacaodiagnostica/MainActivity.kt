package com.example.avaliacaodiagnostica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.avaliacaodiagnostica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btConfirmar.setOnClickListener {
            val note = binding.editnome.text.toString()
            binding.txtResultad0.text = note
        }
    }
}
