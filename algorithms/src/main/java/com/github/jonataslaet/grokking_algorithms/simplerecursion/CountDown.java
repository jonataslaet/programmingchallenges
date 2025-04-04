package com.github.jonataslaet.grokking_algorithms.simplerecursion;

import java.util.Objects;

public class CountDown {

    public static void getCountDown(Integer number) {
        if (Objects.equals(number, 1)) {
            System.out.println(number);
            return;
        }
        System.out.println(number);
        getCountDown(number-1);
    }
}
