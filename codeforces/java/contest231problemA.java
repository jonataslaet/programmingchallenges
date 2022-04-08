/*
Fonte: https://codeforces.com/contest/231/problem/A
#	Author	Problem	Lang	Verdict	Time	Memory	Sent	Judged	 	 
145672353	Practice:
jonataslaetprogramador	231A - 11	Java 11	Accepted	374 ms	0 KB	2022-02-08 19:45:26	2022-02-08 19:45:26
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