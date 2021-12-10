package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AddNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnote)

        val imagetask = findViewById<ImageView>(R.id.task)

        imagetask.setOnClickListener{
            startActivity(Intent(this,TaskActivity::class.java))
        }

        val imagelist = findViewById<ImageView>(R.id.list)

        imagelist.setOnClickListener{
            startActivity(Intent(this,ListActivity::class.java))
        }

        val imagegallery = findViewById<ImageView>(R.id.gallery)

        imagegallery.setOnClickListener{
            startActivity(Intent(this,ImageActivity::class.java))
        }
        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,NoNotesActivity::class.java))
        }
    }
}