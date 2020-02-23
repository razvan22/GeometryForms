package com.company;

public class StartingPoint {
    private float y;
    private float x;

    public StartingPoint(int y, int xStartingPoint) {
        if ((y < 1)&&(y > Bord.MAX_SIZE)||(xStartingPoint < 1)&&(xStartingPoint > Bord.MAX_SIZE)){
            throw  new IllegalArgumentException("The minim size must be greater or equal with 1  ");
        }else {
            this.y =  RandomSize.randomSize(y);
            this.x = RandomSize.randomSize(xStartingPoint);
        }
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }
}
