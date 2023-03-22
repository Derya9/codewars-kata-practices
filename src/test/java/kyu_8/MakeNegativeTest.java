package kyu_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {
    ReturnNegative returnNegative = new ReturnNegative();

    @ParameterizedTest
    @CsvSource({"-1,1", "-5,-5", "0,0"})
    void makeNegativeTest(int expected, int startNumber) {
        int result = returnNegative.makeNegative(startNumber);

        assertEquals(expected, result);
    }
}
