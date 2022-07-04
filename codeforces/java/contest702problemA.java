/*
#	When	Who	Problem	Lang	Verdict	Time	Memory
162691606	Jul/03/2022 22:44UTC-3	jonataslaetprogramador	A - Maximum Increase	Java 11	Accepted	296 ms	0 KB
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		Integer count = 0;
		Integer biggestCount = 0;
		Integer previousNumber = 0;
		in.nextLine();
		for (int i = 0; i < n; i++) {
			Integer currentNumber = in.nextInt();
			if (currentNumber > previousNumber) {
				count++;
				if (count > biggestCount) {
					biggestCount = count;
				}
			} else {
				count = 1;
			}
			previousNumber = currentNumber;
		}
		System.out.println(biggestCount);
		in.close();
	}

}
