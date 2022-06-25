/*
PROBLEMA:
2850 - Papagaio Poliglota
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.246s
TAMANHO:
717 Bytes
MEMÓRIA:
-
SUBMISSÃO:
17/06/2022 23:45:03
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {
			String legsPositionInTheAir = in.readLine();
			if (legsPositionInTheAir.equals("as duas")) {
				System.out.println("caiu");
			} else if (legsPositionInTheAir.equals("esquerda")) {
				System.out.println("ingles");
			} else if (legsPositionInTheAir.equals("direita")) {
				System.out.println("frances");
			} else if (legsPositionInTheAir.equals("nenhuma")) {
				System.out.println("portugues");
			}
		}
	}

}