/*
Description: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
Runtime: 11 ms, faster than 8.14% of Java online submissions for Kids With the Greatest Number of Candies.
Memory Usage: 43.4 MB, less than 5.67% of Java online submissions for Kids With the Greatest Number of Candies.
Time Submitted: 02/25/2022 05:59
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution202202250559 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<Boolean>();
		List<Integer> numsList = Arrays.stream(candies).boxed().collect(Collectors.toList());
		int m = candies.length;
		for (int i = 0; i < m; i++) {
			resultList.add(extraCandies + candies[i] >= Collections.max(numsList));
		}
		return resultList;
    }
}