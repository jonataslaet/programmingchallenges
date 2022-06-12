/*
PROBLEMA:
2547 - Montanha-Russa
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.105s
TAMANHO:
700 Bytes
MEMÓRIA:
-
SUBMISSÃO:
12/06/2022 15:35:28
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(in.ready()) {
			String[] entering = in.readLine().split(" ");
			Integer n = Integer.parseInt(entering[0]);
			Integer hmin = Integer.parseInt(entering[1]);
			Integer hmax = Integer.parseInt(entering[2]);
			Integer x, count = 0;
			for (int i = 0; i < n; i++) {
				x = Integer.parseInt(in.readLine());
				if (x >= hmin && x <= hmax) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
	}

}