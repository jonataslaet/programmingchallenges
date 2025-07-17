package com.github.jonataslaet.devsuperior.dynamicprogramming;

public class MaximumContiguousSum {

    public static Integer getMaximumContiguousSubarraySum(int[] v) {
        return getKadaneSum(v);
    }

    private static Integer getKadaneSum(int[] v) {
        int maxSum = v[0];
        int currentSum = v[0];
        for (int i = 1; i < v.length; i++) {
            currentSum = Math.max(currentSum + v[i], v[i]);
            if (currentSum > maxSum) maxSum = currentSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] v = new int []{5, -10, 2, 3, 6, -5, 7, -20, 10};
        System.out.println(getMaximumContiguousSubarraySum(v));
    }
}
