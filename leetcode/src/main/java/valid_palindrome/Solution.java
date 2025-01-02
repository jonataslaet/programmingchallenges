package valid_palindrome;

//Fonte: https://leetcode.com/problems/valid-palindrome/

import java.util.Objects;

class Solution {
    public boolean isPalindrome(String s) {
        char [] word = getX(s);
        int m = word.length / 2;
        int j = word.length - 1;
        for (int i = 0; i < m; i++) {
            if (!Objects.equals(word[i], word[j--])) {
                return false;
            }
        }
        return true;
    }

    private char[] getX(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }
}