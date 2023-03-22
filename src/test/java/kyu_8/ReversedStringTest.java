package kyu_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

public class ReversedStringTest {
    ReversedString reversedString = new ReversedString();

    static Stream<Arguments> parameters() {
        return Stream.of(
                of("dlrow", "world"),
                of("drow", "word"),
                of("123", "321"),
                of("a", "a"),
                of("aa", "aa"),
                of("ba", "ab"),
                of("1a", "a1")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void reversedStringTest(String expected, String stringToReverse) {
        String result = reversedString.solution(stringToReverse);

        assertEquals(expected, result);
    }
}