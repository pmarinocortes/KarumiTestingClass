package com.example.karumitestingclass

import java.util.*


class LogOut(val clock: Clock) {
    fun logOut(): Boolean {
        return clock.now().time.toInt()%2 == 0
    }
}

interface Clock {
    fun now(): Date
}

class SystemClock: Clock {
    override fun now() = Date()
}
