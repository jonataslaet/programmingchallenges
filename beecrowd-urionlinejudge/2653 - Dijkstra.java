/*
PROBLEMA:
2653 - Dijkstra
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.197s
TAMANHO:
527 Bytes
MEMÓRIA:
-
SUBMISSÃO:
28/05/2022 10:14:39
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> mapa = new HashSet<String>();
		int q = 0;
		
		while(in.ready()) {
			String texto = in.readLine();
			if (mapa.add(texto)) {
				q++;
			}
		}
		System.out.println(q);

	}

}