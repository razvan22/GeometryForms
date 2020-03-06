package com.company.figures;

public abstract class GeometricFigure implements Comparable<GeometricFigure>, FigurePosition{

    StartingPoint startingPoint;

    private int y;
    private int x;
    private double radius;

    public GeometricFigure(StartingPoint startingPoint){this.startingPoint = startingPoint;}
    public GeometricFigure(StartingPoint startingPoint, double radius){this.startingPoint = startingPoint; this.radius = radius; }
    public GeometricFigure(StartingPoint startingPoint, int y, int x) {
        this.startingPoint = startingPoint;
        this.y = y;
        this.x = x;
    }

    public double getStartingPointX(){
        return startingPoint.getX();
    }

    public double getStartingPointY(){
        return startingPoint.getY();
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(GeometricFigure o) {
        return 0;
    }

    @Override
    public double getXStartingValue() {
        return 0;
    }

    @Override
    public double getXEndingValue() {
        return 0;
    }

    @Override
    public double getYStartingValue() {
        return 0;
    }

    @Override
    public double getYEndingValue() {
        return 0;
    }
}
