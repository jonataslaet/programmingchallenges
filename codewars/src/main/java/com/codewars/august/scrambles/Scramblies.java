package com.codewars.august.scrambles;

import java.util.HashMap;
import java.util.Map;

//https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        int x = 0;
        for (Character c: str1.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (k, v) -> v + 1);
        }
        for (Character c: str2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            if (map.get(c) > 0) {
                map.computeIfPresent(c, (k, v) -> v - 1);
                x++;
            }
        }
        return x == str2.length();
    }
}
