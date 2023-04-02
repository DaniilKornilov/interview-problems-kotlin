package net.leetcode.stack

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource
    fun testIsValid(s: String, expected: Boolean) {
        Assertions.assertEquals(expected, isValid(s))
    }

    fun testIsValid(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("()", true),
            Arguments.of("()[]{}", true),
            Arguments.of("(]", false),
            Arguments.of("([)]", false),
            Arguments.of("{[]}", true),
        )
    }

}
