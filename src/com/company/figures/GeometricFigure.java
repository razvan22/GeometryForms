package com.company.figures;

import com.company.Bord;

public abstract class GeometricFigure implements Comparable<GeometricFigure>, FigurePosition{

    StartingPoint startingPoint;

    private int y;
    private int x;
    private double radius;

    public GeometricFigure(StartingPoint startingPoint){this.startingPoint = startingPoint;}

    public GeometricFigure(StartingPoint startingPoint, double radius) {
        this.startingPoint = startingPoint; this.radius = radius;
        }

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
        return Math.round(radius);
    }

    @Override
    public int compareTo(GeometricFigure figure) {

        boolean xStartValue =  this.getXStartingValue() >= figure.getXStartingValue()
                && this.getXStartingValue() <= figure.getXEndingValue();

        boolean xEndValue = this.getXEndingValue()>= figure.getXStartingValue()
                && this.getXStartingValue() <= figure.getXEndingValue();


        if (xStartValue || xEndValue){
            boolean collision = false;

            boolean yStartValue = this.getYStartingValue() >= figure.getYStartingValue()
                    && this.getYEndingValue() <= figure.getYEndingValue();

            boolean yEndValue = this.getYEndingValue() >= figure.getYStartingValue()
                    && this.getYEndingValue() <= figure.getYEndingValue();

            if (yStartValue || yEndValue){
                collision = true;
            }

            if (collision){
                System.out.println("COLLISION OCCURRED");
                System.out.println(getFigureType(this) +" start position x att: "+this.getXStartingValue()+
                        " end position x att: "+this.getXEndingValue());
                System.out.println( getFigureType(this)+" start position y att: " +this.getYStartingValue()+
                        " end position y att: "+this.getYEndingValue()+"\n");


                System.out.println( getFigureType(figure) +" start position x att: "+figure.getXStartingValue()+
                        " end position x att: "+figure.getXEndingValue());
                System.out.println( getFigureType(figure)+" start position Y att: " +figure.getYStartingValue()+
                        " end position y att: "+figure.getYEndingValue());



                System.out.println("=========================================================\n");
                return 1;
            }
        }

        return 0;

    }
    private String getFigureType(GeometricFigure figure){
        String figureType = figure.getClass().toString();
        figureType = figureType.replace("class com.company.figures."," ");
        return figureType;
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

