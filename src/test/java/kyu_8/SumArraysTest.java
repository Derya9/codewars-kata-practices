package kyu_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class SumArraysTest {
    SumArray sumArray = new SumArray();

    public static Stream<Arguments> arraysToSummarize() {
        return Stream.of(
                of(0, new double[]{}),
                of(0, new double[]{0, 0.0}),
                of(6, new double[]{1, 2, 3}),
                of(6.6, new double[]{1.1, 2.2, 3.3}),
                of(-2.398, new double[]{-2.398}),
                of(9.2, new double[]{1, 5.2, 4, 0, -1}),
                of(320, new double[]{30, 89, 100, 101}));
    }

    @ParameterizedTest
    @MethodSource("arraysToSummarize")
    public void sumArrayTest(double expected, double[] numbers) {
        double result = sumArray.sum(numbers);

        assertEquals(expected, result, 1e-4);
    }
}