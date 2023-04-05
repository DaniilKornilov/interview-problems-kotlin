package net.leetcode.stack

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GenerateParenthesesTest {

    @ParameterizedTest
    @MethodSource
    fun testGenerateParenthesis(n: Int, expected: List<String>) {
        Assertions.assertEquals(expected, generateParenthesis(n))
    }

    fun testGenerateParenthesis(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(3, listOf("((()))", "(()())", "(())()", "()(())", "()()()")),
            Arguments.of(1, listOf("()")),
        )
    }

}
