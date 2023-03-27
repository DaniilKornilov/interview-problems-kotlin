package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidSudokuTest {
    @ParameterizedTest
    @MethodSource
    fun testIsValidSudoku(board: Array<CharArray>, expected: Boolean) {
        Assertions.assertEquals(expected, isValidSudoku(board))
    }

    fun testIsValidSudoku(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(getBoard('5'), true),
            Arguments.of(getBoard('8'), false),
        )
    }

    private fun getBoard(topLeft: Char): Array<CharArray> {
        return arrayOf(
            charArrayOf(topLeft, '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
        )
    }
}
