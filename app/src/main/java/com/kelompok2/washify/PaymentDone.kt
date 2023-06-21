package com.kelompok2.washify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PaymentDone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_done)

        val orderDoneBtn = findViewById<ImageButton>(R.id.order_done_btn)
        orderDoneBtn.setOnClickListener {
            val intent = Intent (this@PaymentDone, Home::class.java)
            startActivity(intent)
        }
    }
}