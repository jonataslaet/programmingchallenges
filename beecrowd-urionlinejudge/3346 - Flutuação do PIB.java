/*
PROBLEMA:
3346 - Flutuação do PIB
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.189s
TAMANHO:
519 Bytes
MEMÓRIA:
-
SUBMISSÃO:
25/06/2022 16:11:17
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		Double p = 100.0;
		Double py1 = Double.parseDouble(line[0]);
		p = p * (1 + py1/100);
		Double py2 = Double.parseDouble(line[1]);
		p = p * (1 + py2/100);
		System.out.printf("%.6f\n", p - 100);	
	}

}
