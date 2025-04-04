package com.github.jonataslaet.grokking_algorithms.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Integer> getOrderedNumbers(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }
        else if (numbers.size() == 2) {
            if (numbers.get(0) > numbers.get(1)) {
                int help = numbers.get(0);
                numbers.set(0, numbers.get(1));
                numbers.set(1, help);
                return numbers;
            }
        } else {
            int pivot = (numbers.size() / 2);
            List<Integer> leftList = new ArrayList<>();
            List<Integer> rightList = new ArrayList<>();
            for (Integer number : numbers) {
                if (number < numbers.get(pivot)) {
                    leftList.add(number);
                } else if (number > numbers.get(pivot)) {
                    rightList.add(number);
                }
            }
            List<Integer> newList = new ArrayList<>();
            newList.addAll(getOrderedNumbers(leftList));
            newList.add(numbers.get(pivot));
            newList.addAll(getOrderedNumbers(rightList));
            return newList;
        }
        return numbers;
    }
}
