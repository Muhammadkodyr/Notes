package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Main2v2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2v2)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,Maindont::class.java))
        }

        val listOrange = findViewById<ImageView>(R.id.listOrange)

        listOrange.setOnClickListener{
            startActivity(Intent(this,Main2::class.java))
        }

        val task = findViewById<ImageView>(R.id.task)

        task.setOnClickListener{
            startActivity(Intent(this,Main2v1::class.java))
        }

        val galle = findViewById<ImageView>(R.id.gallery)

        galle.setOnClickListener{
            startActivity(Intent(this,Main2v3::class.java))
        }

        val addnote = findViewById<ImageView>(R.id.addnote)

        addnote.setOnClickListener{
            startActivity(Intent(this,Main1::class.java))
        }


    }
}