package com.github.jonataslaet.grokking_algorithms.knapsack;

import static java.lang.Integer.sum;

public class Knapsack {
    public static Integer getMaxValue(int [][] itemIdWeight, int [][] itemIdValue, int maxWeight) {
        int [][] matrix = new int[6][7];
        for (int itemId = 1; itemId <= 5; itemId++) {
            for(int weight = 1; weight <= maxWeight; weight++) {
                Integer currentItemWeight = getCurrentItemWeight(itemId, itemIdWeight);
                if (weight >= currentItemWeight) {
                    Integer currentItemValue = getCurrentItemValue(itemId, itemIdValue);
                    Integer previousMaxValue = getPreviousMaxValue(itemId, weight, matrix);
                    Integer valueRemaining = getValueRemaining(itemId, weight, currentItemWeight, matrix);
                    matrix[itemId][weight] = Math.max(previousMaxValue, sum(currentItemValue, valueRemaining));
                } else {
                    matrix[itemId][weight] = matrix[itemId-1][weight];
                }
            }
        }
        return matrix[5][6];
    }

    private static Integer getCurrentItemValue(int itemId, int[][] itemIdValue) {
        return itemIdValue[itemId][2];
    }

    private static Integer getValueRemaining(int i, int weight, Integer currentItemWeight, int[][] matrix) {
        return matrix[i-1][weight-currentItemWeight];
    }

    private static Integer getPreviousMaxValue(int i, int j, int[][] matrix) {
        return matrix[i-1][j];
    }

    private static Integer getCurrentItemWeight(int i, int [][] itemIdWeight) {
        return itemIdWeight[i][2];
    }
}
