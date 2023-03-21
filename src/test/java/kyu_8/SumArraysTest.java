package kyu_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumArraysTest {

    public static Stream<Arguments> arraysToSummarize() {
        return Stream.of(
                Arguments.arguments(0, new double[]{}),
                Arguments.arguments(-2.398, new double[]{-2.398}),
                Arguments.arguments(6, new double[]{1, 2, 3}),
                Arguments.arguments(6.6, new double[]{1.1, 2.2, 3.3}),
                Arguments.arguments(9.2, new double[]{1, 5.2, 4, 0, -1}),
                Arguments.arguments(320, new double[]{30, 89, 100, 101})
        );
    }

    @ParameterizedTest
    @MethodSource("arraysToSummarize")
    public void sumArrayTest(double expectedSum, double[] numbers) {
        assertEquals(expectedSum, SumArray.sum(numbers), 1e-4);
    }
}