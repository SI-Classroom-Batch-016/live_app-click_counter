package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.clickcounter.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout.TabGravity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding initialisieren
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Programmlogik

        binding.addBTN.setOnClickListener {
            score++
            binding.counterTV.text = "$score"
        }

        val tag1 = "MainActivity"
        val tag2 = "Score"
        Log.d("$tag1 _$tag2", "$score")

    }


    //    override fun onCreate(savedInstanceState: Bundle?) {
    //        super.onCreate(savedInstanceState)
    //        setContentView(R.layout.activity_main)
    //
    //        //Lade alle Views
    //        val counterTV = findViewById<TextView>(R.id.counterTV)
    //        val addBTN = findViewById<Button>(R.id.addBTN)
    //
    //
    //        addBTN.setOnClickListener {
    //            score++
    //            counterTV.text = "$score"
    //        }
    //    }
}