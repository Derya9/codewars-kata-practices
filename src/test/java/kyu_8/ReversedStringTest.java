package kyu_8;

import kyu_8.ReversedString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedStringTest {

    static Stream<Arguments> stringsToReverse() {
        return Stream.of(
                Arguments.arguments("dlrow", "world"),
                Arguments.arguments("drow", "word"),
                Arguments.arguments("123", "321")
        );
    }

    @ParameterizedTest
    @MethodSource("stringsToReverse")
    public void reversedStringTest(String expectedString, String stringToReverse) {
        assertEquals(expectedString, ReversedString.solution(stringToReverse));
    }
}