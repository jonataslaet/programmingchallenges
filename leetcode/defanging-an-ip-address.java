/*
Description: https://leetcode.com/problems/defanging-an-ip-address
Runtime: 1 ms, faster than 50.29% of Java online submissions for Defanging an IP Address.
Memory Usage: 42.1 MB, less than 15.77% of Java online submissions for Defanging an IP Address.
Time Submitted: 02/20/2022 22:27
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