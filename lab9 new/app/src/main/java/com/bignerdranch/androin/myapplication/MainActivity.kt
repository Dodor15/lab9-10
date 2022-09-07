package com.bignerdranch.androin.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
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
        hig.isEnabled = false
        first.isEnabled = false
        radioButton.setOnClickListener {
            hig.isEnabled = true
            first.isEnabled = true
        }
        radioButton2.setOnClickListener{
            hig.isEnabled = false
            first.isEnabled = true
        }
        radioButton3.setOnClickListener {
            hig.isEnabled = false
            first.isEnabled = true
        }
        btn.setOnClickListener {
            if (first.text.toString()!=""&&hig.text.toString()!="") {
                if (radioButton.isChecked == true) {
                    val once = first.text.toString().toDouble()
                    val second = hig.text.toString().toDouble()
                    var finish = 0.5 * once * second
                    val intent = Intent(this, FinishActivity::class.java)
                    intent.putExtra("data", finish.toDouble())
                    startActivity(intent)
                } else if (radioButton2.isChecked == true) {
                    val once = first.text.toString().toDouble()
                    var finish = once * once
                    val intent = Intent(this, FinishActivity::class.java)
                    intent.putExtra("data", finish.toDouble())
                    startActivity(intent)
                } else if (radioButton3.isChecked == true) {
                    val once = first.text.toString().toDouble()
                    var finish = 3.14 * (once * once)
                    val intent = Intent(this, FinishActivity::class.java)
                    intent.putExtra("data", finish.toDouble())
                    startActivity(intent)
                }
            }
            else {
                Toast.makeText(this,"Не все поля заполнены",Toast.LENGTH_SHORT).show()
            }
        }



    }


}