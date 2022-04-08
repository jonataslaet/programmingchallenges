/*
Description: https://leetcode.com/problems/number-of-good-pairs
Runtime: 1 ms, faster than 82.65% of Java online submissions for Number of Good Pairs.
Memory Usage: 42 MB, less than 9.08% of Java online submissions for Number of Good Pairs.
Time Submitted: 02/21/2022 21:13
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int r = nums.length, sum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (nums[i] == nums[j] && i < j) sum++;
			}
		}
        return sum;
    }
}