package com.codewars.august.highestscoringword;

import java.util.Map;
import static java.util.Map.entry;

public class Kata {

    private static final Map<String, Integer> map = Map.ofEntries(
            entry("a", 1),
            entry("b", 2),
            entry("c", 3),
            entry("d", 4),
            entry("e", 5),
            entry("f", 6),
            entry("g", 7),
            entry("h", 8),
            entry("i", 9),
            entry("j", 10),
            entry("k", 11),
            entry("l", 12),
            entry("m", 13),
            entry("n", 14),
            entry("o", 15),
            entry("p", 16),
            entry("q", 17),
            entry("r", 18),
            entry("s", 19),
            entry("t", 20),
            entry("u", 21),
            entry("v", 22),
            entry("w", 23),
            entry("x", 24),
            entry("y", 25),
            entry("z", 26)
    );

    public static String high(String s) {
        int sum;
        int biggestSum = 0;
        String g = "";
        String[] phrase = s.split(" ");
        String biggestWord = phrase[0];
        for (String word: phrase) {
            sum = getSum(word);
            if (sum > biggestSum) {
                biggestSum = sum;
                biggestWord = word;
            }
        }
        return biggestWord;
    }

    private static int getSum(String word) {
        int sum = 0;
        for (Character letter: word.toCharArray()) {
            sum += map.get(String.valueOf(letter));
        }
        return sum;
    }
}
