package remove_element;

/*
https://leetcode.com/problems/remove-element/description/
 */
class Solution {
	public int removeElement(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (val != nums[i]) {
				nums[k++] = nums[i];
			}
		}
		return k;
	}
}