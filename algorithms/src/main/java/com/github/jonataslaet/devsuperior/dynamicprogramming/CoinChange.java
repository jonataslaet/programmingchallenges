package com.github.jonataslaet.devsuperior.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    public static Integer getMinimumCoins(Integer value, Integer[] coins) {
        Map<Integer, Integer> memo = new HashMap<>();
        return loadMinimumCoins(value, coins, memo);
    }

    private static Integer loadMinimumCoins(Integer value, Integer[] coins, Map<Integer, Integer> memo) {
        if (memo.containsKey(value)) {
            return memo.get(value);
        }
        if (value == 0) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (value - coins[i] >= 0) {
                result = Math.min(result, 1 + loadMinimumCoins(value - coins[i], coins, memo));
            }
        }
        memo.put(value, result);
        return result;
    }

    public static void main(String[] args) {
        Integer v = 200;
        Integer[] coins = new Integer[]{7, 10, 1};
        System.out.println(getMinimumCoins(v, coins));
    }
}
