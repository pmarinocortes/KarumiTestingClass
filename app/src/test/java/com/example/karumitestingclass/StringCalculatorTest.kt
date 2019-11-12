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

    private val scenarios = listOf(
        Pair("", 0),
        Pair("1", 1),
        Pair("11,22", 33),
        Pair("1,2", 3)
    )
    
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

    private fun evaluateStringCalculator(input: String, expectedResult: Int) {
        val result = stringCalculator.add(input)
        assertEquals(expectedResult, result)
    }
}