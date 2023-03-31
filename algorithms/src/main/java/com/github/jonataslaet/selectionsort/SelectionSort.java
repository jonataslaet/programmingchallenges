package com.github.jonataslaet.selectionsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelectionSort {
    public static List<Integer> getSelectionSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();

        while (!list.isEmpty()) {
            int removedItemId = list.remove(findSmallest(list));
            sortedList.add(removedItemId);
        }

        return sortedList;
    }

    private static int findSmallest(List<Integer> numbers) {
        int smallest_id = 0;
        int smallest = numbers.get(smallest_id);
        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
                smallest_id = i;
            }
        }
        return smallest_id;
    }
}
