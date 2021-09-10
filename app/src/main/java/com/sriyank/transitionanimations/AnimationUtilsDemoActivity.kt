package com.sriyank.transitionanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_interpolator.*


class AnimationUtilsDemoActivity : AppCompatActivity() {
    private lateinit var anim: AnimationUtils
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpolator)

        val animation = AnimationUtils.loadAnimation(this, R.anim.fall_in)

        button2.setOnClickListener {
            button2.startAnimation(animation)
        }
    }
}