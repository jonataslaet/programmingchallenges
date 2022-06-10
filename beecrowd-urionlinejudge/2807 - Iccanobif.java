/*
PROBLEMA:
2807 - Iccanobif
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.190s
TAMANHO:
682 Bytes
MEMÓRIA:
-
SUBMISSÃO:
09/06/2022 20:43:13
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int v[] = new int[]{1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155};
		Integer n = Integer.parseInt(in.readLine());
		for (int i = n-1; i >= 0; i--) {
			if (i == 0) System.out.println(v[i]);
			else System.out.print(v[i] + " ");
		}
	}

}
