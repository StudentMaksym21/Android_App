package com.example.maksym_nadvornyi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.maksym_nadvornyi.CredentialsManager


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvRegisterNow = findViewById<TextView>(R.id.tvRegisterNow)

        val credentialsManager = CredentialsManager()

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (!credentialsManager.isEmailValid(email)) {
                Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show()
            } else if (!credentialsManager.isPasswordValid(password)) {
                Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show()
            } else {
                // Assuming a successful login with dummy credentials
                if (email == "user@example.com" && password == "password123") {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, NextActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }

        tvRegisterNow.setOnClickListener {
            // Open the registration activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}

