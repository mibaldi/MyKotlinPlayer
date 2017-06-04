package com.mibaldi.mykotlinplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mibaldi.mykotlinplayer.adapters.MediaAdapter
import com.mibaldi.mykotlinplayer.data.MediaItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.adapter = MediaAdapter(listOf(MediaItem("item1","url",MediaItem.Type.PHOTO),MediaItem("item2","url",MediaItem.Type.VIDEO),MediaItem("item3","url",MediaItem.Type.PHOTO)))

    }
}


