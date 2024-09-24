package com.piyush.a17_lottie_animation

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val checkAnimation = findViewById<LottieAnimationView>(R.id.checkAnimation)

        checkAnimation.setAnimation(R.raw.check_animation)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            checkAnimation.playAnimation()
        }
    }
}