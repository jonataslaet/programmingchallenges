package com.codewars.august.pyramidslidedown;

//https://www.codewars.com/kata/551f23362ff852e2ab000037/train/java
public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        int [][] pd = new int[999][999];
        int size = pyramid.length;
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i == size - 1) pd[i][j] = pyramid[i][j];
                else pd[i][j] = pd[i][j]  + Math.max(pd[i+1][j], pyramid[i+1][j+1]);
            }
        }
        return pd[0][0];
    }
}
