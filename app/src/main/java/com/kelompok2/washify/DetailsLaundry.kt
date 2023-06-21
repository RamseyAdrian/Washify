package com.kelompok2.washify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DetailsLaundry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_laundry)

        val checkoutButton = findViewById<Button>(R.id.Checkout_btn)
        checkoutButton.setOnClickListener {
            val intent = Intent(this@DetailsLaundry, Payment::class.java)
            startActivity(intent)
        }
    }
}