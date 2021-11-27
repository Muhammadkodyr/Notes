package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imagetask = findViewById<ImageView>(R.id.task)

        imagetask.setOnClickListener{
            startActivity(Intent(this,Main2v1::class.java))
        }

        val imagelist = findViewById<ImageView>(R.id.list)

        imagelist.setOnClickListener{
            startActivity(Intent(this,Main2v2::class.java))
        }

        val imagegallery = findViewById<ImageView>(R.id.gallery)

        imagegallery.setOnClickListener{
            startActivity(Intent(this,Main2v3::class.java))
        }
        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,Maindont::class.java))
        }

        val addnote = findViewById<ImageView>(R.id.addnote)

        addnote.setOnClickListener{
            startActivity(Intent(this,Main1::class.java))
        }
    }
}