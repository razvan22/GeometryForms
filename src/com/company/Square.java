package com.company;

public class Square extends GeometricFigure {
    private int y;
    private int x;

    public Square(StartingPoint startingPoint, int y, int x) {
        super(startingPoint);
        this.y = y;
        this.x = x;
    }

    @Override
    public StartingPoint getStartingPoint() {
        return super.getStartingPoint();
    }

    @Override
    public int getSize() {
    return y;
    }
}
