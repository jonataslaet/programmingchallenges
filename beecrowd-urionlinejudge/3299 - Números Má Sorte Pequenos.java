/*
PROBLEMA:
3299 - Números Má Sorte Pequenos
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.515s
TAMANHO:
724 Bytes
MEMÓRIA:
-
SUBMISSÃO:
25/06/2022 16:37:33
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String number = in.readLine();
		boolean foundOne = false;
		boolean foundThree = false;
		
		for (char c : number.toCharArray()) {
			if (c == '1' && !foundOne) {
				foundOne = true;
				continue;
			}
			if (c == '3' && foundOne) {
				foundThree = true;
				break;
			} else if (c != '1'){
				foundOne = false;
			}
		}
		
		System.out.println(number + (foundOne && foundThree? " es de Mala Suerte":" NO es de Mala Suerte"));
		
	}

}
