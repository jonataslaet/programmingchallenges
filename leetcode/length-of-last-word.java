/* 
Description: https://leetcode.com/problems/length-of-last-word/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
Memory Usage: 40.4 MB, less than 32.55% of Java online submissions for Length of Last Word.
Time Submitted: 02/17/2022 23:11	
*/

class Solution {
    public int lengthOfLastWord(String s) {
		String[] split = s.trim().split(" ");
        return  (split[split.length-1]).length();
    }
}