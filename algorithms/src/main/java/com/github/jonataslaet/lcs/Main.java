package com.github.jonataslaet.lcs;

public class Main {
    public static void main(String[] args) {
        String word = "blue";
        String word2 = "clues";
        System.out.println("Longest Common Substring = " + LongestCommonSubstring.getLCS(word, word2));
        System.out.println("Longest Common Subsequence = " + LongestCommonSubsequence.getLCS(word, word2));
    }
}
