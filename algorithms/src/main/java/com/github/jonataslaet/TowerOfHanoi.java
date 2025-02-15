package com.github.jonataslaet;

public class TowerOfHanoi {

    public static int moveTower(int n, char origin, char auxiliar, char destiny) {
        if (n == 1) {
            System.out.println("Moving disk " + n + " from tower " + origin + " to tower " + destiny);
            return 1;
        }
        int moves1 = 1 + moveTower(n - 1, origin, destiny, auxiliar);
        System.out.println("Moving disk " + n + " from tower " + origin + " to tower " + destiny);
        int moves2 = moveTower(n - 1, auxiliar, origin, destiny);
        return moves1 + moves2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(moveTower(n, 'A', 'B', 'C'));
    }
}
