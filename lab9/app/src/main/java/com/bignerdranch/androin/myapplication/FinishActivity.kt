package com.bignerdranch.androin.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    private lateinit var tw: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        tw = findViewById(R.id.textView)
        val data:Double = intent.getDoubleExtra("data", 0.0)
        tw.text = "$data"
    }
}