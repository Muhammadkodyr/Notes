package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,NoNotesActivity::class.java))
        }

        val check = findViewById<ImageView>(R.id.check)

        check.setOnClickListener{
            startActivity(Intent(this,MainPageActivity::class.java))
        }

        val galleryOrange = findViewById<ImageView>(R.id.galleryOrange)

        galleryOrange.setOnClickListener{
            startActivity(Intent(this,AddNoteActivity::class.java))
        }

        val task = findViewById<ImageView>(R.id.task)

        task.setOnClickListener{
            startActivity(Intent(this,TaskActivity::class.java))
        }

        val list = findViewById<ImageView>(R.id.list)

        list.setOnClickListener{
            startActivity(Intent(this,ListActivity::class.java))
        }
    }
}