package two_sum;

/*
Description: https://leetcode.com/problems/two-sum/
Runtime: 5 ms, faster than 60.21% of Java online submissions for Two Sum.
Memory Usage: 46.9 MB, less than 5.93% of Java online submissions for Two Sum.
Time Submitted: 03/05/2022 00:31
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int missing = target - nums[0];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			missing = target - nums[i];
			if (map.containsKey(missing) && i != map.get(missing)) {
				return new int[] { i, map.get(missing) };
			}
		}

		return null;
    }
}