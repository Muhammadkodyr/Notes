package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Maindont : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindont)

        val imageview = findViewById<ImageView>(R.id.searchloupe)

        imageview.setOnClickListener{
            startActivity(Intent(this,Mainsearch::class.java))
        }

        val imageView = findViewById<ImageView>(R.id.plusnote)

        imageView.setOnClickListener{
            startActivity(Intent(this,Main2::class.java))
        }

    }
}