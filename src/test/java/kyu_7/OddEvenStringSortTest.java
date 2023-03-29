package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class OddEvenStringSortTest {
    OddEvenStringSort oddEven = new OddEvenStringSort();

    static Stream<Arguments> parameters() {
        return Stream.of(
                of("Wleclgltihuebredrf ofsheesenasnegrof", "Wolfeschlegelsteinhausenbergerdorff"),
                of("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", "METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"),
                of("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"),
                of("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", "PSEUDOPSEUDOHYPOPARATHYROIDISM"),
                of("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", "FLOCCINAUCINIHILIPILIFICATION"),
                of("SBEMTGYHC UDRAOLPI", "SUBDERMATOGLYPHIC"),
                of(" ", "")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testSomething(String expected, String givenString) {
        String result = oddEven.sortMyString(givenString);

        assertEquals(expected, result);
    }

}