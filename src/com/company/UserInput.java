package com.company;

import java.util.Scanner;

public class UserInput {

    public static int readInt(){
        int input = -2;

        try{
            return input = new  Scanner(System.in).nextInt();
        }catch (Exception e){
        }

        return input = new  Scanner(System.in).nextInt();
    }
}
