package two_sum;

/*
Description: https://leetcode.com/problems/two-sum/
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int missing;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[] { map.get(nums[i]), i };
			}
			missing = target - nums[i];
			if (!map.containsKey(missing)) {
				map.put(missing, i);
			}
		}
		return null;
    }
}