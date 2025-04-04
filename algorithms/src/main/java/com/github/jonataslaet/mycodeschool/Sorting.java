package com.github.jonataslaet.mycodeschool;

import java.util.List;

public class Sorting {

    public static void selectionSort(List<Integer> v) {
        int iMin = 0;
        for (int i = 0; i < v.size() - 1; i++) {
            for (int j = i; j < v.size(); j++) {
                if (v.get(j) < v.get(iMin)) {
                    iMin = j;
                }
            }
            int temp = v.get(iMin);
            v.set(iMin, v.get(i));
            v.set(i, temp);
            int a = 1;
        }
    }
}
