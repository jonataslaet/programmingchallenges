package com.github.jonataslaet.devsuperior.dynamicprogramming;

public class Grid {

    public static Integer getCountPaths(int i, int j) {
        int[][] memo = new int[i+1][j+1];
        return countPaths(i, j, memo);
    }

    private static Integer countPaths(int i, int j, int[][] memo) {
        if (i == 0 || j == 0) {
            return 1;
        }
        if (memo[i][j] != 0) return memo[i][j];
        memo[i][j] = countPaths(i - 1, j, memo) + countPaths(i, j - 1, memo);
        return memo[i][j];
    }

    public static void main(String[] args) {
        int n = 10, m = 10;
        System.out.println(getCountPaths(n - 1, m - 1));
    }
}
