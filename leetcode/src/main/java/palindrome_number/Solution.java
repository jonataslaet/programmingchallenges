package palindrome_number;

//Fonte: https://leetcode.com/problems/palindrome-number/

import java.util.LinkedList;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) return true;
        if ((x < 10) || (x < 100 && (x % 10 != (x / 10)))) return false;
        LinkedList<Integer> reversedList = new LinkedList<>();
        int num = x;
        while(num > 0) {
            reversedList.addFirst(num % 10);
            num /= 10;
        }
        for (Integer n: reversedList) {
            if (n != (x % 10)) return false;
            x /= 10;
        }
        return true;
    }
}
