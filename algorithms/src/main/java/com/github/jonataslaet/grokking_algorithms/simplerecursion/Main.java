package com.github.jonataslaet.grokking_algorithms.simplerecursion;

public class Main {
    public static void main(String[] args) {
        Integer num = 5;
        CountDown.getCountDown(num);
        System.out.println(num+"! = " + Factorial.getFactorial(num));
    }
}
