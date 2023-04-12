package net.leetcode.slidingwindow

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource
    fun testLengthOfLongestSubstring(s: String, expected: Int) {
        Assertions.assertEquals(expected, lengthOfLongestSubstring(s))
    }

    fun testLengthOfLongestSubstring(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("abcabcbb", 3),
            Arguments.of("bbbbb", 1),
            Arguments.of("pwwkew", 3),
        )
    }

}
