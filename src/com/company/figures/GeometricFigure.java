package com.company.figures;

import com.company.Bord;

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
    public int compareTo(GeometricFigure figure) {
        boolean xStart =  this.getXStartingValue() < figure.getXStartingValue();
        boolean xEnd = this.getXEndingValue() < figure.getXEndingValue();

        boolean yStart = this.getYStartingValue() < figure.getYStartingValue();
        boolean yEnd = this.getYEndingValue() < figure.getYEndingValue();

        if (xStart || xEnd){
            return 1;
        }
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
class Test{
    public static void main(String[] args) {
        Bord bord = new Bord(100,100);
        StartingPoint startingPoint = new StartingPoint(100,100);
        Square square = new Square(startingPoint,20,20);
        Circle circle = new Circle(startingPoint,3);

        System.out.println("Square start x att: "+square.getXStartingValue()+
                " end x att: "+square.getXEndingValue());

        System.out.println("Square start y att: "+square.getYStartingValue()+
                " end y att: "+square.getYEndingValue());


        System.out.println("\nCircle start x att: "+circle.getXStartingValue()+
                " end x att: "+circle.getXEndingValue());

        System.out.println("Circle start y att: "+circle.getYStartingValue()+
                " end y att: "+circle.getYEndingValue());

    }
}
