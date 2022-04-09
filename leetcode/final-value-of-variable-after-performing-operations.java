/*
Description: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
Runtime: 1 ms, faster than 90.30% of Java online submissions for Final Value of Variable After Performing Operations.
Memory Usage: 41.9 MB, less than 32.31% of Java online submissions for Final Value of Variable After Performing Operations.
Time Submitted: 02/20/2022 22:21
*/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
		for (String operation : operations) {
			if ("++X".equalsIgnoreCase(operation)) {
				++x;
			}
			else if ("X++".equalsIgnoreCase(operation)) {
				x++;
			}
			else if ("--X".equalsIgnoreCase(operation)) {
				--x;
			}
			else if ("X--".equalsIgnoreCase(operation)) {
				x--;
			}
		}
		return x;
    }
}