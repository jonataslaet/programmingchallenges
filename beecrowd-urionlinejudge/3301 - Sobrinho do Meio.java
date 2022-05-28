/*
PROBLEMA:
3301 - Sobrinho do Meio
RESPOSTA:
Accepted
LINGUAGEM:
Java 14 (OpenJDK 1.14.0) [+2s]
TEMPO:
0.180s
TAMANHO:
1,19 KB
MEMÓRIA:
-
SUBMISSÃO:
28/05/2022 12:49:33
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	static class Nephew {
		private String name;
		private Integer age;

		Nephew(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public Integer getAge() {
			return age;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {
			String[] ages = in.readLine().split(" ");

			List<Nephew> nephews = new ArrayList<Nephew>();
			nephews.add(new Nephew("huguinho", Integer.parseInt(ages[0])));
			nephews.add(new Nephew("zezinho", Integer.parseInt(ages[1])));
			nephews.add(new Nephew("luisinho", Integer.parseInt(ages[2])));

			Collections.sort(nephews, new Comparator<Nephew>() {
				public int compare(Nephew o1, Nephew o2) {
					return o1.getAge().compareTo(o2.getAge());
				}
			});
			System.out.println(nephews.get(1).getName());
		}

	}

}
