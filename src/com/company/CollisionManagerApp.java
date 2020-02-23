package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollisionManagerApp {

    private final int RUN_APP = 1;
    private final int EXIT = 0;
    private int choiceMade = -1;
    private enum MenuOption {FIRST,SECOND}
    private MenuOption option = MenuOption.FIRST;
    private  Bord bord ;
    private List<GeometricFigure> figureList = new ArrayList<>();

    public CollisionManagerApp() throws ClassNotFoundException {

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


        for (GeometricFigure figure : figureList){
          int count = 1 + figureList.indexOf(figure);
            String className = figure.getClass().toString().substring(18,figure.getClass().toString().length())+"."+count;
            System.out.println(className+"\n");
            System.out.printf("point y : %d \n", (int)figure.startingPoint.getY());
            System.out.printf("start point x : %d\n",(int) figure.startingPoint.getY());
            System.out.printf("size y: %d \n",figure.getSize());
            System.out.printf("size  x: %d\n\n",figure.getSize());
        }

    }
    private void generateRandomFigures(int figureNumber){
        int[] figuresId = {0,1,2,3};
        for (int i = 0; i < figureNumber ;i++){

            int randomIndex = RandomSize.randomSize(2);
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
        int radius = RandomSize.randomSize(bord.getWeight());

        boolean generateCircle = true;
        while (generateCircle){

            startingPoint = new StartingPoint(bord.getHeight(),bord.getWeight());
            radius = RandomSize.randomSize(bord.getWeight());



            while ((radius > startingPoint.getY())|| (radius > startingPoint.getX())){
                radius = RandomSize.randomSize(bord.getWeight());
            }

            boolean isYBigger =  (radius + (int)startingPoint.getY()) > bord.getHeight();
            boolean isXBigger = (radius + (int)  startingPoint.getX()) > bord.getWeight();

            if (isYBigger || isXBigger ){
                generateCircle = true;
            }else {
                generateCircle = false;
            }
        }

       return new Circle(startingPoint, radius);
    }

    private Square createNewSquare(){
        StartingPoint startingPoint = new StartingPoint(bord.getHeight(),bord.getWeight());
        int squareSize = RandomSize.randomSize(bord.getWeight());
        boolean isxBigger = bord.getWeight() > (squareSize + startingPoint.getX());
        boolean isyBigger = bord.getWeight() > (squareSize + startingPoint.getY());

        if ((!isxBigger) || (!isyBigger) || (squareSize < 1)){
            boolean isBigger = true;

            while (isBigger){
                squareSize = RandomSize.randomSize(bord.getWeight());
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
                System.out.printf("1. Run App\n" + "0 EXIT\n");
                break;
            case SECOND:
                System.out.printf("1.Repeat the Process\n" +
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
