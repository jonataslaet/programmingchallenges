/*
Description: https://leetcode.com/problems/create-target-array-in-the-given-order/
Runtime: 4 ms, faster than 6.62% of Java online submissions for Create Target Array in the Given Order.
Memory Usage: 42.7 MB, less than 13.14% of Java online submissions for Create Target Array in the Given Order.
Time Submitted: 03/01/2022 11:52
*/

import java.util.LinkedList;

class Solution202203011152 {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> target = new LinkedList<Integer>();
        int i = 0;
        for (int num : nums) {
        	target.add(index[i++], num);
		}
		return target.stream().mapToInt(n -> n).toArray();
    }
}