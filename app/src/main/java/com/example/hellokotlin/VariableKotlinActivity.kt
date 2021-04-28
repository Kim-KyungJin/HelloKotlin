package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickCount = 0
    val startTime = System.currentTimeMillis()

    //var elapsedSeconds : Long = ((System.currentTimeMillis() - startTime) / 1000.0).toLong()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)

        btnClickMe.setOnClickListener {
            clickCount++
            txtCountBtnClicks.text = "Button clicks: " + clickCount
            var elapsedSeconds : Long = ((System.currentTimeMillis() - startTime) / 1000.0).toLong()
            txtElapsedTime.setText("${elapsedSeconds} seconds elapsed")

        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime)
        txtActivityStartTime.text = "Activity start time: ${timeText}"
        txtActivityStartTime.text = "Activity start time: " + timeText
    }
}