package com.company.figures;

import com.company.RandomNr;

public class StartingPoint {
    private double y;
    private double x;

    public StartingPoint(int startY, int startX) {
        if (( startY < 0)||( startX < 0 )){
            throw  new IllegalArgumentException("The minim size must be greater or equal with 1  ");
        }else {
            this.y =  RandomNr.randomIntRangeOf(startY);
            this.x = RandomNr.randomIntRangeOf(startX);
        }
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

}
