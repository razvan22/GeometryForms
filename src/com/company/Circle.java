package com.company;

public class Circle extends GeometricFigure {
    private int radius;

    public Circle(StartingPoint startingPoint, int radius ) {
        super(startingPoint);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getSize() {
        return radius;
    }
}
