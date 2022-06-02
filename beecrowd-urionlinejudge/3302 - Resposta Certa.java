/*
PROBLEMA:
3302 - Resposta Certa
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
1.230s
TAMANHO:
515 Bytes
MEMÓRIA:
-
SUBMISSÃO:
01/06/2022 23:23:46
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {
			Integer n = Integer.parseInt(in.readLine());
			
			for (int i = 1; i <= n; i++) {
				Integer answer = Integer.parseInt(in.readLine());
				System.out.println("resposta " + i + ": " + answer);
			}
			
		}

	}

}