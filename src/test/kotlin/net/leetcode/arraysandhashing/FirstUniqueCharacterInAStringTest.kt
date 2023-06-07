package net.leetcode.arraysandhashing

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FirstUniqueCharacterInAStringTest {

    @ParameterizedTest
    @MethodSource
    fun testFirstUniqChar(s: String, expected: Int) {
        Assertions.assertThat(firstUniqChar(s)).isEqualTo(expected)
    }

    fun testFirstUniqChar(): Stream<Arguments> {
        return Stream.of(
            Arguments.of("leetcode", 0),
            Arguments.of("loveleetcode", 2),
            Arguments.of("aabb", -1),
        )
    }

}
