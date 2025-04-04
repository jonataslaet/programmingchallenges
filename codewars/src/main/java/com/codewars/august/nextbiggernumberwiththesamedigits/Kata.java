package com.codewars.august.nextbiggernumberwiththesamedigits;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    static Map<Long, Integer> map = new HashMap<>();
    public static long nextBiggerNumber(long n)
    {
        if (n < 10) return -1;
        int count = 1;
        long digit, x = n;
        long biggestDigit = x % 10;
        while (x > 9) {
            digit = (x % 10);
            if (digit > biggestDigit) {
                biggestDigit = digit;
                count++;
            }
            map.putIfAbsent(digit, 0);
            map.computeIfPresent(digit, (k,v) -> v+1);
            x /= 10;
        }
        if (x > biggestDigit) {
            biggestDigit = x;
            count++;
        }
        map.putIfAbsent(x, 0);
        map.computeIfPresent(x, (k,v) -> v+1);
        x = map.keySet().size();
        if (x == 1 || x == count) return -1;
        return n;
    }

}
