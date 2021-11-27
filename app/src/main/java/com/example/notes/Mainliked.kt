package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Mainliked : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainliked)

        val like = findViewById<ImageView>(R.id.heart)

        like.setOnClickListener{
            startActivity(Intent(this,Main1::class.java))
        }

        val plus = findViewById<ImageView>(R.id.plusnote)

        plus.setOnClickListener{
            startActivity(Intent(this,Main2::class.java))
        }

        val search = findViewById<ImageView>(R.id.searchloupe)

        search.setOnClickListener{
            startActivity(Intent(this,Mainsearch::class.java))
        }
    }
}