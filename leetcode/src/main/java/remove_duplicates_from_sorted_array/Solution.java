package remove_duplicates_from_sorted_array;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1487157453/
public class Solution {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (Integer num: nums) {
            if (k == 0) {
                nums[k] = num;
                k++;
            }
            else {
                if (num != nums[k-1]) {
                    nums[k] = num;
                    k++;
                }
            }
        }
        return k;
    }
}
