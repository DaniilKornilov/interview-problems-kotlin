package net.leetcode.arraysandhashing

//https://leetcode.com/problems/valid-sudoku/

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rowDigitsSets = mutableMapOf<Int, MutableSet<Char>>()
    val columnDigitsSets = mutableMapOf<Int, MutableSet<Char>>()
    val subBoxDigitsSets = mutableMapOf<Pair<Int, Int>, MutableSet<Char>>()

    for (i in board.indices) {
        for (j in board.indices) {
            val char = board[i][j]
            if (char.isDigit()) {
                val subBoxKey = Pair(i / 3, j / 3)
                if (rowDigitsSets[i]?.contains(char) == true ||
                    columnDigitsSets[j]?.contains(char) == true ||
                    subBoxDigitsSets[subBoxKey]?.contains(char) == true
                ) {
                    return false
                }
                rowDigitsSets.getOrPut(i) { mutableSetOf() }.add(char)
                columnDigitsSets.getOrPut(j) { mutableSetOf() }.add(char)
                subBoxDigitsSets.getOrPut(subBoxKey) { mutableSetOf() }.add(char)
            }
        }
    }

    return true
}
