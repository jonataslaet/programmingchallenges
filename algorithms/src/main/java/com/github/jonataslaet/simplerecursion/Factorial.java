package com.github.jonataslaet.simplerecursion;

public class Factorial {

    public static Integer getFactorial(Integer num) {
        if (num < 2) {
            return num;
        }
        return num * getFactorial(num - 1);
    }
}
