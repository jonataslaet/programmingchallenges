package com.github.jonataslaet.grokking_algorithms.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(156, 141, 35, 94, 88, 61, 111));
        System.out.println(QuickSort.getOrderedNumbers(list));
    }
}
