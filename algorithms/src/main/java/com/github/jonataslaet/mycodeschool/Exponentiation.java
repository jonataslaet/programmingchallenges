package com.github.jonataslaet.mycodeschool;

import java.math.BigDecimal;

public class Exponentiation {

    public static BigDecimal pow(int x, int n) {
        if (n == 0) return BigDecimal.ONE;
        if (n % 2 == 0) {
            BigDecimal y = pow(x, n/2);
            return y.multiply(y);
        }
        return new BigDecimal(x).multiply(pow(x, n-1));
    }

    public static BigDecimal mod(int x, int n, int m) {
        BigDecimal M = new BigDecimal(m);
        if (n == 0) return BigDecimal.ONE;
        if (n % 2 == 0) {
            BigDecimal y = mod(x, n/2, m);
            return (y.multiply(y)).remainder(M);
        }
        BigDecimal X = new BigDecimal(x);
        return ((X.remainder(M)).multiply(mod(x, n-1, m))).remainder(M);
    }


}
