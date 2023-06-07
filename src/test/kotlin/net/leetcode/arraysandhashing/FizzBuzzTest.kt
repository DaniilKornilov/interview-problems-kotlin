package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FizzBuzzTest {

    @ParameterizedTest
    @MethodSource
    fun testFizzBuzz(n: Int, expected: List<String>) {
        Assertions.assertEquals(expected, fizzBuzz(n))
    }

    fun testFizzBuzz(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(3, listOf("1", "2", "Fizz")),
            Arguments.of(5, listOf("1", "2", "Fizz", "4", "Buzz")),
            Arguments.of(
                15,
                listOf(
                    "1",
                    "2",
                    "Fizz",
                    "4",
                    "Buzz",
                    "Fizz",
                    "7",
                    "8",
                    "Fizz",
                    "Buzz",
                    "11",
                    "Fizz",
                    "13",
                    "14",
                    "FizzBuzz"
                )
            ),
        )
    }

}
