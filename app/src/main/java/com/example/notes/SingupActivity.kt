package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SingupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val textView = findViewById<TextView>(R.id.signin)

        textView.setOnClickListener{
            startActivity(Intent(this,SignInActivity::class.java))
        }
        val button = findViewById<Button>(R.id.signupButton)

        button.setOnClickListener{
            startActivity(Intent(this,NoNotesActivity::class.java))
        }


    }
}