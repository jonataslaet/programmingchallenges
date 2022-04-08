/*
Description: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
Memory Usage: 40.6 MB, less than 38.16% of Java online submissions for Number of Steps to Reduce a Number to Zero.
Time Submitted: 02/28/2022 21:55
*/

class Solution {
    public int numberOfSteps(int num) {
        int q = 0;
		while(num > 0) {
			num = num % 2 == 0 ? num/2 : --num;
			q++;
		}
		return q;
    }
}