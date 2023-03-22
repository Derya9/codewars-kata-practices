package kyu_7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PatternNo4Test {

    static Stream<Arguments> numbersToPattern() {
        return Stream.of(
                Arguments.arguments(1,"1"),
                Arguments.arguments(2, "\"12\\n2\""),
                Arguments.arguments(5, "12345\n2345\n345\n45\n5"),
                Arguments.arguments(0, ""),
                Arguments.arguments(-25, ""),
                Arguments.arguments(-59, "")
        );
    }


    @ParameterizedTest
    @MethodSource("numbersToPattern")
    void patternNo4Test(int givenNumber, String actualPattern) throws Exception {
        assertEquals( PatternNo4.pattern( givenNumber ), actualPattern );
    }
}