package com.github.jonataslaet.grokking_algorithms.simplerecursion;

public class Factorial {

    public static Integer getFactorial(Integer num) {
        if (num < 2) {
            return num;
        }
        return num * getFactorial(num - 1);
    }
}
