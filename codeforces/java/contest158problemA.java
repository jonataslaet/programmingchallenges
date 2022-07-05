/*
#	When	Who	Problem	Lang	Verdict	Time	Memory
162842440	Jul/04/2022 23:37UTC-3	jonataslaetprogramador	A - Next Round	Java 11	Accepted	374 ms	0 KB
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int[] v = new int[50];
		int count = 0;
		Integer n = in.nextInt();
		Integer k = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			Integer currentNumber = in.nextInt();
			v[i] = currentNumber;
		}
		for (int i = 0; i < n; i++) {
			if (v[i] > 0 && v[i] >= v[k - 1]) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
