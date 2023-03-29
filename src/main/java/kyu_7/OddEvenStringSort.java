package kyu_7;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenStringSort {
    public String sortMyString(String s) {
        if(s.isEmpty()){
            return " ";
        }
        String evenString = IntStream.range(0, s.length())
                .filter(letter -> letter % 2 == 0)
                .mapToObj(s::charAt)
                .map(Objects::toString).
                collect(Collectors.joining());
        String oddString = IntStream.range(0, s.length())
                .filter(letter -> letter % 2 != 0)
                .mapToObj(s::charAt)
                .map(Objects::toString).
                collect(Collectors.joining());
        return oddString.length() == 0 ? evenString : evenString + " " + oddString;
    }
}

// Given a string s.
// You have to return another string such that even-indexed
// and odd-indexed characters of s are grouped and groups are space-separated (see sample below)
