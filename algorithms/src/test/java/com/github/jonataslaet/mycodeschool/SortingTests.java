package com.github.jonataslaet.mycodeschool;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTests {

    @Test
    @Order(1)
    public void testSelectionSort() {
        List<Integer> v = Arrays.asList(2, 7, 4, 1, 5, 3);
        Sorting.selectionSort(v);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 7), v);
    }

}
