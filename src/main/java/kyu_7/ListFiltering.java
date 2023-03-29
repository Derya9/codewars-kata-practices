package kyu_7;


import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(i -> i instanceof Integer)
                .collect(Collectors.toList());
    }
}


// In this kata you will create a function that takes a list of non-negative integers
// and strings and returns a new list with the strings filtered out.
