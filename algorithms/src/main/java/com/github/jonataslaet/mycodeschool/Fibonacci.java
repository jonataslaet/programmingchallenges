package com.github.jonataslaet.mycodeschool;

import java.math.BigDecimal;
import java.util.Map;

public class Fibonacci {

    public static BigDecimal f(int i) {
        if (i < 2) return new BigDecimal(i);
        return f(i-1).add(f(i-2));
    }

    public static BigDecimal f(int i, Map<Integer, BigDecimal> memory) {
        if (i < 2) return new BigDecimal(i);
        if (!memory.containsKey(i)) {
            memory.put(i, (f(i-1, memory).add(f(i-2, memory))));
        }
        return memory.get(i);
    }

}
