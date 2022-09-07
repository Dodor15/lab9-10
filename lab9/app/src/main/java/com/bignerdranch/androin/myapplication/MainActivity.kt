package com.bignerdranch.androin.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    private lateinit var first: EditText
    private lateinit var hig:EditText
    private lateinit var btn:Button
    private lateinit var radioButton: RadioButton
    private lateinit var radioButton2: RadioButton
    private lateinit var radioButton3: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first=findViewById(R.id.editTextNumberDecimal)
        hig=findViewById(R.id.editTextNumberDecimal2)
        btn=findViewById(R.id.button)
        radioButton=findViewById(R.id.radioButton)
        radioButton2=findViewById(R.id.radioButton2)
        radioButton3=findViewById(R.id.radioButton3)
        if (radioButton.isChecked==true)
        {
            hig.isEnabled(setVisible(true))
            val once= first.text.toString().toDouble()
            val second=hig.text.toString().toDouble()
            val finish=0.5*once*second
        }
        if (radioButton2.isChecked==true)
        {
            hig.isEnabled=false
        }

    }


}