package majority_element;
//https://leetcode.com/problems/majority-element/submissions/1487143401/
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer majority = nums[0], m = 1;
        for (Integer num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > m) {
                majority = num;
                m = map.get(num);
            }
        }
        return majority;
    }
}
