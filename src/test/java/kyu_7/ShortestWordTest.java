package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class ShortestWordTest {

    ShortestWord shortestWord = new ShortestWord();

    static Stream<Arguments> parameters() {
        return Stream.of(
                of(3, "bitcoin take over the world maybe who knows perhaps"),
                of(3, "turns out random test cases are easier than writing out basic ones"),
                of(2, "Let's travel abroad shall we"),
                of(0, "")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findShort(int expected, String givenString) {

        int result = shortestWord.findShort(givenString);

        assertEquals(expected, result);


    }
}