/* 
Description: https://leetcode.com/problems/search-insert-position/
Runtime: 1 ms, faster than 10.22% of Java online submissions for Search Insert Position.
Memory Usage: 43.6 MB, less than 12.72% of Java online submissions for Search Insert Position.
Time Submitted: 02/15/2022 20:35	
*/

class Solution202202152035 {
    public int searchInsert(int[] nums, int target) {
        int k = 0, p = 1;
		for (int num : nums) {
			if (target > num) {
				k = p;
			}
			p++;
		}
        return k;
    }
}