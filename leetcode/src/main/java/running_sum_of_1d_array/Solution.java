package running_sum_of_1d_array;

/*
Description: https://leetcode.com/problems/running-sum-of-1d-array
Runtime: 3 ms, faster than 8.20% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 42.6 MB, less than 34.12% of Java online submissions for Running Sum of 1d Array.
Time Submitted: 02/20/2022 22:10
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] buildArray(int[] nums) {
        List<Integer> arrayAns = new ArrayList<Integer>();
		int r = nums.length;
		for (int i = 0; i < r; i++) {
			arrayAns.add(nums[nums[i]]);
		}
		return arrayAns.stream().mapToInt(i -> i).toArray();
    }
}