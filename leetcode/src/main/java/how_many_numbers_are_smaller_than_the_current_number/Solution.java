package how_many_numbers_are_smaller_than_the_current_number;

/*
Description: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
Runtime: 15 ms, faster than 54.46% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
Memory Usage: 44.5 MB, less than 27.03% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
Time Submitted: 02/27/2022 12:10
*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int x = 0;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j != i && nums[j] < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}
