package com.example.chamber_bahadrabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.EditText
import com.example.chamber_bahadrabi.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val screenWidth = displayMetrics.widthPixels
        val screenHeight = displayMetrics.heightPixels

        val editText = findViewById<EditText>(R.id.editTextPhone2)

        val desiredWidth = (screenWidth * 0.5).toInt()
        val desiredHeight = (screenHeight * 0.2).toInt()

        val params = editText.layoutParams
        params.width = desiredWidth
        params.height = desiredHeight
        editText.layoutParams = params
    }
}