/* 
Description: https://leetcode.com/problems/find-the-difference/
Runtime: 97 ms, faster than 5.19% of Java online submissions for Find the Difference.
Memory Usage: 42.6 MB, less than 6.09% of Java online submissions for Find the Difference.
Time Submitted: 02/07/2022 11:12
*/

class Solution {
    public char findTheDifference(String s, String t) {
        int r = t.length() - 1;
        char currentCharInTheT;

        while (r > 0) {
          currentCharInTheT = t.charAt(r);
          if (s.contains(String.valueOf(t.charAt(r)))) {
            s = s.replaceFirst(String.valueOf(currentCharInTheT), "");
            t = t.replaceFirst(String.valueOf(currentCharInTheT), "");
          }
          r--;
        }

        return t.charAt(t.length()-1);        
    }
}