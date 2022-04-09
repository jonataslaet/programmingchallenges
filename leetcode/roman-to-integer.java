/* 
Description: https://leetcode.com/problems/roman-to-integer/
Runtime: 6 ms, faster than 64.44% of Java online submissions for Roman to Integer.
Memory Usage: 45.1 MB, less than 16.77% of Java online submissions for Roman to Integer.
Time Submitted: 02/05/2022 12:11
*/

class Solution {
    public int romanToInt(String s) {
        char[] in = s.toCharArray();
        
        int rightEnd = in.length-1; 
        int nextDigit = 0;
        int currentDigit = getValueFromSymbol(in[rightEnd]);
        int sum = currentDigit;
        for(int i = rightEnd-1; i >= 0; i--){
            nextDigit = getValueFromSymbol(in[i]);
            if (nextDigit < currentDigit) sum -= nextDigit;
            else sum += nextDigit;
            currentDigit = nextDigit;
        }
        return sum;
    }
    
    public static Integer getValueFromSymbol(char input){
        switch(input) {
          case 'I':
            return 1;
          case 'V':
            return 5;
          case 'X':
            return 10;
          case 'L':
            return 50;
          case 'C':
            return 100;
          case 'D':
            return 500;
          default:
            return 1000;
        }
    }
}