package com.company.figures;

public class GeometricFigure implements Comparable<GeometricFigure>{

    StartingPoint startingPoint;

    private int y;
    private int x;
    private double size;

    public GeometricFigure(StartingPoint startingPoint){this.startingPoint = startingPoint;}
    public GeometricFigure(StartingPoint startingPoint, double size){this.startingPoint = startingPoint; this.size = size; }
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

    public double getSize() {
        return size;
    }

    @Override
    public int compareTo(GeometricFigure figure) {

        return 0;
    }
}
