package com.codewars.july.disemvoweltrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","");
    }
}
