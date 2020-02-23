package com.company;

public class
GeometricFigure implements Comparable<GeometricFigure>, FigureSize{
    StartingPoint startingPoint;


    public GeometricFigure(StartingPoint startingPoint) {
        this.startingPoint = startingPoint;

    }
    public StartingPoint getStartingPoint() {
        return startingPoint;
    }


    @Override
    public int compareTo(GeometricFigure figure) {

        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
