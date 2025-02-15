package concatenation_of_array;
/*
Description: https://leetcode.com/problems/build-array-from-permutation
Runtime: 2 ms, faster than 35.79% of Java online submissions for Concatenation of Array.
Memory Usage: 50 MB, less than 20.49% of Java online submissions for Concatenation of Array.
Time Submitted: 02/18/2022 23:47
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2 * size];

        int r = size - 1;
        int z = 2 * size - 1;
        int l = 0;
        while (l < size) {
            ans[l] = nums[l];
            ans[z] = nums[r];
            r--;
            l++;
            z--;
        }
        return ans;
    }
}