package com.github.jonataslaet.mycodeschool;

import java.math.BigDecimal;

public class Factorial {

    public static BigDecimal factorialWithRecursion(int n) {
        if (n == 0 || n == 1) return BigDecimal.ONE;
        if (n == 2) return BigDecimal.TWO;
        return new BigDecimal(n).multiply(factorialWithRecursion(n-1));
    }

    public static BigDecimal factorialWithoutRecursion(int n) {
        BigDecimal current = BigDecimal.ONE;

        for (int i = n; i >= 1; i--) {
            current = current.multiply(new BigDecimal(i));
        }

        return current;
    }
}
