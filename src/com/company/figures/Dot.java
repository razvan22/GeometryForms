package com.company.figures;

public class Dot extends GeometricFigure {
    public Dot(StartingPoint startingPoint) {
        super(startingPoint);
    }

    @Override
    public double getXStartingValue() {
        return getStartingPointX();
    }

    @Override
    public double getXEndingValue() {
        return getStartingPointX();
    }

    @Override
    public double getYStartingValue() {
        return getStartingPointY();
    }

    @Override
    public double getYEndingValue() {
        return getStartingPointY();
    }
}
