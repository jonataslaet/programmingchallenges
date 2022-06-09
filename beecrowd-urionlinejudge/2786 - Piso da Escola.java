/*
PROBLEMA:
2786 - Piso da Escola
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.179s
TAMANHO:
549 Bytes
MEMÓRIA:
-
SUBMISSÃO:
06/06/2022 21:07:09
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Integer l = Integer.parseInt(in.readLine());
		Integer c = Integer.parseInt(in.readLine());
		Integer type1Sum = 0, type2Sum = 0;
		type1Sum = l * c + ((l-1)*(c-1));
		type2Sum = 2*(c-1) + 2*(l-1);
		System.out.println(type1Sum);
		System.out.println(type2Sum);
		
	}

}