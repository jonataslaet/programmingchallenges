package com.github.jonataslaet.devsuperior.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Knapsack {

    public static Integer getKnapsack(int w, int[] weights, int[] values) {
        int[][] memo = new int[weights.length+1][w+1];
        for (int i = 0; i < weights.length+1; i++) {
            Arrays.fill(memo[i], -1);
        }
        int result = loadKnapsack(values.length, w, weights, values, memo);
        return result;
    }

    private static Integer loadKnapsack(int n, int w, int[] weights, int[] values, int[][] memo) {
        if (n <= 0 || w <= 0) return 0;
        if (memo[n][w] != -1) return memo[n][w];
        if (weights[n - 1] > w) {
            return loadKnapsack(n - 1, w, weights, values, memo);
        }
        int valueIncludedItemN = values[n - 1] + loadKnapsack(n - 1, w - weights[n - 1], weights, values, memo);
        int valueNotIncludedItemN = loadKnapsack(n - 1, w, weights, values, memo);
        memo[n][w] = Math.max(valueIncludedItemN, valueNotIncludedItemN);
        return memo[n][w];
    }

    public static void main(String[] args) {
//        int[] weights = new int []{1, 2, 3};
//        int[] values = new int []{6, 10, 12};
//        int w = 5;

//        int[] weights = new int[]{2, 3, 4, 5};
//        int[] values = new int[]{3, 4, 5, 6};
//        int w = 5;

//        int[] weights = new int[]{1, 3, 4, 5};
//        int[] values = new int[]{1, 4, 5, 7};
//        int w = 7;

//        int[] weights = new int[]{
//            2, 3, 4, 5, 9, 7, 3, 4, 6, 2,
//            5, 8, 1, 7, 6, 3, 4, 5, 2, 9
//        };
//        int[] values = new int[]{
//            3, 4, 8, 8, 10, 7, 5, 9, 12, 1,
//            7, 13, 2, 9, 11, 4, 6, 8, 3, 15
//        };
//        int w = 25;

        int[] weights = new int[]{
            2, 1, 5, 4, 4, 3, 2, 11, 2, 7,
            1, 1, 4, 4, 9, 1, 9, 4, 7, 4,
            10, 5, 13, 1, 3, 12, 3, 4, 6, 2,
            7, 2, 6, 14, 6, 10, 1, 8, 2, 2,
            5, 10, 6, 10, 4, 2, 1, 11, 4, 5,
            2, 2, 7, 5, 14, 6, 4
        };
        int[] values = new int[]{
            3, 20, 18, 8, 6, 15, 9, 18, 8, 11,
            13, 9, 7, 19, 11, 16, 13, 15, 18, 18,
            19, 14, 19, 12, 17, 16, 5, 6, 20, 13,
            13, 20, 15, 17, 9, 18, 18, 11, 10, 15,
            9, 17, 17, 20, 7, 12, 6, 18, 17, 20,
            11, 12, 10, 8, 19, 16, 18
        };
        int w = 300;

        System.out.println(getKnapsack(w, weights, values));
    }
}
