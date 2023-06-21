package com.kelompok2.washify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val homeNavButton = findViewById<Button>(R.id.profile_to_home_btn)
        homeNavButton.setOnClickListener {
            val intent = Intent(this@Profile, Home::class.java)
            startActivity(intent)
        }
    }
}