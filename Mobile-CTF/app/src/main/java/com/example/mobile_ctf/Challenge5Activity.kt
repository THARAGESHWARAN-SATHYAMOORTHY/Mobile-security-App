package com.example.mobile_ctf

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Challenge5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_challenge1)

        val challengeTitle = findViewById<TextView>(R.id.challengeTitle)
        val challengeDescription = findViewById<TextView>(R.id.challengeDescription)
        val downloadLink = findViewById<TextView>(R.id.downloadLink)

        challengeTitle.text = "Challenge 5: Make your BUG %JUMP%"
        challengeDescription.text = "Buggy Jumpa is a new mobile game, that can be enjoyabale for both hackers and gamers ! There's a lot going on, can you get some of the games source code to see whats happening behind the scence !!!"

        val challengeUrl = "https://github.com/hafiz-ng/Beetlebug/blob/main/app/src/main/java/app/beetlebug/ctf/WebViewXSSActivity.java"
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