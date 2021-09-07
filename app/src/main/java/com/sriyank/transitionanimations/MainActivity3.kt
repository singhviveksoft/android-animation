package com.sriyank.transitionanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button2.setOnClickListener {
            Toast.makeText(this,"hello", Toast.LENGTH_SHORT).show()
        }
    }
}