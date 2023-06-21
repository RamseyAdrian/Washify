package com.kelompok2.washify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<ImageButton>(R.id.Login_btn)
        loginBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity, Home::class.java)
            startActivity(intent)
        }
    }

}