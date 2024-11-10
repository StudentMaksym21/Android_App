package com.example.maksym_nadvornyi

import org.junit.Test
import org.junit.Assert.assertEquals

class CredentialsManagerTest {

    private val credentialsManager = CredentialsManager()

    @Test
    fun givenEmptyEmail_thenReturnFalse() {
        val isEmailValid = credentialsManager.isEmailValid("")
        assertEquals(false, isEmailValid)
    }

    @Test
    fun givenInvalidEmailFormat_thenReturnFalse() {
        val isEmailValid = credentialsManager.isEmailValid("invalid_email")
        assertEquals(false, isEmailValid)
    }

    @Test
    fun givenProperEmail_thenReturnTrue() {
        val isEmailValid = credentialsManager.isEmailValid("user@example.com")
        assertEquals(true, isEmailValid)
    }

    @Test
    fun givenEmptyPassword_thenReturnFalse() {
        val isPasswordValid = credentialsManager.isPasswordValid("")
        assertEquals(false, isPasswordValid)
    }

    @Test
    fun givenValidPassword_thenReturnTrue() {
        val isPasswordValid = credentialsManager.isPasswordValid("password123")
        assertEquals(true, isPasswordValid)
    }
}
