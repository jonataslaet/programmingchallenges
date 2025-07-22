package com.github.jonataslaet.beecrowd;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1558 {

    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        int n;

        Map<Integer, Integer> mapSquareNumbers = new HashMap<>();
        for (int i = 0; i <= 100; i++) {
            mapSquareNumbers.putIfAbsent(i * i, i);
        }

        while (keyboard.hasNext()) {
            n = keyboard.nextInt();
            if (existsTwoNumbersToSquareResulting(n, mapSquareNumbers)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        keyboard.close();
    }

    private static boolean existsTwoNumbersToSquareResulting(int n, Map<Integer, Integer> mapSquareNumbers) {
        for (int i = 0; i <= n; i++) {
            if (mapSquareNumbers.containsKey(n - i * i)) return true;
        }
        return false;
    }
}
