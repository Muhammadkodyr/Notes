package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imagetask = findViewById<ImageView>(R.id.task)

        imagetask.setOnClickListener{
            startActivity(Intent(this,main2v1::class.java))
        }

        val imagelist = findViewById<ImageView>(R.id.list)

        imagelist.setOnClickListener{
            startActivity(Intent(this,main2v2::class.java))
        }

        val imagegallery = findViewById<ImageView>(R.id.gallery)

        imagegallery.setOnClickListener{
            startActivity(Intent(this,main2v3::class.java))
        }
        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,maindont::class.java))
        }
    }
}