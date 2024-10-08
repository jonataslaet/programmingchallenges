/*
Description: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 39.2 MB, less than 44.24% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Time Submitted: 02/28/2022 21:31
*/

class Solution202202282131 {
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }
    
    public static int product(int n) {
		if (n < 10) return n;
		return product(n%10) * product(n / 10);
	}
	
	public static int sum(int n) {
		if (n < 10) return n;
		return sum(n%10) + sum(n / 10);
	}
}