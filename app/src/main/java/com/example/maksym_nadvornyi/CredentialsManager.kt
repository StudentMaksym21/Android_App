package com.example.maksym_nadvornyi

import android.util.Patterns

class CredentialsManager {

    fun isEmailValid(email: String): Boolean {
        return email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isPasswordValid(password: String): Boolean {
        return password.isNotEmpty() && password.length >= 6
    }
}
