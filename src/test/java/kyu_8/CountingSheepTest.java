package kyu_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

public class CountingSheepTest {

    CountingSheep countingSheep = new CountingSheep();

    static Stream<Arguments> parameters() {
        return Stream.of(
                of(0, new Boolean[]{}),
                of(0, new Boolean[]{null}),
                of(0, new Boolean[]{false}),
                of(0, new Boolean[]{false, false}),
                of(1, new Boolean[]{true}),
                of(1, new Boolean[]{true, false}),
                of(1, new Boolean[]{true, null}),
                of(2, new Boolean[]{true, true}),
                of(2, new Boolean[]{true, false, true, null})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testCountSheep(int expected, Boolean[] sheep) {
        int result = countingSheep.countSheep(sheep);

        assertEquals(expected, result);
    }
}
