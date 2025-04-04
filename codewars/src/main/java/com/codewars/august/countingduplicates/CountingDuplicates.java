package com.codewars.august.countingduplicates;

import java.util.HashMap;
import java.util.Map;

//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for(Character letter: text.toCharArray()) {
            String capitalLetter = String.valueOf(letter).toUpperCase();
            map.putIfAbsent(capitalLetter, 0);
            map.computeIfPresent(capitalLetter, (k, v) -> v + 1);
            if (map.get(String.valueOf(letter).toUpperCase()) == 2) {
                count++;
            }
        }
        return count;
    }
}
