package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

public class YouReASquareTest {
    YouReASquare youReASquare = new YouReASquare();
    static Stream<Arguments> numbersToCheck() {
        return Stream.of(
                of(false, -1),
                of(true, 0),
                of(false, 3),
                of(true, 4),
                of(true, 25),
                of(false, 26)
        );
    }


    @ParameterizedTest
    @MethodSource("numbersToCheck")
    public void shouldWorkForSomeExamples(Boolean expected, int number) {
        Boolean result = youReASquare.isSquare(number);

        assertEquals(expected, result);

    }
}