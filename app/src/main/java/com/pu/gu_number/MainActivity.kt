package com.pu.guess_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var ans = "8524"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.tv)
        var bt = findViewById<Button>(R.id.bt)
        var et = findViewById<EditText>(R.id.et)

        bt.setOnClickListener {
            var guess = et.text.toString()
            var nA = 0
            var nB = 0
            for (i in 0..3){
                for (j in 0..3){
                    if (ans.get(i) == guess.get(i))
                        nA ++
                    else
                        nB ++
                }
            }
            tv.text = nA.toString() + "A" + nB.toString() + "B"
        }

    }
}