package com.company;

public class Bord {
    public static final int MAX_SIZE = Integer.MAX_VALUE;

    private int height;
    private int weight;

    public Bord(int height, int weight) {
        if ((height < 1)&&(height > MAX_SIZE)||(weight < 1)&&(weight > MAX_SIZE)){
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

    private void setHeight(int height) {
        this.height = height;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }
}
