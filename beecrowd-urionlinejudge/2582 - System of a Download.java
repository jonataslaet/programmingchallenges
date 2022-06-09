/*
PROBLEMA:
2582 - System of a Download
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.331s
TAMANHO:
735 Bytes
MEMÓRIA:
-
SUBMISSÃO:
08/06/2022 16:30:40
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] songs = new String[] { "PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE",
				"OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS" };

		Integer n = Integer.parseInt(in.readLine());
		String[] line = new String[] {};
		
		for (int i = 0; i < n; i++) {
			line = (in.readLine().split(" "));
			Integer b1 = Integer.parseInt(line[0]);
			Integer b2 = Integer.parseInt(line[1]);
			System.out.println(songs[b1+b2]);
		}

	}

}