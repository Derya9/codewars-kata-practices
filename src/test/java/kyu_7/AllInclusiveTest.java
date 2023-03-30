package kyu_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;


class AllInclusiveTest {
    AllInclusive allInclusive = new AllInclusive();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("", List.of(), true),
                of("", List.of("bsjq", "qbsj"), true),
                of("bsjq", List.of("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"), true),
                of("XjYABhR", List.of("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA","YABhRXj",
                        "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY"), false)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void containAllRotsTest(String givenString, List<String> givenList, Boolean expected) {
        Boolean result = allInclusive.containAllRots(givenString, givenList);

        assertEquals(expected, result);
    }
}