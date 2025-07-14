package watter_bottles;

/*
Description: https://leetcode.com/problems/water-bottles
*/

class Solution {
	public int numWaterBottles(int numBottles, int numExchange) {
		int numFullBottles;
		int numEmptyBottles = numBottles;
		int k = numBottles;

		do {
			numFullBottles = numEmptyBottles / numExchange;
			k += numFullBottles;
			numEmptyBottles = (numEmptyBottles % numExchange) + numFullBottles;
		} while (numFullBottles > 0);

		return k;
	}
}