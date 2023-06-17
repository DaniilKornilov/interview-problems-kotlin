package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/unique-paths/

fun uniquePaths(m: Int, n: Int): Int {
    val grid = Array(m) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (i == 0 || j == 0) {
                grid[i][j] = 1
            } else {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1]
            }
        }
    }
    return grid[m - 1][n - 1]
}
