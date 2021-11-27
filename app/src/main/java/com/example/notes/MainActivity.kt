package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.signUp)

        textView.setOnClickListener{
            startActivity(Intent(this,Main0::class.java))
        }

        val button = findViewById<Button>(R.id.signinButton)

        button.setOnClickListener{
            startActivity(Intent(this,Maindont::class.java))
        }

    }
}