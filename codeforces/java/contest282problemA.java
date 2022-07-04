/*
#	When	Who	Problem	Lang	Verdict	Time	Memory
162594380	Jul/02/2022 21:17UTC-3	jonataslaetprogramador	A - Bit++	Java 11	Accepted	187 ms	0 KB
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		Integer p = 0;
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String operation = in.nextLine();
			if (operation.equals("X++")) {
				++p;
			} else if (operation.equals("++X")) {
				p++;
			} else if (operation.equals("--X")) {
				--p;
			} else if (operation.equals("X--")) {
				p--;
			}
		}
		System.out.println(p);
		in.close();
	}

}
