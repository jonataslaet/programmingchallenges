package plus_one;

/*
Description: https://leetcode.com/problems/plus-one/
Runtime: 2 ms, faster than 6.46% of Java online submissions for Plus One.
Memory Usage: 42.6 MB, less than 7.86% of Java online submissions for Plus One.
Time Submitted: 02/07/2022 18:06
*/

import java.util.LinkedList;
/*https://leetcode.com/problems/plus-one*/
class Solution {
    public int[] plusOne(int[] digits) {
        int r = digits.length - 1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int subiu = 0;
        for (int i = r; i >= 0; i--) {
            if (i == r) {
                subiu = (digits[i] + 1) / 10;
                list.addFirst((digits[i] + 1) % 10);
            } else {
                list.addFirst((digits[i] + subiu) % 10);
                subiu = digits[i] + subiu > 9 ? 1 : 0;
            }
        }
        if (subiu > 0) list.addFirst(subiu);

        int[] result = new int[list.size()];
        int i = 0;
        for (int d : list) {
            result[i++] = d;
        }
        return result;
    }
}
