package kyu_7;

import java.util.stream.Stream;

public class ShortestWord {

    public int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

//Simple, given a string of words, return the length of the shortest word(s).
