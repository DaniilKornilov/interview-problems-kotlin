package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidAnagramTest {

    @ParameterizedTest
    @MethodSource
    fun testIsAnagram(s: String, t: String, expected: Boolean) {
        Assertions.assertEquals(expected, isAnagram(s, t))
    }

    fun testIsAnagram(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("anagram", "nagaram", true),
            Arguments.of("rat", "car", false),
        )
    }

}
