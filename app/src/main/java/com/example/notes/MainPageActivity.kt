package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class MainPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        val imageView = findViewById<ImageView>(R.id.plusnote)

        imageView.setOnClickListener{
            startActivity(Intent(this,AddNoteActivity::class.java))
        }

        val note = findViewById<LinearLayout>(R.id.linearLayout14)

        note.setOnClickListener{
            startActivity(Intent(this,NoteViewActivity::class.java))
        }

        val like = findViewById<ImageView>(R.id.like)

        like.setOnClickListener{
            startActivity(Intent(this,LikedActivity::class.java))
        }

        val imageview = findViewById<ImageView>(R.id.searchloupe)

        imageview.setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }
    }
}