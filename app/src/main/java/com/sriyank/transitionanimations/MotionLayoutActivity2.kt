package com.sriyank.transitionanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_motion_layout2.*

class MotionLayoutActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout2)

        textView3.setOnClickListener {
            Toast.makeText(this, "hhhhhhhhh", Toast.LENGTH_SHORT).show()
        }
    }
}