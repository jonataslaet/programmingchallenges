/*
PROBLEMA:
3037 - Jogando Dardos Por Distância
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.132s
TAMANHO:
797 Bytes
MEMÓRIA:
-
SUBMISSÃO:
18/06/2022 22:01:53
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(in.readLine());
		Integer p = -1, joaoScore = 0, mariaScore = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= 6; j++) {
				String[] xy = in.readLine().split(" ");
				Integer score = Integer.parseInt(xy[0]) * Integer.parseInt(xy[1]);
				if (p == -1) {
					joaoScore += score;
				} else {
					mariaScore += score;
				}
				if (j == 3) p += -1;
			}
			System.out.println(joaoScore > mariaScore ? "JOAO":"MARIA");
			joaoScore = 0;
			mariaScore = 0;
			p = -1;
		}
	}

}