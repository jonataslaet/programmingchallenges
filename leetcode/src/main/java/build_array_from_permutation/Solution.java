package build_array_from_permutation;
/*
Description: https://leetcode.com/problems/build-array-from-permutation
Runtime: 9 ms, faster than 9.83% of Java online submissions for Build Array from Permutation.
Memory Usage: 54.2 MB, less than 7.26% of Java online submissions for Build Array from Permutation.
Time Submitted: 02/18/2022 23:22
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