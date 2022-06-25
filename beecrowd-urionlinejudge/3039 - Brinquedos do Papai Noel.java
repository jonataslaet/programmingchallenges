/*
PROBLEMA:
3039 - Brinquedos do Papai Noel
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.346s
TAMANHO:
699 Bytes
MEMÓRIA:
-
SUBMISSÃO:
20/06/2022 22:26:48
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(in.readLine());
		int quantityOfToysOfBoys = 0, quantityOfToysOfGirls = 0;
		for (int i = 0; i < n; i++) {
			String[] nameAndSex = in.readLine().split(" ");
			if (nameAndSex[1].equals("F")) {
				quantityOfToysOfGirls++;
			} else {
				quantityOfToysOfBoys++;
			}
		}
		System.out.println(quantityOfToysOfBoys + " carrinhos");
		System.out.println(quantityOfToysOfGirls + " bonecas");
	}

}