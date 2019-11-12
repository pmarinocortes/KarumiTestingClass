package com.example.karumitestingclass

class StringCalculator {
    fun add(number: String): Int =

        if (number.isEmpty()) {
            0
        } else {
            number.split(",", "\n").map { it.toInt() }.sum()
        }

//    when {
//        number.isEmpty() -> 0
//        number.contains("-") -> throw CustomException()
//        else -> {
//            val replacedString = number.replace("\n", ",")
//        }
//        !number.contains(",") || !number.contains("\n") -> try {
//            number.toInt()
//        }catch (e: Exception) {
//            throw CustomException()
//        }
//        else -> number.split(",", "\n").map { it.toInt() }.sum()
//    }

}