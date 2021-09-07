package com.sriyank.transitionanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.View
import androidx.transition.Scene
import androidx.transition.Transition
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var scene1:Scene
    private lateinit var scene2:Scene
    private lateinit var currentScene:Scene
    private lateinit var transition: Transition
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        scene1=Scene.getSceneForLayout(sceneRootFrameLayout,R.layout.scene1,this)
        scene2=Scene.getSceneForLayout(sceneRootFrameLayout,R.layout.scene2,this)

        scene1.enter()
        currentScene=scene1
        transition=androidx.transition.TransitionInflater.from(this).inflateTransition(R.transition.example_2)
    }

    fun onClick(view: View) {    // will be executed on click of root layout of activity_main.xml
        // Step 3: Call TransitionManager.go() to run animation

        currentScene = if (currentScene == scene1) {
            androidx.transition.TransitionManager.go(scene2,transition)
            scene2
        } else{
            androidx.transition.TransitionManager.go(scene1,transition)
            scene1
        }
    }
}