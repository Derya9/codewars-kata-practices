package kyu_8;

import static java.lang.Math.abs;

public class ReturnNegative {
    public static int makeNegative(final int x) {
        return -abs(x);
    }
}

//In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

//Notes
//The number can be negative already, in which case no change is required.
//Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.