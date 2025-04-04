package com.codewars.august.bouncingballs;

public class Main {
    public static void main(String[] args){
        double h = 3.0;
        double bounce = 0.66;
        double window = 1.5;
        int result = BouncingBall.bouncingBall(h, bounce, window);
        System.out.println("Result = " + result);
    }
}