package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val textView = findViewById<TextView>(R.id.signUp)

        textView.setOnClickListener{
            startActivity(Intent(this,SingupActivity::class.java))
        }

        val button = findViewById<Button>(R.id.signinButton)

        button.setOnClickListener{
            startActivity(Intent(this,NoNotesActivity::class.java))
        }

    }
}