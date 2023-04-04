package net.leetcode.stack

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EvaluateReversePolishNotationTest {

    @ParameterizedTest
    @MethodSource
    fun testEvalRPN(tokens: Array<String>, expected: Int) {
        Assertions.assertEquals(expected, evalRPN(tokens))
    }

    fun testEvalRPN(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(arrayOf("2", "1", "+", "3", "*"), 9),
            Arguments.of(arrayOf("4", "13", "5", "/", "+"), 6),
            Arguments.of(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"), 22),
        )
    }

}
