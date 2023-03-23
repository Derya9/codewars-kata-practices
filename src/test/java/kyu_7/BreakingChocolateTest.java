package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;


class BreakingChocolateTest {
    BreakingChocolate breakingChocolate = new BreakingChocolate();

    static Stream<Arguments> parameters() {
        return Stream.of(
                of(24, 5,5),
                of(0,1,1)
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void breakChocolate(long expected, long numberA, long numberB) {
        long result = breakingChocolate.breakChocolate(numberA, numberB);

        assertEquals(expected, result,
                "The answer for" +  numberA + "x" + numberB +  "should be" + expected);
    }
}
