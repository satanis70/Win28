package com.example.win28

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoadImage.load(constraintLayout = main_layout, this)
        button_start.setOnClickListener {
            startActivity(Intent(this, ActivityGame::class.java))
        }
    }
}