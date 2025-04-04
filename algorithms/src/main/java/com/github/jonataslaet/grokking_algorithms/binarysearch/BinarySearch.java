package com.github.jonataslaet.grokking_algorithms.binarysearch;

import java.util.List;
import java.util.Objects;

public class BinarySearch {
    public static Integer getId(Integer target, int[] array) {

        int low_id = 0;
        int high_id = array.length - 1;

        while(low_id <= high_id) {
            int middle_id = (low_id + high_id) / 2;
            Integer item = array[middle_id];
            if (Objects.equals(target, item)) {
                return middle_id;
            }
            if (item < target) {
                low_id = middle_id + 1;
            } else {
                high_id = middle_id - 1;
            }
        }

        return null;
    }
}
