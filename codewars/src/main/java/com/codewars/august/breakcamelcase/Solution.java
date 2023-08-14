package com.codewars.august.breakcamelcase;


//https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
public class Solution {
    public static String camelCase(String input) {
        if (input.trim().isEmpty()) return "";
        String word = String.valueOf(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            String originalLetter = String.valueOf(input.charAt(i));
            if (originalLetter.equals(String.valueOf(input.charAt(i)).toUpperCase())) {
                word = word.concat(" ");
            }
            word = word.concat(originalLetter);
        }
        return word;
    }
}
