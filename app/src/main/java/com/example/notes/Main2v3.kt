package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Main2v3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2v3)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,Maindont::class.java))
        }



        val galleryOrange = findViewById<ImageView>(R.id.galleryOrange)

        galleryOrange.setOnClickListener{
            startActivity(Intent(this,Main2::class.java))
        }

        val task = findViewById<ImageView>(R.id.task)

        task.setOnClickListener{
            startActivity(Intent(this,Main2v1::class.java))
        }

        val list = findViewById<ImageView>(R.id.list)

        list.setOnClickListener{
            startActivity(Intent(this,Main2v2::class.java))
        }

        val addnote = findViewById<ImageView>(R.id.addnote)

        addnote.setOnClickListener{
            startActivity(Intent(this,Main1::class.java))
        }
    }
}