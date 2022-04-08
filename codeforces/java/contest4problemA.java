/*
Fonte: https://codeforces.com/contest/4/problem/A
#	Author	Problem	Lang	Verdict	Time	Memory	Sent	Judged	 	 
145662742	Practice:
jonataslaetprogramador	4A - 8	Java 11	Accepted	374 ms	0 KB	2022-02-08 18:18:00	2022-02-08 18:18:00
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