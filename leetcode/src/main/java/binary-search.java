/*
Description: https://leetcode.com/problems/binary-search/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
Memory Usage: 54.5 MB, less than 33.03% of Java online submissions for Binary Search.
Time Submitted: 04/19/2022 20:45
*/

class Solution202204192045 {
    
    public static int binarySearch(int[] nums, int begin, int end, int target) {
    	int i = (begin+end)/2;
        if (nums[i] == target) return i;
        else if (i >= end) return -1;
        else if (nums[i] < target) return binarySearch(nums, i+1, end, target);
        else return binarySearch(nums, begin, i-1, target);
    }
    
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}