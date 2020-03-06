package com.company;

public class Bord {
    public static final int MAX_SIZE = Integer.MAX_VALUE;

    private int height;
    private int weight;

    public Bord(int height, int weight) {
        if ((height < 1) || (weight < 1) ){
           throw  new IllegalArgumentException("The minim size must be greater or equal with 1  ");
        }else {
            this.height = height;
            this.weight = weight;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
