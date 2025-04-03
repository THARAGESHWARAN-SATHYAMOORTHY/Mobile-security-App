package com.example.mobile_ctf

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Challenge2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_challenge1)

        val challengeTitle = findViewById<TextView>(R.id.challengeTitle)
        val challengeDescription = findViewById<TextView>(R.id.challengeDescription)
        val downloadLink = findViewById<TextView>(R.id.downloadLink)

        challengeTitle.text = "Challenge 3: Strum your strings #\$"
        challengeDescription.text = "Have you ever wanted to play the guitar on your phone ?? Here's a free app, with all guitar strings included for free !!!"

        val challengeUrl = "https://drive.google.com/uc?export=download&id=1w5lEAAzocdihuxUE36_I1ITjl5w-3Mtb"
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