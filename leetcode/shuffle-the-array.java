/*
Description: https://leetcode.com/problems/shuffle-the-array
Runtime: 10 ms, faster than 5.14% of Java online submissions for Shuffle the Array.
Memory Usage: 46.5 MB, less than 5.21% of Java online submissions for Shuffle the Array.
Time Submitted: 02/21/2022 21:28
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> v = new ArrayList<Integer>();
		for (int i = 0, k = n; i < n; i++) {
			v.add(nums[i]);
			v.add(nums[k++]);
		}
		return v.stream().mapToInt(i -> i).toArray();
    }
}