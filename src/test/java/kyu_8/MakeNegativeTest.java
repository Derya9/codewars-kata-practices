package kyu_8;

import kyu_8.ReturnNegative;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;

public class MakeNegativeTest{

    static Stream<Arguments> numbersToNegative() {
        return Stream.of(
                Arguments.arguments(1, -1),
                Arguments.arguments(-5, -5),
                Arguments.arguments(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersToNegative")
    void makeNegativeTest(int startNumber, int negativeNumber) {
        assertEquals(negativeNumber ,ReturnNegative.makeNegative(startNumber));
    }
}
