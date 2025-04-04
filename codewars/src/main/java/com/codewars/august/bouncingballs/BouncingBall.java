package com.codewars.august.bouncingballs;

//https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        int r = 1;
        if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
            while (h * bounce > window) {
                r = r + 2;
                h = h * bounce;
            }
            return r;
        } else {
            return -1;
        }
    }
}
