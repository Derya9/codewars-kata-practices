package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class YouReASquareTest {
    static Stream<Arguments> numbersToCheck() {
        return Stream.of(
                Arguments.arguments(false, -1),
                Arguments.arguments(true, 0),
                Arguments.arguments(false, 3),
                Arguments.arguments(true, 4),
                Arguments.arguments(true, 25),
                Arguments.arguments(false, 26),
                Arguments.arguments(false, "24")
        );
    }


    @ParameterizedTest
    @MethodSource("numbersToCheck")
    public void shouldWorkForSomeExamples(Boolean expectedValue, int number) {
        assertEquals(expectedValue, YouReASquare.isSquare(number));

    }
}