package pilier2

import org.junit.Assert.assertEquals
import org.junit.Test


class ParseFodepTest {

    @Test
    fun testFodepParser() {
        val tester = ParseFodep()
        assertEquals("10 x 5 must be 50",
                "ep:EP01; feuillet:01; dispru:RA001; dispruPre:RA; dispruSuf:001; colone:01",
                tester.fodepParser("20171231CF-K-006EP0101SRA00101N# 00000000000.05625"))
    }

    @Test
    fun testDropOne() {
        val tester = ParseFodep()
        assertEquals("10 x 5 must be 50",
                "002",
                tester.dropOne("20171231CF-K-006EP0101SRA00101N# 00000000000.05625", percentage= .5))
    }
}

