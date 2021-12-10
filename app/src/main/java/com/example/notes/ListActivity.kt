package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,NoNotesActivity::class.java))
        }

        val check = findViewById<ImageView>(R.id.check)

        check.setOnClickListener{
            startActivity(Intent(this,MainPageActivity::class.java))
        }

        val listOrange = findViewById<ImageView>(R.id.listOrange)

        listOrange.setOnClickListener{
            startActivity(Intent(this,AddNoteActivity::class.java))
        }

        val task = findViewById<ImageView>(R.id.task)

        task.setOnClickListener{
            startActivity(Intent(this,TaskActivity::class.java))
        }

        val galle = findViewById<ImageView>(R.id.gallery)

        galle.setOnClickListener{
            startActivity(Intent(this,ImageActivity::class.java))
        }
    }
}