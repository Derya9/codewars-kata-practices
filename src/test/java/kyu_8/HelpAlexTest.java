package kyu_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;


class HelpAlexTest {
    HelpAlex helpAlex = new HelpAlex();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("Great, now move on to tricks", 10),
                of("Keep at it until you get it", 5),
                of("Keep at it until you get it", 0));
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void hoopCount(String expectedResponse, int amountOfHoops) {
        String result = helpAlex.hoopCount(amountOfHoops);

        Assertions.assertEquals(expectedResponse, result);
    }

}