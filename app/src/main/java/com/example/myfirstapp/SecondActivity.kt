package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val HELLO_KEY = "hello"

class SecondActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView = findViewById(R.id.hello_text_view)

        val helloValua:String? = intent.extras?.getString(HELLO_KEY, "default")
        helloTextView.text = helloValua
    }
}