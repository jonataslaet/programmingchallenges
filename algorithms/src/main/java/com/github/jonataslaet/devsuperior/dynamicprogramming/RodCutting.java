package com.github.jonataslaet.devsuperior.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class RodCutting {

    public static Integer getRodCutting(int n, int[] p) {
        Map<Integer, Integer> memo = new HashMap<>();
        int result = loadRodCutting(n, p, memo);
        return result;
    }

    private static Integer loadRodCutting(int n, int[] p, Map<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (memo.containsKey(n)) return memo.get(n);
        int result = -Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (n - i >= 0) {
                result = Math.max(loadRodCutting(n - i, p, memo) + p[i-1], result);
            }
        }
        memo.putIfAbsent(n, result);
        return result;
    }

    public static void main(String[] args) {
        int[] v = new int []{3, 4, 8};
//        int[] v = new int []{3, 4, 8, 10, 10, 11, 23, 23, 24, 25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3,
//            4, 8, 10, 10, 11, 23, 23, 24, 25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(getRodCutting(v.length, v));
    }
}
