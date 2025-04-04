/*
PROBLEMA:
3053 - Jogo Dos Copos
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.063s
TAMANHO:
1,3 KB
MEMÓRIA:
-
SUBMISSÃO:
24/06/2022 23:20:38
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void moveType1SwapAforB(int v[]) {
		int aux = 0;
		if (v[0] == 1) {
			aux = v[0];
			v[0] = v[1];
			v[1] = aux;
		} else {
			aux = v[1];
			v[1] = v[0];
			v[0] = aux;
		}
	}

	public static void moveType2SwapBforC(int v[]) {
		int aux = 0;
		if (v[1] == 1) {
			aux = v[1];
			v[1] = v[2];
			v[2] = aux;
		} else {
			aux = v[2];
			v[2] = v[1];
			v[1] = aux;
		}
	}

	public static void moveType3SwapCforA(int v[]) {
		int aux = 0;
		if (v[2] == 1) {
			aux = v[2];
			v[2] = v[0];
			v[0] = aux;
		} else {
			aux = v[0];
			v[0] = v[2];
			v[2] = aux;
		}
	}

	public static void main(String[] args) throws IOException {
		int[] v = new int[3];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(in.readLine());
		String p = in.readLine();
		v[p.equals("A") ? 0 : p.equals("B") ? 1 : 2] = 1;
		for (int i = 0; i < n; i++) {
			Integer j = Integer.parseInt(in.readLine());
			if (j == 1)
				moveType1SwapAforB(v);
			else if (j == 2)
				moveType2SwapBforC(v);
			else
				moveType3SwapCforA(v);
		}
		System.out.println(v[0] == 1 ? 'A' : v[1] == 1 ? 'B' : 'C');
	}

}