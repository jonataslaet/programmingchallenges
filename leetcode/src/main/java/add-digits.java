/*
Description: https://leetcode.com/problems/add-digits/
Runtime: 2 ms.
Memory Usage: 41.6 MB.
Time Submitted: 02/10/2022 20:18
*/

class Solution202202102018 {
    public int addDigits(int num) {
        String stringNum = String.valueOf(num);
		
		int rightId = stringNum.length() - 1;
		int sum = 0, currentSum = 0, currentDigit = 0;
		while(rightId >= 0) {
			currentDigit = Character.getNumericValue(stringNum.charAt(rightId));
			currentSum += currentDigit;
			
			rightId--;
			
			if (rightId < 0) {
				sum = currentSum;
				if (sum/10 > 0) {
					stringNum = String.valueOf(sum);
					currentSum = 0;
					rightId = stringNum.length()-1;
				}
			}
		}
        return sum;
    }
}