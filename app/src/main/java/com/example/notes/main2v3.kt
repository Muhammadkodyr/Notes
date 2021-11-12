package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class main2v3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2v3)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,maindont::class.java))
        }

        val check = findViewById<ImageView>(R.id.check)

        check.setOnClickListener{
            startActivity(Intent(this,main1::class.java))
        }

        val galleryOrange = findViewById<ImageView>(R.id.galleryOrange)

        galleryOrange.setOnClickListener{
            startActivity(Intent(this,main2::class.java))
        }

        val task = findViewById<ImageView>(R.id.task)

        task.setOnClickListener{
            startActivity(Intent(this,main2v1::class.java))
        }

        val list = findViewById<ImageView>(R.id.list)

        list.setOnClickListener{
            startActivity(Intent(this,main2v2::class.java))
        }
    }
}