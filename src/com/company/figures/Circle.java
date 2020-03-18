package com.company.figures;

public class Circle extends GeometricFigure {
    public Circle( StartingPoint startingPoint, double radius) {
        super(startingPoint, radius);
    }

    @Override
    public double getXStartingValue() {
        return getStartingPointX() - getRadius();
    }

    @Override
    public double getXEndingValue() {
        return getStartingPointX() + getRadius();
    }

    @Override
    public double getYStartingValue() {
        return getStartingPointY() - getRadius();
    }

    @Override
    public double getYEndingValue() {
        return getStartingPointY() + getRadius();
    }
}

