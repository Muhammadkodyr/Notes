package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Main2v1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2v1)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,Maindont::class.java))
        }

        val taskOrange = findViewById<ImageView>(R.id.taskOrange)

        taskOrange.setOnClickListener{
            startActivity(Intent(this,Main2::class.java))
        }

        val list = findViewById<ImageView>(R.id.list)

        list.setOnClickListener{
            startActivity(Intent(this,Main2v2::class.java))
        }

        val gall = findViewById<ImageView>(R.id.gallery)

        gall.setOnClickListener{
            startActivity(Intent(this,Main2v3::class.java))
        }

        val addnote = findViewById<ImageView>(R.id.addnote)

        addnote.setOnClickListener{
            startActivity(Intent(this,Main1::class.java))
        }


    }
}