package com.github.jonataslaet.lcs;

public class LongestCommonSubstring {
    public static Integer getLCS(String firstWord, String secondWord) {
        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();
        char[] w1 = firstWord.toCharArray();
        char[] w2 = secondWord.toCharArray();
        int [][] grid = new int[1+firstWordLength][1+secondWordLength];
        int maxValue = grid[0][0];
        for (int i = 1; i <= firstWordLength; i++) {
            for(int j = 1; j <= secondWordLength; j++) {
                if (w1[i-1] == w2[j-1]) {
                    grid[i][j] = grid[i-1][j-1] + 1;
                    maxValue = Math.max(grid[i][j], maxValue);
                }
            }
        }
        return maxValue;
    }
}
