package com.codewars.august.writenumberinexpandedform;

//https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
public class Kate {
    public static String expandedForm(int num)
    {
        int count = 1;
        String result = "";
        if (num < 10) return String.valueOf(num);
        int algarismo;
        while (num > 9) {
            algarismo = (num % 10);
            if (algarismo > 0) {
                result = getConcat(algarismo, count, result);
            }
            num /= 10;
            count *= 10;
        }
        result = getConcat(num, count, result);
        return result;
    }

    private static String getConcat(int first, int second, String result) {
        return result.isEmpty() ? result.concat(String.valueOf(first * second))
                : String.valueOf(first * second).concat(" + ".concat(result));
    }
}
