package com.company;

import com.company.figures.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollisionManagerApp {
    private final int RUN_APP = 1;
    private final int EXIT = 0;
    private int choiceMade = -1;
    private enum MenuOption {FIRST,SECOND}
    private MenuOption option = MenuOption.FIRST;
    private  Bord bord ;
    private List<GeometricFigure> figureList = new ArrayList<>();

    public CollisionManagerApp()  {

            while (choiceMade != 0){
            displayOptions(option);
            choiceMade =  UserInput.readInt();

            switch (choiceMade){
                case RUN_APP:
                runCollisionTest();
                break;
                case EXIT:
                    exitMassage();
                    choiceMade = 0;
                break;
                default:
                    notValidMassage();
                break;
            }
            option = MenuOption.SECOND;
        }
    }
    private void runCollisionTest(){

        bord = new Bord(100,100);
        figureList.clear();
//        createNewCircle();
//        System.out.printf("radius is : %d \n",(int)createNewCircle().getRadius());
//        System.out.printf("point x : %d \n", (int)createNewCircle().getStartingPoint().getX());
//        System.out.printf("point y : %d\n", (int)createNewCircle().getStartingPoint().getY());


        generateRandomFigures(4);

        figureList.size();
        Map<Integer,Double> figurePosition = new HashMap();
        for (GeometricFigure figure : figureList){
            figureList.indexOf(figure);
            figure.getStartingPointY();
            figure.getStartingPointX();
        }

    }
    private void generateRandomFigures(int figureNumber){
        int[] figuresId = {0,1,2,3};
        for (int i = 0; i < figureNumber ;i++){

            int randomIndex = RandomNr.randomIntRangeOf(3);
            switch (figuresId[randomIndex]){
                case 1:
                    figureList.add(createNewSquare());
                break;
                case 2:
                    figureList.add(createNewCircle());
                break;
                case 3:
                    figureList.add(createNewDot());
                break;
            }
        }
    }

    private Bord generateBord(){
        System.out.print("Write bord's size in mm :");
        int bordSize = UserInput.readInt();
        return bord = new Bord(bordSize,bordSize);
    }

    private Dot createNewDot(){
        StartingPoint startingPoint = new StartingPoint(bord.getHeight(),bord.getWeight());
        return  new Dot(startingPoint);
    }

    private Circle createNewCircle(){
        StartingPoint startingPoint = new StartingPoint(bord.getHeight(),bord.getWeight());
        Circle circle = new Circle(startingPoint, RandomNr.randomDoubleRangeOf(bord.getWeight()));


        while (isCircleLargerThanTable(circle)){
            startingPoint = new StartingPoint(bord.getHeight(),bord.getWeight());
            circle = new Circle(startingPoint, RandomNr.randomDoubleRangeOf(bord.getWeight()));
        }
       return circle;
    }

    private boolean isCircleLargerThanTable(Circle circle){

        double down =  circle.getStartingPointY() - circle.getRadius();
        double upp = circle.getStartingPointY() + circle.getRadius();

        boolean isShapeBigger = false;
        boolean isHigher = false;
        boolean isWidth = false;

        if ((down < 0 )||(upp > bord.getHeight())){
            isHigher = true;
        }

        double leftSide = circle.getStartingPointX() - circle.getRadius();
        double rightSide = circle.getStartingPointX() + circle.getRadius();

        if ((leftSide < 0 )||(rightSide > bord.getHeight())){
            isWidth = true;
        }

        if (isHigher || isWidth){
            isShapeBigger = true;
        }

        return  isShapeBigger;
    }

    private Square createNewSquare(){
        StartingPoint startingPoint = new StartingPoint(bord.getHeight(),bord.getWeight());
        int squareSize = RandomNr.randomIntRangeOf(bord.getWeight());
        boolean isxBigger = bord.getWeight() > (squareSize + startingPoint.getX());
        boolean isyBigger = bord.getWeight() > (squareSize + startingPoint.getY());

        if ((!isxBigger) || (!isyBigger) || (squareSize < 1)){
            boolean isBigger = true;

            while (isBigger){
                squareSize = RandomNr.randomIntRangeOf(bord.getWeight());
                isxBigger = bord.getWeight() > (squareSize + startingPoint.getX());
                isyBigger = bord.getWeight() > (squareSize + startingPoint.getY());
                if ((!isxBigger) || (!isyBigger)||(squareSize < 1)){
                    isBigger = true;
                }else {
                    isBigger = false;
                }
            }
        }
        return new Square(startingPoint,squareSize,squareSize);
    }

    private void displayOptions( MenuOption options){
            switch (options){
            case FIRST:
                System.out.printf("1. Run Collision Test\n" + "0 EXIT\n");
                break;
            case SECOND:
                System.out.printf("1.Repeat Collision Test\n" +
                        "0 EXIT\n");
                break;
        }
    }
    private void exitMassage(){
        System.out.println("Exiting.......");
    }
    private void notValidMassage(){
        System.out.println("Not a valid option !!!\n");
    }
}
