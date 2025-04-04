/*
PROBLEMA:
2930 - TCC da Depressão Natalino
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.077s
TAMANHO:
1,28 KB
MEMÓRIA:
-
SUBMISSÃO:
28/06/2022 23:37:08
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static boolean isValidValue(String s) {
		boolean isOnlyNumber = s != null && s.length() > 0 && s.matches("\\d+");
        return isOnlyNumber && Integer.parseInt(s) > 0 && Integer.parseInt(s) < 25;
    }

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		boolean teacherTaughtIt = line.length > 1 && isValidValue(line[0]) && isValidValue(line[1]);
		Integer e = -1;
		Integer d = -99;
		if (teacherTaughtIt) {
			e = Integer.parseInt(line[0]);
			d = Integer.parseInt(line[1]);
			teacherTaughtIt = teacherTaughtIt && d >= e;
		}
		
		Integer period = d - e;
		boolean extendedFinal = period < 3 && period >= 0;
		
		String result = !teacherTaughtIt ? "Eu odeio a professora!":"Muito bem! Apresenta antes do Natal!";
		String finalResult = "TCC Apresentado!";
		
		if (extendedFinal) {
			result = "Parece o trabalho do meu filho!";
			if (d+2 > 24) {
				finalResult = "Fail! Entao eh nataaaaal!";
			}
		}
		
		System.out.println(result);
		if(extendedFinal) {
			System.out.println(finalResult);
		}
		
	}

}
