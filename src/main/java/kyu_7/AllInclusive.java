package kyu_7;

import java.util.List;
import java.util.stream.IntStream;

public class AllInclusive {
    public boolean containAllRots(String str, List<String> arr) {
        if (str.isEmpty()) {
            return true;
        }
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.substring(i) + str.substring(0, i))
                .allMatch(arr::contains);
        }

}