package com.github.jonataslaet.knapsack;

public class Main {
    public static void main(String[] args) {
        int [][] itemPositionWeight = Configuration.getItemIdWeight();
        int [][] itemPositionValue = Configuration.getItemIdValue();
        int maxWeight = 6;
        System.out.println("Max = " + Knapsack.getMaxValue(itemPositionWeight, itemPositionValue, maxWeight));
    }
}
