package com.example.karumitestingclass

class StringCalculator {
    fun add(number: String): Int =
        if (number.isEmpty()) {
            0
        } else {
            number.split(",", "\n").map { it.toInt() }.sum()
        }
}