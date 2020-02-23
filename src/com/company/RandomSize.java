package com.company;

public class RandomSize {
    public static int randomSize( int range ){
    int nr = 1 + (int) (Math.random() * range);
        return nr;
    }
}
