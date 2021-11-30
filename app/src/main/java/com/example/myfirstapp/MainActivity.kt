package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val HELLO_KEY = "hello"
private const val RANDOM_KEY = "random"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button
    lateinit var urlActivityButton: Button
    lateinit var randomActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)
        urlActivityButton = findViewById(R.id.url_button)
        randomActivityButton = findViewById(R.id.random_button)


        nextActivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY, "привет из первой")

            startActivity(secondActivityIntent)

            urlActivityButton.setOnClickListener {
                val googleLink = Uri.parse("https://google.com")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
                val chooser = Intent.createChooser(openBrowserIntent, "browser")
                startActivity(chooser)

                randomActivityButton.setOnClickListener {
                    val threeActivityIntent: Intent = Intent(this, ThreeActivity::class.java)
                    threeActivityIntent.putExtra(RANDOM_KEY, "тут рандом")

                    startActivity(threeActivityIntent)

                }
            }
        }

    }
}


