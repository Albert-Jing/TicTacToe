package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.provider.Settings.Global.getString
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnReset.setOnClickListener {
            binding.ticTacToe.resetGame()
        }
    }

    public fun setStatusText(message: String) {
        var meter = binding.cMeter
        stopTime()
        meter.base = SystemClock.elapsedRealtime()
        startTime()
        binding.tvStatus.text = message
    }


    fun startTime() {
        var meter = binding.cMeter
        meter.start()
    }
    fun stopTime() {
        var meter = binding.cMeter
        meter.stop()
    }


}

