/*
PROBLEMA:
3342 - Keanu
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.122s
TAMANHO:
480 Bytes
MEMÓRIA:
-
SUBMISSÃO:
25/06/2022 15:51:18
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(in.readLine());
		Integer t = n*n;
		Integer a = t/2;
		Integer b = t/2;
		if (n % 2 != 0) {
			a++;
		}
		System.out.println(a + " casas brancas e " + b + " casas pretas");
	}

}