package kyu_8;

import java.util.Arrays;

public class CountingSheep {

    public int countSheep(Boolean[] arrayOfSheep) {
         return (int)Arrays.stream(arrayOfSheep)
                 .filter(Boolean::booleanValue).count();
    }

}
