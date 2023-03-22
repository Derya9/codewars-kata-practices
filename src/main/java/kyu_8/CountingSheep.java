package kyu_8;

import java.util.Arrays;
import java.util.Objects;

public class CountingSheep {

    public int countSheep(Boolean[] arrayOfSheep) {
         return (int)Arrays.stream(arrayOfSheep)
                 .filter(Objects::nonNull)
                 .filter(Boolean::booleanValue)
                 .count();
    }

}

//Consider an array/list of sheep where some sheep may be missing from their place.
//We need a function that counts the number of sheep present in the array (true means present).
//Hint: Don't forget to check for bad values like null/undefined
