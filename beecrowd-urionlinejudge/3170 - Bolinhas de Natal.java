/*
PROBLEMA:
3170 - Bolinhas de Natal
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.147s
TAMANHO:
555 Bytes
MEMÓRIA:
-
SUBMISSÃO:
31/05/2022 08:22:21
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer b = Integer.parseInt(in.readLine());
		Integer g = Integer.parseInt(in.readLine());
		Integer m = Math.floorDiv(g, 2);
		
		if (b >= m) {
			System.out.println("Amelia tem todas bolinhas!");
		} else {
			System.out.println("Faltam "+ (m - b) +" bolinha(s)");
		}

	}

}