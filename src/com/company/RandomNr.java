package com.company;

public class RandomNr {
    public static int randomIntRangeOf(int range ){
    int nr = 1 + (int) (Math.random() * range);
        return nr;
    }
    public static double randomDoubleRangeOf(int range ){
        double nr =  Math.random() * range;
        nr = Math.round(nr * 10.0) / 10.0;
        return nr;
    }
}
