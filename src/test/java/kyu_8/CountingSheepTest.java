package kyu_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CountingSheepTest {

    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    static Stream<Arguments> listOfSheep() {
        return Stream.of(
                Arguments.arguments(17, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("listOfSheep")
    public void testCountSheep(int expectedSheeps, int sheepToCount) {
        assertEquals("There are 17 sheep in total", expectedSheeps, new CountingSheep().countSheep(array1));
    }


}
