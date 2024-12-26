package valid_parentheses;

/*
Description: https://leetcode.com/problems/valid-parentheses
Runtime: 2 ms, faster than 81.48% of Java online submissions for Valid Parentheses.
Memory Usage: 41.9 MB, less than 59.09% of Java online submissions for Valid Parentheses.
Time Submitted: 04/18/2022 08:56
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        String[] token = {"()","{}","[]"}; 
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
			if (isOpenChar(c, token)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() || !match(stack.pop(), c, token)) {
					return false;
				}
			}
		}
        
        return stack.isEmpty();
    }
    
    private static boolean match(Character top, Character c, String[] token) {
    	for (String line : token) {
			if (top == line.toCharArray()[0] && c == line.toCharArray()[1]) {
				return true;
			}
		}
		return false;
	}
    
    private static boolean isOpenChar(Character c, String[] token) {
		for (String line : token) {
			if (line.startsWith(String.valueOf(c))) {
				return true;
			}
		}
		return false;
	}
}