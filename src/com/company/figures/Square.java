package com.company.figures;

public class Square extends GeometricFigure {

    public Square(StartingPoint startingPoint, int y, int x) {
        super(startingPoint, y, x);
    }

    @Override
    public double getXStartingValue() {
        return getStartingPointX();
    }

    @Override
    public double getXEndingValue() {
        return getStartingPointX() + getX();
    }

    @Override
    public double getYStartingValue() {
        return getStartingPointY();
    }

    @Override
    public double getYEndingValue() {
        return getStartingPointY() + getY();
    }
}
