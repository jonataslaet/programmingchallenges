package com.github.jonataslaet.beecrowd;

import java.util.Scanner;

public class Solution1221 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n, x, i = 0;

        n = keyboard.nextInt();
        while (i < n) {
            x = keyboard.nextInt();
            if (!isPrime(x)) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
            i++;
        }

    }

    // n is not prime if it can be written as the product of two natural numbers which are greater than one and obsviously less than n
    // 1 < d < n
    // (a * d) == n
    // n = a * d; a pertence [2, n-1]
    // d = n / a
    // a <= d
    // a <= (n / a)
    // a² <= n
    // a <= sqrt(n) E a >= 2
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}