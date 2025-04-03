package com.example.mobile_ctf

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Challenge1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_challenge1)

        val challengeTitle = findViewById<TextView>(R.id.challengeTitle)
        val challengeDescription = findViewById<TextView>(R.id.challengeDescription)
        val downloadLink = findViewById<TextView>(R.id.downloadLink)

        challengeTitle.text = "Challenge 1: Nekko Nekko"
        challengeDescription.text = "I found a cool android app to play with a cowboy cat! There's has to be more going on with the app I can't see on my screen ..."

        val challengeUrl = "https://drive.google.com/file/d/1EnyEDeot5CIv4z-wA8sPxht5AnbMiJoA/view?usp=drive_link"
        downloadLink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(challengeUrl))
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}