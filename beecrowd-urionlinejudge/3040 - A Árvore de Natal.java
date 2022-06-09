/*
PROBLEMA:
3040 - A Árvore de Natal
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.280s
TAMANHO:
653 Bytes
MEMÓRIA:
-
SUBMISSÃO:
09/06/2022 20:05:58
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Integer n = Integer.parseInt(in.readLine());
		String[] line = new String[] {};
		
		for (int i = 0; i < n; i++) {
			line = (in.readLine().split(" "));
			Integer h = Integer.parseInt(line[0]);
			Integer d = Integer.parseInt(line[1]);
			Integer g = Integer.parseInt(line[2]);
			
			System.out.println(h >= 200 && h <= 300 && d >= 50 && g >= 150 ? "Sim":"Nao");
		}

	}

}