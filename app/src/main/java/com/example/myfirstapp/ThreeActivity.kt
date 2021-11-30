package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

private const val RANDOM_KEY = "random"

class ThreeActivity : AppCompatActivity() {

    lateinit var randomTextView: TextView
    lateinit var three_randomTextView: TextView
    lateinit var three_randomTextButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        randomTextView = findViewById(R.id.random_text_view)
        three_randomTextView = findViewById(R.id.three_random_text_view)
        three_randomTextButton = findViewById(R.id.three_random_text_button)

        val randomValue: String? = intent.extras?.getString(RANDOM_KEY, "random defauld")
        randomTextView.text = randomValue

        newTextButtonClick()
    }

    fun newTextButtonClick() {

        three_randomTextButton.setOnClickListener {
            three_randomTextView.text = Random.nextInt().toString()

        }
    }
}