package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class main0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0)

        val textView = findViewById<TextView>(R.id.signin)

        textView.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        val button = findViewById<Button>(R.id.signupButton)

        button.setOnClickListener{
            startActivity(Intent(this,maindont::class.java))
        }


    }
}