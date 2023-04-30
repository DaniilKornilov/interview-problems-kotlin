package net.leetcode.slidingwindow

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindAllAnagramsInAStringTest {

    @ParameterizedTest
    @MethodSource
    fun testFindAnagrams(s: String, p: String, expected: List<Int>) {
        Assertions.assertEquals(expected, findAnagrams(s, p))
    }

    fun testFindAnagrams(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("cbaebabacd", "abc", listOf(0, 6)),
            Arguments.of("abab", "ab", listOf(0, 1, 2)),
        )
    }

}
