package net.leetcode.twopointers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidPalindromeTest {

    @ParameterizedTest
    @MethodSource
    fun testIsPalindrome(s: String, expected: Boolean) {
        Assertions.assertEquals(expected, isPalindrome(s))
    }

    fun testIsPalindrome(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("A man, a plan, a canal: Panama", true),
            Arguments.of("race a car", false),
            Arguments.of(" ", true),
        )
    }

}
