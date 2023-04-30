package net.leetcode.slidingwindow

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LongestRepeatingCharacterReplacementTest {

    @ParameterizedTest
    @MethodSource
    fun testCharacterReplacement(s: String, k: Int, expected: Int) {
        Assertions.assertEquals(expected, characterReplacement(s, k))
    }

    fun testCharacterReplacement(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("ABAB", 2, 4),
            Arguments.of("AABABBA", 1, 4),
        )
    }

}
