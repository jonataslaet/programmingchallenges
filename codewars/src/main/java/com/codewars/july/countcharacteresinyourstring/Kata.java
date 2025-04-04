package com.codewars.july.countcharacteresinyourstring;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: str.toCharArray()) {
            map.putIfAbsent(c, 1);
            map.computeIfPresent(c, (k, v) -> v + 1);
        }
        return map;
    }
}
