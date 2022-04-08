/*
Fonte: https://codeforces.com/problemset/problem/71/A
#	Author	Problem	Lang	Verdict	Time	Memory	Sent	Judged	 	 
145444722	Practice:
jonataslaetprogramador	71A - 14	Java 11	Accepted	202 ms	48 KB	2022-02-06 19:07:16	2022-02-06 19:07:16
*/

import java.util.Scanner;

public class waytoolongwords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++) {
			String word = in.nextLine();
			System.out.println(word.length() > 10 ? getAbbreviationFromWord(word): word);
		}
		in.close();
	}

	private static String getAbbreviationFromWord(String word) {
		int lengthOfTheWord = word.length();
		int qtdLettersBetweenBoth = lengthOfTheWord - 2;
		return String.valueOf(word.charAt(0)) + qtdLettersBetweenBoth + word.charAt(lengthOfTheWord - 1);
	}

}