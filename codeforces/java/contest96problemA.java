/*
#	When	Who	Problem	Lang	Verdict	Time	Memory
164958876	Jul/19/2022 23:53UTC-3	jonataslaetprogramador	A - Football	Java 11	Accepted	372 ms	0 KB
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] players = br.readLine().toCharArray();

		Integer size = players.length;
		Integer q1 = 0, q0 = 0, q = 0;
		for (int i = 0; i < size; i++) {

			if (players[i] == '1')
			{
				q1++;
				q0 = 0;
			}
			else
			{
				q0++;
				q1 = 0;
			}
			if (q1 > 6 || q0 > 6) q = 1;
		}
		if (q == 0) System.out.printf("NO\n");
		else System.out.printf("YES\n");

	}

}
