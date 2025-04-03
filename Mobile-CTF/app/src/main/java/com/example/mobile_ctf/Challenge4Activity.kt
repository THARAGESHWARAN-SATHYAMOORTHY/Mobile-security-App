package com.example.mobile_ctf

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Challenge4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_challenge1)

        val challengeTitle = findViewById<TextView>(R.id.challengeTitle)
        val challengeDescription = findViewById<TextView>(R.id.challengeDescription)
        val downloadLink = findViewById<TextView>(R.id.downloadLink)

        challengeTitle.text = "Challenge 4: Cookie /@/"
        challengeDescription.text = "In order to eat the cookie, You need to click the cookie. But in reality we dont usually click the cookie !?!?!"

        val challengeUrl = "https://drive.google.com/uc?export=download&id=1t1QX75cSFPXvrvcVr1_DeaDY2nfTR63K"
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