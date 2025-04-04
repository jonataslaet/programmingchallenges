package com.github.jonataslaet.grokking_algorithms.knapsack;

/*
Fonte: Grokking Algorithms
Water, 3 lb, 10
Book, 1 lb, 3
Food, 2 lb, 9
Jacket, 2 lb, 5
Camera, 1 lb, 6
 */
public class Configuration {

    public static int[][] getItemIdWeight() {
        return new int[][]{{0, 0, 0}, {0, 1, 3}, {0, 1, 1}, {0, 2, 2}, {0, 3, 2}, {0, 4, 1}};
    }

    public static int[][] getItemIdValue() {
        return new int[][]{{0, 0, 0}, {0, 1, 10}, {0, 1, 3}, {0, 2, 9}, {0, 3, 5}, {0, 4, 6}};
    }
}
