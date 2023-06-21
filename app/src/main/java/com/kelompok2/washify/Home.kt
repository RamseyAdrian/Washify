package com.kelompok2.washify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val washButton = findViewById<ImageButton>(R.id.WashIron_Btn)
        val historyButton = findViewById<ImageButton>(R.id.History_Btn)
        val dryButton = findViewById<ImageButton>(R.id.Dryclean_Btn)
        val ironButton = findViewById<ImageButton>(R.id.Ironing_Btn)
        val profileNavButton = findViewById<Button>(R.id.Home_toProfile_btn)

        washButton.setOnClickListener {
            val intent = Intent (this@Home, DetailsLaundry::class.java)
            startActivity(intent)
        }

        dryButton.setOnClickListener {
            val intent = Intent (this@Home, DetailsLaundry::class.java)
            startActivity(intent)
        }

        ironButton.setOnClickListener {
            val intent = Intent (this@Home, DetailsLaundry::class.java)
            startActivity(intent)
        }

        historyButton.setOnClickListener {
            val intent = Intent (this@Home, History::class.java)
            startActivity(intent)
        }

        profileNavButton.setOnClickListener {
            val intent = Intent (this@Home, Profile::class.java)
            startActivity(intent)
        }

    }
}