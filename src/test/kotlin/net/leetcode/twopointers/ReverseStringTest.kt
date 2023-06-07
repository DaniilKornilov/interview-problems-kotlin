package net.leetcode.twopointers

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ReverseStringTest {

    @Test
    fun testReverseString() {
        val charArray = charArrayOf('a', 'b', 'c', 'a', 'd')
        val charArrayExpected = charArray.reversedArray()
        reverseString(charArray)
        Assertions.assertThat(charArray).isEqualTo(charArrayExpected)
    }

}
