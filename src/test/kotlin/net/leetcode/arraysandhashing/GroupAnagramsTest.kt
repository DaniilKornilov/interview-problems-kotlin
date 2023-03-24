package net.leetcode.arraysandhashing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GroupAnagramsTest {

    @ParameterizedTest
    @MethodSource
    fun testGroupAnagrams(strs: Array<String>, expected: List<List<String>>) {
        assertThat(expected).containsExactlyInAnyOrderElementsOf(groupAnagrams(strs))
    }

    fun testGroupAnagrams(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(
                arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
                listOf(listOf("bat"), listOf("tan", "nat"), listOf("eat", "tea", "ate"))
            ),
            Arguments.of(
                arrayOf(""),
                listOf(listOf(""))
            ),
            Arguments.of(
                arrayOf("a"),
                listOf(listOf("a"))
            ),
        )
    }

}
