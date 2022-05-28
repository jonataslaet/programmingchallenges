/*
PROBLEMA:
2765 - Entrada e Saída com Virgula
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.161s
TAMANHO:
448 Bytes
MEMÓRIA:
-
SUBMISSÃO:
28/05/2022 11:06:55
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {
			String phrase = in.readLine();
			String [] parts = phrase.split(",");
			System.out.println(parts[0]);
			System.out.println(parts[1]);
		}

	}

}