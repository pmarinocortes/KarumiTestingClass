package com.example.karumitestingclass

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StringCalculatorTest {
    private lateinit var stringCalculator: StringCalculator
    @Before
    fun setUp() {
        stringCalculator = StringCalculator()
    }

    @Test
    fun returnsZeroIfTheStringIsEmpty() {
        evaluateStringCalculator("", 0)
    }

    @Test
    fun returnsANumberIfTheStringIsNotEmpty() {
        evaluateStringCalculator("1", 1)
    }

    @Test
    fun returnsTheSumOfTheNumberSepareatedByComa() {
        evaluateStringCalculator("11,22", 33)
    }

    @Test
    fun returnsTheSumOfTheNumberSepareatedByComaWithSmallNumbers() {
        evaluateStringCalculator("1,2", 3)
    }

    @Test
    fun returnsTheSumOfTheNumberSepareatedByComaWith3Numbers() {
        evaluateStringCalculator("1,2,3", 6)
    }

    @Test
    fun returnsTheSumOfTheNumberSepareatedByNewLine() {
        evaluateStringCalculator("1\n2", 3)
    }
//
//    @Test(expected = CustomException::class)
//    fun returnsException() {
//        stringCalculator.add("1")
//    }
//
//    @Test(expected = CustomException::class)
//    fun returnsExceptionWithAPoint() {
//        stringCalculator.add("1.2")
//    }

    private fun evaluateStringCalculator(input: String, expectedResult: Int) {
        val result = stringCalculator.add(input)
        assertEquals(expectedResult, result)
    }
}