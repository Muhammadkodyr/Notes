package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,NoNotesActivity::class.java))
        }

        val check = findViewById<ImageView>(R.id.check)

        check.setOnClickListener{
            startActivity(Intent(this,MainPageActivity::class.java))
        }

        val taskOrange = findViewById<ImageView>(R.id.taskOrange)

        taskOrange.setOnClickListener{
            startActivity(Intent(this,AddNoteActivity::class.java))
        }

        val list = findViewById<ImageView>(R.id.list)

        list.setOnClickListener{
            startActivity(Intent(this,ListActivity::class.java))
        }

        val gall = findViewById<ImageView>(R.id.gallery)

        gall.setOnClickListener{
            startActivity(Intent(this,ImageActivity::class.java))
        }


    }
}