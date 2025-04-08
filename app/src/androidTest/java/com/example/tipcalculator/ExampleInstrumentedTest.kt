package com.example.tipcalculator

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertEquals
import org.junit.Assert.*
import java.text.NumberFormat

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
//@RunWith(AndroidJUnit4::class)
class TipCalculatorTest {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        // Context of the app under test.
        val amount = 10.00
        val customTip = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, customTip = customTip, false)
        assertEquals(expectedTip, actualTip)
    }
}