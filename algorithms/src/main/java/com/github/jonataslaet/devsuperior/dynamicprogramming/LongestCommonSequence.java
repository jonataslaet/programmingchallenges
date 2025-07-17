package com.github.jonataslaet.devsuperior.dynamicprogramming;

import java.util.Arrays;

public class LongestCommonSequence {

    public static Integer getLongestCommonSequence(String s1, String s2) {
        int[][] memo = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            Arrays.fill(memo[i], -1);
        }
        int result = loadLongestCommonSequence(s1, s2, s1.length()-1, s2.length()-1, memo);
        return result;
    }

    private static Integer loadLongestCommonSequence(String s1, String s2, Integer indS1, Integer indS2, int[][] memo) {
        if (indS1 < 0 || indS2 < 0) return 0;
        if (memo[indS1][indS2] != -1) return memo[indS1][indS2];
        if (s1.charAt(indS1) == s2.charAt(indS2)) {
            return 1 + loadLongestCommonSequence(s1, s2, indS1-1, indS2-1, memo);
        }
        memo[indS1][indS2] = Math.max(loadLongestCommonSequence(s1, s2, indS1-1, indS2, memo),
            loadLongestCommonSequence(s1, s2, indS1, indS2-1, memo));
        return memo[indS1][indS2];
    }

    public static void main(String[] args) {
//        String s1 = "mnbvcxzçlkjhgfdsapoiuytrewqabc";
//        String s2 = "aqwertyuiopasdfghjkllzxcvbnmbc";
        String s1 = "abpalczxcv";
        String s2 = "beac";

        System.out.println(getLongestCommonSequence(s1, s2));
    }
}
