package com.codewars.august.pyramidslidedown;

//https://www.codewars.com/kata/551f23362ff852e2ab000037/train/java
public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        int [][] sum = new int[99][99];
        int size = pyramid.length;
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i == size - 1) sum[i][j] = pyramid[i][j];
                else sum[i][j] = pyramid[i][j]  + Math.max(sum[i+1][j], sum[i+1][j+1]);
            }
        }
        return sum[0][0];
    }
}
