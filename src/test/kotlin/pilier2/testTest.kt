package pilier2

import org.junit.Assert.assertEquals

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test

class SomeClassTest {

    @Test(expected = IllegalArgumentException::class)
    fun testExceptionIsThrown() {
        val tester = SomeClass()
        tester.multiply(1000, 5)
    }

    @Test
    fun testMultiply() {
        val tester = SomeClass()
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5).toLong())
    }
}
