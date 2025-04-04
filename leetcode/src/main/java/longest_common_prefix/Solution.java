package longest_common_prefix;

/*
Description: https://leetcode.com/problems/longest-common-prefix/
*/

public class Solution {
	public String longestCommonPrefix(String[] strs) {

		String minor = null;
		String major = null;

		int pMax = 0;

		if (strs.length < 2) {
			return strs[0];
		}

		for (String word: strs) {
			if (word.isEmpty()) return "";

			if (minor == null) {
				minor = word;
			}
			else if (word.compareToIgnoreCase(minor) < 0) {
				minor = word;
			}

			if (major == null) {
				major = word;
			}
			else if (word.compareToIgnoreCase(major) > 0) {
				major = word;
			}
		}

		while (pMax < minor.length()) {
			if (minor.charAt(pMax) == major.charAt(pMax)) pMax++;
			else break;
		}

		return minor.substring(0, pMax);
	}
}