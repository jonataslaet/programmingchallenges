/*
PROBLEMA:
3046 - Dominó
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.389s
TAMANHO:
355 Bytes
MEMÓRIA:
-
SUBMISSÃO:
03/06/2022 23:02:21
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(in.readLine());
		System.out.println(((n+1)*(n+2))/2);
	}

}