/*
PROBLEMA:
3146 - Charadas no Escuro
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.215s
TAMANHO:
403 Bytes
MEMÓRIA:
-
SUBMISSÃO:
29/06/2022 22:30:56
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Double pi = 3.14;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		Double r = Double.parseDouble(line);
		System.out.printf("%.2f\n", 2*pi*r);
	}

}
