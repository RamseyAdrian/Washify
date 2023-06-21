package com.kelompok2.washify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

        val processButton = findViewById<Button>(R.id.Pay_To_Done)
        processButton.setOnClickListener {
            val intent = Intent(this@Payment, PaymentDone::class.java)
            startActivity(intent)
        }
    }
}