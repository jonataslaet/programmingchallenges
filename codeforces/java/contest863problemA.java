/*
Fonte: https://codeforces.com/contest/863//problem/A
#	Author	Problem	Lang	Verdict	Time	Memory	Sent	Judged	 	 
145425779	Practice:
jonataslaetprogramador	863A - 19	Java 11	Accepted	233 ms	28 KB	2022-02-06 18:25:19	2022-02-06 18:25:19
*/

import java.util.Scanner;

public class quasipalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		System.out.println(isQuasiPalindrome(n) ? "YES" : "NO");
	}
	
	public static boolean isQuasiPalindrome(Integer n) {
		boolean result = true;
		String stringNumber = String.valueOf(n);
		
		char[] number = (getZerosAtTheLeft(stringNumber)+stringNumber).toCharArray();
		int t = number.length;
		int m = t/2;
		int r = t - 1;
		for(int l = 0; l < m; l++) {
			if (number[l] != number[r--]) {
				return false;
			}
		}
		return result;
	}
	
	public static String getZerosAtTheLeft(String n) {
		String s = "";
		char[] nChar = n.toCharArray();
		char c = n.charAt(0);
		for(int i = nChar.length - 1; i >= 0; i--) {
			c = n.charAt(i);
			if (c != '0') {
				return s;
			}
			s = s + String.valueOf(c);
		}
		return s;
		
	}

}