package com.example.karumitestingclass

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test
import java.util.*

class LogInLogOutTest {
    @Test
    fun returnTrueIfCorrectCredentials() {
        val result = LogIn().logIn("galicia", "llueve")
        assertTrue(result)
    }

    @Test
    fun returnTrueIfIncorrectCredentials() {
        val result = LogIn().logIn("gal", "hiu")
        assertFalse(result)
    }

    @Test
    fun returnTrueIFSecondIsEven() {
        val result = LogOut(FixedTimeClock(Date(222222))).logOut()
        assertTrue(result)
    }

    @Test
    fun returnFalseIfSecondIsOdd() {
        val result = LogOut(FixedTimeClock(Date(11111))).logOut()
        assertFalse(result)
    }
}

class FixedTimeClock(val now: Date): Clock {
    override fun now() = now
}