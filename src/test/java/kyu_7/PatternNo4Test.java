package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class PatternNo4Test {
    PatternNo4 pattern = new PatternNo4();

    static Stream<Arguments> parameters() {
        return Stream.of(
                of(1,"1"),
                of(2, "\"12\\n2\""),
                of(5, "12345\n2345\n345\n45\n5"),
                of(0, ""),
                of(-25, ""),
                of(-59, "")
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void patternNo4Test(int givenNumber, String expected) {
        String result = pattern.pattern(givenNumber);

        assertEquals(expected, result );
    }
}