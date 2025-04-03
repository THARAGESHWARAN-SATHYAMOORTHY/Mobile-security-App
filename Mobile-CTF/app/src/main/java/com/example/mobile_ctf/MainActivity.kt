package com.example.mobile_ctf

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.challenge1Btn).setOnClickListener {
            startActivity(Intent(this, Challenge1Activity::class.java))
        }

        findViewById<Button>(R.id.challenge2Btn).setOnClickListener {
            startActivity(Intent(this, Challenge2Activity::class.java))
        }

        findViewById<Button>(R.id.challenge3Btn).setOnClickListener {
            startActivity(Intent(this, Challenge3Activity::class.java))
        }

        findViewById<Button>(R.id.challenge4Btn).setOnClickListener {
            startActivity(Intent(this, Challenge4Activity::class.java))
        }

        findViewById<Button>(R.id.challenge5Btn).setOnClickListener {
            startActivity(Intent(this, Challenge5Activity::class.java))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}