package com.github.jonataslaet.devsuperior.dynamicprogramming;

import java.util.Arrays;

public class LongestIncresingSubsequence {

    public static Integer getLongestIncresingSubsequence(int[] v) {
        return loadLongestIncresingSubsequence(v);
    }

    private static Integer loadLongestIncresingSubsequence(int[] v) {
        int[] lis = new int[v.length];
        Arrays.fill(lis, 1);
        int s = 1;

        for (int n = 0; n < v.length; n++) {
            for (int k = 0; k < n; k++) {
                if (v[k] < v[n]) {
                    lis[n] = Math.max(lis[n], 1 + lis[k]);
                }
            }
            s = Math.max(s, lis[n]);
        }

        return s;
    }

    public static void main(String[] args) {
        int[] v1 = new int []{3, 1, 8, 2, 5};
        int[] v2 = new int []{10, 4, 5, 6, 5, 15, 2, 3};
        int[] v3 = new int []{3, 2, 1};
        System.out.println(getLongestIncresingSubsequence(v1));
        System.out.println(getLongestIncresingSubsequence(v2));
        System.out.println(getLongestIncresingSubsequence(v3));
    }
}
